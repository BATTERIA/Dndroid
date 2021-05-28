package a.v;

import a.g;
import a.w.c.i;
import java.lang.reflect.Method;

@g(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "ReflectAddSuppressedMethod", "kotlin-stdlib"}, mv = {1, 1, 16})
public class a {

    /* renamed from: a.v.a$a  reason: collision with other inner class name */
    public static final class C0080a {

        /* renamed from: a  reason: collision with root package name */
        public static final Method f2127a;

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (a.w.c.i.a(r5, java.lang.Throwable.class) != false) goto L_0x003b;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                a.w.c.i.a(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x000e:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = "it"
                a.w.c.i.a(r6, r7)
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = a.w.c.i.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L_0x003a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                a.w.c.i.a(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x0033
                r5 = r7[r3]
            L_0x0033:
                boolean r5 = a.w.c.i.a(r5, r0)
                if (r5 == 0) goto L_0x003a
                goto L_0x003b
            L_0x003a:
                r8 = 0
            L_0x003b:
                if (r8 == 0) goto L_0x003f
                r5 = r6
                goto L_0x0042
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x000e
            L_0x0042:
                a.v.a.C0080a.f2127a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.v.a.C0080a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        if (th == null) {
            i.a("cause");
            throw null;
        } else if (th2 != null) {
            Method method = C0080a.f2127a;
            if (method != null) {
                method.invoke(th, th2);
            }
        } else {
            i.a("exception");
            throw null;
        }
    }
}
