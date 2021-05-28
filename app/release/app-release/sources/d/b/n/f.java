package d.b.n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.b.n.i.j;
import d.b.n.i.k;
import d.b.o.b0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f2752e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f2753f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2754a;
    public final Object[] b;

    /* renamed from: c  reason: collision with root package name */
    public Context f2755c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2756d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f2757c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f2758a;
        public Method b;

        public a(Object obj, String str) {
            this.f2758a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, f2757c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.b.invoke(this.f2758a, menuItem)).booleanValue();
                }
                this.b.invoke(this.f2758a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class b {
        public d.g.l.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f2759a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2760c;

        /* renamed from: d  reason: collision with root package name */
        public int f2761d;

        /* renamed from: e  reason: collision with root package name */
        public int f2762e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2763f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2764g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2765h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.f2759a = menu;
            this.b = 0;
            this.f2760c = 0;
            this.f2761d = 0;
            this.f2762e = 0;
            this.f2763f = true;
            this.f2764g = true;
        }

        public SubMenu a() {
            this.f2765h = true;
            SubMenu addSubMenu = this.f2759a.addSubMenu(this.b, this.i, this.j, this.k);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = f.this.f2755c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void a(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!f.this.f2755c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.f2756d == null) {
                        fVar.f2756d = fVar.a(fVar.f2755c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f2756d, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z3 = menuItem instanceof j;
            if (z3) {
                j jVar = (j) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    j jVar2 = (j) menuItem;
                    jVar2.x = (jVar2.x & -5) | 4;
                } else if (menuItem instanceof k) {
                    k kVar = (k) menuItem;
                    try {
                        if (kVar.f2836e == null) {
                            kVar.f2836e = kVar.f2789a.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        kVar.f2836e.invoke(kVar.f2789a, true);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, f.f2752e, f.this.f2754a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            d.g.l.b bVar = this.A;
            if (bVar != null) {
                if (menuItem instanceof d.g.g.a.b) {
                    ((d.g.g.a.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z4 = menuItem instanceof d.g.g.a.b;
            if (z4) {
                ((d.g.g.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z4) {
                ((d.g.g.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i4 = this.o;
            if (z4) {
                ((d.g.g.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.p;
            int i5 = this.q;
            if (z4) {
                ((d.g.g.a.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z4) {
                    ((d.g.g.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList == null) {
                return;
            }
            if (z4) {
                ((d.g.g.a.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f2752e = clsArr;
        f2753f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f2755c = context;
        Object[] objArr = {context};
        this.f2754a = objArr;
        this.b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v68, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c2;
        char c3;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(e.a.a.a.a.b("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.b = 0;
                            bVar.f2760c = 0;
                            bVar.f2761d = 0;
                            bVar.f2762e = 0;
                            bVar.f2763f = true;
                            bVar.f2764g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.f2765h) {
                                d.g.l.b bVar2 = bVar.A;
                                if (bVar2 == null || !((k.a) bVar2).b.hasSubMenu()) {
                                    bVar.f2765h = true;
                                    bVar.a(bVar.f2759a.add(bVar.b, bVar.i, bVar.j, bVar.k));
                                } else {
                                    bVar.a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.f2755c.obtainStyledAttributes(attributeSet, d.b.j.MenuGroup);
                        bVar.b = obtainStyledAttributes.getResourceId(d.b.j.MenuGroup_android_id, 0);
                        bVar.f2760c = obtainStyledAttributes.getInt(d.b.j.MenuGroup_android_menuCategory, 0);
                        bVar.f2761d = obtainStyledAttributes.getInt(d.b.j.MenuGroup_android_orderInCategory, 0);
                        bVar.f2762e = obtainStyledAttributes.getInt(d.b.j.MenuGroup_android_checkableBehavior, 0);
                        bVar.f2763f = obtainStyledAttributes.getBoolean(d.b.j.MenuGroup_android_visible, true);
                        bVar.f2764g = obtainStyledAttributes.getBoolean(d.b.j.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        TypedArray obtainStyledAttributes2 = f.this.f2755c.obtainStyledAttributes(attributeSet, d.b.j.MenuItem);
                        bVar.i = obtainStyledAttributes2.getResourceId(d.b.j.MenuItem_android_id, 0);
                        bVar.j = (obtainStyledAttributes2.getInt(d.b.j.MenuItem_android_menuCategory, bVar.f2760c) & -65536) | (obtainStyledAttributes2.getInt(d.b.j.MenuItem_android_orderInCategory, bVar.f2761d) & 65535);
                        bVar.k = obtainStyledAttributes2.getText(d.b.j.MenuItem_android_title);
                        bVar.l = obtainStyledAttributes2.getText(d.b.j.MenuItem_android_titleCondensed);
                        bVar.m = obtainStyledAttributes2.getResourceId(d.b.j.MenuItem_android_icon, 0);
                        String string = obtainStyledAttributes2.getString(d.b.j.MenuItem_android_alphabeticShortcut);
                        if (string == null) {
                            c2 = 0;
                        } else {
                            c2 = string.charAt(0);
                        }
                        bVar.n = c2;
                        bVar.o = obtainStyledAttributes2.getInt(d.b.j.MenuItem_alphabeticModifiers, 4096);
                        String string2 = obtainStyledAttributes2.getString(d.b.j.MenuItem_android_numericShortcut);
                        if (string2 == null) {
                            c3 = 0;
                        } else {
                            c3 = string2.charAt(0);
                        }
                        bVar.p = c3;
                        bVar.q = obtainStyledAttributes2.getInt(d.b.j.MenuItem_numericModifiers, 4096);
                        bVar.r = obtainStyledAttributes2.hasValue(d.b.j.MenuItem_android_checkable) ? obtainStyledAttributes2.getBoolean(d.b.j.MenuItem_android_checkable, false) : bVar.f2762e ? 1 : 0;
                        bVar.s = obtainStyledAttributes2.getBoolean(d.b.j.MenuItem_android_checked, false);
                        bVar.t = obtainStyledAttributes2.getBoolean(d.b.j.MenuItem_android_visible, bVar.f2763f);
                        bVar.u = obtainStyledAttributes2.getBoolean(d.b.j.MenuItem_android_enabled, bVar.f2764g);
                        bVar.v = obtainStyledAttributes2.getInt(d.b.j.MenuItem_showAsAction, -1);
                        bVar.z = obtainStyledAttributes2.getString(d.b.j.MenuItem_android_onClick);
                        bVar.w = obtainStyledAttributes2.getResourceId(d.b.j.MenuItem_actionLayout, 0);
                        bVar.x = obtainStyledAttributes2.getString(d.b.j.MenuItem_actionViewClass);
                        String string3 = obtainStyledAttributes2.getString(d.b.j.MenuItem_actionProviderClass);
                        bVar.y = string3;
                        boolean z3 = string3 != null;
                        if (z3 && bVar.w == 0 && bVar.x == null) {
                            bVar.A = (d.g.l.b) bVar.a(bVar.y, f2753f, f.this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.A = null;
                        }
                        bVar.B = obtainStyledAttributes2.getText(d.b.j.MenuItem_contentDescription);
                        bVar.C = obtainStyledAttributes2.getText(d.b.j.MenuItem_tooltipText);
                        if (obtainStyledAttributes2.hasValue(d.b.j.MenuItem_iconTintMode)) {
                            bVar.E = b0.a(obtainStyledAttributes2.getInt(d.b.j.MenuItem_iconTintMode, -1), bVar.E);
                        } else {
                            bVar.E = null;
                        }
                        if (obtainStyledAttributes2.hasValue(d.b.j.MenuItem_iconTint)) {
                            bVar.D = obtainStyledAttributes2.getColorStateList(d.b.j.MenuItem_iconTint);
                        } else {
                            bVar.D = null;
                        }
                        obtainStyledAttributes2.recycle();
                        bVar.f2765h = false;
                    } else {
                        if (name3.equals("menu")) {
                            a(xmlPullParser, attributeSet, bVar.a());
                        } else {
                            z2 = true;
                            str = name3;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof d.g.g.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f2755c.getResources().getLayout(i);
            a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
