
package master.flame.danmaku.danmaku.model.android;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

import tv.cjump.jni.NativeBitmapFactory;

public class DrawingCacheHolder {

    public Canvas canvas;

    public Bitmap bitmap;

    private Rect[][] mBitmapRectArray;

    private Bitmap[][] mBitmapArray;

    private Rect rectDst = new Rect();

    private Object extra;

    public int width;

    public int height;

    public boolean drawn;

    private int mDensity;

    public DrawingCacheHolder() {

    }

    public void buildCache(int w, int h, int density, boolean checkSizeEquals, int bitsPerPixel) {
        boolean reuse = checkSizeEquals ? (w == width && h == height) : (w <= width && h <= height);
        if (reuse && bitmap != null) {
//            canvas.drawColor(Color.TRANSPARENT);
//            canvas.setBitmap(null);
            bitmap.eraseColor(Color.TRANSPARENT);
            canvas.setBitmap(bitmap);
            return;
        }
        if (bitmap != null || mBitmapArray != null) {
            recycle();
        }
        width = w;
        height = h;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (bitsPerPixel != 32) {
            config = Bitmap.Config.ARGB_4444;
        }
        bitmap = NativeBitmapFactory.createBitmap(w, h, config);
        if (density > 0) {
            mDensity = density;
            bitmap.setDensity(density);
        }
        if (canvas == null){
            canvas = new Canvas(bitmap);
        }
        canvas.setBitmap(bitmap);
        canvas.setDensity(density);
    }

    public synchronized void recycle() {
        Bitmap bitmapReserve = bitmap;
        bitmap = null;
        width = height = 0;
        if (bitmapReserve != null) {
            bitmapReserve.recycle();
        }
        Bitmap[][] bitmapArray = mBitmapArray;
        mBitmapArray = null;
        if (bitmapArray != null) {
            for (int yIndex = 0; yIndex < bitmapArray.length; yIndex++) {
                for (int xIndex = 0; xIndex < bitmapArray[yIndex].length; xIndex++) {
                    if (bitmapArray[yIndex][xIndex] != null) {
                        bitmapArray[yIndex][xIndex].recycle();
                    }
                }
            }
        }
        extra = null;
        mBitmapRectArray = null;
    }

    @SuppressLint("NewApi")
    public void splitWith(boolean isHardwareBimtapEnabled, int dispWidth, int dispHeight, int maximumCacheWidth, int maximumCacheHeight) {
        if (width <= 0 || height <= 0 || bitmap == null) {
            return;
        }
        if (width <= maximumCacheWidth && height <= maximumCacheHeight) {
            return;
        }
        maximumCacheWidth = Math.min(maximumCacheWidth, dispWidth);
        maximumCacheHeight = Math.min(maximumCacheHeight, dispHeight);
        int xCount = width / maximumCacheWidth + (width % maximumCacheWidth == 0 ? 0 : 1);
        int yCount = height / maximumCacheHeight + (height % maximumCacheHeight == 0 ? 0 : 1);
        int averageWidth = width / xCount;
        int averageHeight = height / yCount;
        Rect[][] bmpRectArray = new Rect[yCount][xCount];
        Bitmap[][] bmpArray = new Bitmap[yCount][xCount];
        if (canvas == null){
            canvas = new Canvas();
            if (mDensity > 0) {
                canvas.setDensity(mDensity);
            }
        }
        Rect rectSrc = new Rect();
        Rect rectDst = new Rect();
        for (int yIndex = 0; yIndex < yCount; yIndex++) {
            for (int xIndex = 0; xIndex < xCount; xIndex++) {
                int left = xIndex * averageWidth, top = yIndex * averageHeight;
                rectSrc.set(left, top, left + averageWidth, top + averageHeight);
                bmpRectArray[yIndex][xIndex] = rectSrc;

                if (isHardwareBimtapEnabled && (xCount > 1 || yCount > 1)) {
                    Bitmap memBitmap = Bitmap.createBitmap(this.bitmap, rectSrc.left, rectSrc.top, rectSrc.width(), rectSrc.height());
                    Bitmap hardBitmap = memBitmap.copy(Bitmap.Config.HARDWARE, false);
                    if (hardBitmap != null) {
                        bmpArray[yIndex][xIndex] = hardBitmap;
                        memBitmap.recycle();
                    } else {
                        bmpArray[yIndex][xIndex] = memBitmap;
                    }
                }
            }
        }

        if (isHardwareBimtapEnabled && (xCount > 1 || yCount > 1)) {
            mBitmapRectArray = bmpRectArray;
            this.bitmap.recycle();
            this.bitmap = null;
            mBitmapArray = bmpArray;
        }
    }

    private void eraseBitmap(Bitmap bmp) {
        if (bmp != null) {
            bmp.eraseColor(Color.TRANSPARENT);
        }
    }

    public final synchronized boolean draw(Canvas canvas, float left, float top, Paint paint) {
        Rect[][] bitmapRectArray = this.mBitmapRectArray;
        Bitmap[][] bitmapArray = this.mBitmapArray;
        boolean isHardwareBimtapEnabled = (bitmapArray != null);
        if (bitmapRectArray != null) {
            for (int i = 0; i < bitmapRectArray.length; i++) {
                for (int j = 0; j < bitmapRectArray[i].length; j++) {
                    Rect rectSrc = bitmapRectArray[i][j];
                    if (rectSrc != null) {
                        float dleft = left + j * rectSrc.width();
                        if (dleft > canvas.getWidth() || dleft + rectSrc.width() < 0) {
                            continue;
                        }
                        float dtop = top + i * rectSrc.height();
                        if (dtop > canvas.getHeight() || dtop + rectSrc.height() < 0) {
                            continue;
                        }
//                        canvas.drawBitmap(bitmap, dleft, dtop, paint);
                        rectDst.set((int) dleft, (int) dtop, (int) dleft + rectSrc.width(), (int) dtop + rectSrc.height());
                        if (isHardwareBimtapEnabled) {
                            Bitmap bitmap = bitmapArray[i][j];
                            if (bitmap != null) {
                                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && !canvas.isHardwareAccelerated() && Bitmap.Config.HARDWARE.equals(bitmap.getConfig())) {
                                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                                    canvas.drawBitmap(copy, dleft, dtop, paint);
                                    copy.recycle();
                                } else {
                                    canvas.drawBitmap(bitmap, dleft, dtop, paint);
                                }
                            }
                        } else {
                            Bitmap bitmap = this.bitmap;
                            if (bitmap != null) {
                                canvas.drawBitmap(bitmap, rectSrc, rectDst, paint);
                            }
                        }
                    }
                }
            }
            return true;
        } else if (bitmap != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && !canvas.isHardwareAccelerated() && Bitmap.Config.HARDWARE.equals(bitmap.getConfig())) {
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                canvas.drawBitmap(copy, left, top, paint);
                copy.recycle();
            } else {
                canvas.drawBitmap(bitmap, left, top, paint);
            }
            return true;
        }
        return false;
    }

}
