package e.e.a.q.a;

import android.text.TextUtils;
import e.a.a.a.a;
import e.c.a.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public String f4460a = "";

    public void a(List<i> list) {
        l lVar;
        l lVar2;
        l lVar3;
        StringBuilder a2 = a.a("┌─────────────────────────\n│\t视图树\n├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄\n");
        l lVar4 = null;
        if (list != null && !list.isEmpty()) {
            Stack stack = new Stack();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            l lVar5 = null;
            for (i iVar : list) {
                if ("constructor".equals(iVar.f4463c)) {
                    l lVar6 = new l(iVar.b, iVar.f4462a);
                    lVar6.f4484h = iVar.f4467g;
                    linkedHashMap.put(Long.valueOf(lVar6.f4478a), lVar6);
                    if (!stack.isEmpty()) {
                        l lVar7 = (l) stack.peek();
                        if (!lVar7.f4483g) {
                            lVar7.f4480d.add(lVar6);
                            lVar6.f4482f = lVar7;
                        }
                    }
                    stack.push(lVar6);
                } else {
                    boolean z = true;
                    if ("constructor_end".equals(iVar.f4463c)) {
                        ((l) stack.pop()).f4483g = true;
                    } else if ("setText".equals(iVar.f4463c) || "setSrc".equals(iVar.f4463c)) {
                        l lVar8 = (l) linkedHashMap.get(Long.valueOf(iVar.b));
                        if (lVar8 != null) {
                            Object[] objArr = iVar.f4464d;
                            if (objArr.length > 0) {
                                lVar8.f4479c = String.valueOf(objArr[0]);
                            }
                        }
                    } else if ("appendChild".equals(iVar.f4463c)) {
                        l lVar9 = (l) linkedHashMap.get(Long.valueOf(iVar.b));
                        if (!(lVar9 == null || (lVar3 = (l) linkedHashMap.get(Long.valueOf(((Number) iVar.f4464d[0]).longValue()))) == null)) {
                            l lVar10 = lVar3.f4482f;
                            if (lVar10 != null) {
                                lVar10.a(lVar3);
                                lVar3.f4482f = null;
                            }
                            Iterator<l> it = lVar9.f4480d.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (it.next().f4478a == lVar3.f4478a) {
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            if (!z) {
                                lVar9.f4480d.add(lVar3);
                            }
                            lVar3.f4481e = lVar9;
                        }
                    } else if ("removeChild".equals(iVar.f4463c)) {
                        l lVar11 = (l) linkedHashMap.get(Long.valueOf(iVar.b));
                        if (!(lVar11 == null || (lVar2 = (l) linkedHashMap.get(Long.valueOf(((Number) iVar.f4464d[0]).longValue()))) == null)) {
                            l lVar12 = lVar2.f4482f;
                            if (lVar12 != null) {
                                lVar12.a(lVar2);
                                lVar2.f4482f = null;
                            }
                            l lVar13 = lVar2.f4481e;
                            if (lVar13 != null) {
                                lVar13.a(lVar2);
                                lVar2.f4481e = null;
                            }
                            lVar11.a(lVar2);
                        }
                    } else if ("Hummer".equals(iVar.f4462a) && "render".equals(iVar.f4463c) && (lVar = (l) linkedHashMap.get(Long.valueOf(((Number) iVar.f4464d[0]).longValue()))) != null) {
                        lVar.f4479c = "RootView";
                        lVar5 = lVar;
                    }
                }
            }
            if (lVar5 == null) {
                lVar4 = new l(-1, "<< Root With Crash >>");
                for (Long l : linkedHashMap.keySet()) {
                    l lVar14 = (l) linkedHashMap.get(Long.valueOf(l.longValue()));
                    if (lVar14 != null && lVar14.f4481e == null && lVar14.f4482f == null) {
                        lVar4.f4480d.add(lVar14);
                        lVar14.f4481e = lVar4;
                    }
                }
            } else {
                lVar4 = lVar5;
            }
        }
        this.f4460a = a.a(a2, a(lVar4, 0, 0), "└─────────────────────────\n");
        StringBuilder a3 = a.a(" \n");
        a3.append(this.f4460a);
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
