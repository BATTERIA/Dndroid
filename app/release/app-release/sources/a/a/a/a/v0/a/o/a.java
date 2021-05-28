package a.a.a.a.v0.a.o;

import a.a.a.a.v0.a.k;
import a.a.a.a.v0.a.o.b;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.l.j;
import a.t.n;
import a.w.c.f;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a implements a.a.a.a.v0.b.c1.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0012a f233c = new C0012a(null);

    /* renamed from: a  reason: collision with root package name */
    public final j f234a;
    public final w b;

    /* renamed from: a.a.a.a.v0.a.o.a$a  reason: collision with other inner class name */
    public static final class C0012a {
        public /* synthetic */ C0012a(f fVar) {
        }

        public final b a(String str, a.a.a.a.v0.f.b bVar) {
            boolean z;
            b.c cVar;
            Integer num;
            if (b.c.j == null) {
                throw null;
            } else if (bVar == null) {
                i.a("packageFqName");
                throw null;
            } else if (str != null) {
                b.c[] values = b.c.values();
                int length = values.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i2 >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = values[i2];
                    if (i.a(cVar.f245c, bVar) && a.a.a.a.v0.m.l1.a.a(str, cVar.f246d, false, 2)) {
                        break;
                    }
                    i2++;
                }
                if (cVar != null) {
                    String substring = str.substring(cVar.f246d.length());
                    i.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    if (substring.length() != 0) {
                        z = false;
                    }
                    if (!z) {
                        int length2 = substring.length();
                        int i3 = 0;
                        while (true) {
                            if (i < length2) {
                                int charAt = substring.charAt(i) - '0';
                                if (charAt < 0 || 9 < charAt) {
                                    break;
                                }
                                i3 = (i3 * 10) + charAt;
                                i++;
                            } else {
                                num = Integer.valueOf(i3);
                                break;
                            }
                        }
                    }
                    num = null;
                    if (num != null) {
                        return new b(cVar, num.intValue());
                    }
                }
                return null;
            } else {
                i.a("className");
                throw null;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final b.c f235a;
        public final int b;

        public b(b.c cVar, int i) {
            if (cVar != null) {
                this.f235a = cVar;
                this.b = i;
                return;
            }
            i.a("kind");
            throw null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.f235a, bVar.f235a) && this.b == bVar.b;
        }

        public int hashCode() {
            b.c cVar = this.f235a;
            return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("KindWithArity(kind=");
            a2.append(this.f235a);
            a2.append(", arity=");
            a2.append(this.b);
            a2.append(")");
            return a2.toString();
        }
    }

    public a(j jVar, w wVar) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (wVar != null) {
            this.f234a = jVar;
            this.b = wVar;
        } else {
            i.a("module");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.c1.b
    public e a(a.a.a.a.v0.f.a aVar) {
        if (aVar != null) {
            if (!aVar.f1342c && !aVar.g()) {
                String a2 = aVar.e().a();
                i.a((Object) a2, "classId.relativeClassName.asString()");
                if (!a.a0.i.a((CharSequence) a2, (CharSequence) "Function", false, 2)) {
                    return null;
                }
                a.a.a.a.v0.f.b d2 = aVar.d();
                i.a((Object) d2, "classId.packageFqName");
                b a3 = f233c.a(a2, d2);
                if (a3 != null) {
                    b.c cVar = a3.f235a;
                    int i = a3.b;
                    List<y> y0 = this.b.a(d2).y0();
                    ArrayList arrayList = new ArrayList();
                    for (T t : y0) {
                        if (t instanceof a.a.a.a.v0.a.b) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof a.a.a.a.v0.a.e) {
                            arrayList2.add(next);
                        }
                    }
                    y yVar = (a.a.a.a.v0.a.e) a.t.f.b((List) arrayList2);
                    if (yVar == null) {
                        yVar = (a.a.a.a.v0.a.b) a.t.f.a((List) arrayList);
                    }
                    return new b(this.f234a, yVar, cVar, i);
                }
            }
            return null;
        }
        i.a("classId");
        throw null;
    }

    @Override // a.a.a.a.v0.b.c1.b
    public Collection<e> a(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            return n.f2121c;
        }
        i.a("packageFqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.c1.b
    public boolean a(a.a.a.a.v0.f.b bVar, d dVar) {
        if (bVar == null) {
            i.a("packageFqName");
            throw null;
        } else if (dVar != null) {
            String a2 = dVar.a();
            i.a((Object) a2, "name.asString()");
            return (a.a.a.a.v0.m.l1.a.a(a2, "Function", false, 2) || a.a.a.a.v0.m.l1.a.a(a2, k.f222d, false, 2) || a.a.a.a.v0.m.l1.a.a(a2, "SuspendFunction", false, 2) || a.a.a.a.v0.m.l1.a.a(a2, k.f223e, false, 2)) && f233c.a(a2, bVar) != null;
        } else {
            i.a("name");
            throw null;
        }
    }
}
