package e.a.a.a;

import a.a.a.a.c0;
import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.e.x0.b;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.k1.h;
import a.w.c.i;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: outline */
public class a {
    public static int a(int i, int i2, int i3, int i4) {
        return ((i - i2) * i3) / i4;
    }

    public static g0 a(g0 g0Var, g0 g0Var2) {
        g0.c a2 = g0.a(g0Var);
        a2.a(g0Var2);
        return a2.i();
    }

    public static String a(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.k());
        return sb.toString();
    }

    public static String a(String str, int i) {
        return str + i;
    }

    public static String a(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String a(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String a(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder a(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder a(String str, h hVar, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(hVar);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void a(StringBuilder sb, Fragment fragment, String str) {
        sb.append(fragment);
        Log.d(str, sb.toString());
    }

    public static boolean a(c0.a aVar) {
        return c1.c(aVar.h().e().c());
    }

    public static boolean a(b.C0045b bVar, int i, String str) {
        Boolean a2 = bVar.a(i);
        i.a((Object) a2, str);
        return a2.booleanValue();
    }

    public static String b(String str, String str2) {
        return str + str2;
    }
}
