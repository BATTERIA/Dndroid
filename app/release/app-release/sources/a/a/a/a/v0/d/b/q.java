package a.a.a.a.v0.d.b;

import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class q extends j implements l<String, String> {

    /* renamed from: c  reason: collision with root package name */
    public static final q f920c = new q();

    public q() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public String a(String str) {
        String str2 = str;
        if (str2 == null) {
            i.a("it");
            throw null;
        } else if (str2.length() <= 1) {
            return str2;
        } else {
            return 'L' + str2 + ';';
        }
    }
}
