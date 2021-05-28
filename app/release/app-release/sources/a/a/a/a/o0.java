package a.a.a.a;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.i.c;
import a.a.a.a.v0.m.d0;
import a.g;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.List;

@g(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u0019*\u00060\u001aj\u0002`\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u0019*\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", "parameter", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "renderTypeParameter", "typeParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflection"}, mv = {1, 1, 16})
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f111a = c.f1476a;
    public static final o0 b = null;

    public static final class a extends j implements l<w0, String> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f112c = new a();

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public String a(w0 w0Var) {
            w0 w0Var2 = w0Var;
            o0 o0Var = o0.b;
            i.a((Object) w0Var2, "it");
            d0 c2 = w0Var2.c();
            i.a((Object) c2, "it.type");
            return o0.a(c2);
        }
    }

    public static final String a(s sVar) {
        if (sVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("fun ");
            a(sb, sVar);
            c cVar = f111a;
            d d2 = sVar.d();
            i.a((Object) d2, "descriptor.name");
            sb.append(cVar.a(d2, true));
            List<w0> j = sVar.j();
            i.a((Object) j, "descriptor.valueParameters");
            f.a(j, sb, ", ", "(", ")", 0, null, a.f112c, 48);
            sb.append(": ");
            d0 h2 = sVar.h();
            if (h2 != null) {
                i.a((Object) h2, "descriptor.returnType!!");
                sb.append(a(h2));
                String sb2 = sb.toString();
                i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            i.a();
            throw null;
        }
        i.a("descriptor");
        throw null;
    }

    public static final void a(StringBuilder sb, a.a.a.a.v0.b.a aVar) {
        i0 a2 = s0.a(aVar);
        i0 g0 = aVar.g0();
        a(sb, a2);
        boolean z = (a2 == null || g0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        a(sb, g0);
        if (z) {
            sb.append(")");
        }
    }

    public static final void a(StringBuilder sb, i0 i0Var) {
        if (i0Var != null) {
            d0 c2 = i0Var.c();
            i.a((Object) c2, "receiver.type");
            sb.append(a(c2));
            sb.append(".");
        }
    }

    public static final String a(f0 f0Var) {
        if (f0Var != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(f0Var.V() ? "var " : "val ");
            a(sb, f0Var);
            c cVar = f111a;
            d d2 = f0Var.d();
            i.a((Object) d2, "descriptor.name");
            sb.append(cVar.a(d2, true));
            sb.append(": ");
            d0 c2 = f0Var.c();
            i.a((Object) c2, "descriptor.type");
            sb.append(a(c2));
            String sb2 = sb.toString();
            i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        i.a("descriptor");
        throw null;
    }

    public static final String a(d0 d0Var) {
        if (d0Var != null) {
            return f111a.a(d0Var);
        }
        i.a("type");
        throw null;
    }
}
