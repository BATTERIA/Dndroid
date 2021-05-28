package a.a.a.a;

import a.a.a.a.e;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.d.a.r;
import a.a.a.a.v0.e.x0.e;
import a.a.a.a.v0.e.y0.a;
import a.a.a.a.v0.e.y0.g.e;
import a.a.a.a.v0.e.y0.g.h;
import a.a.a.a.v0.e.z;
import a.a.a.a.v0.h.i;
import a.g;
import a.n;
import a.w.c.i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@g(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, mv = {1, 1, 16})
public abstract class f {

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Field f68a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super(null);
            if (field != null) {
                this.f68a = field;
                return;
            }
            i.a("field");
            throw null;
        }

        @Override // a.a.a.a.f
        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append(r.a(this.f68a.getName()));
            sb.append("()");
            Class<?> type = this.f68a.getType();
            i.a((Object) type, "field.type");
            sb.append(a.a.a.a.v0.b.e1.b.b.c(type));
            return sb.toString();
        }
    }

    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Method f69a;
        public final Method b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super(null);
            if (method != null) {
                this.f69a = method;
                this.b = method2;
                return;
            }
            i.a("getterMethod");
            throw null;
        }

        @Override // a.a.a.a.f
        public String a() {
            return e.f.a.g.a(this.f69a);
        }
    }

    public static final class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f70a;
        public final f0 b;

        /* renamed from: c  reason: collision with root package name */
        public final z f71c;

        /* renamed from: d  reason: collision with root package name */
        public final a.d f72d;

        /* renamed from: e  reason: collision with root package name */
        public final a.a.a.a.v0.e.x0.c f73e;

        /* renamed from: f  reason: collision with root package name */
        public final e f74f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(f0 f0Var, z zVar, a.d dVar, a.a.a.a.v0.e.x0.c cVar, e eVar) {
            super(null);
            String str;
            String str2;
            StringBuilder sb;
            String str3;
            if (f0Var == null) {
                i.a("descriptor");
                throw null;
            } else if (zVar == null) {
                i.a("proto");
                throw null;
            } else if (dVar == null) {
                i.a("signature");
                throw null;
            } else if (cVar == null) {
                i.a("nameResolver");
                throw null;
            } else if (eVar != null) {
                this.b = f0Var;
                this.f71c = zVar;
                this.f72d = dVar;
                this.f73e = cVar;
                this.f74f = eVar;
                if (dVar.h()) {
                    StringBuilder sb2 = new StringBuilder();
                    a.a.a.a.v0.e.x0.c cVar2 = this.f73e;
                    a.c cVar3 = this.f72d.f1288g;
                    i.a((Object) cVar3, "signature.getter");
                    sb2.append(cVar2.a(cVar3.f1277e));
                    a.a.a.a.v0.e.x0.c cVar4 = this.f73e;
                    a.c cVar5 = this.f72d.f1288g;
                    i.a((Object) cVar5, "signature.getter");
                    sb2.append(cVar4.a(cVar5.f1278f));
                    str = sb2.toString();
                } else {
                    e.a a2 = h.b.a(this.f71c, this.f73e, this.f74f, true);
                    if (a2 != null) {
                        String str4 = a2.f1324a;
                        String str5 = a2.b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(r.a(str4));
                        k b2 = this.b.b();
                        i.a((Object) b2, "descriptor.containingDeclaration");
                        if (!i.a(this.b.g(), z0.f514d) || !(b2 instanceof a.a.a.a.v0.k.b.f0.e)) {
                            if (i.a(this.b.g(), z0.f512a) && (b2 instanceof y)) {
                                f0 f0Var2 = this.b;
                                if (f0Var2 != null) {
                                    a.a.a.a.v0.k.b.f0.g gVar = ((a.a.a.a.v0.k.b.f0.k) f0Var2).G;
                                    if (gVar instanceof a.a.a.a.v0.d.b.g) {
                                        a.a.a.a.v0.d.b.g gVar2 = (a.a.a.a.v0.d.b.g) gVar;
                                        if (gVar2.f910c != null) {
                                            sb = e.a.a.a.a.a("$");
                                            str3 = gVar2.e().a();
                                        }
                                    }
                                } else {
                                    throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                                }
                            }
                            str2 = "";
                            sb3.append(str2);
                            sb3.append("()");
                            sb3.append(str5);
                            str = sb3.toString();
                        } else {
                            a.a.a.a.v0.e.f fVar = ((a.a.a.a.v0.k.b.f0.e) b2).w;
                            i.g<a.a.a.a.v0.e.f, Integer> gVar3 = a.a.a.a.v0.e.y0.a.i;
                            a.w.c.i.a((Object) gVar3, "JvmProtoBuf.classModuleName");
                            Integer num = (Integer) e.f.a.g.a(fVar, gVar3);
                            String str6 = (num == null || (str6 = this.f73e.a(num.intValue())) == null) ? "main" : str6;
                            sb = e.a.a.a.a.a("$");
                            str3 = a.a.a.a.v0.f.e.a(str6);
                        }
                        sb.append(str3);
                        str2 = sb.toString();
                        sb3.append(str2);
                        sb3.append("()");
                        sb3.append(str5);
                        str = sb3.toString();
                    } else {
                        StringBuilder a3 = e.a.a.a.a.a("No field signature for property: ");
                        a3.append(this.b);
                        throw new i0(a3.toString());
                    }
                }
                this.f70a = str;
            } else {
                a.w.c.i.a("typeTable");
                throw null;
            }
        }

        @Override // a.a.a.a.f
        public String a() {
            return this.f70a;
        }
    }

    public static final class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final e.C0005e f75a;
        public final e.C0005e b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e.C0005e eVar, e.C0005e eVar2) {
            super(null);
            if (eVar != null) {
                this.f75a = eVar;
                this.b = eVar2;
                return;
            }
            a.w.c.i.a("getterSignature");
            throw null;
        }

        @Override // a.a.a.a.f
        public String a() {
            return this.f75a.f66a;
        }
    }

    public /* synthetic */ f(a.w.c.f fVar) {
    }

    public abstract String a();
}
