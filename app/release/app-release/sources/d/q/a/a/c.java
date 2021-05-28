package d.q.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class c extends g implements b {

    /* renamed from: d  reason: collision with root package name */
    public b f3685d;

    /* renamed from: e  reason: collision with root package name */
    public Context f3686e;

    /* renamed from: f  reason: collision with root package name */
    public ArgbEvaluator f3687f;

    /* renamed from: g  reason: collision with root package name */
    public final Drawable.Callback f3688g;

    public class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    public static class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f3690a;
        public h b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f3691c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f3692d;

        /* renamed from: e  reason: collision with root package name */
        public d.d.a<Animator, String> f3693e;

        public b(b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f3690a = bVar.f3690a;
                h hVar = bVar.b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    h hVar2 = (h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.b = hVar2;
                    hVar2.mutate();
                    this.b = hVar2;
                    hVar2.setCallback(callback);
                    this.b.setBounds(bVar.b.getBounds());
                    this.b.f3703h = false;
                }
                ArrayList<Animator> arrayList = bVar.f3692d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f3692d = new ArrayList<>(size);
                    this.f3693e = new d.d.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f3692d.get(i);
                        Animator clone = animator.clone();
                        String orDefault = bVar.f3693e.getOrDefault(animator, null);
                        clone.setTarget(this.b.f3699d.b.p.getOrDefault(orDefault, null));
                        this.f3692d.add(clone);
                        this.f3693e.put(clone, orDefault);
                    }
                    if (this.f3691c == null) {
                        this.f3691c = new AnimatorSet();
                    }
                    this.f3691c.playTogether(this.f3692d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f3690a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this(null, null, null);
    }

    public c(Context context, b bVar, Resources resources) {
        this.f3687f = null;
        this.f3688g = new a();
        this.f3686e = context;
        if (bVar != null) {
            this.f3685d = bVar;
        } else {
            this.f3685d = new b(bVar, this.f3688g, resources);
        }
    }

    public final void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f3687f == null) {
                    this.f3687f = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f3687f);
            }
        }
    }

    @Override // d.q.a.a.g
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3698c;
        if (drawable != null && Build.VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f3698c;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return drawable.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f3685d.b.draw(canvas);
        if (this.f3685d.f3691c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f3685d.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3685d.f3690a;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f3698c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0115c(this.f3698c.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3685d.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3685d.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.getOpacity() : this.f3685d.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f2, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0140, code lost:
        r20.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:34:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0140  */
    @Override // android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: d.q.a.a.c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f3685d.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f3698c;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3685d.f3691c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.isStateful() : this.f3685d.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3685d.b.setBounds(rect);
        }
    }

    @Override // d.q.a.a.g
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.setLevel(i) : this.f3685d.b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3698c;
        return drawable != null ? drawable.setState(iArr) : this.f3685d.b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3685d.b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        h hVar = this.f3685d.b;
        Drawable drawable2 = hVar.f3698c;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            hVar.f3699d.f3728e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        h hVar = this.f3685d.b;
        Drawable drawable2 = hVar.f3698c;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        hVar.f3701f = colorFilter;
        hVar.invalidateSelf();
    }

    @Override // d.g.f.i.a
    public void setTint(int i) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            c.a.a.a.a.b(drawable, i);
        } else {
            this.f3685d.b.setTint(i);
        }
    }

    @Override // d.g.f.i.a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            c.a.a.a.a.a(drawable, colorStateList);
        } else {
            this.f3685d.b.setTintList(colorStateList);
        }
    }

    @Override // d.g.f.i.a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            c.a.a.a.a.a(drawable, mode);
        } else {
            this.f3685d.b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f3685d.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f3685d.f3691c.isStarted()) {
            this.f3685d.f3691c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f3698c;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3685d.f3691c.end();
        }
    }

    /* renamed from: d.q.a.a.c$c  reason: collision with other inner class name */
    public static class C0115c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f3694a;

        public C0115c(Drawable.ConstantState constantState) {
            this.f3694a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f3694a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f3694a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f3694a.newDrawable();
            cVar.f3698c = newDrawable;
            newDrawable.setCallback(cVar.f3688g);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f3694a.newDrawable(resources);
            cVar.f3698c = newDrawable;
            newDrawable.setCallback(cVar.f3688g);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f3694a.newDrawable(resources, theme);
            cVar.f3698c = newDrawable;
            newDrawable.setCallback(cVar.f3688g);
            return cVar;
        }
    }
}
