package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.h0.b;
import e.h.a.h0.c;
import e.h.a.z;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class k extends c0<Date> {
    public static final d0 b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final DateFormat f4768a = new SimpleDateFormat("MMM d, yyyy");

    public class a implements d0 {
        @Override // e.h.a.d0
        public <T> c0<T> a(e.h.a.k kVar, e.h.a.g0.a<T> aVar) {
            if (aVar.f4806a == Date.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // e.h.a.c0
    public synchronized Date a(e.h.a.h0.a aVar) {
        if (aVar.A() == b.NULL) {
            aVar.x();
            return null;
        }
        try {
            return new Date(this.f4768a.parse(aVar.y()).getTime());
        } catch (ParseException e2) {
            throw new z(e2);
        }
    }

    public synchronized void a(c cVar, Date date) {
        cVar.d(date == null ? null : this.f4768a.format(date));
    }
}
