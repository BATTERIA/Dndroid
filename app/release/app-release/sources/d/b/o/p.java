package d.b.o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import d.g.f.i.b;

public class p {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2968c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f2969a;
    public Bitmap b;

    public p(ProgressBar progressBar) {
        this.f2969a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i) {
        t0 a2 = t0.a(this.f2969a.getContext(), attributeSet, f2968c, i, 0);
        Drawable c2 = a2.c(0);
        if (c2 != null) {
            ProgressBar progressBar = this.f2969a;
            if (c2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) c2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a3 = a(animationDrawable.getFrame(i2), true);
                    a3.setLevel(10000);
                    animationDrawable2.addFrame(a3, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                c2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(c2);
        }
        Drawable c3 = a2.c(1);
        if (c3 != null) {
            this.f2969a.setProgressDrawable(a(c3, false));
        }
        a2.b.recycle();
    }

    public final Drawable a(Drawable drawable, boolean z) {
        if (drawable instanceof b) {
            b bVar = (b) drawable;
            Drawable a2 = bVar.a();
            if (a2 != null) {
                bVar.a(a(a2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.b == null) {
                this.b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}
