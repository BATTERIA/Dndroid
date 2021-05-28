package e.h.a;

import e.f.a.g;
import e.h.a.f0.p;
import e.h.a.h0.b;
import e.h.a.h0.c;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class a extends c0<Date> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<? extends Date> f4680a;
    public final List<DateFormat> b = new ArrayList();

    public a(Class<? extends Date> cls, int i, int i2) {
        a(cls);
        this.f4680a = cls;
        this.b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (p.f4719a >= 9) {
            this.b.add(g.a(i, i2));
        }
    }

    public static Class<? extends Date> a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.h.a.c0
    public Date a(e.h.a.h0.a aVar) {
        Object date;
        if (aVar.A() == b.NULL) {
            aVar.x();
            return null;
        }
        Date a2 = a(aVar.y());
        Class<? extends Date> cls = this.f4680a;
        if (cls == Date.class) {
            return a2;
        }
        if (cls == Timestamp.class) {
            date = new Timestamp(a2.getTime());
        } else if (cls == java.sql.Date.class) {
            date = new java.sql.Date(a2.getTime());
        } else {
            throw new AssertionError();
        }
        return date;
    }

    public final Date a(String str) {
        synchronized (this.b) {
            for (DateFormat dateFormat : this.b) {
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
    }

    public void a(c cVar, Date date) {
        if (date == null) {
            cVar.p();
            return;
        }
        synchronized (this.b) {
            cVar.d(this.b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb;
        String str;
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = e.a.a.a.a.a("DefaultDateTypeAdapter(");
            str = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = e.a.a.a.a.a("DefaultDateTypeAdapter(");
            str = dateFormat.getClass().getSimpleName();
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }
}
