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

package master.flame.danmaku.danmaku.model;


public class R2LImageDanmaku extends R2LDanmaku {

    private float yRatioPosition = 0;

    public R2LImageDanmaku(Duration duration, float yRatioPosition) {
        super(duration);
        this.duration = duration;
        this.yRatioPosition = yRatioPosition;
    }

    @Override
    protected void setY(IDisplayer displayer, float y) {
        y = displayer.getOriginHeight() * this.yRatioPosition;
        if (y + this.paintHeight > displayer.getOriginHeight()) {
            y = displayer.getOriginHeight() - this.paintHeight;
        }
        this.y = y;
    }

    @Override
    public int getType() {
        return TYPE_SCROLL_RL_IMAGE;
    }

    @Override
    public void measure(IDisplayer displayer, boolean fromWorkerThread) {
        super.measure(displayer, fromWorkerThread);
        setY(displayer, 0f);
    }
}
