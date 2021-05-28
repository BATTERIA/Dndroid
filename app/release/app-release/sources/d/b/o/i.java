package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import d.d.f;
import d.q.a.a.h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class i {

    /* renamed from: g  reason: collision with root package name */
    public static final PorterDuff.Mode f2923g = PorterDuff.Mode.SRC_IN;

    /* renamed from: h  reason: collision with root package name */
    public static i f2924h;
    public static final c i = new c(6);
    public static final int[] j = {d.b.e.abc_textfield_search_default_mtrl_alpha, d.b.e.abc_textfield_default_mtrl_alpha, d.b.e.abc_ab_share_pack_mtrl_alpha};
    public static final int[] k = {d.b.e.abc_ic_commit_search_api_mtrl_alpha, d.b.e.abc_seekbar_tick_mark_material, d.b.e.abc_ic_menu_share_mtrl_alpha, d.b.e.abc_ic_menu_copy_mtrl_am_alpha, d.b.e.abc_ic_menu_cut_mtrl_alpha, d.b.e.abc_ic_menu_selectall_mtrl_alpha, d.b.e.abc_ic_menu_paste_mtrl_am_alpha};
    public static final int[] l = {d.b.e.abc_textfield_activated_mtrl_alpha, d.b.e.abc_textfield_search_activated_mtrl_alpha, d.b.e.abc_cab_background_top_mtrl_alpha, d.b.e.abc_text_cursor_material, d.b.e.abc_text_select_handle_left_mtrl_dark, d.b.e.abc_text_select_handle_middle_mtrl_dark, d.b.e.abc_text_select_handle_right_mtrl_dark, d.b.e.abc_text_select_handle_left_mtrl_light, d.b.e.abc_text_select_handle_middle_mtrl_light, d.b.e.abc_text_select_handle_right_mtrl_light};
    public static final int[] m = {d.b.e.abc_popup_background_mtrl_mult, d.b.e.abc_cab_background_internal_bg, d.b.e.abc_menu_hardkey_panel_mtrl_mult};
    public static final int[] n = {d.b.e.abc_tab_indicator_material, d.b.e.abc_textfield_search_material};
    public static final int[] o = {d.b.e.abc_btn_check_material, d.b.e.abc_btn_radio_material};

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, d.d.i<ColorStateList>> f2925a;
    public d.d.a<String, d> b;

    /* renamed from: c  reason: collision with root package name */
    public d.d.i<String> f2926c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, d.d.e<WeakReference<Drawable.ConstantState>>> f2927d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f2928e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2929f;

    public static class a implements d {
        @Override // d.b.o.i.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return d.b.m.a.a.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    public static class b implements d {
        @Override // d.b.o.i.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                d.q.a.a.c cVar = new d.q.a.a.c(context, null, null);
                cVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return cVar;
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    public static class c extends f<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }
    }

    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static class e implements d {
        @Override // d.b.o.i.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return h.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f2924h == null) {
                i iVar2 = new i();
                f2924h = iVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    iVar2.a("vector", new e());
                    iVar2.a("animated-vector", new b());
                    iVar2.a("animated-selector", new a());
                }
            }
            iVar = f2924h;
        }
        return iVar;
    }

    public static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (b0.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f2923g;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = d.b.o.i.f2923g
            int[] r1 = d.b.o.i.j
            boolean r1 = a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = d.b.a.colorControlNormal
        L_0x0012:
            r7 = -1
        L_0x0013:
            r1 = 1
            goto L_0x0042
        L_0x0015:
            int[] r1 = d.b.o.i.l
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L_0x0020
            int r2 = d.b.a.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = d.b.o.i.m
            boolean r1 = a(r1, r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = d.b.e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003a
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L_0x0013
        L_0x003a:
            int r1 = d.b.e.abc_dialog_material_background
            if (r7 != r1) goto L_0x003f
            goto L_0x0012
        L_0x003f:
            r7 = -1
            r1 = 0
            r2 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x005f
            boolean r1 = d.b.o.b0.a(r8)
            if (r1 == 0) goto L_0x004e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x004e:
            int r6 = d.b.o.o0.b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = a(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L_0x005e
            r8.setAlpha(r7)
        L_0x005e:
            return r5
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.i.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public final ColorStateList a(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList c2 = o0.c(context, d.b.a.colorSwitchThumbNormal);
        if (c2 == null || !c2.isStateful()) {
            iArr[0] = o0.b;
            iArr2[0] = o0.a(context, d.b.a.colorSwitchThumbNormal);
            iArr[1] = o0.f2965e;
            iArr2[1] = o0.b(context, d.b.a.colorControlActivated);
            iArr[2] = o0.f2966f;
            iArr2[2] = o0.b(context, d.b.a.colorSwitchThumbNormal);
        } else {
            iArr[0] = o0.b;
            iArr2[0] = c2.getColorForState(iArr[0], 0);
            iArr[1] = o0.f2965e;
            iArr2[1] = o0.b(context, d.b.a.colorControlActivated);
            iArr[2] = o0.f2966f;
            iArr2[2] = c2.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public final ColorStateList a(Context context, int i2) {
        int b2 = o0.b(context, d.b.a.colorControlHighlight);
        int a2 = o0.a(context, d.b.a.colorButtonNormal);
        return new ColorStateList(new int[][]{o0.b, o0.f2964d, o0.f2963c, o0.f2966f}, new int[]{a2, d.g.f.a.a(b2, i2), d.g.f.a.a(b2, i2), i2});
    }

    public final void a(String str, d dVar) {
        if (this.b == null) {
            this.b = new d.d.a<>();
        }
        this.b.put(str, dVar);
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            d.d.e<WeakReference<Drawable.ConstantState>> eVar = this.f2927d.get(context);
            if (eVar == null) {
                eVar = new d.d.e<>();
                this.f2927d.put(context, eVar);
            }
            eVar.c(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final Drawable b(Context context, int i2) {
        if (this.f2928e == null) {
            this.f2928e = new TypedValue();
        }
        TypedValue typedValue = this.f2928e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable a2 = a(context, j2);
        if (a2 != null) {
            return a2;
        }
        if (i2 == d.b.e.abc_cab_background_top_material) {
            a2 = new LayerDrawable(new Drawable[]{c(context, d.b.e.abc_cab_background_internal_bg), c(context, d.b.e.abc_cab_background_top_mtrl_alpha)});
        }
        if (a2 != null) {
            a2.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, a2);
        }
        return a2;
    }

    public synchronized void b(Context context) {
        d.d.e<WeakReference<Drawable.ConstantState>> eVar = this.f2927d.get(context);
        if (eVar != null) {
            eVar.b();
        }
    }

    public synchronized Drawable c(Context context, int i2) {
        return a(context, i2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList d(android.content.Context r4, int r5) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.i.d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b A[Catch:{ Exception -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1 A[Catch:{ Exception -> 0x00a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable e(android.content.Context r11, int r12) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.i.e(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable a(Context context, long j2) {
        d.d.e<WeakReference<Drawable.ConstantState>> eVar = this.f2927d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> b2 = eVar.b(j2, null);
        if (b2 != null) {
            Drawable.ConstantState constantState = b2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.b(j2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable a(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f2929f     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0006
            goto L_0x002a
        L_0x0006:
            r0 = 1
            r4.f2929f = r0     // Catch:{ all -> 0x0047 }
            int r1 = d.b.e.abc_vector_test     // Catch:{ all -> 0x0047 }
            android.graphics.drawable.Drawable r1 = r4.c(r5, r1)     // Catch:{ all -> 0x0047 }
            r2 = 0
            if (r1 == 0) goto L_0x0049
            boolean r3 = r1 instanceof d.q.a.a.h     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0047 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0049
        L_0x002a:
            android.graphics.drawable.Drawable r0 = r4.e(r5, r6)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0034
            android.graphics.drawable.Drawable r0 = r4.b(r5, r6)     // Catch:{ all -> 0x0047 }
        L_0x0034:
            if (r0 != 0) goto L_0x003a
            android.graphics.drawable.Drawable r0 = d.g.e.a.b(r5, r6)     // Catch:{ all -> 0x0047 }
        L_0x003a:
            if (r0 == 0) goto L_0x0040
            android.graphics.drawable.Drawable r0 = r4.a(r5, r6, r7, r0)     // Catch:{ all -> 0x0047 }
        L_0x0040:
            if (r0 == 0) goto L_0x0045
            d.b.o.b0.b(r0)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r4)
            return r0
        L_0x0047:
            r5 = move-exception
            goto L_0x0053
        L_0x0049:
            r4.f2929f = r2
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)
            throw r5
        L_0x0053:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.i.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (i.class) {
            c cVar = i;
            if (cVar != null) {
                int i3 = (i2 + 31) * 31;
                porterDuffColorFilter = (PorterDuffColorFilter) cVar.a(Integer.valueOf(mode.hashCode() + i3));
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                    c cVar2 = i;
                    if (cVar2 != null) {
                        PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar2.a(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
                    } else {
                        throw null;
                    }
                }
            } else {
                throw null;
            }
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i3;
        ColorStateList d2 = d(context, i2);
        PorterDuff.Mode mode = null;
        if (d2 != null) {
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable a2 = c.a.a.a.a.a(drawable);
            c.a.a.a.a.a(a2, d2);
            if (i2 == d.b.e.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return a2;
            }
            c.a.a.a.a.a(a2, mode);
            return a2;
        }
        if (i2 == d.b.e.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(16908288), o0.b(context, d.b.a.colorControlNormal), f2923g);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i3 = d.b.a.colorControlNormal;
        } else if (i2 == d.b.e.abc_ratingbar_material || i2 == d.b.e.abc_ratingbar_indicator_material || i2 == d.b.e.abc_ratingbar_small_material) {
            layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(16908288), o0.a(context, d.b.a.colorControlNormal), f2923g);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i3 = d.b.a.colorControlActivated;
        } else if (a(context, i2, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
        a(findDrawableByLayerId, o0.b(context, i3), f2923g);
        a(layerDrawable.findDrawableByLayerId(16908301), o0.b(context, d.b.a.colorControlActivated), f2923g);
        return drawable;
    }

    public static void a(Drawable drawable, r0 r0Var, int[] iArr) {
        if (!b0.a(drawable) || drawable.mutate() == drawable) {
            if (r0Var.f2978d || r0Var.f2977c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = r0Var.f2978d ? r0Var.f2976a : null;
                PorterDuff.Mode mode = r0Var.f2977c ? r0Var.b : f2923g;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }
}
