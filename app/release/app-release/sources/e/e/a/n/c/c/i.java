package e.e.a.n.c.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import com.blankj.utilcode.util.UtilsTransActivity;
import e.c.a.b.l;
import e.c.a.b.m;
import e.c.a.b.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class i implements e.e.a.n.c.a {

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    public static /* synthetic */ void a(Context context, e.e.a.n.c.b bVar) {
        Toast.makeText(context, "Need Location Permission!", 0).show();
        if (bVar != null) {
            bVar.a(1001, "ERROR_NO_LOCATION_PERMISSION");
        }
    }

    public static /* synthetic */ void a(UtilsTransActivity utilsTransActivity, n.b.a aVar) {
        m mVar = (m) aVar;
        mVar.f3805c.i = new ArrayList();
        mVar.f3805c.j = new ArrayList();
        mVar.f3804a.run();
    }

    public static /* synthetic */ void b(Context context, e.e.a.n.c.b bVar) {
        Toast.makeText(context, "Need Location Permission!", 0).show();
        if (bVar != null) {
            bVar.a(1001, "ERROR_NO_LOCATION_PERMISSION");
        }
    }

    public /* synthetic */ void a(long j, long j2, e.e.a.n.c.b bVar, Context context) {
        if (!l.f.a(j, j2, new g(this, bVar))) {
            Toast.makeText(context, "Need Location Service!", 0).show();
            if (bVar != null) {
                bVar.a(1002, "ERROR_NO_LOCATION_SERVICE");
            }
        }
    }

    public /* synthetic */ void a(e.e.a.n.c.b bVar, Context context) {
        if (!l.f.a(0, 0, new f(this, bVar))) {
            Toast.makeText(context, "Need Location Service!", 0).show();
            if (bVar != null) {
                bVar.a(1002, "ERROR_NO_LOCATION_SERVICE");
            }
        }
    }

    public final void a(b bVar, a aVar) {
        List list;
        String[] strArr;
        n nVar = new n("LOCATION");
        nVar.b = b.f4339a;
        nVar.f3807c = new h(this, bVar, aVar);
        String[] strArr2 = nVar.f3806a;
        if (strArr2 == null || strArr2.length <= 0) {
            Log.e("PermissionUtils", "No permissions to request.");
            return;
        }
        nVar.f3810f = new LinkedHashSet();
        nVar.f3811g = new ArrayList();
        nVar.f3812h = new ArrayList();
        nVar.i = new ArrayList();
        nVar.j = new ArrayList();
        try {
            String[] strArr3 = l.f.b().getPackageManager().getPackageInfo(l.f.b().getPackageName(), 4096).requestedPermissions;
            list = strArr3 == null ? Collections.emptyList() : Arrays.asList(strArr3);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            list = Collections.emptyList();
        }
        String[] strArr4 = nVar.f3806a;
        for (String str : strArr4) {
            if (str != null) {
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -1611296843:
                        if (str.equals("LOCATION")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1596608551:
                        if (str.equals("SENSORS")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case -1166291365:
                        if (str.equals("STORAGE")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 82233:
                        if (str.equals("SMS")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 76105038:
                        if (str.equals("PHONE")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 215175251:
                        if (str.equals("CONTACTS")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 604302142:
                        if (str.equals("CALENDAR")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1856013610:
                        if (str.equals("MICROPHONE")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1980544805:
                        if (str.equals("CAMERA")) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        strArr = e.c.a.a.a.f3764a;
                        break;
                    case 1:
                        strArr = e.c.a.a.a.b;
                        break;
                    case 2:
                        strArr = e.c.a.a.a.f3765c;
                        break;
                    case 3:
                        strArr = e.c.a.a.a.f3766d;
                        break;
                    case 4:
                        strArr = e.c.a.a.a.f3767e;
                        break;
                    case 5:
                        if (Build.VERSION.SDK_INT < 26) {
                            strArr = e.c.a.a.a.f3769g;
                            break;
                        } else {
                            strArr = e.c.a.a.a.f3768f;
                            break;
                        }
                    case 6:
                        strArr = e.c.a.a.a.f3770h;
                        break;
                    case 7:
                        strArr = e.c.a.a.a.i;
                        break;
                    case '\b':
                        strArr = e.c.a.a.a.j;
                        break;
                    default:
                        strArr = new String[]{str};
                        break;
                }
            } else {
                strArr = new String[0];
            }
            boolean z = false;
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    nVar.f3810f.add(str2);
                    z = true;
                }
            }
            if (!z) {
                nVar.i.add(str);
                Log.e("PermissionUtils", "U should add the permission of " + str + " in manifest.");
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            nVar.f3812h.addAll(nVar.f3810f);
        } else {
            for (String str3 : nVar.f3810f) {
                (n.a(str3) ? nVar.f3812h : nVar.f3811g).add(str3);
            }
            if (!nVar.f3811g.isEmpty()) {
                n.c.a(1);
                return;
            }
        }
        nVar.a();
    }
}
