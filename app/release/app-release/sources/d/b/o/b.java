package d.b.o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f2865a;

    public b(ActionBarContainer actionBarContainer) {
        this.f2865a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f2865a;
        if (actionBarContainer.j) {
            Drawable drawable = actionBarContainer.i;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2286g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f2865a;
        Drawable drawable3 = actionBarContainer2.f2287h;
        if (drawable3 != null && actionBarContainer2.k) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f2865a;
        if (actionBarContainer.j) {
            drawable = actionBarContainer.i;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f2286g;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
