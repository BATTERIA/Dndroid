package e.c.a.b;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Trace;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.didi.hummer.core.engine.jsc.jni.TypeConvertor;
import com.facebook.yoga.YogaNode;
import d.d.h;
import e.e.a.k;
import e.e.a.y.a.b.f;
import e.e.a.y.a.b.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f3785a = {'V', 'D', 'I', 'W', 'E', 'A'};
    public static final String b = System.getProperty("file.separator");

    /* renamed from: c  reason: collision with root package name */
    public static final String f3786c = System.getProperty("line.separator");

    /* renamed from: d  reason: collision with root package name */
    public static final c f3787d = new c(null);

    /* renamed from: e  reason: collision with root package name */
    public static SimpleDateFormat f3788e;

    /* renamed from: f  reason: collision with root package name */
    public static final ExecutorService f3789f = Executors.newSingleThreadExecutor();

    /* renamed from: g  reason: collision with root package name */
    public static final h<Class, e> f3790g = new h<>();

    public static class a implements FilenameFilter {
        public boolean accept(File file, String str) {
            StringBuilder a2 = e.a.a.a.a.a("^");
            a2.append(l.f3787d.b);
            a2.append("_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
            return str.matches(a2.toString());
        }
    }

    public static class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ File f3791c;

        public b(File file) {
            this.f3791c = file;
        }

        public void run() {
            if (!this.f3791c.delete()) {
                StringBuilder a2 = e.a.a.a.a.a("delete ");
                a2.append(this.f3791c);
                a2.append(" failed!");
                Log.e("LogUtils", a2.toString());
            }
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public String f3792a;
        public String b = "util";

        /* renamed from: c  reason: collision with root package name */
        public String f3793c = ".txt";

        /* renamed from: d  reason: collision with root package name */
        public boolean f3794d = true;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3795e = true;

        /* renamed from: f  reason: collision with root package name */
        public String f3796f = "";

        /* renamed from: g  reason: collision with root package name */
        public boolean f3797g = true;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3798h = true;
        public boolean i = false;
        public boolean j = true;
        public boolean k = true;
        public int l = 2;
        public int m = 2;
        public int n = 1;
        public int o = 0;
        public int p = -1;
        public String q = w.a();
        public d r;

        public /* synthetic */ c(k kVar) {
            StringBuilder sb;
            File file;
            if (!"mounted".equals(Environment.getExternalStorageState()) || f.b().getExternalFilesDir(null) == null) {
                sb = new StringBuilder();
                file = f.b().getFilesDir();
            } else {
                sb = new StringBuilder();
                file = f.b().getExternalFilesDir(null);
            }
            sb.append(file);
            sb.append(l.b);
            sb.append("log");
            sb.append(l.b);
            this.f3792a = sb.toString();
        }

        public final String a() {
            return w.a(this.f3796f) ? "" : this.f3796f;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("process: ");
            String str = this.q;
            a2.append(str == null ? "" : str.replace(":", "_"));
            a2.append(l.f3786c);
            a2.append("switch: ");
            a2.append(this.f3794d);
            a2.append(l.f3786c);
            a2.append("console: ");
            a2.append(this.f3795e);
            a2.append(l.f3786c);
            a2.append("tag: ");
            a2.append(a());
            a2.append(l.f3786c);
            a2.append("head: ");
            a2.append(this.f3798h);
            a2.append(l.f3786c);
            a2.append("file: ");
            a2.append(this.i);
            a2.append(l.f3786c);
            a2.append("dir: ");
            a2.append(this.f3792a);
            a2.append(l.f3786c);
            a2.append("filePrefix: ");
            a2.append(this.b);
            a2.append(l.f3786c);
            a2.append("border: ");
            a2.append(this.j);
            a2.append(l.f3786c);
            a2.append("singleTag: ");
            a2.append(this.k);
            a2.append(l.f3786c);
            a2.append("consoleFilter: ");
            a2.append(l.f3785a[this.l - 2]);
            a2.append(l.f3786c);
            a2.append("fileFilter: ");
            a2.append(l.f3785a[this.m - 2]);
            a2.append(l.f3786c);
            a2.append("stackDeep: ");
            a2.append(this.n);
            a2.append(l.f3786c);
            a2.append("stackOffset: ");
            a2.append(this.o);
            a2.append(l.f3786c);
            a2.append("saveDays: ");
            a2.append(this.p);
            a2.append(l.f3786c);
            a2.append("formatter: ");
            a2.append(l.f3790g);
            return a2.toString();
        }
    }

    public interface d {
        void a(String str, String str2);
    }

    public static abstract class e<T> {
        public abstract String a(T t);
    }

    public static final class f {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a  reason: collision with root package name */
        public static Application f3799a;
        public static e.e.a.b0.c b;

        /* renamed from: c  reason: collision with root package name */
        public static e.e.a.b0.b f3800c;

        /* renamed from: d  reason: collision with root package name */
        public static LocationManager f3801d;

        public static int a(float f2) {
            return (int) (f2 * 1000.0f);
        }

        public static int a(Context context, float f2) {
            return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
        }

        public static int a(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return 0;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                return 1;
            }
            if (action == 1) {
                return 3;
            }
            if (action != 2) {
                return action != 3 ? 0 : 4;
            }
            return 2;
        }

        public static long a(long j, Object obj) {
            if (obj == null) {
                return -1;
            }
            return obj instanceof Number ? TypeConvertor.makeNumber(j, ((Number) obj).doubleValue()) : obj instanceof Boolean ? TypeConvertor.makeBoolean(j, ((Boolean) obj).booleanValue()) : obj instanceof String ? TypeConvertor.makeString(j, (String) obj) : obj instanceof e.e.a.q.b.e.c ? ((e.e.a.q.b.e.c) obj).b : obj instanceof e.e.a.q.b.e.a ? ((e.e.a.q.b.e.a) obj).b : TypeConvertor.makeFromJsonString(j, e.e.a.q.d.d.a(obj));
        }

        public static Bitmap.Config a(Bitmap bitmap) {
            return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
        }

        public static YogaNode a() {
            if ((YogaNode.class.getModifiers() & 1024) != 0) {
                return YogaNode.create();
            }
            try {
                return (YogaNode) YogaNode.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }

        public static e.e.a.o.n.e a(Map map) {
            Object obj = map.get("text");
            Object obj2 = map.get("color");
            Object obj3 = map.get("backgroundColor");
            Object obj4 = map.get("fontFamily");
            Object obj5 = map.get("fontSize");
            Object obj6 = map.get("fontWeight");
            Object obj7 = map.get("fontStyle");
            Object obj8 = map.get("textDecoration");
            Object obj9 = map.get("image");
            Object obj10 = map.get("imageWidth");
            Object obj11 = map.get("imageHeight");
            Object obj12 = map.get("imageAlign");
            Object obj13 = map.get("href");
            Object obj14 = map.get("hrefColor");
            e.e.a.o.n.e eVar = new e.e.a.o.n.e();
            if (obj instanceof String) {
                eVar.f4419a = (String) obj;
            }
            if (obj2 instanceof String) {
                eVar.b = h((String) obj2);
            }
            if (obj3 instanceof String) {
                eVar.f4420c = h((String) obj3);
            }
            if (obj4 instanceof String) {
                eVar.f4421d = (String) obj4;
            }
            if (obj6 instanceof String) {
                eVar.f4423f = (String) obj6;
            }
            if (obj7 instanceof String) {
                eVar.f4424g = (String) obj7;
            }
            if (obj8 instanceof String) {
                eVar.f4425h = (String) obj8;
            }
            eVar.f4422e = (int) e.e.a.y.c.c.b(obj5);
            if (obj9 instanceof String) {
                eVar.i = (String) obj9;
            }
            eVar.j = (int) e.e.a.y.c.c.b(obj10);
            eVar.k = (int) e.e.a.y.c.c.b(obj11);
            if (obj12 instanceof String) {
                eVar.l = (String) obj12;
            }
            if (obj13 instanceof String) {
                eVar.m = (String) obj13;
            }
            if (obj14 instanceof String) {
                eVar.n = h((String) obj14);
            }
            return eVar;
        }

        public static String a(int i) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(" ");
            }
            return sb.toString();
        }

        public static String a(String str) {
            StringBuilder sb;
            int i;
            StringBuilder sb2 = new StringBuilder(str);
            if (str == null || str.isEmpty()) {
                return null;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                if (charAt == '{' || charAt == '[') {
                    i3 += 4;
                    i = i4 + i2 + 1;
                    sb = new StringBuilder();
                } else if (charAt == ',') {
                    i = i4 + i2 + 1;
                    sb = new StringBuilder();
                } else if (charAt == '}' || charAt == ']') {
                    i3 -= 4;
                    i = i4 + i2;
                    sb = new StringBuilder();
                }
                sb.append("\n");
                sb.append(a(i3));
                sb2.insert(i, sb.toString());
                i2 = i3 + 1 + i2;
            }
            return sb2.toString();
        }

        public static List<PropertyValuesHolder> a(Object obj, Object obj2, int i) {
            ArrayList arrayList = new ArrayList();
            if (obj == null) {
                return arrayList;
            }
            String str = i != 1 ? i != 2 ? "rotation" : "rotationY" : "rotationX";
            float a2 = e.e.a.y.c.c.a(obj2, false);
            float a3 = e.e.a.y.c.c.a(obj, false);
            arrayList.add(obj2 != null ? PropertyValuesHolder.ofFloat(str, a2, a3) : PropertyValuesHolder.ofFloat(str, a3));
            return arrayList;
        }

        public static List<Object> a(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (!(jSONArray == null || arrayList == JSONObject.NULL)) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONArray) {
                        obj = a((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = a((JSONObject) obj);
                    }
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public static Map<String, Object> a(String str, j jVar) {
            String str2;
            CharSequence text;
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", str);
            hashMap.put("view_name", jVar.getView().getClass().getSimpleName());
            hashMap.put("view_id", jVar.getViewID());
            if (jVar.getView() instanceof TextView) {
                text = ((TextView) jVar.getView()).getText();
            } else if (jVar.getView() instanceof Button) {
                text = ((Button) jVar.getView()).getText();
            } else {
                str2 = null;
                hashMap.put("view_content", str2);
                hashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                return hashMap;
            }
            str2 = text.toString();
            hashMap.put("view_content", str2);
            hashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            return hashMap;
        }

        public static Map<String, Object> a(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            if (!(jSONObject == null || jSONObject == JSONObject.NULL)) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONArray) {
                        obj = a((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = a((JSONObject) obj);
                    }
                    hashMap.put(next, obj);
                }
            }
            return hashMap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:40:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(android.text.SpannableString r6, e.e.a.o.n.e r7, int r8, int r9) {
            /*
            // Method dump skipped, instructions count: 187
            */
            throw new UnsupportedOperationException("Method not decompiled: e.c.a.b.l.f.a(android.text.SpannableString, e.e.a.o.n.e, int, int):void");
        }

        public static void a(View view) {
            InputMethodManager inputMethodManager;
            if (view != null && (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public static /* synthetic */ void a(e.e.a.p.b bVar, String str, e.e.a.n.a.b bVar2) {
            bVar.a(bVar2.f4315d, str);
            Toast.makeText(bVar, "页面已刷新", 0).show();
        }

        public static void a(j jVar, SpannableString spannableString, e.e.a.o.n.e eVar, int i, int i2) {
            if (!TextUtils.isEmpty(eVar.m)) {
                spannableString.setSpan(new e.e.a.o.n.h(eVar.m, eVar.n), i, i2, 17);
                if (jVar.getView() instanceof TextView) {
                    ((TextView) jVar.getView()).setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
        }

        public static void a(j jVar, SpannableString spannableString, e.e.a.o.n.e eVar, int i, int i2, e.e.a.o.n.d dVar) {
            if (!TextUtils.isEmpty(eVar.i)) {
                a((e.e.a.p.b) jVar.getContext(), eVar.i, new b(spannableString, eVar, i, i2, dVar));
            }
        }

        public static void a(Exception exc, StackTraceElement stackTraceElement) {
            ArrayList arrayList = new ArrayList(Arrays.asList(exc.getStackTrace()));
            arrayList.add(0, stackTraceElement);
            exc.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        }

        public static void a(String str, String str2, String str3) {
            String a2 = e.a.a.a.a.a(str, str2, str3);
            if (a2.length() > 127 && str2 != null) {
                StringBuilder a3 = e.a.a.a.a.a(str);
                a3.append(str2.substring(0, (127 - str.length()) - str3.length()));
                a3.append(str3);
                a2 = a3.toString();
            }
            Trace.beginSection(a2);
        }

        public static void a(Map<String, Object> map, Map<String, Object> map2) {
            if (map != null && map2 != null) {
                if (map.containsKey("backgroundColor") && !map2.containsKey("backgroundColor")) {
                    map2.put("backgroundColor", map.get("backgroundColor"));
                }
                if (map.containsKey("borderWidth") && !map2.containsKey("borderWidth")) {
                    map2.put("borderWidth", map.get("borderWidth"));
                }
                if (map.containsKey("borderColor") && !map2.containsKey("borderColor")) {
                    map2.put("borderColor", map.get("borderColor"));
                }
                if (map.containsKey("borderRadius") && !map2.containsKey("borderRadius")) {
                    map2.put("borderRadius", map.get("borderRadius"));
                }
                if (map.containsKey("borderStyle") && !map2.containsKey("borderStyle")) {
                    map2.put("borderStyle", map.get("borderStyle"));
                }
                if (map.containsKey("color") && !map2.containsKey("color")) {
                    map2.put("color", map.get("color"));
                }
            }
        }

        public static Object[] a(Object obj) {
            if (!(obj instanceof Map)) {
                return null;
            }
            Map map = (Map) obj;
            return new Object[]{map.get("x"), map.get("y")};
        }

        public static int b(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return -1;
            }
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            return point.x;
        }

        public static int b(Context context, float f2) {
            return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
        }

        public static int b(String str, String str2, String str3) {
            if (str3 == null) {
                try {
                    str3 = k.f4312a.getPackageName();
                } catch (Exception e2) {
                    throw new RuntimeException("Error getResourceId by NJContextUtil.getContext()", e2);
                }
            }
            return k.f4312a.getResources().getIdentifier(str, str2, str3);
        }

        public static long b(float f2) {
            return (long) (f2 * 1000.0f);
        }

        public static Application b() {
            Application application = f3799a;
            if (application != null) {
                return application;
            }
            v vVar = v.f3828g;
            Application application2 = null;
            if (vVar != null) {
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object invoke = cls.getMethod("getApplication", new Class[0]).invoke(vVar.a(), new Object[0]);
                    if (invoke != null) {
                        application2 = (Application) invoke;
                    }
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (ClassNotFoundException e5) {
                    e5.printStackTrace();
                }
                a(application2);
                if (f3799a != null) {
                    Log.i("Utils", w.a() + " reflect app success.");
                    return f3799a;
                }
                throw new NullPointerException("reflect failed.");
            }
            throw null;
        }

        public static List<PropertyValuesHolder> b(Object obj, Object obj2, int i) {
            PropertyValuesHolder propertyValuesHolder;
            ArrayList arrayList = new ArrayList();
            if (obj == null) {
                return arrayList;
            }
            Object[] a2 = a(obj);
            if (a2 != null && a2.length == 2 && i == 13) {
                float[] fArr = {e.e.a.y.c.c.a(a2[0], false), e.e.a.y.c.c.a(a2[1], false)};
                arrayList.add(PropertyValuesHolder.ofFloat("scaleX", fArr[0]));
                arrayList.add(PropertyValuesHolder.ofFloat("scaleY", fArr[1]));
                return arrayList;
            }
            float a3 = e.e.a.y.c.c.a(obj2, false);
            float a4 = e.e.a.y.c.c.a(obj, false);
            if (i != 11) {
                if (i != 12) {
                    if (obj2 != null) {
                        arrayList.add(PropertyValuesHolder.ofFloat("scaleX", a3, a4));
                        propertyValuesHolder = PropertyValuesHolder.ofFloat("scaleY", a3, a4);
                    } else {
                        arrayList.add(PropertyValuesHolder.ofFloat("scaleX", a4));
                        propertyValuesHolder = PropertyValuesHolder.ofFloat("scaleY", a4);
                    }
                } else if (obj2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat("scaleY", a3, a4);
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat("scaleY", a4);
                }
            } else if (obj2 != null) {
                propertyValuesHolder = PropertyValuesHolder.ofFloat("scaleX", a3, a4);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofFloat("scaleX", a4);
            }
            arrayList.add(propertyValuesHolder);
            return arrayList;
        }

        public static float c(Context context, float f2) {
            return f2 / context.getResources().getDisplayMetrics().density;
        }

        public static int c(Map<String, Object> map) {
            if (map == null || !map.containsKey("color")) {
                return -16777216;
            }
            Object obj = map.get("color");
            if (obj instanceof String) {
                return h((String) obj);
            }
            return -16777216;
        }

        public static TimeInterpolator c(String str) {
            return "linear".equalsIgnoreCase(str) ? new LinearInterpolator() : "ease-in".equalsIgnoreCase(str) ? new AccelerateInterpolator() : "ease-out".equalsIgnoreCase(str) ? new DecelerateInterpolator() : "ease-in-out".equalsIgnoreCase(str) ? new AccelerateDecelerateInterpolator() : new AccelerateDecelerateInterpolator();
        }

        public static void c() {
            LocationManager locationManager = f3801d;
            if (locationManager != null) {
                e.e.a.b0.b bVar = f3800c;
                if (bVar != null) {
                    locationManager.removeUpdates(bVar);
                    f3800c = null;
                }
                f3801d = null;
            }
            if (b != null) {
                b = null;
            }
        }

        public static void c(String str, String str2) {
            if (e.e.a.q.d.b.f4498a) {
                Log.i(str, str2);
            }
        }

        public static int d(String str) {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("assets:///")) {
                return 1;
            }
            if (lowerCase.startsWith("file:///")) {
                return 2;
            }
            return lowerCase.startsWith("http") ? 3 : 0;
        }

        public static e.e.a.n.d.a e(String str) {
            e.e.a.g a2 = k.a(str);
            if (a2.j == null) {
                a2.j = new e.e.a.n.d.d.d();
            }
            return a2.j;
        }

        public static e.e.a.n.e.a f(String str) {
            e.e.a.g a2 = k.a(str);
            if (a2.f4300h == null) {
                a2.f4300h = new e.e.a.n.e.b.a();
            }
            return a2.f4300h;
        }

        public static e.e.a.n.f.a g(String str) {
            e.e.a.g a2 = k.a(str);
            if (a2.f4298f == null) {
                a2.f4298f = new e.e.a.n.f.d.a();
            }
            return a2.f4298f;
        }

        public static int h(String str) {
            int i;
            try {
                i = Color.parseColor(str);
            } catch (Exception unused) {
                i = 0;
            }
            if (str.length() != 9) {
                return i;
            }
            return ((i >> 8) & 16777215) | (i << 24);
        }

        public static int[] i(String str) {
            String[] split = str.replace("linear-gradient(", "").replace("deg", "").replace(")", "").trim().split("\\s+");
            int length = split.length;
            int[] iArr = new int[length];
            iArr[0] = Integer.parseInt(split[0]) % 360;
            for (int i = 1; i < length; i++) {
                iArr[i] = h(split[i]);
            }
            return iArr;
        }

        public static String j(String str) {
            byte[] bArr;
            ByteArrayOutputStream byteArrayOutputStream;
            try {
                InputStream open = b().getAssets().open(str);
                if (open == null) {
                    bArr = null;
                } else {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[8192];
                        while (true) {
                            int read = open.read(bArr2, 0, 8192);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                        open.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        try {
                            open.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                        byteArrayOutputStream = null;
                    } catch (Throwable th) {
                        try {
                            open.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                        throw th;
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                }
                if (bArr != null) {
                    if (w.a((String) null)) {
                        return new String(bArr);
                    }
                    try {
                        return new String(bArr, (String) null);
                    } catch (UnsupportedEncodingException e6) {
                        e6.printStackTrace();
                    }
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            return "";
        }

        public static String a(Bundle bundle) {
            Iterator<String> it = bundle.keySet().iterator();
            if (!it.hasNext()) {
                return "Bundle {}";
            }
            StringBuilder sb = new StringBuilder(128);
            sb.append("Bundle { ");
            while (true) {
                String next = it.next();
                Object obj = bundle.get(next);
                sb.append(next);
                sb.append('=');
                sb.append(obj instanceof Bundle ? obj == bundle ? "(this Bundle)" : a((Bundle) obj) : l.a(obj));
                if (!it.hasNext()) {
                    sb.append(" }");
                    return sb.toString();
                }
                sb.append(',');
                sb.append(' ');
            }
        }

        public static /* synthetic */ void c(View view) {
            view.requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 2);
            }
        }

        public static void a(Context context) {
            View currentFocus;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isActive() && activity.getCurrentFocus() != null && activity.getCurrentFocus().getWindowToken() != null && (currentFocus = activity.getCurrentFocus()) != null) {
                    currentFocus.post(new c(currentFocus));
                }
            }
        }

        public static void a(String str, String str2) {
            if (e.e.a.q.d.b.f4498a) {
                Log.d(str, str2);
            }
        }

        public static e.e.a.n.b.b b(String str) {
            e.e.a.g a2 = k.a(str);
            if (a2.f4299g == null) {
                a2.f4299g = new e.e.a.n.b.c.a();
            }
            return a2.f4299g;
        }

        public static String b(String str, String str2) {
            String str3;
            StringBuilder sb;
            int lastIndexOf;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str.startsWith("./")) {
                return str;
            }
            String str4 = "";
            if (!TextUtils.isEmpty(str2) && (lastIndexOf = str2.lastIndexOf("/")) >= 0) {
                str4 = str2.substring(0, lastIndexOf + 1);
            }
            if (TextUtils.isEmpty(str4)) {
                return str;
            }
            String substring = str.substring(2);
            int d2 = d(str2);
            if (d2 == 1) {
                str3 = str4.substring(10);
                sb = new StringBuilder();
            } else if (d2 != 2) {
                return d2 != 3 ? substring : e.a.a.a.a.b(str4, substring);
            } else {
                str3 = str4.substring(7);
                sb = new StringBuilder();
            }
            return e.a.a.a.a.a(sb, str3, substring);
        }

        public static void a(String str, String str2, Throwable th) {
            if (e.e.a.q.d.b.f4498a) {
                Log.e(str, str2, th);
            }
        }

        public static /* synthetic */ void b(View view) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (Build.VERSION.SDK_INT >= 26) {
                    viewGroup.setDefaultFocusHighlightEnabled(false);
                }
                viewGroup.setFocusable(true);
                viewGroup.setFocusableInTouchMode(true);
                viewGroup.requestFocus();
            }
            view.clearFocus();
            a(view);
        }

        public static Map<String, Float> a(Context context, MotionEvent motionEvent) {
            HashMap hashMap = new HashMap();
            Float valueOf = Float.valueOf(0.0f);
            hashMap.put("x", valueOf);
            hashMap.put("y", valueOf);
            if (motionEvent == null) {
                return hashMap;
            }
            hashMap.put("x", Float.valueOf(motionEvent.getX() / context.getResources().getDisplayMetrics().density));
            hashMap.put("y", Float.valueOf(motionEvent.getY() / context.getResources().getDisplayMetrics().density));
            return hashMap;
        }

        public static void b(e.e.a.p.b bVar, String str, e.e.a.n.b.a aVar) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("//")) {
                    str = e.a.a.a.a.b("https:", str);
                }
                ((e.e.a.n.b.c.a) b(bVar.f4442c)).a(str, aVar);
            }
        }

        public static <T> void a(String str, e.e.a.n.a.a<T> aVar) {
            e.e.a.g a2 = k.a(null);
            if (a2.f4297e == null) {
                a2.f4297e = new e.e.a.n.a.d.g();
            }
            ((e.e.a.n.a.d.g) a2.f4297e).a(str, "GET", 10000, null, null, aVar, null);
        }

        public static Drawable b(Map<String, Object> map) {
            Object obj;
            Object obj2;
            Object a2;
            Object obj3;
            Object obj4 = null;
            if (map == null) {
                return null;
            }
            if (map.containsKey("backgroundColor")) {
                obj4 = e.e.a.y.c.c.a(map.get("backgroundColor"));
            }
            e.e.a.y.a.b.f fVar = new e.e.a.y.a.b.f();
            fVar.a(obj4);
            if (map.containsKey("borderWidth") && (obj3 = map.get("borderWidth")) != null) {
                float b2 = e.e.a.y.c.c.b(obj3);
                fVar.f4565d.b.set(b2, b2, b2, b2);
                fVar.invalidateSelf();
            }
            if (map.containsKey("borderColor") && (a2 = e.e.a.y.c.c.a(map.get("borderColor"))) != null) {
                int intValue = ((Integer) a2).intValue();
                fVar.f4565d.f4571c.set(intValue, intValue, intValue, intValue);
                fVar.invalidateSelf();
            }
            if (map.containsKey("borderRadius") && (obj2 = map.get("borderRadius")) != null) {
                fVar.a(e.e.a.y.c.c.b(obj2));
            }
            if (map.containsKey("borderStyle") && (obj = map.get("borderStyle")) != null) {
                int a3 = f.a.a((String) obj);
                fVar.f4565d.f4570a.set(a3, a3, a3, a3);
                fVar.invalidateSelf();
            }
            return fVar;
        }

        public static void a(Application application) {
            if (application == null) {
                Log.e("Utils", "app is null.");
                return;
            }
            Application application2 = f3799a;
            if (application2 == null) {
                f3799a = application;
                v vVar = v.f3828g;
                if (vVar != null) {
                    application.registerActivityLifecycleCallbacks(vVar);
                    Runnable[] runnableArr = {new g()};
                    for (int i = 0; i < 1; i++) {
                        q.a(-2, 5).execute(runnableArr[i]);
                    }
                    return;
                }
                throw null;
            } else if (!application2.equals(application)) {
                Application application3 = f3799a;
                v vVar2 = v.f3828g;
                vVar2.f3829a.clear();
                application3.unregisterActivityLifecycleCallbacks(vVar2);
                f3799a = application;
                v vVar3 = v.f3828g;
                if (vVar3 != null) {
                    application.registerActivityLifecycleCallbacks(vVar3);
                    return;
                }
                throw null;
            }
        }

        public static String a(Intent intent) {
            boolean z;
            String str;
            StringBuilder sb = new StringBuilder(128);
            sb.append("Intent { ");
            String action = intent.getAction();
            boolean z2 = true;
            boolean z3 = false;
            if (action != null) {
                sb.append("act=");
                sb.append(action);
                z = false;
            } else {
                z = true;
            }
            Set<String> categories = intent.getCategories();
            if (categories != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("cat=[");
                for (String str2 : categories) {
                    if (!z2) {
                        sb.append(',');
                    }
                    sb.append(str2);
                    z2 = false;
                }
                sb.append("]");
                z = false;
            }
            Uri data = intent.getData();
            if (data != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("dat=");
                sb.append(data);
                z = false;
            }
            String type = intent.getType();
            if (type != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("typ=");
                sb.append(type);
                z = false;
            }
            int flags = intent.getFlags();
            if (flags != 0) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("flg=0x");
                sb.append(Integer.toHexString(flags));
                z = false;
            }
            String str3 = intent.getPackage();
            if (str3 != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("pkg=");
                sb.append(str3);
                z = false;
            }
            ComponentName component = intent.getComponent();
            if (component != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("cmp=");
                sb.append(component.flattenToShortString());
                z = false;
            }
            Rect sourceBounds = intent.getSourceBounds();
            if (sourceBounds != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("bnds=");
                sb.append(sourceBounds.toShortString());
                z = false;
            }
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                if (!z) {
                    sb.append(' ');
                }
                ClipData.Item itemAt = clipData.getItemAt(0);
                if (itemAt == null) {
                    sb.append("ClipData.Item {}");
                } else {
                    sb.append("ClipData.Item { ");
                    String htmlText = itemAt.getHtmlText();
                    if (htmlText != null) {
                        sb.append("H:");
                        sb.append(htmlText);
                    } else {
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            sb.append("T:");
                            sb.append(text);
                        } else {
                            Uri uri = itemAt.getUri();
                            if (uri != null) {
                                sb.append("U:");
                                sb.append(uri);
                            } else {
                                Intent intent2 = itemAt.getIntent();
                                if (intent2 != null) {
                                    sb.append("I:");
                                    str = a(intent2);
                                } else {
                                    str = "NULL";
                                }
                                sb.append(str);
                            }
                        }
                    }
                    sb.append("}");
                }
                z = false;
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (!z) {
                    sb.append(' ');
                }
                sb.append("extras={");
                sb.append(a(extras));
                sb.append('}');
            } else {
                z3 = z;
            }
            Intent selector = intent.getSelector();
            if (selector != null) {
                if (!z3) {
                    sb.append(' ');
                }
                sb.append("sel={");
                sb.append(selector == intent ? "(this Intent)" : a(selector));
                sb.append("}");
            }
            sb.append(" }");
            return sb.toString();
        }

        public static Object a(long j, long j2) {
            e.e.a.q.b.e.c cVar = new e.e.a.q.b.e.c(j, j2);
            if (cVar.f4489c.h()) {
                return null;
            }
            if (cVar.f4489c.e()) {
                return Double.valueOf(cVar.f4489c.m());
            }
            if (cVar.f4489c.g()) {
                return Boolean.valueOf(cVar.f4489c.c());
            }
            if (cVar.f4489c.b()) {
                return cVar.f4489c.i();
            }
            boolean j3 = cVar.f4489c.j();
            Object obj = cVar;
            if (j3) {
                obj = new e.e.a.q.b.e.a(cVar.f4488a, cVar.b);
            }
            return obj;
        }

        public static /* synthetic */ void a(e.e.a.p.b bVar, String str, View view) {
            bVar.f4445f.onDestroy();
            a(str, new f(bVar, str));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
            if (r1 != 4) goto L_0x005e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void a(android.text.SpannableString r7, e.e.a.o.n.e r8, int r9, int r10, e.e.a.o.n.d r11, android.graphics.drawable.Drawable r12) {
            /*
            // Method dump skipped, instructions count: 132
            */
            throw new UnsupportedOperationException("Method not decompiled: e.c.a.b.l.f.a(android.text.SpannableString, e.e.a.o.n.e, int, int, e.e.a.o.n.d, android.graphics.drawable.Drawable):void");
        }

        public static void a(e.e.a.p.b bVar, String str, e.e.a.n.b.a aVar) {
            if (!TextUtils.isEmpty(str)) {
                if (!(str != null && (str.startsWith("//") || str.toLowerCase().startsWith("http")))) {
                    if (!(str != null && str.startsWith("/"))) {
                        if (str != null && str.startsWith("./")) {
                            int d2 = d(bVar.i);
                            str = b(str, bVar.i);
                            if (d2 == 1) {
                                ((e.e.a.n.b.c.a) b(bVar.f4442c)).a(e.a.a.a.a.b("file:///android_asset/", str), aVar);
                                return;
                            } else if (d2 != 2) {
                                if (d2 != 3) {
                                    return;
                                }
                            }
                        } else {
                            BitmapDrawable bitmapDrawable = null;
                            if (str != null && (str.contains("base64") || str.contains("BASE64"))) {
                                try {
                                    byte[] decode = Base64.decode(str.split(",")[1], 0);
                                    bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                                } catch (Exception unused) {
                                }
                                if (aVar != null) {
                                    aVar.a(bitmapDrawable);
                                    return;
                                }
                                return;
                            }
                            int b2 = b(str, "drawable", (String) null);
                            e.e.a.n.b.c.a aVar2 = (e.e.a.n.b.c.a) b(bVar.f4442c);
                            if (aVar2 != null) {
                                try {
                                    e.d.a.e.b(k.f4312a).a(Integer.valueOf(b2)).a(new e.e.a.n.b.c.b(aVar2, aVar));
                                    return;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                    ((e.e.a.n.b.c.a) b(bVar.f4442c)).a(str, aVar);
                    return;
                }
                b(bVar, str, aVar);
            }
        }

        public static String a(Object obj, int i) {
            if (obj.getClass().isArray()) {
                if (obj instanceof Object[]) {
                    return Arrays.deepToString((Object[]) obj);
                }
                if (obj instanceof boolean[]) {
                    return Arrays.toString((boolean[]) obj);
                }
                if (obj instanceof byte[]) {
                    return Arrays.toString((byte[]) obj);
                }
                if (obj instanceof char[]) {
                    return Arrays.toString((char[]) obj);
                }
                if (obj instanceof double[]) {
                    return Arrays.toString((double[]) obj);
                }
                if (obj instanceof float[]) {
                    return Arrays.toString((float[]) obj);
                }
                if (obj instanceof int[]) {
                    return Arrays.toString((int[]) obj);
                }
                if (obj instanceof long[]) {
                    return Arrays.toString((long[]) obj);
                }
                if (obj instanceof short[]) {
                    return Arrays.toString((short[]) obj);
                }
                StringBuilder a2 = e.a.a.a.a.a("Array has incompatible type: ");
                a2.append(obj.getClass());
                throw new IllegalArgumentException(a2.toString());
            } else if (obj instanceof Throwable) {
                return r.a((Throwable) obj);
            } else {
                if (obj instanceof Bundle) {
                    return a((Bundle) obj);
                }
                if (obj instanceof Intent) {
                    return a((Intent) obj);
                }
                if (i != 32) {
                    String obj2 = obj.toString();
                    if (i != 48) {
                        return obj2;
                    }
                    try {
                        StreamSource streamSource = new StreamSource(new StringReader(obj2));
                        StreamResult streamResult = new StreamResult(new StringWriter());
                        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
                        newTransformer.setOutputProperty("indent", "yes");
                        newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
                        newTransformer.transform(streamSource, streamResult);
                        String obj3 = streamResult.getWriter().toString();
                        return obj3.replaceFirst(">", ">" + l.f3786c);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return obj2;
                    }
                } else if (obj instanceof CharSequence) {
                    String obj4 = obj.toString();
                    try {
                        int length = obj4.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            char charAt = obj4.charAt(i2);
                            if (charAt == '{') {
                                return new JSONObject(obj4).toString(4);
                            }
                            if (charAt == '[') {
                                return new JSONArray(obj4).toString(4);
                            }
                            if (!Character.isWhitespace(charAt)) {
                                return obj4;
                            }
                        }
                        return obj4;
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                        return obj4;
                    }
                } else {
                    try {
                        e.h.a.k kVar = j.f3781a.get("logUtilsGson");
                        if (kVar == null) {
                            e.h.a.l lVar = new e.h.a.l();
                            lVar.m = true;
                            lVar.f4841g = true;
                            kVar = lVar.a();
                            j.f3781a.put("logUtilsGson", kVar);
                        }
                        return kVar.a(obj);
                    } catch (Throwable unused) {
                        return obj.toString();
                    }
                }
            }
        }

        public static List<PropertyValuesHolder> a(String str, Object obj, Object obj2) {
            PropertyValuesHolder propertyValuesHolder;
            PropertyValuesHolder propertyValuesHolder2;
            PropertyValuesHolder propertyValuesHolder3;
            PropertyValuesHolder propertyValuesHolder4;
            float[] fArr = null;
            if ("position".equalsIgnoreCase(str) || "translate".equalsIgnoreCase(str)) {
                Object[] a2 = a(obj);
                float[] fArr2 = (a2 == null || a2.length != 2) ? null : new float[]{e.e.a.y.c.c.b(a2[0]), e.e.a.y.c.c.b(a2[1])};
                if (fArr2 == null) {
                    return new ArrayList();
                }
                Object[] a3 = a(obj2);
                if (a3 != null && a3.length == 2) {
                    fArr = new float[]{e.e.a.y.c.c.b(a3[0]), e.e.a.y.c.c.b(a3[1])};
                }
                ArrayList arrayList = new ArrayList();
                if (fArr != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat("translationX", fArr[0], fArr2[0]);
                    propertyValuesHolder = PropertyValuesHolder.ofFloat("translationY", fArr[1], fArr2[1]);
                } else {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat("translationX", fArr2[0]);
                    propertyValuesHolder = PropertyValuesHolder.ofFloat("translationY", fArr2[1]);
                }
                arrayList.add(propertyValuesHolder2);
                arrayList.add(propertyValuesHolder);
                return arrayList;
            } else if ("opacity".equalsIgnoreCase(str)) {
                ArrayList arrayList2 = new ArrayList();
                if (obj != null) {
                    float a4 = e.e.a.y.c.c.a(obj, false);
                    arrayList2.add(obj2 != null ? PropertyValuesHolder.ofFloat("alpha", e.e.a.y.c.c.a(obj2, false), a4) : PropertyValuesHolder.ofFloat("alpha", a4));
                }
                return arrayList2;
            } else if ("scale".equalsIgnoreCase(str)) {
                return b(obj, obj2, 13);
            } else {
                if ("scaleX".equalsIgnoreCase(str)) {
                    return b(obj, obj2, 11);
                }
                if ("scaleY".equalsIgnoreCase(str)) {
                    return b(obj, obj2, 12);
                }
                if ("rotateX".equalsIgnoreCase(str) || "rotationX".equalsIgnoreCase(str)) {
                    return a(obj, obj2, 1);
                }
                if ("rotateY".equalsIgnoreCase(str) || "rotationY".equalsIgnoreCase(str)) {
                    return a(obj, obj2, 2);
                }
                if ("rotate".equalsIgnoreCase(str) || "rotation".equalsIgnoreCase(str) || "rotationZ".equalsIgnoreCase(str)) {
                    return a(obj, obj2, 3);
                }
                if ("backgroundColor".equalsIgnoreCase(str)) {
                    ArrayList arrayList3 = new ArrayList();
                    if (obj != null) {
                        int h2 = h(String.valueOf(obj2));
                        int h3 = h(String.valueOf(obj));
                        arrayList3.add(obj2 != null ? PropertyValuesHolder.ofObject("backgroundColor", new ArgbEvaluator(), Integer.valueOf(h2), Integer.valueOf(h3)) : PropertyValuesHolder.ofObject("backgroundColor", new ArgbEvaluator(), Integer.valueOf(h3)));
                    }
                    return arrayList3;
                } else if ("width".equalsIgnoreCase(str)) {
                    ArrayList arrayList4 = new ArrayList();
                    if (obj != null) {
                        int b2 = (int) e.e.a.y.c.c.b(obj);
                        if (obj2 == null) {
                            propertyValuesHolder4 = PropertyValuesHolder.ofInt("width", b2);
                        } else {
                            int b3 = (int) e.e.a.y.c.c.b(obj2);
                            if (b3 != b2) {
                                propertyValuesHolder4 = PropertyValuesHolder.ofInt("width", b3, b2);
                            }
                        }
                        arrayList4.add(propertyValuesHolder4);
                    }
                    return arrayList4;
                } else if ("height".equalsIgnoreCase(str)) {
                    ArrayList arrayList5 = new ArrayList();
                    if (obj != null) {
                        int b4 = (int) e.e.a.y.c.c.b(obj);
                        if (obj2 == null) {
                            propertyValuesHolder3 = PropertyValuesHolder.ofInt("height", b4);
                        } else {
                            int b5 = (int) e.e.a.y.c.c.b(obj2);
                            if (b5 != b4) {
                                propertyValuesHolder3 = PropertyValuesHolder.ofInt("height", b5, b4);
                            }
                        }
                        arrayList5.add(propertyValuesHolder3);
                    }
                    return arrayList5;
                } else if (!"skew".equalsIgnoreCase(str)) {
                    return new ArrayList();
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    if (obj != null) {
                        Object[] a5 = a(obj);
                        if (a5 != null && a5.length == 2) {
                            fArr = new float[]{e.e.a.y.c.c.a(a5[0], false), e.e.a.y.c.c.a(a5[1], false)};
                        }
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("skewY", (float) Math.tan(Math.toRadians((double) fArr[1])));
                        arrayList6.add(PropertyValuesHolder.ofFloat("skewX", (float) Math.tan(Math.toRadians((double) fArr[0]))));
                        arrayList6.add(ofFloat);
                    }
                    return arrayList6;
                }
            }
        }

        public static void a(String str, int i, String str2) {
            e.e.a.g a2 = k.a(str);
            if (a2.b == null) {
                a2.b = e.e.a.b.f4289a;
            }
            e.e.a.a0.e eVar = a2.b;
            if (eVar != null) {
                eVar.a(i, str2);
            }
        }

        public static boolean a(long j, long j2, e.e.a.b0.c cVar) {
            if (cVar == null) {
                return false;
            }
            if (f3801d != null) {
                return true;
            }
            LocationManager locationManager = (LocationManager) b().getSystemService("location");
            f3801d = locationManager;
            if (locationManager == null || (!locationManager.isProviderEnabled("network") && !f3801d.isProviderEnabled("gps"))) {
                l.a("LocationUtils", "无法定位，请打开定位服务");
                return false;
            }
            b = cVar;
            LocationManager locationManager2 = f3801d;
            Criteria criteria = new Criteria();
            criteria.setAccuracy(1);
            criteria.setSpeedRequired(false);
            criteria.setCostAllowed(false);
            criteria.setBearingRequired(false);
            criteria.setAltitudeRequired(false);
            criteria.setPowerRequirement(1);
            String bestProvider = locationManager2.getBestProvider(criteria, true);
            Location lastKnownLocation = f3801d.getLastKnownLocation(bestProvider);
            if (lastKnownLocation == null) {
                lastKnownLocation = new Location("unknown");
            }
            cVar.a(lastKnownLocation);
            if (f3801d != null) {
                if (f3800c == null) {
                    f3800c = new e.e.a.b0.b(null);
                }
                f3801d.requestLocationUpdates(bestProvider, j, (float) j2, f3800c);
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
            if (r7 != false) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            if (r7 != false) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
            if (r7 != false) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
            a(r4, r5, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
            if (r7 != false) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
            ((e.e.a.n.b.c.a) b(r4.f4442c)).a(r6, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(e.e.a.p.b r4, android.widget.ImageView r5, java.lang.String r6, boolean r7, int r8) {
            /*
            // Method dump skipped, instructions count: 283
            */
            throw new UnsupportedOperationException("Method not decompiled: e.c.a.b.l.f.a(e.e.a.p.b, android.widget.ImageView, java.lang.String, boolean, int):void");
        }

        public static void a(e.e.a.p.b bVar, ImageView imageView, String str, int i) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("//")) {
                    str = e.a.a.a.a.b("https:", str);
                }
                ((e.e.a.n.b.c.a) b(bVar.f4442c)).a(str, i, imageView);
            }
        }

        public static void a(e.e.a.p.b bVar, ImageView imageView, String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("//")) {
                    str = e.a.a.a.a.b("https:", str);
                }
                ((e.e.a.n.b.c.a) b(bVar.f4442c)).a(str, imageView);
            }
        }

        public static Bitmap a(Bitmap bitmap, e.d.a.m.i.m.b bVar, int i) {
            Matrix matrix = new Matrix();
            switch (i) {
                case 2:
                    matrix.setScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.setRotate(180.0f);
                    break;
                case 4:
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 5:
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix.setRotate(90.0f);
                    break;
                case 7:
                    matrix.setRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.setRotate(-90.0f);
                    break;
            }
            if (matrix.isIdentity()) {
                return bitmap;
            }
            RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            matrix.mapRect(rectF);
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            Bitmap.Config a2 = a(bitmap);
            Bitmap a3 = bVar.a(round, round2, a2);
            if (a3 == null) {
                a3 = Bitmap.createBitmap(round, round2, a2);
            }
            matrix.postTranslate(-rectF.left, -rectF.top);
            new Canvas(a3).drawBitmap(bitmap, matrix, new Paint(6));
            return a3;
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public String f3802a;
        public String[] b;

        /* renamed from: c  reason: collision with root package name */
        public String f3803c;

        public g(String str, String[] strArr, String str2) {
            this.f3802a = str;
            this.b = strArr;
            this.f3803c = str2;
        }
    }

    public static String a(StackTraceElement stackTraceElement) {
        String fileName = stackTraceElement.getFileName();
        if (fileName != null) {
            return fileName;
        }
        String className = stackTraceElement.getClassName();
        String[] split = className.split("\\.");
        if (split.length > 0) {
            className = split[split.length - 1];
        }
        int indexOf = className.indexOf(36);
        if (indexOf != -1) {
            className = className.substring(0, indexOf);
        }
        return e.a.a.a.a.b(className, ".java");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Object... r18) {
        /*
        // Method dump skipped, instructions count: 899
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.b.l.a(java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d A[SYNTHETIC, Splitter:B:28:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.b.l.b(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b A[SYNTHETIC, Splitter:B:12:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.a.b.l.c(java.lang.String, java.lang.String):void");
    }

    public static void a(String str, String str2) {
        File[] listFiles;
        if (f3787d.p > 0 && (listFiles = new File(str).getParentFile().listFiles(new a())) != null && listFiles.length > 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
            try {
                long time = simpleDateFormat.parse(str2).getTime() - (((long) f3787d.p) * 86400000);
                for (File file : listFiles) {
                    String name = file.getName();
                    name.length();
                    Matcher matcher = Pattern.compile("[0-9]{4}_[0-9]{2}_[0-9]{2}").matcher(name);
                    if (simpleDateFormat.parse(matcher.find() ? matcher.group() : "").getTime() <= time) {
                        f3789f.execute(new b(file));
                    }
                }
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static String a(Object obj) {
        Type type;
        int i;
        if (obj == null) {
            return "null";
        }
        if (!f3790g.isEmpty()) {
            h<Class, e> hVar = f3790g;
            Class<?> cls = obj.getClass();
            if (cls.isAnonymousClass() || cls.isSynthetic()) {
                Type[] genericInterfaces = cls.getGenericInterfaces();
                if (genericInterfaces.length == 1) {
                    type = genericInterfaces[0];
                    while (type instanceof ParameterizedType) {
                        type = ((ParameterizedType) type).getRawType();
                    }
                } else {
                    type = cls.getGenericSuperclass();
                    while (type instanceof ParameterizedType) {
                        type = ((ParameterizedType) type).getRawType();
                    }
                }
                String obj2 = type.toString();
                if (obj2.startsWith("class ")) {
                    i = 6;
                } else {
                    if (obj2.startsWith("interface ")) {
                        i = 10;
                    }
                    cls = Class.forName(obj2);
                }
                obj2 = obj2.substring(i);
                try {
                    cls = Class.forName(obj2);
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
            }
            e orDefault = hVar.getOrDefault(cls, null);
            if (orDefault != null) {
                return orDefault.a(obj);
            }
        }
        return f.a(obj, -1);
    }

    public static void a(int i, String str, String str2) {
        if (!f3787d.j) {
            Log.println(i, str, str2);
            return;
        }
        String[] split = str2.split(f3786c);
        for (String str3 : split) {
            Log.println(i, str, "│ " + str3);
        }
    }
}
