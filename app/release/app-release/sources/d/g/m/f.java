package d.g.m;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

public interface f {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
