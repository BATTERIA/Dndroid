package master.flame.danmaku.danmaku.model;

import master.flame.danmaku.danmaku.model.android.BaseCacheStuffer;

public abstract class AbsDisplayer<T, F> implements IDisplayer {

    private int width;

    private int height;

    private int scaledHeight;

    private float screenOccupationRatio = 1f;

    public abstract T getExtraData();

    public abstract void setExtraData(T data);

    @Override
    public boolean isHardwareAccelerated() {
        return false;
    }

    public abstract void drawDanmaku(BaseDanmaku danmaku, T canvas, float left, float top, boolean fromWorkerThread);

    public abstract void clearTextHeightCache();

    public abstract void setTypeFace(F font, float fontSpacingMult);

    public abstract void setFakeBoldText(boolean bold);

    public abstract void setTransparency(int newTransparency);

    public abstract void setScaleTextSizeFactor(float factor);

    public abstract void setCacheStuffer(BaseCacheStuffer cacheStuffer);

    public abstract BaseCacheStuffer getCacheStuffer();

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return scaledHeight;
    }

    @Override
    public int getOriginHeight() {
        return height;
    }

    @Override
    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
        this.scaledHeight = (int) (height * this.screenOccupationRatio);
    }

    @Override
    public void setScreenOccupationRatio(float screenOccupationRatio) {
        this.screenOccupationRatio = screenOccupationRatio;
        this.scaledHeight = (int) (this.height * screenOccupationRatio);
    }
}
