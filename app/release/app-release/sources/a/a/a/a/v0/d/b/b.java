package a.a.a.a.v0.d.b;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.d.b.l;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.s.g;
import a.w.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class b implements l.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f883a;
    public final /* synthetic */ HashMap b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HashMap f884c;

    public final class a extends C0033b implements l.e {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b f885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, o oVar) {
            super(bVar, oVar);
            if (oVar != null) {
                this.f885d = bVar;
                return;
            }
            i.a("signature");
            throw null;
        }

        @Override // a.a.a.a.v0.d.b.l.e
        public l.a a(int i, a.a.a.a.v0.f.a aVar, m0 m0Var) {
            if (aVar == null) {
                i.a("classId");
                throw null;
            } else if (m0Var != null) {
                o a2 = o.a(this.b, i);
                List list = (List) this.f885d.b.get(a2);
                if (list == null) {
                    list = new ArrayList();
                    this.f885d.b.put(a2, list);
                }
                return a.a(this.f885d.f883a, aVar, m0Var, list);
            } else {
                i.a("source");
                throw null;
            }
        }
    }

    /* renamed from: a.a.a.a.v0.d.b.b$b  reason: collision with other inner class name */
    public class C0033b implements l.c {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<A> f886a;
        public final o b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b f887c;

        public C0033b(b bVar, o oVar) {
            if (oVar != null) {
                this.f887c = bVar;
                this.b = oVar;
                this.f886a = new ArrayList<>();
                return;
            }
            i.a("signature");
            throw null;
        }

        @Override // a.a.a.a.v0.d.b.l.c
        public l.a a(a.a.a.a.v0.f.a aVar, m0 m0Var) {
            if (aVar == null) {
                i.a("classId");
                throw null;
            } else if (m0Var != null) {
                return a.a(this.f887c.f883a, aVar, m0Var, this.f886a);
            } else {
                i.a("source");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.c
        public void a() {
            if (!this.f886a.isEmpty()) {
                this.f887c.b.put(this.b, this.f886a);
            }
        }
    }

    public b(a aVar, HashMap hashMap, HashMap hashMap2) {
        this.f883a = aVar;
        this.b = hashMap;
        this.f884c = hashMap2;
    }

    @Override // a.a.a.a.v0.d.b.l.d
    public l.c a(d dVar, String str, Object obj) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (str != null) {
            String a2 = dVar.a();
            i.a((Object) a2, "name.asString()");
            o a3 = o.a(a2, str);
            if (obj != null) {
                if (((c) this.f883a) != null) {
                    boolean z = false;
                    if (a.a0.i.a((CharSequence) "ZBCS", (CharSequence) str, false, 2)) {
                        int intValue = ((Integer) obj).intValue();
                        int hashCode = str.hashCode();
                        if (hashCode != 66) {
                            if (hashCode != 67) {
                                if (hashCode != 83) {
                                    if (hashCode == 90 && str.equals("Z")) {
                                        if (intValue != 0) {
                                            z = true;
                                        }
                                        obj = Boolean.valueOf(z);
                                    }
                                } else if (str.equals("S")) {
                                    obj = Short.valueOf((short) intValue);
                                }
                            } else if (str.equals("C")) {
                                obj = Character.valueOf((char) intValue);
                            }
                        } else if (str.equals("B")) {
                            obj = Byte.valueOf((byte) intValue);
                        }
                        throw new AssertionError(str);
                    }
                    g<?> a4 = a.a.a.a.v0.j.s.i.a(obj);
                    if (a4 != null) {
                        this.f884c.put(a3, a4);
                    }
                } else {
                    throw null;
                }
            }
            return new C0033b(this, a3);
        } else {
            i.a("desc");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.b.l.d
    public l.e a(d dVar, String str) {
        if (dVar == null) {
            i.a("name");
            throw null;
        } else if (str != null) {
            String a2 = dVar.a();
            i.a((Object) a2, "name.asString()");
            return new a(this, o.b(a2, str));
        } else {
            i.a("desc");
            throw null;
        }
    }
}
