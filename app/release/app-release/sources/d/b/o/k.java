package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import d.g.l.o;
import d.g.m.f;

public class k extends ImageButton implements o, f {

    /* renamed from: c  reason: collision with root package name */
    public final e f2932c;

    /* renamed from: d  reason: collision with root package name */
    public final l f2933d;

    public k(Context context, AttributeSet attributeSet, int i) {
        super(q0.a(context), attributeSet, i);
        e eVar = new e(this);
        this.f2932c = eVar;
        eVar.a(attributeSet, i);
        l lVar = new l(this);
        this.f2933d = lVar;
        lVar.a(attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2932c;
        if (eVar != null) {
            eVar.a();
        }
        l lVar = this.f2933d;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // d.g.l.o
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2932c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // d.g.l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2932c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // d.g.m.f
    public ColorStateList getSupportImageTintList() {
        r0 r0Var;
        l lVar = this.f2933d;
        if (lVar == null || (r0Var = lVar.b) == null) {
            return null;
        }
        return r0Var.f2976a;
    }

    @Override // d.g.m.f
    public PorterDuff.Mode getSupportImageTintMode() {
        r0 r0Var;
        l lVar = this.f2933d;
        if (lVar == null || (r0Var = lVar.b) == null) {
            return null;
        }
        return r0Var.b;
    }

    public boolean hasOverlappingRendering() {
        return this.f2933d.b() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2932c;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f2932c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.f2933d;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.f2933d;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setImageResource(int i) {
        this.f2933d.a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f2933d;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2932c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2932c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // d.g.m.f
    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.f2933d;
        if (lVar != null) {
            lVar.a(colorStateList);
        }
    }

    @Override // d.g.m.f
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.f2933d;
        if (lVar != null) {
            lVar.a(mode);
        }
    }
}
