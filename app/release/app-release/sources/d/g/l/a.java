package d.g.l;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import d.g.l.z.b;
import d.g.l.z.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f3330c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f3331a = f3330c;
    public final View.AccessibilityDelegate b = new C0104a(this);

    /* renamed from: d.g.l.a$a  reason: collision with other inner class name */
    public static final class C0104a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f3332a;

        public C0104a(a aVar) {
            this.f3332a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3332a.f3331a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f3332a.f3331a.getAccessibilityNodeProvider(view);
            c cVar = accessibilityNodeProvider != null ? new c(accessibilityNodeProvider) : null;
            if (cVar != null) {
                return (AccessibilityNodeProvider) cVar.f3371a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3332a.a(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            b bVar = new b(accessibilityNodeInfo);
            boolean s = p.s(view);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f3365a.setScreenReaderFocusable(s);
            } else {
                bVar.a(1, s);
            }
            Boolean bool = (Boolean) new s(d.g.b.tag_accessibility_heading, Boolean.class, 28).b(view);
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f3365a.setHeading(booleanValue);
            } else {
                bVar.a(2, booleanValue);
            }
            CharSequence charSequence = (CharSequence) new r(d.g.b.tag_accessibility_pane_title, CharSequence.class, 8, 28).b(view);
            if (Build.VERSION.SDK_INT >= 28) {
                bVar.f3365a.setPaneTitle(charSequence);
            } else {
                bVar.f3365a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
            }
            this.f3332a.a(view, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (Build.VERSION.SDK_INT < 26) {
                bVar.f3365a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                bVar.f3365a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                bVar.f3365a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                bVar.f3365a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(d.g.b.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                        if (((WeakReference) sparseArray.valueAt(i2)).get() == null) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        sparseArray.remove(((Integer) arrayList.get(i3)).intValue());
                    }
                }
                ClickableSpan[] a2 = b.a(text);
                if (a2 != null && a2.length > 0) {
                    bVar.a().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", d.g.b.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(d.g.b.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(d.g.b.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i4 = 0; i4 < a2.length; i4++) {
                        ClickableSpan clickableSpan = a2[i4];
                        int i5 = 0;
                        while (true) {
                            if (i5 >= sparseArray2.size()) {
                                i = b.f3364d;
                                b.f3364d = i + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i5)).get())) {
                                i = sparseArray2.keyAt(i5);
                                break;
                            } else {
                                i5++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(a2[i4]));
                        ClickableSpan clickableSpan2 = a2[i4];
                        Spanned spanned = (Spanned) text;
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List list = (List) view.getTag(d.g.b.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i6 = 0; i6 < list.size(); i6++) {
                b.a aVar = (b.a) list.get(i6);
                if (Build.VERSION.SDK_INT >= 21) {
                    bVar.f3365a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3367a);
                }
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3332a.f3331a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3332a.f3331a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3332a.a(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f3332a.f3331a.sendAccessibilityEvent(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3332a.f3331a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f3331a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, b bVar) {
        this.f3331a.onInitializeAccessibilityNodeInfo(view, bVar.f3365a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r8, int r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.l.a.a(android.view.View, int, android.os.Bundle):boolean");
    }
}
