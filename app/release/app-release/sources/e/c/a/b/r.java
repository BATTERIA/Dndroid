package e.c.a.b;

import e.a.a.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3827a = System.getProperty("line.separator");

    public static String a(Throwable th) {
        List<String> list;
        String str;
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i = size - 1;
        List<String> b = b((Throwable) arrayList.get(i));
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (size != 0) {
                list = b((Throwable) arrayList.get(size - 1));
                int size2 = b.size() - 1;
                ArrayList arrayList3 = (ArrayList) list;
                int size3 = arrayList3.size();
                while (true) {
                    size3--;
                    if (size2 < 0 || size3 < 0) {
                        break;
                    }
                    if (b.get(size2).equals((String) arrayList3.get(size3))) {
                        b.remove(size2);
                    }
                    size2--;
                }
            } else {
                list = b;
            }
            if (size == i) {
                str = ((Throwable) arrayList.get(size)).toString();
            } else {
                StringBuilder a2 = a.a(" Caused by: ");
                a2.append(((Throwable) arrayList.get(size)).toString());
                str = a2.toString();
            }
            arrayList2.add(str);
            arrayList2.addAll(b);
            b = list;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(f3827a);
        }
        return sb.toString();
    }

    public static List<String> b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f3827a);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().isEmpty()) {
                arrayList.add(nextToken);
                z = true;
            } else if (z) {
                break;
            }
        }
        return arrayList;
    }
}
