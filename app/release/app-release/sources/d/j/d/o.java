package d.j.d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import d.j.c;
import e.a.a.a.a;

public class o implements LayoutInflater.Factory2 {

    /* renamed from: c  reason: collision with root package name */
    public final q f3486c;

    public o(q qVar) {
        this.f3486c = qVar;
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (k.class.getName().equals(str)) {
            return new k(context, attributeSet, this.f3486c);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(c.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(c.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(c.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !m.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f3486c.b(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f3486c.b(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f3486c.b(id);
        }
        if (q.c(2)) {
            StringBuilder a2 = a.a("onCreateView: id=0x");
            a2.append(Integer.toHexString(resourceId));
            a2.append(" fname=");
            a2.append(attributeValue);
            a2.append(" existing=");
            a2.append(fragment);
            Log.v("FragmentManager", a2.toString());
        }
        if (fragment == null) {
            fragment = this.f3486c.h().a(context.getClassLoader(), attributeValue);
            fragment.o = true;
            fragment.x = resourceId != 0 ? resourceId : id;
            fragment.y = id;
            fragment.z = string;
            fragment.p = true;
            q qVar = this.f3486c;
            fragment.t = qVar;
            n<?> nVar = qVar.n;
            fragment.u = nVar;
            Context context2 = nVar.f3481d;
            fragment.a(attributeSet, fragment.f2392d);
            this.f3486c.a(fragment);
            q qVar2 = this.f3486c;
            qVar2.a(fragment, qVar2.m);
        } else if (!fragment.p) {
            fragment.p = true;
            n<?> nVar2 = this.f3486c.n;
            fragment.u = nVar2;
            Context context3 = nVar2.f3481d;
            fragment.a(attributeSet, fragment.f2392d);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        q qVar3 = this.f3486c;
        if (qVar3.m >= 1 || !fragment.o) {
            q qVar4 = this.f3486c;
            qVar4.a(fragment, qVar4.m);
        } else {
            qVar3.a(fragment, 1);
        }
        View view2 = fragment.I;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.I.getTag() == null) {
                fragment.I.setTag(string);
            }
            return fragment.I;
        }
        throw new IllegalStateException(a.a("Fragment ", attributeValue, " did not create a view."));
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
