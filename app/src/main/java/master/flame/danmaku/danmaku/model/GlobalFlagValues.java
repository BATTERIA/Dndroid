package master.flame.danmaku.danmaku.model;

public class GlobalFlagValues {

    public int MEASURE_RESET_FLAG = 0;
    public int VISIBLE_RESET_FLAG = 0;
    public int SUBTITLE_VISIBLE_RESET = 0;
    public int FILTER_RESET_FLAG = 0;
    public int FIRST_LOADED_RESET_FLAG = 0;
    public int FIRST_SHOWN_RESET_FLAG = 0;
    public int WILL_DISMISS_RESET_FLAG = 0;
    public int SYNC_TIME_OFFSET_RESET_FLAG = 0;
    public int PREPARE_RESET_FLAG = 0;

    public void resetAll() {
        VISIBLE_RESET_FLAG = 0;
        MEASURE_RESET_FLAG = 0;
        FILTER_RESET_FLAG = 0;
        FIRST_LOADED_RESET_FLAG = 0;
        FIRST_SHOWN_RESET_FLAG = 0;
        WILL_DISMISS_RESET_FLAG = 0;
        SYNC_TIME_OFFSET_RESET_FLAG = 0;
        PREPARE_RESET_FLAG = 0;
    }

    public void updateAll() {
        VISIBLE_RESET_FLAG++;
        MEASURE_RESET_FLAG++;
        FILTER_RESET_FLAG++;
        FIRST_LOADED_RESET_FLAG++;
        FIRST_SHOWN_RESET_FLAG++;
        WILL_DISMISS_RESET_FLAG++;
        SYNC_TIME_OFFSET_RESET_FLAG++;
        PREPARE_RESET_FLAG++;
    }

    public void updateSubtitleVisibleFlag() {
        SUBTITLE_VISIBLE_RESET++;
    }

    public void updateVisibleFlag() {
        VISIBLE_RESET_FLAG++;
    }

    public void updateMeasureFlag() {
        MEASURE_RESET_FLAG++;
    }

    public void updateFilterFlag() {
        FILTER_RESET_FLAG++;
    }

    public void updateFirstLoadedFlag() {
        FIRST_LOADED_RESET_FLAG++;
    }

    public void updateFirstShownFlag() {
        FIRST_SHOWN_RESET_FLAG++;
    }

    public void updateWillDismissFlag() {
        WILL_DISMISS_RESET_FLAG++;
    }

    public void updateSyncOffsetTimeFlag() {
        SYNC_TIME_OFFSET_RESET_FLAG++;
    }

    public void updatePrepareFlag() {
        PREPARE_RESET_FLAG++;
    }
}
