package e.h.a;

import e.h.a.f0.r;
import java.math.BigInteger;

public final class w extends q {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4846a;

    public w(Boolean bool) {
        if (bool != null) {
            this.f4846a = bool;
            return;
        }
        throw null;
    }

    public static boolean a(w wVar) {
        Object obj = wVar.f4846a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean c() {
        Object obj = this.f4846a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(e());
    }

    public Number d() {
        Object obj = this.f4846a;
        return obj instanceof String ? new r((String) this.f4846a) : (Number) obj;
    }

    public String e() {
        Object obj = this.f4846a;
        if (obj instanceof Number) {
            return d().toString();
        }
        return obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f4846a == null) {
            return wVar.f4846a == null;
        }
        if (a(this) && a(wVar)) {
            return d().longValue() == wVar.d().longValue();
        }
        if (!(this.f4846a instanceof Number) || !(wVar.f4846a instanceof Number)) {
            return this.f4846a.equals(wVar.f4846a);
        }
        double doubleValue = d().doubleValue();
        double doubleValue2 = wVar.d().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f4846a == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = d().longValue();
        } else {
            Object obj = this.f4846a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(d().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public w(Number number) {
        if (number != null) {
            this.f4846a = number;
            return;
        }
        throw null;
    }

    public w(String str) {
        if (str != null) {
            this.f4846a = str;
            return;
        }
        throw null;
    }
}
