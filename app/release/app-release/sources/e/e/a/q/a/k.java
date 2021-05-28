package e.e.a.q.a;

import e.c.a.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public String f4476a = "";

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f4477a;
        public long b;

        public /* synthetic */ b(k kVar, a aVar) {
        }
    }

    public static /* synthetic */ int a(Map.Entry entry, Map.Entry entry2) {
        return -Long.compare(((b) entry.getValue()).b, ((b) entry2.getValue()).b);
    }

    public void a(List<i> list, long j, String str) {
        HashMap hashMap = new HashMap();
        long j2 = 0;
        for (i iVar : list) {
            String str2 = iVar.f4462a + "." + iVar.f4463c;
            b bVar = (b) hashMap.get(str2);
            if (bVar == null) {
                bVar = new b(this, null);
                hashMap.put(str2, bVar);
            }
            long j3 = iVar.f4466f - iVar.f4465e;
            bVar.f4477a++;
            bVar.b += j3;
            j2 += j3;
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, e.f4458c);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            b bVar2 = (b) entry.getValue();
            if (!str3.contains("constructor_end")) {
                sb.append("│\t");
                sb.append(String.format("[%d ms] %s <%d>\n", Long.valueOf(bVar2.b / 1000000), str3, Integer.valueOf(bVar2.f4477a)));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("┌─────────────────────────\n│\t耗时统计\n├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄\n│\tcallFrom: ");
        sb2.append(str);
        sb2.append("\n├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄\n");
        StringBuilder a2 = e.a.a.a.a.a("│\t");
        a2.append(String.format("totalCost: %d ms\n", Long.valueOf(j / 1000000)));
        a2.append("│\t");
        a2.append(String.format("invokeCost: %d ms\n", Long.valueOf(j2 / 1000000)));
        a2.append("│\t");
        a2.append(String.format("otherCost: %d ms\n", Long.valueOf((j - j2) / 1000000)));
        sb2.append(a2.toString());
        sb2.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄\n");
        sb2.append((Object) sb);
        sb2.append("├┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄┄\n");
        StringBuilder sb3 = new StringBuilder();
        for (i iVar2 : list) {
            if (!iVar2.f4463c.equals("constructor_end")) {
                sb3.append("│\t");
                Object[] objArr = new Object[5];
                objArr[0] = iVar2.f4468h;
                objArr[1] = Long.valueOf(iVar2.b);
                objArr[2] = iVar2.f4462a;
                objArr[3] = iVar2.f4463c;
                Object[] objArr2 = iVar2.f4464d;
                objArr[4] = objArr2.length > 0 ? Arrays.toString(objArr2) : "";
                sb3.append(String.format("[%s] (%d) %s.%s(%s)\n", objArr));
            }
        }
        sb2.append(sb3.toString());
        sb2.append("└─────────────────────────\n\n");
        String sb4 = sb2.toString();
        l.f.c("HummerDebug", " \n" + sb4);
        this.f4476a = e.a.a.a.a.a(new StringBuilder(), this.f4476a, sb4);
    }
}
