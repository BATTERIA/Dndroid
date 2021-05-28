package a.a.a.a.v0.d.b;

import a.a.a.a.v0.d.b.h;
import a.a.a.a.v0.j.v.b;
import a.a.a.a.v0.j.v.c;
import a.a.a.a.v0.m.l1.a;
import a.a0.i;
import a.s;

public final class j implements i<h> {

    /* renamed from: a  reason: collision with root package name */
    public static final j f915a = new j();

    @Override // a.a.a.a.v0.d.b.i
    public h a(String str) {
        c cVar;
        if (str != null) {
            boolean z = false;
            boolean z2 = str.length() > 0;
            if (!s.f2103a || z2) {
                char charAt = str.charAt(0);
                c[] values = c.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = values[i];
                    if (cVar.a().charAt(0) == charAt) {
                        break;
                    }
                    i++;
                }
                if (cVar != null) {
                    return new h.c(cVar);
                }
                if (charAt == 'V') {
                    return new h.c(null);
                }
                if (charAt != '[') {
                    if (charAt == 'L') {
                        if (str.length() > 0 && a.a(str.charAt(i.a(str)), ';', false)) {
                            z = true;
                        }
                    }
                    if (!s.f2103a || z) {
                        String substring = str.substring(1, str.length() - 1);
                        a.w.c.i.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        return new h.b(substring);
                    }
                    throw new AssertionError(e.a.a.a.a.a("Type that is not primitive nor array should be Object, but '", str, "' was found"));
                }
                String substring2 = str.substring(1);
                a.w.c.i.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                return new h.a(a(substring2));
            }
            throw new AssertionError("empty string as JvmType");
        }
        a.w.c.i.a("representation");
        throw null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.a.a.a.v0.d.b.i
    public h b(h hVar) {
        c cVar;
        h hVar2 = hVar;
        if (hVar2 == null) {
            a.w.c.i.a("possiblyPrimitiveType");
            throw null;
        } else if (!(hVar2 instanceof h.c) || (cVar = ((h.c) hVar2).f914a) == null) {
            return hVar2;
        } else {
            b a2 = b.a(cVar.f());
            a.w.c.i.a((Object) a2, "JvmClassName.byFqNameWit…mitiveType.wrapperFqName)");
            String a3 = a2.a();
            a.w.c.i.a((Object) a3, "JvmClassName.byFqNameWit…apperFqName).internalName");
            return b(a3);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.a.a.a.v0.d.b.i
    public h a() {
        return b("java/lang/Class");
    }

    public String a(h hVar) {
        String str;
        StringBuilder sb;
        String a2;
        if (hVar != null) {
            if (hVar instanceof h.a) {
                sb = e.a.a.a.a.a("[");
                str = a(((h.a) hVar).f912a);
            } else if (hVar instanceof h.c) {
                c cVar = ((h.c) hVar).f914a;
                if (cVar == null || (a2 = cVar.a()) == null) {
                    return "V";
                }
                return a2;
            } else if (hVar instanceof h.b) {
                sb = e.a.a.a.a.a("L");
                sb.append(((h.b) hVar).f913a);
                str = ";";
            } else {
                throw new a.h();
            }
            sb.append(str);
            return sb.toString();
        }
        a.w.c.i.a("type");
        throw null;
    }

    /* Return type fixed from 'a.a.a.a.v0.d.b.h$b' to match base method */
    @Override // a.a.a.a.v0.d.b.i
    public h b(String str) {
        if (str != null) {
            return new h.b(str);
        }
        a.w.c.i.a("internalName");
        throw null;
    }
}
