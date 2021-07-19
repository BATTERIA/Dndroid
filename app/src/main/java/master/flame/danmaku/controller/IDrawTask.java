/*
 * Copyright (C) 2013 Chen Hui <calmer91@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package master.flame.danmaku.controller;

import master.flame.danmaku.danmaku.model.AbsDisplayer;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.Duration;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;
import master.flame.danmaku.danmaku.renderer.IRenderer.RenderingState;
import master.flame.danmaku.danmaku.util.DanmakuReportParameters;

public interface IDrawTask {
    public static final int PLAY_STATE_PLAYING = 1;
    public static final int PLAY_STATE_PAUSE = 2;

    public void addDanmaku(BaseDanmaku item);

    public void removeAllDanmakus(boolean isClearDanmakusOnScreen);

    public void removeAllLiveDanmakus();

    public void clearDanmakusOnScreen(long currMillis);

	public IDanmakus getVisibleDanmakusOnTime(long time);

	public IDanmakus getDanmakusInDuration(long beginMills, long endMills, boolean isDuplicateMergingEnabled);

	public void addHoveredDanmaku(BaseDanmaku danmaku);

	public void removeHoveredDanmaku(BaseDanmaku danmaku);

    public RenderingState draw(AbsDisplayer displayer, DrawHelper.Mode mode);

    public void reset();

    public void seek(long mills);

    public void start();

    public void quit();

    public void prepare();

    public void onPlayStateChanged(int state);

    public void requestClear();

    DanmakuReportParameters reportDanmakuParameters(long time);

    void requestClearRetainer();

    void requestClearRetainer(Integer type);

    void requestSync(long fromTimeMills, long toTimeMills, long offsetMills);

    public void setParser(BaseDanmakuParser parser);

    void invalidateDanmaku(BaseDanmaku item, boolean remeasure);

    void removeDanmakusByType(int type);

    long getCurrentCachingTimeMills();

    long getCurrentCachingBeginTimeMills();

    public interface TaskListener {
        public void ready();

        public void onDanmakuAdd(BaseDanmaku danmaku);

        public void onDanmakuShown(BaseDanmaku danmaku);

        public void onDanmakuWillDismiss(BaseDanmaku danmaku);

        public void onDanmakuConfigChanged();

        public void onDanmakusDrawingFinished();

        public void onLayerPreUpdate(int layer);

        public void onLayerUpdate(int layer);

        void onDanmakuVisibilityChanged();
    }

    public void requestHide();

    void requestRender();

    class Layer {
        private static final int MAX_SPECIAL_DM_COUNTS_ON_SCREEN_PER_SECOND = 30;

        public Layer(int id) {
            mId = id;
            danmakus = new Danmakus(IDanmakus.ST_BY_LIST);
        }

        public Layer(int id, IDanmakus.BaseComparator comparator) {
            mId = id;
            danmakus = new Danmakus(IDanmakus.ST_BY_TIME, false, comparator);
        }

        private int mId;

        private long mLastBeginMills;

        private long mLastEndMills;

        public IDanmakus danmakus;

        private Duration mMaxDuration = new Duration(0);

        public IDanmakus currentScreenDanmakus = new Danmakus(Danmakus.ST_BY_LIST);

        public IDanmakus stoppedDanmakus = new Danmakus(Danmakus.ST_BY_TIME);

        public IDanmakus obtainCurrent() {
            return null;
        }

        public IDanmakus getCurrent(long beginMills, long endMills) {
            return null;
        }

        public synchronized boolean addDanmaku(BaseDanmaku item) {
            boolean subAdded = true;
            long time = item.getActualTime();
            if (time >= mLastBeginMills && time <= mLastEndMills) {
                subAdded = currentScreenDanmakus.addItem(item);
            } else if (item.isLive) {
                subAdded = false;
            }
            boolean added = danmakus.addItem(item);
            mMaxDuration =  item.getDuration() > mMaxDuration.value ? item.duration : mMaxDuration;
            if (!subAdded || !added) {
                mLastBeginMills = mLastEndMills = 0;
            }
            return added;
        }

        public void removeAllDanmakus(boolean isClearDanmakusOnScreen) {
            if (isClearDanmakusOnScreen) {
                currentScreenDanmakus.clear();
                stoppedDanmakus.clear();
            }
            danmakus.clear();
        }

        public void reset() {
            currentScreenDanmakus = new Danmakus();
            stoppedDanmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                @Override
                public int accept(BaseDanmaku danmaku) {
                    if (danmaku.isHovered()) {
                        danmaku.setDanmakuHovered(false);
                    }
                    danmaku.resetHoverTime();
                    return ACTION_REMOVE;
                }
            });
            mLastBeginMills = mLastEndMills = 0;
        }

        public void resetRange() {
            mLastBeginMills = mLastEndMills = 0;
        }

        public boolean prepareDanmakusOnScreen(DanmakuContext context, long beginMills, long endMills, DanmakuTimer timer, boolean noCache, boolean isSpecilDanmaku) {
            if (noCache || mLastBeginMills > beginMills || timer.current() > mLastEndMills) {
                final IDanmakus screenDanmakus;
                if (stoppedDanmakus != null && !stoppedDanmakus.isEmpty()) {
                    screenDanmakus = danmakus.subNewSet(beginMills, endMills);
                    stoppedDanmakus.forEachSync(new IDanmakus.DefaultConsumer<BaseDanmaku>() {
                        @Override
                        public int accept(BaseDanmaku danmaku) {
                            if (danmaku.isTimeOut()) {
                                return ACTION_REMOVE;
                            }
                            screenDanmakus.removeItem(danmaku);
                            return ACTION_CONTINUE;
                        }
                    });
                } else {
                    screenDanmakus = danmakus.sub(beginMills, endMills);
                }
                if (screenDanmakus != null) {
                    final int maxSpecialDmCounts = (int) (floorDiv((endMills - beginMills),1000) * MAX_SPECIAL_DM_COUNTS_ON_SCREEN_PER_SECOND);
                    if (isSpecilDanmaku && screenDanmakus.size() > maxSpecialDmCounts) {
                        final IDanmakus newScreenDanmaku = new Danmakus();
                        screenDanmakus.forEachSync(new IDanmakus.Consumer<BaseDanmaku, Object>() {
                            private int count = 0;

                            @Override
                            public int accept(BaseDanmaku t) {
                                if (count > maxSpecialDmCounts) {
                                    return ACTION_BREAK;
                                }
                                newScreenDanmaku.addItem(t);
                                count++;
                                return ACTION_CONTINUE;
                            }
                        });
                        this.currentScreenDanmakus = newScreenDanmaku;
                    } else {
                        this.currentScreenDanmakus = screenDanmakus;
                    }
                }
                mLastBeginMills = beginMills;
                mLastEndMills = endMills;
                return true;
            }
            return false;
        }

        public long getLastBeginMills() {
            return mLastBeginMills;
        }

        public long getLastEndMillsMills() {
            return mLastEndMills;
        }

        public int getDanmakusSize() {
            return danmakus.size();
        }

        public boolean removeItem(BaseDanmaku danmaku) {
            return danmakus.removeItem(danmaku);
        }

        public IDanmakus subnew(long beginMills, long endMills) {
            return danmakus.subnew(beginMills, endMills);
        }

        public IDanmakus subNewSet(long beginMills, long endMills) {
            return danmakus.subNewSet(beginMills, endMills);
        }

        public int getId() {
            return mId;
        }

        public long getMaxDuration() {
            return mMaxDuration.value;
        }

        private long floorDiv(long x, long y) {
            if (y == 0) {
                return 0;
            }
            long r = x / y;
            // if the signs are different and modulo not zero, round down
            if ((x ^ y) < 0 && (r * y != x)) {
                r--;
            }
            return r;
        }
    }


}
