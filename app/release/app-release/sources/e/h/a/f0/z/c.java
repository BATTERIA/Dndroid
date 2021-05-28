package e.h.a.f0.z;

import e.f.a.g;
import e.h.a.c0;
import e.h.a.d0;
import e.h.a.f0.p;
import e.h.a.h0.b;
import e.h.a.k;
import e.h.a.z;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class c extends c0<Date> {
    public static final d0 b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<DateFormat> f4747a;

    public class a implements d0 {
        @Override // e.h.a.d0
        public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
            if (aVar.f4806a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f4747a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f4747a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (p.f4719a >= 9) {
            this.f4747a.add(g.a(2, 2));
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.h.a.c0
    public Date a(e.h.a.h0.a aVar) {
        if (aVar.A() != b.NULL) {
            return a(aVar.y());
        }
        aVar.x();
        return null;
    }

    public final synchronized Date a(String str) {
        for (DateFormat dateFormat : this.f4747a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return e.h.a.f0.z.s.a.a(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new z(str, e2);
        }
    }

    public synchronized void a(e.h.a.h0.c cVar, Date date) {
        if (date == null) {
            cVar.p();
        } else {
            cVar.d(this.f4747a.get(0).format(date));
        }
    }
}
