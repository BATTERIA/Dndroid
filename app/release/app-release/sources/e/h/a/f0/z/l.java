package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.h0.b;
import e.h.a.h0.c;
import e.h.a.k;
import e.h.a.z;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class l extends c0<Time> {
    public static final d0 b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f4769a = new SimpleDateFormat("hh:mm:ss a");

    public class a implements d0 {
        @Override // e.h.a.d0
        public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
            if (aVar.f4806a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    @Override // e.h.a.c0
    public synchronized Time a(e.h.a.h0.a aVar) {
        if (aVar.A() == b.NULL) {
            aVar.x();
            return null;
        }
        try {
            return new Time(this.f4769a.parse(aVar.y()).getTime());
        } catch (ParseException e2) {
            throw new z(e2);
        }
    }

    public synchronized void a(c cVar, Time time) {
        cVar.d(time == null ? null : this.f4769a.format(time));
    }
}
