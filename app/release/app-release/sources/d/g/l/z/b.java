package d.g.l.z;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import d.g.l.z.d;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: d  reason: collision with root package name */
    public static int f3364d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f3365a;
    public int b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3366c = -1;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f3367a;
        public final Class<? extends d.a> b;

        /* renamed from: c  reason: collision with root package name */
        public final d f3368c;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(1, null);
            new a(2, null);
            new a(4, null);
            new a(8, null);
            new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, d.b.class);
            new a(512, null, d.b.class);
            new a(1024, null, d.c.class);
            new a(2048, null, d.c.class);
            new a(4096, null);
            new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, d.g.class);
            new a(262144, null);
            new a(524288, null);
            new a(1048576, null);
            new a(2097152, null, d.h.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, d.e.class);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            new a(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, d.f.class);
            new a(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, d.C0106d.class);
            new a(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a(accessibilityAction, 16908357, null, null, null);
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public a(int i, CharSequence charSequence, Class<? extends d.a> cls) {
            this(null, i, charSequence, null, cls);
        }

        public a(Object obj, int i, CharSequence charSequence, d dVar, Class<? extends d.a> cls) {
            this.f3368c = dVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f3367a = obj;
            this.b = cls;
        }
    }

    /* renamed from: d.g.l.z.b$b  reason: collision with other inner class name */
    public static class C0105b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f3369a;

        public C0105b(Object obj) {
            this.f3369a = obj;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f3370a;

        public c(Object obj) {
            this.f3370a = obj;
        }

        public static c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return Build.VERSION.SDK_INT >= 21 ? new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3365a = accessibilityNodeInfo;
    }

    public static ClickableSpan[] a(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public Bundle a() {
        return this.f3365a.getExtras();
    }

    public final List<Integer> a(String str) {
        ArrayList<Integer> integerArrayList = this.f3365a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f3365a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void a(int i, boolean z) {
        Bundle a2 = a();
        if (a2 != null) {
            int i2 = a2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            a2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public void a(Object obj) {
        this.f3365a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f3370a);
    }

    public CharSequence b() {
        if (!(!a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f3365a.getText();
        }
        List<Integer> a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a5 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3365a.getText(), 0, this.f3365a.getText().length()));
        for (int i = 0; i < a2.size(); i++) {
            spannableString.setSpan(new a(a5.get(i).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a2.get(i).intValue(), a3.get(i).intValue(), a4.get(i).intValue());
        }
        return spannableString;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3365a;
        if (accessibilityNodeInfo == null) {
            if (bVar.f3365a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.f3365a)) {
            return false;
        }
        return this.f3366c == bVar.f3366c && this.b == bVar.b;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3365a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f3365a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f3365a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f3365a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f3365a.getClassName());
        sb.append("; text: ");
        sb.append(b());
        sb.append("; contentDescription: ");
        sb.append(this.f3365a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f3365a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f3365a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f3365a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f3365a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f3365a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f3365a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f3365a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f3365a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f3365a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f3365a.isPassword());
        sb.append("; scrollable: " + this.f3365a.isScrollable());
        sb.append("; [");
        int actions = this.f3365a.getActions();
        while (actions != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
            actions &= numberOfTrailingZeros ^ -1;
            if (numberOfTrailingZeros == 1) {
                str = "ACTION_FOCUS";
            } else if (numberOfTrailingZeros != 2) {
                switch (numberOfTrailingZeros) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    default:
                        str = "ACTION_UNKNOWN";
                        break;
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            sb.append(str);
            if (actions != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
