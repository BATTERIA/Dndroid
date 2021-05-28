package c.a.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import d.b.o.b1;
import d.b.o.x0;
import d.e.a.h.c;
import d.e.a.h.d;
import d.e.a.h.e;
import d.e.a.h.g;
import d.e.a.h.i;
import d.e.a.h.j;
import d.e.a.h.l;
import d.g.j.a;
import d.j.d.h;
import d.k.a.a.b;
import d.o.c.s;
import d.q.a.a.f;
import e.c.a.b.w;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Field f2576a;
    public static boolean b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f2577c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f2578d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f2579e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2580f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f2581g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f2582h;
    public static Method i;
    public static boolean j;
    public static Method k;
    public static boolean l;
    public static Field m;
    public static boolean n;
    public static Field o;
    public static boolean p;
    public static Method q;
    public static boolean r;
    public static Field s;
    public static boolean t;
    public static List<Field> u;

    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, float f2) {
        return !a(xmlPullParser, str) ? f2 : typedArray.getFloat(i2, f2);
    }

    public static int a(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !a(xmlPullParser, str) ? i3 : typedArray.getColor(i2, i3);
    }

    public static int a(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.d() == 0 || xVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(mVar.i(view) - mVar.i(view2)) + 1;
        }
        return Math.min(sVar.g(), sVar.a(view2) - sVar.d(view));
    }

    public static int a(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z, boolean z2) {
        if (mVar.d() == 0 || xVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (xVar.a() - Math.max(mVar.i(view), mVar.i(view2))) - 1) : Math.max(0, Math.min(mVar.i(view), mVar.i(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(sVar.a(view2) - sVar.d(view))) / ((float) (Math.abs(mVar.i(view) - mVar.i(view2)) + 1)))) + ((float) (sVar.f() - sVar.d(view))));
    }

    public static int a(d dVar) {
        if (dVar.e() == d.a.MATCH_CONSTRAINT) {
            int d2 = (int) (dVar.H == 0 ? ((float) dVar.d()) * dVar.G : ((float) dVar.d()) / dVar.G);
            dVar.f(d2);
            return d2;
        } else if (dVar.i() != d.a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            int j2 = (int) (dVar.H == 1 ? ((float) dVar.j()) * dVar.G : ((float) dVar.j()) / dVar.G);
            dVar.e(j2);
            return j2;
        }
    }

    public static int a(d dVar, int i2) {
        d dVar2;
        c cVar;
        int i3 = i2 * 2;
        c[] cVarArr = dVar.A;
        c cVar2 = cVarArr[i3];
        c cVar3 = cVarArr[i3 + 1];
        c cVar4 = cVar2.f3150d;
        if (cVar4 == null || cVar4.b != (dVar2 = dVar.D) || (cVar = cVar3.f3150d) == null || cVar.b != dVar2) {
            return 0;
        }
        return (int) (((float) (((dVar2.c(i2) - cVar2.a()) - cVar3.a()) - dVar.c(i2))) * (i2 == 0 ? dVar.V : dVar.W));
    }

    public static Keyframe a(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    public static Intent a(Context context, ComponentName componentName) {
        String b2 = b(context, componentName);
        if (b2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b2);
        return b(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static Drawable a(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 23 ? drawable : i2 >= 21 ? !(drawable instanceof d.g.f.i.a) ? new d.g.f.i.d(drawable) : drawable : !(drawable instanceof d.g.f.i.a) ? new d.g.f.i.c(drawable) : drawable;
    }

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!p) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            p = true;
        }
        Field field = o;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                o = null;
            }
        }
        return null;
    }

    public static ActionMode.Callback a(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof d.g.m.d)) ? callback : new d.g.m.d(callback, textView);
    }

    public static Interpolator a(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        XmlResourceParser xmlResourceParser = null;
        if (i2 == 17563663) {
            try {
                return new d.k.a.a.a();
            } catch (XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e2);
                throw notFoundException;
            } catch (IOException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            } catch (Throwable th) {
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } else if (i2 == 17563661) {
            return new b();
        } else {
            if (i2 == 17563662) {
                return new d.k.a.a.c();
            }
            XmlResourceParser animation = context.getResources().getAnimation(i2);
            context.getResources();
            context.getTheme();
            Interpolator a2 = a(context, (XmlPullParser) animation);
            animation.close();
            return a2;
        }
    }

    public static Interpolator a(Context context, XmlPullParser xmlPullParser) {
        Interpolator fVar;
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    String name = xmlPullParser.getName();
                    if (name.equals("linearInterpolator")) {
                        interpolator = new LinearInterpolator();
                    } else {
                        if (name.equals("accelerateInterpolator")) {
                            fVar = new AccelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("decelerateInterpolator")) {
                            fVar = new DecelerateInterpolator(context, asAttributeSet);
                        } else if (name.equals("accelerateDecelerateInterpolator")) {
                            interpolator = new AccelerateDecelerateInterpolator();
                        } else if (name.equals("cycleInterpolator")) {
                            fVar = new CycleInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateInterpolator")) {
                            fVar = new AnticipateInterpolator(context, asAttributeSet);
                        } else if (name.equals("overshootInterpolator")) {
                            fVar = new OvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("anticipateOvershootInterpolator")) {
                            fVar = new AnticipateOvershootInterpolator(context, asAttributeSet);
                        } else if (name.equals("bounceInterpolator")) {
                            interpolator = new BounceInterpolator();
                        } else if (name.equals("pathInterpolator")) {
                            fVar = new f(context, asAttributeSet, xmlPullParser);
                        } else {
                            StringBuilder a2 = e.a.a.a.a.a("Unknown interpolator name: ");
                            a2.append(xmlPullParser.getName());
                            throw new RuntimeException(a2.toString());
                        }
                        interpolator = fVar;
                    }
                }
            }
        }
        return interpolator;
    }

    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof b1) {
                    editorInfo.hintText = ((b1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder a2 = e.a.a.a.a.a(".font");
        a2.append(Process.myPid());
        a2.append("-");
        a2.append(Process.myTid());
        a2.append("-");
        String sb = a2.toString();
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, e.a.a.a.a.a(sb, i2));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static <T> T a(T t2, Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static String a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (!a(xmlPullParser, str)) {
            return null;
        }
        return typedArray.getString(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r9.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0047, code lost:
        r8.addSuppressed(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004a, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch:{ IOException -> 0x004b }
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x004b }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x003f }
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ all -> 0x003f }
            r8.<init>(r9)     // Catch:{ all -> 0x003f }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x0033 }
            long r5 = r1.size()     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            r8.close()
            r7.close()
            return r9
        L_0x0033:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r8 = move-exception
            r9.addSuppressed(r8)
        L_0x003e:
            throw r1
        L_0x003f:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r9 = move-exception
            r7.close()     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0046:
            r7 = move-exception
            r8.addSuppressed(r7)
        L_0x004a:
            throw r9
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    public static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static void a(Drawable drawable, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f2, f3);
        }
    }

    public static void a(Drawable drawable, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof d.g.f.i.a) {
            ((d.g.f.i.a) drawable).setTintList(colorStateList);
        }
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof d.g.f.i.a) {
            ((d.g.f.i.a) drawable).setTintMode(mode);
        }
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!n) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                m = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                StringBuilder a2 = e.a.a.a.a.a("forceSetFactory2 Could not find field 'mFactory2' on class ");
                a2.append(LayoutInflater.class.getName());
                a2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", a2.toString(), e2);
            }
            n = true;
        }
        Field field = m;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e3);
            }
        }
    }

    public static void a(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f2, f3);
        } else {
            edgeEffect.onPull(f2);
        }
    }

    public static void a(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i2);
            return;
        }
        if (!r) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                q = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            r = true;
        }
        Method method = q;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i2 >= 21) {
            if (!t) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    s = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                t = true;
            }
            Field field = s;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    public static void a(TextView textView, int i2) {
        a(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 - (-i3), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0166, code lost:
        if (r12.f0 == 2) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x016a, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e8, code lost:
        if (r4[r10].f3150d.b == r15) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x014a, code lost:
        if (r12.e0 == 2) goto L_0x0168;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(d.e.a.h.e r27, d.e.a.e r28, int r29) {
        /*
        // Method dump skipped, instructions count: 1130
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(d.e.a.h.e, d.e.a.e, int):void");
    }

    public static void a(Object obj) {
        if (!f2578d) {
            try {
                f2577c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f2578d = true;
        }
        Class cls = f2577c;
        if (cls != null) {
            if (!f2580f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f2579e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f2580f = true;
            }
            Field field = f2579e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public static void a(Object obj, StringBuilder sb) {
        String hexString;
        int lastIndexOf;
        if (obj == null) {
            hexString = "null";
        } else {
            String simpleName = obj.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    public static void a(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static boolean a(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i2);
        }
        if (!j) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            j = true;
        }
        Method method = i;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i2));
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                i = null;
            }
        }
        return false;
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean a(d.g.f.b[] bVarArr, d.g.f.b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            if (!(bVarArr[i2].f3261a == bVarArr2[i2].f3261a && bVarArr[i2].b.length == bVarArr2[i2].b.length)) {
                return false;
            }
        }
        return true;
    }

    public static float[] a(float[] fArr, int i2, int i3) {
        if (i2 <= i3) {
            int length = fArr.length;
            if (i2 < 0 || i2 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i4 = i3 - i2;
            int min = Math.min(i4, length - i2);
            float[] fArr2 = new float[i4];
            System.arraycopy(fArr, i2, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static d.g.f.b[] a(d.g.f.b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        d.g.f.b[] bVarArr2 = new d.g.f.b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = new d.g.f.b(bVarArr[i2]);
        }
        return bVarArr2;
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !a(xmlPullParser, str) ? i3 : typedArray.getInt(i2, i3);
    }

    public static int b(RecyclerView.x xVar, s sVar, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.d() == 0 || xVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return xVar.a();
        }
        return (int) ((((float) (sVar.a(view2) - sVar.d(view))) / ((float) (Math.abs(mVar.i(view) - mVar.i(view2)) + 1))) * ((float) xVar.a()));
    }

    public static Path b(String str) {
        Path path = new Path();
        d.g.f.b[] a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            d.g.f.b.a(a2, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException(e.a.a.a.a.b("Error in parsing ", str), e2);
        }
    }

    public static String b(Context context, ComponentName componentName) {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void b(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i2);
        } else if (drawable instanceof d.g.f.i.a) {
            ((d.g.f.i.a) drawable).setTint(i2);
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                a(layoutInflater, factory2);
            }
        }
    }

    public static void b(TextView textView, int i2) {
        a(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static boolean b(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static void c(TextView textView, int i2) {
        a(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v55, resolved type: d.e.a.h.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2.e0 == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r2.f0 == 2) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0467  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x046a  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ef  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0514  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x03cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(d.e.a.h.e r33, d.e.a.e r34, int r35, int r36, d.e.a.h.b r37) {
        /*
        // Method dump skipped, instructions count: 1379
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(d.e.a.h.e, d.e.a.e, int, int, d.e.a.h.b):void");
    }

    public static int a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = Build.VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if ((Build.VERSION.SDK_INT >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) : 1) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0014 A[SYNTHETIC, Splitter:B:13:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r0, android.content.res.Resources r1, int r2) {
        /*
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ all -> 0x0010 }
            boolean r0 = a(r0, r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()     // Catch:{ IOException -> 0x000d }
        L_0x000d:
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()     // Catch:{ IOException -> 0x0017 }
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(java.io.File, android.content.res.Resources, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047 A[SYNTHETIC, Splitter:B:25:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0050 A[SYNTHETIC, Splitter:B:31:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r5, java.io.InputStream r6) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002a }
            r3.<init>(r5, r1)     // Catch:{ IOException -> 0x002a }
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
        L_0x000f:
            int r2 = r6.read(r5)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r4 = -1
            if (r2 == r4) goto L_0x001a
            r3.write(r5, r1, r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            goto L_0x000f
        L_0x001a:
            r5 = 1
            r3.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            android.os.StrictMode.setThreadPolicy(r0)
            return r5
        L_0x0022:
            r5 = move-exception
            r2 = r3
            goto L_0x004e
        L_0x0025:
            r5 = move-exception
            r2 = r3
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            goto L_0x004e
        L_0x002a:
            r5 = move-exception
        L_0x002b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r3.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0028 }
            r3.append(r5)     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0028 }
            android.util.Log.e(r6, r5)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x004e:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            android.os.StrictMode.setThreadPolicy(r0)
            goto L_0x0058
        L_0x0057:
            throw r5
        L_0x0058:
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(java.io.File, java.io.InputStream):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v16, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0305  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28, float r29) {
        /*
        // Method dump skipped, instructions count: 855
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r13 == false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[Catch:{ NumberFormatException -> 0x00ba }, LOOP:3: B:25:0x006d->B:45:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d.g.f.b[] a(java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(java.lang.String):d.g.f.b[]");
    }

    public static void a(e eVar) {
        if ((eVar.C0 & 32) != 32) {
            eVar.w0.clear();
            eVar.w0.add(0, new d.e.a.h.f(eVar.k0));
            return;
        }
        eVar.D0 = true;
        eVar.x0 = false;
        eVar.y0 = false;
        eVar.z0 = false;
        ArrayList<d> arrayList = eVar.k0;
        List<d.e.a.h.f> list = eVar.w0;
        boolean z = eVar.e() == d.a.WRAP_CONTENT;
        boolean z2 = eVar.i() == d.a.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (d dVar : arrayList) {
            dVar.p = null;
            dVar.d0 = false;
            dVar.m();
        }
        for (d dVar2 : arrayList) {
            if (dVar2.p == null) {
                d.e.a.h.f fVar = new d.e.a.h.f(new ArrayList(), true);
                list.add(fVar);
                if (!a(dVar2, fVar, list, z3)) {
                    eVar.w0.clear();
                    eVar.w0.add(0, new d.e.a.h.f(eVar.k0));
                    eVar.D0 = false;
                    return;
                }
            }
        }
        int i2 = 0;
        int i3 = 0;
        for (d.e.a.h.f fVar2 : list) {
            i2 = Math.max(i2, a(fVar2, 0));
            i3 = Math.max(i3, a(fVar2, 1));
        }
        if (z) {
            eVar.a(d.a.FIXED);
            eVar.f(i2);
            eVar.x0 = true;
            eVar.y0 = true;
            eVar.A0 = i2;
        }
        if (z2) {
            eVar.b(d.a.FIXED);
            eVar.e(i3);
            eVar.x0 = true;
            eVar.z0 = true;
            eVar.B0 = i3;
        }
        a(list, 0, eVar.j());
        a(list, 1, eVar.d());
    }

    public static int a(d.e.a.h.f fVar, int i2) {
        int i3 = i2 * 2;
        List<d> list = null;
        if (fVar != null) {
            if (i2 == 0) {
                list = fVar.f3184f;
            } else if (i2 == 1) {
                list = fVar.f3185g;
            }
            int size = list.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                d dVar = list.get(i5);
                c[] cVarArr = dVar.A;
                int i6 = i3 + 1;
                i4 = Math.max(i4, a(dVar, i2, cVarArr[i6].f3150d == null || !(cVarArr[i3].f3150d == null || cVarArr[i6].f3150d == null), 0));
            }
            fVar.f3183e[i2] = i4;
            return i4;
        }
        throw null;
    }

    public static int a(d dVar, int i2, boolean z, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int j2;
        int i9;
        int i10;
        d dVar2;
        int i11 = 0;
        if (!dVar.b0) {
            return 0;
        }
        boolean z2 = dVar.w.f3150d != null && i2 == 1;
        if (z) {
            i7 = dVar.Q;
            i6 = dVar.d() - dVar.Q;
            i5 = i2 * 2;
            i4 = i5 + 1;
        } else {
            int d2 = dVar.d();
            i6 = dVar.Q;
            i7 = d2 - i6;
            i4 = i2 * 2;
            i5 = i4 + 1;
        }
        c[] cVarArr = dVar.A;
        if (cVarArr[i4].f3150d == null || cVarArr[i5].f3150d != null) {
            i8 = 1;
        } else {
            i8 = -1;
            i4 = i5;
            i5 = i4;
        }
        int i12 = z2 ? i3 - i7 : i3;
        int a2 = a(dVar, i2) + (dVar.A[i5].a() * i8);
        int i13 = i12 + a2;
        int j3 = (i2 == 0 ? dVar.j() : dVar.d()) * i8;
        Iterator<l> it = dVar.A[i5].f3148a.f3195a.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, a(((j) it.next()).f3188c.b, i2, z, i13));
        }
        int i14 = 0;
        for (Iterator<l> it2 = dVar.A[i4].f3148a.f3195a.iterator(); it2.hasNext(); it2 = it2) {
            i14 = Math.max(i14, a(((j) it2.next()).f3188c.b, i2, z, j3 + i13));
        }
        if (z2) {
            i11 -= i7;
            j2 = i14 + i6;
        } else {
            j2 = i14 + ((i2 == 0 ? dVar.j() : dVar.d()) * i8);
        }
        if (i2 == 1) {
            Iterator<l> it3 = dVar.w.f3148a.f3195a.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                i15 = Math.max(i15, a(((j) it3.next()).f3188c.b, i2, z, i8 == 1 ? i7 + i13 : (i6 * i8) + i13));
                it3 = it3;
                i4 = i4;
            }
            i9 = i4;
            i10 = (dVar.w.f3148a.f3195a.size() <= 0 || z2) ? i15 : i8 == 1 ? i15 + i7 : i15 - i6;
        } else {
            i9 = i4;
            i10 = 0;
        }
        int max = Math.max(i11, Math.max(j2, i10)) + a2;
        int i16 = j3 + i13;
        if (i8 == -1) {
            i16 = i13;
            i13 = i16;
        }
        if (z) {
            i.a(dVar, i2, i13);
            dVar.a(i13, i16, i2);
        } else {
            dVar.p.a(dVar, i2);
            if (i2 == 0) {
                dVar.K = i13;
            } else if (i2 == 1) {
                dVar.L = i13;
            }
        }
        if (dVar.b(i2) == d.a.MATCH_CONSTRAINT && dVar.G != 0.0f) {
            dVar.p.a(dVar, i2);
        }
        c[] cVarArr2 = dVar.A;
        if (cVarArr2[i5].f3150d != null && cVarArr2[i9].f3150d != null && cVarArr2[i5].f3150d.b == (dVar2 = dVar.D) && cVarArr2[i9].f3150d.b == dVar2) {
            dVar.p.a(dVar, i2);
        }
        return max;
    }

    public static d.g.e.c.a a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2, int i3) {
        d.g.e.c.a aVar;
        if (a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new d.g.e.c.a(null, null, typedValue.data);
            }
            try {
                aVar = d.g.e.c.a.a(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return new d.g.e.c.a(null, null, i3);
    }

    public static PropertyValuesHolder a(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z = peekValue != null;
        int i5 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z2 = peekValue2 != null;
        int i6 = z2 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((!z || !b(i5)) && (!z2 || !b(i6))) ? 0 : 3;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            d.g.f.b[] a2 = a(string);
            d.g.f.b[] a3 = a(string2);
            if (a2 == null && a3 == null) {
                return null;
            }
            if (a2 != null) {
                d.q.a.a.d dVar = new d.q.a.a.d();
                if (a3 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, dVar, a2);
                } else if (a(a2, a3)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, dVar, a2, a3);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
                return propertyValuesHolder2;
            } else if (a3 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new d.q.a.a.d(), a3);
            }
        } else {
            d.q.a.a.e eVar = i2 == 3 ? d.q.a.a.e.f3696a : null;
            if (z3) {
                if (z) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z2) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
            } else if (z) {
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : b(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : b(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else {
                if (z2) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : b(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                }
                if (propertyValuesHolder3 == null && eVar != null) {
                    propertyValuesHolder3.setEvaluator(eVar);
                    return propertyValuesHolder3;
                }
            }
            propertyValuesHolder3 = propertyValuesHolder;
            return propertyValuesHolder3 == null ? propertyValuesHolder3 : propertyValuesHolder3;
        }
    }

    public static Intent a(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String b2 = b(activity, activity.getComponentName());
            if (b2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, b2);
            try {
                return b(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b2 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r8 != 2) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r3 != false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d.g.j.a.C0103a a(android.widget.TextView r8) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.a.a(android.widget.TextView):d.g.j.a$a");
    }

    public static h a(Context context, d.j.d.j jVar, Fragment fragment, boolean z) {
        int i2;
        Fragment.b bVar = fragment.L;
        boolean z2 = false;
        int i3 = bVar == null ? 0 : bVar.f2402e;
        int l2 = fragment.l();
        fragment.a(0);
        View a2 = jVar.a(fragment.y);
        if (!(a2 == null || a2.getTag(d.j.b.visible_removing_fragment_view_tag) == null)) {
            a2.setTag(d.j.b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        if (l2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(l2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, l2);
                    if (loadAnimation != null) {
                        return new h(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, l2);
                    if (loadAnimator != null) {
                        return new h(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, l2);
                        if (loadAnimation2 != null) {
                            return new h(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i3 == 0) {
            return null;
        }
        if (i3 != 4097) {
            i2 = i3 != 4099 ? i3 != 8194 ? -1 : z ? d.j.a.fragment_close_enter : d.j.a.fragment_close_exit : z ? d.j.a.fragment_fade_enter : d.j.a.fragment_fade_exit;
        } else {
            i2 = z ? d.j.a.fragment_open_enter : d.j.a.fragment_open_exit;
        }
        if (i2 < 0) {
            return null;
        }
        return new h(AnimationUtils.loadAnimation(context, i2));
    }

    public static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        TypedArray a2 = a(resources, theme, attributeSet, d.q.a.a.a.f3683g);
        TypedArray a3 = a(resources, theme, attributeSet, d.q.a.a.a.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long b2 = (long) b(a2, xmlPullParser, "duration", 1, 300);
        int i2 = 0;
        long b3 = (long) b(a2, xmlPullParser, "startOffset", 2, 0);
        int b4 = b(a2, xmlPullParser, "valueType", 7, 4);
        if (a(xmlPullParser, "valueFrom") && a(xmlPullParser, "valueTo")) {
            if (b4 == 4) {
                TypedValue peekValue = a2.peekValue(5);
                boolean z = peekValue != null;
                int i3 = z ? peekValue.type : 0;
                TypedValue peekValue2 = a2.peekValue(6);
                boolean z2 = peekValue2 != null;
                b4 = ((!z || !b(i3)) && (!z2 || !b(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder a4 = a(a2, b4, 5, 6, "");
            if (a4 != null) {
                valueAnimator4.setValues(a4);
            }
        }
        valueAnimator4.setDuration(b2);
        valueAnimator4.setStartDelay(b3);
        valueAnimator4.setRepeatCount(b(a2, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(b(a2, xmlPullParser, "repeatMode", 4, 1));
        if (a3 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String a5 = a(a3, xmlPullParser, "pathData", 1);
            if (a5 != null) {
                String a6 = a(a3, xmlPullParser, "propertyXName", 2);
                String a7 = a(a3, xmlPullParser, "propertyYName", 3);
                if (a6 == null && a7 == null) {
                    throw new InflateException(a3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path b5 = b(a5);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(b5, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                while (true) {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                }
                PathMeasure pathMeasure2 = new PathMeasure(b5, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / ((float) (min - 1));
                valueAnimator2 = valueAnimator4;
                typedArray = a2;
                int i4 = 0;
                float f6 = 0.0f;
                while (true) {
                    propertyValuesHolder = null;
                    if (i2 >= min) {
                        break;
                    }
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i2] = fArr3[0];
                    fArr2[i2] = fArr3[1];
                    f6 += f5;
                    int i5 = i4 + 1;
                    if (i5 < arrayList.size() && f6 > ((Float) arrayList.get(i5)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i5;
                    }
                    i2++;
                    min = min;
                }
                PropertyValuesHolder ofFloat = a6 != null ? PropertyValuesHolder.ofFloat(a6, fArr) : null;
                if (a7 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(a7, fArr2);
                }
                if (ofFloat == null) {
                    i2 = 0;
                    objectAnimator.setValues(propertyValuesHolder);
                } else {
                    i2 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, propertyValuesHolder);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = a2;
                objectAnimator.setPropertyName(a(a3, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = a2;
        }
        if (!a(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i2 = typedArray2.getResourceId(i2, i2);
        }
        if (i2 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(a(context, i2));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator3;
    }

    public static d.g.e.c.b a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), d.g.c.FontFamily);
                String string = obtainAttributes.getString(d.g.c.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(d.g.c.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(d.g.c.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(d.g.c.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(d.g.c.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(d.g.c.FontFamily_fontProviderFetchTimeout, 500);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), d.g.c.FontFamilyFont);
                                int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(d.g.c.FontFamilyFont_fontWeight) ? d.g.c.FontFamilyFont_fontWeight : d.g.c.FontFamilyFont_android_fontWeight, 400);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(d.g.c.FontFamilyFont_fontStyle) ? d.g.c.FontFamilyFont_fontStyle : d.g.c.FontFamilyFont_android_fontStyle, 0);
                                int i3 = obtainAttributes2.hasValue(d.g.c.FontFamilyFont_ttcIndex) ? d.g.c.FontFamilyFont_ttcIndex : d.g.c.FontFamilyFont_android_ttcIndex;
                                String string4 = obtainAttributes2.getString(obtainAttributes2.hasValue(d.g.c.FontFamilyFont_fontVariationSettings) ? d.g.c.FontFamilyFont_fontVariationSettings : d.g.c.FontFamilyFont_android_fontVariationSettings);
                                int i4 = obtainAttributes2.getInt(i3, 0);
                                int i5 = obtainAttributes2.hasValue(d.g.c.FontFamilyFont_font) ? d.g.c.FontFamilyFont_font : d.g.c.FontFamilyFont_android_font;
                                int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                                String string5 = obtainAttributes2.getString(i5);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    a(xmlPullParser);
                                }
                                arrayList.add(new d.g.e.c.d(string5, i2, z, string4, i4, resourceId2));
                            } else {
                                a(xmlPullParser);
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    return new d.g.e.c.c((d.g.e.c.d[]) arrayList.toArray(new d.g.e.c.d[arrayList.size()]));
                }
                while (xmlPullParser.next() != 3) {
                    a(xmlPullParser);
                }
                return new d.g.e.c.e(new d.g.i.a(string, string2, string3, a(resources, resourceId)), integer, integer2);
            }
            a(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> a(Resources resources, int i2) {
        int i3;
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i3 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i3 = typedValue.type;
            }
            if (i3 == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i2)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void a(List<d.e.a.h.f> list, int i2, int i3) {
        int c2;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            d.e.a.h.f fVar = list.get(i4);
            HashSet<d> hashSet = null;
            if (fVar != null) {
                if (i2 == 0) {
                    hashSet = fVar.f3186h;
                } else if (i2 == 1) {
                    hashSet = fVar.i;
                }
                for (d dVar : hashSet) {
                    if (dVar.b0) {
                        int i5 = i2 * 2;
                        c[] cVarArr = dVar.A;
                        c cVar = cVarArr[i5];
                        c cVar2 = cVarArr[i5 + 1];
                        if ((cVar.f3150d == null || cVar2.f3150d == null) ? false : true) {
                            c2 = cVar.a() + a(dVar, i2);
                        } else if (dVar.G == 0.0f || dVar.b(i2) != d.a.MATCH_CONSTRAINT) {
                            int i6 = i3 - (i2 == 0 ? dVar.K : i2 == 1 ? dVar.L : 0);
                            c2 = i6 - dVar.c(i2);
                            dVar.a(c2, i6, i2);
                        } else {
                            int a2 = a(dVar);
                            int i7 = (int) dVar.A[i5].f3148a.f3192g;
                            j jVar = cVar2.f3148a;
                            jVar.f3191f = cVar.f3148a;
                            jVar.f3192g = (float) a2;
                            jVar.b = 1;
                            dVar.a(i7, i7 + a2, i2);
                        }
                        i.a(dVar, i2, c2);
                    }
                }
            } else {
                throw null;
            }
        }
    }

    public static void a(TextView textView, d.g.j.a aVar) {
        a.C0103a a2 = a(textView);
        if (aVar == null) {
            throw null;
        } else if (a2.a(null)) {
            textView.setText(aVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        x0 x0Var = x0.l;
        if (x0Var != null && x0Var.f3022c == view) {
            x0.a((x0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            x0 x0Var2 = x0.m;
            if (x0Var2 != null && x0Var2.f3022c == view) {
                x0Var2.b();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new x0(view, charSequence);
    }

    public static boolean a(d dVar, d.e.a.h.f fVar, List<d.e.a.h.f> list, boolean z) {
        c cVar;
        c cVar2;
        c cVar3;
        d dVar2;
        c cVar4;
        c cVar5;
        c cVar6;
        c cVar7;
        d dVar3;
        c cVar8;
        if (dVar == null) {
            return true;
        }
        dVar.c0 = false;
        e eVar = (e) dVar.D;
        d.e.a.h.f fVar2 = dVar.p;
        if (fVar2 == null) {
            dVar.b0 = true;
            fVar.f3180a.add(dVar);
            dVar.p = fVar;
            if (dVar.s.f3150d == null && dVar.u.f3150d == null && dVar.t.f3150d == null && dVar.v.f3150d == null && dVar.w.f3150d == null && dVar.z.f3150d == null) {
                fVar.f3182d = false;
                eVar.D0 = false;
                dVar.b0 = false;
                if (z) {
                    return false;
                }
            }
            if (!(dVar.t.f3150d == null || dVar.v.f3150d == null)) {
                eVar.i();
                d.a aVar = d.a.WRAP_CONTENT;
                if (z) {
                    fVar.f3182d = false;
                    eVar.D0 = false;
                    dVar.b0 = false;
                    return false;
                }
                d dVar4 = dVar.t.f3150d.b;
                d dVar5 = dVar.D;
                if (!(dVar4 == dVar5 && dVar.v.f3150d.b == dVar5)) {
                    fVar.f3182d = false;
                    eVar.D0 = false;
                    dVar.b0 = false;
                }
            }
            if (!(dVar.s.f3150d == null || dVar.u.f3150d == null)) {
                eVar.e();
                d.a aVar2 = d.a.WRAP_CONTENT;
                if (z) {
                    fVar.f3182d = false;
                    eVar.D0 = false;
                    dVar.b0 = false;
                    return false;
                }
                d dVar6 = dVar.s.f3150d.b;
                d dVar7 = dVar.D;
                if (!(dVar6 == dVar7 && dVar.u.f3150d.b == dVar7)) {
                    fVar.f3182d = false;
                    eVar.D0 = false;
                    dVar.b0 = false;
                }
            }
            if (((dVar.e() == d.a.MATCH_CONSTRAINT) ^ (dVar.i() == d.a.MATCH_CONSTRAINT)) && dVar.G != 0.0f) {
                a(dVar);
            } else if (dVar.e() == d.a.MATCH_CONSTRAINT || dVar.i() == d.a.MATCH_CONSTRAINT) {
                fVar.f3182d = false;
                eVar.D0 = false;
                dVar.b0 = false;
                if (z) {
                    return false;
                }
            }
            if (((dVar.s.f3150d == null && dVar.u.f3150d == null) || (((cVar5 = dVar.s.f3150d) != null && cVar5.b == dVar.D && dVar.u.f3150d == null) || (((cVar6 = dVar.u.f3150d) != null && cVar6.b == dVar.D && dVar.s.f3150d == null) || ((cVar7 = dVar.s.f3150d) != null && cVar7.b == (dVar3 = dVar.D) && (cVar8 = dVar.u.f3150d) != null && cVar8.b == dVar3)))) && dVar.z.f3150d == null && !(dVar instanceof g) && !(dVar instanceof d.e.a.h.h)) {
                fVar.f3184f.add(dVar);
            }
            if (((dVar.t.f3150d == null && dVar.v.f3150d == null) || (((cVar = dVar.t.f3150d) != null && cVar.b == dVar.D && dVar.v.f3150d == null) || (((cVar2 = dVar.v.f3150d) != null && cVar2.b == dVar.D && dVar.t.f3150d == null) || ((cVar3 = dVar.t.f3150d) != null && cVar3.b == (dVar2 = dVar.D) && (cVar4 = dVar.v.f3150d) != null && cVar4.b == dVar2)))) && dVar.z.f3150d == null && dVar.w.f3150d == null && !(dVar instanceof g) && !(dVar instanceof d.e.a.h.h)) {
                fVar.f3185g.add(dVar);
            }
            if (dVar instanceof d.e.a.h.h) {
                fVar.f3182d = false;
                eVar.D0 = false;
                dVar.b0 = false;
                if (z) {
                    return false;
                }
                d.e.a.h.h hVar = (d.e.a.h.h) dVar;
                for (int i2 = 0; i2 < hVar.l0; i2++) {
                    if (!a(hVar.k0[i2], fVar, list, z)) {
                        return false;
                    }
                }
            }
            int length = dVar.A.length;
            for (int i3 = 0; i3 < length; i3++) {
                c cVar9 = dVar.A[i3];
                c cVar10 = cVar9.f3150d;
                if (!(cVar10 == null || cVar10.b == dVar.D)) {
                    if (cVar9.f3149c == c.EnumC0096c.CENTER) {
                        fVar.f3182d = false;
                        eVar.D0 = false;
                        dVar.b0 = false;
                        if (z) {
                            return false;
                        }
                    } else {
                        j jVar = cVar9.f3148a;
                        if (!(cVar10 == null || cVar10.f3150d == cVar9)) {
                            cVar10.f3148a.f3195a.add(jVar);
                        }
                    }
                    if (!a(cVar9.f3150d.b, fVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (fVar2 != fVar) {
            fVar.f3180a.addAll(fVar2.f3180a);
            fVar.f3184f.addAll(dVar.p.f3184f);
            fVar.f3185g.addAll(dVar.p.f3185g);
            if (!dVar.p.f3182d) {
                fVar.f3182d = false;
            }
            list.remove(dVar.p);
            for (d dVar8 : dVar.p.f3180a) {
                dVar8.p = fVar;
            }
        }
        return true;
    }

    public static void a(Context context, Locale locale) {
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        Locale locale2 = configuration.locale;
        if (!(w.a(locale.getLanguage(), locale2.getLanguage()) && w.a(locale.getCountry(), locale2.getCountry()))) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration.setLocale(locale);
            if (context instanceof Application) {
                Context createConfigurationContext = context.createConfigurationContext(configuration);
                try {
                    Field declaredField = ContextWrapper.class.getDeclaredField("mBase");
                    declaredField.setAccessible(true);
                    declaredField.set(context, createConfigurationContext);
                } catch (Exception unused) {
                }
            }
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
