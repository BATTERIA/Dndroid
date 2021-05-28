package e.e.a.q.a;

import android.text.TextUtils;
import e.a.a.a.a;
import e.c.a.b.l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public String f4459a = "";

    public void a(List<i> list) {
        l lVar;
        String str;
        Object obj;
        Object obj2;
        StringBuilder a2 = a.a("┌─────────────────────────\n│\t函数调用树\n├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄\n");
        if (list == null || list.isEmpty()) {
            lVar = null;
        } else {
            Stack stack = new Stack();
            ArrayList arrayList = new ArrayList();
            for (i iVar : list) {
                long j = iVar.b;
                l lVar2 = new l(j, iVar.f4462a + "." + iVar.f4463c);
                lVar2.f4484h = iVar.f4467g;
                if ("constructor_end".equals(iVar.f4463c)) {
                    ((l) stack.pop()).f4483g = true;
                } else {
                    arrayList.add(lVar2);
                    if (!stack.isEmpty()) {
                        l lVar3 = (l) stack.peek();
                        if (!lVar3.f4483g) {
                            lVar3.f4480d.add(lVar2);
                            lVar2.f4481e = lVar3;
                        }
                    }
                    if ("constructor".equals(iVar.f4463c)) {
                        stack.push(lVar2);
                    } else {
                        if ("setStyle".equals(iVar.f4463c) || "setText".equals(iVar.f4463c) || "setSrc".equals(iVar.f4463c)) {
                            Object[] objArr = iVar.f4464d;
                            if (objArr.length > 0) {
                                obj = objArr[0];
                            }
                        } else {
                            if ("appendChild".equals(iVar.f4463c) || "removeChild".equals(iVar.f4463c)) {
                                obj2 = iVar.f4464d[0];
                            } else if ("insertBefore".equals(iVar.f4463c) || "replaceChild".equals(iVar.f4463c)) {
                                str = String.format("%d, %d", Long.valueOf(((Number) iVar.f4464d[0]).longValue()), Long.valueOf(((Number) iVar.f4464d[0]).longValue()));
                                lVar2.f4479c = str;
                            } else if ("Hummer".equals(iVar.f4462a) && "render".equals(iVar.f4463c)) {
                                obj2 = iVar.f4464d[0];
                            } else if ("Hummer".equals(iVar.f4462a) && "console.log".equals(iVar.f4463c)) {
                                lVar2.b = "console.log";
                                Object[] objArr2 = iVar.f4464d;
                                if (objArr2.length > 0) {
                                    obj = objArr2[0];
                                }
                            }
                            str = String.valueOf(((Number) obj2).longValue());
                            lVar2.f4479c = str;
                        }
                        str = String.valueOf(obj);
                        lVar2.f4479c = str;
                    }
                }
            }
            lVar = new l(-1, "<< JSContext >>");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l lVar4 = (l) it.next();
                if (lVar4 != null && lVar4.f4481e == null) {
                    lVar.f4480d.add(lVar4);
                    lVar4.f4481e = lVar;
                }
            }
        }
        this.f4459a = a.a(a2, a(lVar, 0, 0), "└─────────────────────────\n");
        StringBuilder a3 = a.a(" \n");
        a3.append(this.f4459a);
        l.f.c("HummerDebug", a3.toString());
    }

    public final String a(l lVar, int i, int i2) {
        if (lVar == null) {
            return "";
        }
        StringBuilder a2 = a.a("│\t");
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < i) {
            sb.append(((1 << i3) & i2) == 0 ? i3 < i + -1 ? "│\t" : lVar.f4481e != null ? "├─" : "├x" : i3 < i + -1 ? "\t" : lVar.f4481e != null ? "└─" : "└x");
            i3++;
        }
        if (sb.length() > 0) {
            sb.append(" ");
        }
        a2.append(sb.toString());
        if (lVar.f4484h > 0) {
            a2.append("[");
            a2.append(new SimpleDateFormat("HH:mm:ss").format(Long.valueOf(lVar.f4484h)) + "." + (lVar.f4484h % 1000));
            a2.append("] ");
        }
        long j = lVar.f4478a;
        if (j >= 0) {
            a2.append(j);
            a2.append(".");
        }
        a2.append(lVar.b);
        if (!TextUtils.isEmpty(lVar.f4479c)) {
            a2.append(" (");
            a2.append(lVar.f4479c);
            a2.append(")");
        }
        a2.append('\n');
        List<l> list = lVar.f4480d;
        if (list != null && !list.isEmpty()) {
            int i4 = i + 1;
            Iterator<l> it = lVar.f4480d.iterator();
            while (it.hasNext()) {
                l next = it.next();
                if (!it.hasNext()) {
                    i2 |= 1 << i;
                }
                a2.append(a(next, i4, i2));
            }
        }
        return a2.toString();
    }
}
