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

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;

public class DrawHelper {

    public enum Mode {

        COLOR_CLEAR() {
            @Override
            public void clearCanvasUseMode(Canvas canvas) {
                canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR);
            }
        },

        DRAW_RECT() {
            @Override
            public void clearCanvasUseMode(Canvas canvas) {
                RECT.set(0, 0, canvas.getWidth(), canvas.getHeight());
                clearCanvas(canvas, RECT);
            }
        },

        COLOR_SRC_OVER() {
            @Override
            public void clearCanvasUseMode(Canvas canvas) {
                canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.SRC_OVER);
            }
        };

        public abstract void clearCanvasUseMode(Canvas canvas);

    }

    public static Paint PAINT, PAINT_FPS;

    public static RectF RECT;

    static {
        PAINT = new Paint();
        PAINT.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        PAINT.setColor(Color.TRANSPARENT);
        RECT = new RectF();
    }

    public static void drawFPS(Canvas canvas, String text) {
        if (PAINT_FPS == null) {
            PAINT_FPS = new Paint();
            PAINT_FPS.setColor(Color.RED);
            PAINT_FPS.setTextSize(30);
        }
        int top = canvas.getHeight() - 50;
        clearCanvas(canvas, 10, top - 50, (int) (PAINT_FPS.measureText(text) + 20), canvas.getHeight());
        canvas.drawText(text, 10, top, PAINT_FPS);
    }

    public static void clearCanvas(Canvas canvas, Mode mode) {
        mode.clearCanvasUseMode(canvas);
    }
    
    public static void fillTransparent(Canvas canvas){
        canvas.drawColor(0x00000000, PorterDuff.Mode.CLEAR);
    }

    public static void clearCanvas(Canvas canvas, float left, float top, float right, float bottom) {
        RECT.set(left, top, right, bottom);
        clearCanvas(canvas, RECT);
    }

    private static void clearCanvas(Canvas canvas, RectF rect) {
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        canvas.drawRect(rect, PAINT);
    }
}
