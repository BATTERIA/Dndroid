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

import android.os.SystemClock;

public class DanmakuTimer {
    private long lastSystemClock;
    private long currMillisecond;

    public DanmakuTimer() {
        currMillisecond = 0;
        lastSystemClock = SystemClock.elapsedRealtime();
    }

    public DanmakuTimer(long curr) {
        update(curr);
    }

    public void update(long curr) {
        currMillisecond = curr;
        lastSystemClock = SystemClock.elapsedRealtime();
    }

    public void update() {
        long now = SystemClock.elapsedRealtime();
        currMillisecond = now - lastSystemClock + currMillisecond;
        lastSystemClock = now;
    }

    public long current() {
        return currMillisecond;
    }

    public long naturalCurrent() {
        return SystemClock.elapsedRealtime() - lastSystemClock + currMillisecond;
    }
}
