package e.h.a.f0.z;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class o {
    public static final e.h.a.c0<String> A = new g();
    public static final e.h.a.c0<BigDecimal> B = new h();
    public static final e.h.a.c0<BigInteger> C = new i();
    public static final e.h.a.d0 D = new y(String.class, A);
    public static final e.h.a.c0<StringBuilder> E;
    public static final e.h.a.d0 F;
    public static final e.h.a.c0<StringBuffer> G;
    public static final e.h.a.d0 H;
    public static final e.h.a.c0<URL> I;
    public static final e.h.a.d0 J;
    public static final e.h.a.c0<URI> K;
    public static final e.h.a.d0 L;
    public static final e.h.a.c0<InetAddress> M;
    public static final e.h.a.d0 N;
    public static final e.h.a.c0<UUID> O;
    public static final e.h.a.d0 P;
    public static final e.h.a.c0<Currency> Q;
    public static final e.h.a.d0 R;
    public static final e.h.a.d0 S = new r();
    public static final e.h.a.c0<Calendar> T;
    public static final e.h.a.d0 U;
    public static final e.h.a.c0<Locale> V;
    public static final e.h.a.d0 W;
    public static final e.h.a.c0<e.h.a.q> X;
    public static final e.h.a.d0 Y;
    public static final e.h.a.d0 Z = new w();

    /* renamed from: a  reason: collision with root package name */
    public static final e.h.a.c0<Class> f4783a;
    public static final e.h.a.d0 b;

    /* renamed from: c  reason: collision with root package name */
    public static final e.h.a.c0<BitSet> f4784c;

    /* renamed from: d  reason: collision with root package name */
    public static final e.h.a.d0 f4785d;

    /* renamed from: e  reason: collision with root package name */
    public static final e.h.a.c0<Boolean> f4786e = new z();

    /* renamed from: f  reason: collision with root package name */
    public static final e.h.a.c0<Boolean> f4787f = new a0();

    /* renamed from: g  reason: collision with root package name */
    public static final e.h.a.d0 f4788g = new p(Boolean.TYPE, Boolean.class, f4786e);

    /* renamed from: h  reason: collision with root package name */
    public static final e.h.a.c0<Number> f4789h = new b0();
    public static final e.h.a.d0 i = new p(Byte.TYPE, Byte.class, f4789h);
    public static final e.h.a.c0<Number> j = new c0();
    public static final e.h.a.d0 k = new p(Short.TYPE, Short.class, j);
    public static final e.h.a.c0<Number> l = new d0();
    public static final e.h.a.d0 m = new p(Integer.TYPE, Integer.class, l);
    public static final e.h.a.c0<AtomicInteger> n;
    public static final e.h.a.d0 o;
    public static final e.h.a.c0<AtomicBoolean> p;
    public static final e.h.a.d0 q;
    public static final e.h.a.c0<AtomicIntegerArray> r;
    public static final e.h.a.d0 s;
    public static final e.h.a.c0<Number> t = new b();
    public static final e.h.a.c0<Number> u = new c();
    public static final e.h.a.c0<Number> v = new d();
    public static final e.h.a.c0<Number> w;
    public static final e.h.a.d0 x;
    public static final e.h.a.c0<Character> y = new f();
    public static final e.h.a.d0 z = new p(Character.TYPE, Character.class, y);

    public class a extends e.h.a.c0<AtomicIntegerArray> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public AtomicIntegerArray a(e.h.a.h0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.q()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.u()));
                } catch (NumberFormatException e2) {
                    throw new e.h.a.z(e2);
                }
            }
            aVar.n();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i = 0; i < size; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            cVar.k();
            int length = atomicIntegerArray2.length();
            for (int i = 0; i < length; i++) {
                cVar.f((long) atomicIntegerArray2.get(i));
            }
            cVar.m();
        }
    }

    public class a0 extends e.h.a.c0<Boolean> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Boolean a(e.h.a.h0.a aVar) {
            if (aVar.A() != e.h.a.h0.b.NULL) {
                return Boolean.valueOf(aVar.y());
            }
            aVar.x();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Boolean bool) {
            Boolean bool2 = bool;
            cVar.d(bool2 == null ? "null" : bool2.toString());
        }
    }

    public class b extends e.h.a.c0<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Number a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            try {
                return Long.valueOf(aVar.v());
            } catch (NumberFormatException e2) {
                throw new e.h.a.z(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Number number) {
            cVar.a(number);
        }
    }

    public class b0 extends e.h.a.c0<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Number a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.u());
            } catch (NumberFormatException e2) {
                throw new e.h.a.z(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Number number) {
            cVar.a(number);
        }
    }

    public class c extends e.h.a.c0<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Number a(e.h.a.h0.a aVar) {
            if (aVar.A() != e.h.a.h0.b.NULL) {
                return Float.valueOf((float) aVar.t());
            }
            aVar.x();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Number number) {
            cVar.a(number);
        }
    }

    public class c0 extends e.h.a.c0<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Number a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.u());
            } catch (NumberFormatException e2) {
                throw new e.h.a.z(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Number number) {
            cVar.a(number);
        }
    }

    public class d extends e.h.a.c0<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Number a(e.h.a.h0.a aVar) {
            if (aVar.A() != e.h.a.h0.b.NULL) {
                return Double.valueOf(aVar.t());
            }
            aVar.x();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Number number) {
            cVar.a(number);
        }
    }

    public class d0 extends e.h.a.c0<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Number a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            try {
                return Integer.valueOf(aVar.u());
            } catch (NumberFormatException e2) {
                throw new e.h.a.z(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Number number) {
            cVar.a(number);
        }
    }

    public class e extends e.h.a.c0<Number> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Number a(e.h.a.h0.a aVar) {
            e.h.a.h0.b A = aVar.A();
            int ordinal = A.ordinal();
            if (ordinal == 5 || ordinal == 6) {
                return new e.h.a.f0.r(aVar.y());
            }
            if (ordinal == 8) {
                aVar.x();
                return null;
            }
            throw new e.h.a.z("Expecting number, got: " + A);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Number number) {
            cVar.a(number);
        }
    }

    public class e0 extends e.h.a.c0<AtomicInteger> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public AtomicInteger a(e.h.a.h0.a aVar) {
            try {
                return new AtomicInteger(aVar.u());
            } catch (NumberFormatException e2) {
                throw new e.h.a.z(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, AtomicInteger atomicInteger) {
            cVar.f((long) atomicInteger.get());
        }
    }

    public class f extends e.h.a.c0<Character> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Character a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            String y = aVar.y();
            if (y.length() == 1) {
                return Character.valueOf(y.charAt(0));
            }
            throw new e.h.a.z(e.a.a.a.a.b("Expecting character, got: ", y));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Character ch) {
            Character ch2 = ch;
            cVar.d(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    public class f0 extends e.h.a.c0<AtomicBoolean> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public AtomicBoolean a(e.h.a.h0.a aVar) {
            return new AtomicBoolean(aVar.s());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, AtomicBoolean atomicBoolean) {
            cVar.a(atomicBoolean.get());
        }
    }

    public class g extends e.h.a.c0<String> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public String a(e.h.a.h0.a aVar) {
            e.h.a.h0.b A = aVar.A();
            if (A != e.h.a.h0.b.NULL) {
                return A == e.h.a.h0.b.BOOLEAN ? Boolean.toString(aVar.s()) : aVar.y();
            }
            aVar.x();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, String str) {
            cVar.d(str);
        }
    }

    public static final class g0<T extends Enum<T>> extends e.h.a.c0<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, T> f4790a = new HashMap();
        public final Map<T, String> b = new HashMap();

        public g0(Class<T> cls) {
            try {
                T[] enumConstants = cls.getEnumConstants();
                for (T t : enumConstants) {
                    String name = t.name();
                    e.h.a.e0.b bVar = (e.h.a.e0.b) cls.getField(name).getAnnotation(e.h.a.e0.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f4790a.put(str, t);
                        }
                    }
                    this.f4790a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // e.h.a.c0
        public Object a(e.h.a.h0.a aVar) {
            if (aVar.A() != e.h.a.h0.b.NULL) {
                return this.f4790a.get(aVar.y());
            }
            aVar.x();
            return null;
        }

        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Object obj) {
            Enum r3 = (Enum) obj;
            cVar.d(r3 == null ? null : this.b.get(r3));
        }
    }

    public class h extends e.h.a.c0<BigDecimal> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public BigDecimal a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            try {
                return new BigDecimal(aVar.y());
            } catch (NumberFormatException e2) {
                throw new e.h.a.z(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, BigDecimal bigDecimal) {
            cVar.a(bigDecimal);
        }
    }

    public class i extends e.h.a.c0<BigInteger> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public BigInteger a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            try {
                return new BigInteger(aVar.y());
            } catch (NumberFormatException e2) {
                throw new e.h.a.z(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, BigInteger bigInteger) {
            cVar.a(bigInteger);
        }
    }

    public class j extends e.h.a.c0<StringBuilder> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public StringBuilder a(e.h.a.h0.a aVar) {
            if (aVar.A() != e.h.a.h0.b.NULL) {
                return new StringBuilder(aVar.y());
            }
            aVar.x();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            cVar.d(sb2 == null ? null : sb2.toString());
        }
    }

    public class k extends e.h.a.c0<Class> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Class a(e.h.a.h0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Class cls) {
            StringBuilder a2 = e.a.a.a.a.a("Attempted to serialize java.lang.Class: ");
            a2.append(cls.getName());
            a2.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(a2.toString());
        }
    }

    public class l extends e.h.a.c0<StringBuffer> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public StringBuffer a(e.h.a.h0.a aVar) {
            if (aVar.A() != e.h.a.h0.b.NULL) {
                return new StringBuffer(aVar.y());
            }
            aVar.x();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, StringBuffer stringBuffer) {
            StringBuffer stringBuffer2 = stringBuffer;
            cVar.d(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    public class m extends e.h.a.c0<URL> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public URL a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            String y = aVar.y();
            if ("null".equals(y)) {
                return null;
            }
            return new URL(y);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, URL url) {
            URL url2 = url;
            cVar.d(url2 == null ? null : url2.toExternalForm());
        }
    }

    public class n extends e.h.a.c0<URI> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public URI a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            try {
                String y = aVar.y();
                if ("null".equals(y)) {
                    return null;
                }
                return new URI(y);
            } catch (URISyntaxException e2) {
                throw new e.h.a.r(e2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, URI uri) {
            URI uri2 = uri;
            cVar.d(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* renamed from: e.h.a.f0.z.o$o  reason: collision with other inner class name */
    public class C0144o extends e.h.a.c0<InetAddress> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public InetAddress a(e.h.a.h0.a aVar) {
            if (aVar.A() != e.h.a.h0.b.NULL) {
                return InetAddress.getByName(aVar.y());
            }
            aVar.x();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, InetAddress inetAddress) {
            InetAddress inetAddress2 = inetAddress;
            cVar.d(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    public class p extends e.h.a.c0<UUID> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public UUID a(e.h.a.h0.a aVar) {
            if (aVar.A() != e.h.a.h0.b.NULL) {
                return UUID.fromString(aVar.y());
            }
            aVar.x();
            return null;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, UUID uuid) {
            UUID uuid2 = uuid;
            cVar.d(uuid2 == null ? null : uuid2.toString());
        }
    }

    public class q extends e.h.a.c0<Currency> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Currency a(e.h.a.h0.a aVar) {
            return Currency.getInstance(aVar.y());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Currency currency) {
            cVar.d(currency.getCurrencyCode());
        }
    }

    public class r implements e.h.a.d0 {

        public class a extends e.h.a.c0<Timestamp> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ e.h.a.c0 f4791a;

            public a(r rVar, e.h.a.c0 c0Var) {
                this.f4791a = c0Var;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // e.h.a.c0
            public Timestamp a(e.h.a.h0.a aVar) {
                Date date = (Date) this.f4791a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
            @Override // e.h.a.c0
            public void a(e.h.a.h0.c cVar, Timestamp timestamp) {
                this.f4791a.a(cVar, timestamp);
            }
        }

        @Override // e.h.a.d0
        public <T> e.h.a.c0<T> a(e.h.a.k kVar, e.h.a.g0.a<T> aVar) {
            if (aVar.f4806a != Timestamp.class) {
                return null;
            }
            return new a(this, kVar.a((Class) Date.class));
        }
    }

    public class s extends e.h.a.c0<Calendar> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Calendar a(e.h.a.h0.a aVar) {
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            aVar.k();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (aVar.A() != e.h.a.h0.b.END_OBJECT) {
                String w = aVar.w();
                int u = aVar.u();
                if ("year".equals(w)) {
                    i = u;
                } else if ("month".equals(w)) {
                    i2 = u;
                } else if ("dayOfMonth".equals(w)) {
                    i3 = u;
                } else if ("hourOfDay".equals(w)) {
                    i4 = u;
                } else if ("minute".equals(w)) {
                    i5 = u;
                } else if ("second".equals(w)) {
                    i6 = u;
                }
            }
            aVar.o();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                cVar.p();
                return;
            }
            cVar.l();
            cVar.b("year");
            cVar.f((long) calendar2.get(1));
            cVar.b("month");
            cVar.f((long) calendar2.get(2));
            cVar.b("dayOfMonth");
            cVar.f((long) calendar2.get(5));
            cVar.b("hourOfDay");
            cVar.f((long) calendar2.get(11));
            cVar.b("minute");
            cVar.f((long) calendar2.get(12));
            cVar.b("second");
            cVar.f((long) calendar2.get(13));
            cVar.n();
        }
    }

    public class t extends e.h.a.c0<Locale> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Locale a(e.h.a.h0.a aVar) {
            Locale locale;
            String str = null;
            if (aVar.A() == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.y(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str != null) {
                locale = new Locale(nextToken, nextToken2, str);
            }
            return locale;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Locale locale) {
            Locale locale2 = locale;
            cVar.d(locale2 == null ? null : locale2.toString());
        }
    }

    public class v extends e.h.a.c0<BitSet> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r6.u() != 0) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
            r1 = false;
         */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0053 A[SYNTHETIC] */
        @Override // e.h.a.c0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.BitSet a(e.h.a.h0.a r6) {
            /*
            // Method dump skipped, instructions count: 106
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.a.f0.z.o.v.a(e.h.a.h0.a):java.lang.Object");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            cVar.k();
            int length = bitSet2.length();
            for (int i = 0; i < length; i++) {
                cVar.f(bitSet2.get(i) ? 1 : 0);
            }
            cVar.m();
        }
    }

    public class w implements e.h.a.d0 {
        @Override // e.h.a.d0
        public <T> e.h.a.c0<T> a(e.h.a.k kVar, e.h.a.g0.a<T> aVar) {
            Class<? super T> cls = aVar.f4806a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new g0(cls);
        }
    }

    public class x implements e.h.a.d0 {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e.h.a.g0.a f4792c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.h.a.c0 f4793d;

        public x(e.h.a.g0.a aVar, e.h.a.c0 c0Var) {
            this.f4792c = aVar;
            this.f4793d = c0Var;
        }

        @Override // e.h.a.d0
        public <T> e.h.a.c0<T> a(e.h.a.k kVar, e.h.a.g0.a<T> aVar) {
            if (aVar.equals(this.f4792c)) {
                return this.f4793d;
            }
            return null;
        }
    }

    public class y implements e.h.a.d0 {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Class f4794c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.h.a.c0 f4795d;

        public y(Class cls, e.h.a.c0 c0Var) {
            this.f4794c = cls;
            this.f4795d = c0Var;
        }

        @Override // e.h.a.d0
        public <T> e.h.a.c0<T> a(e.h.a.k kVar, e.h.a.g0.a<T> aVar) {
            if (aVar.f4806a == this.f4794c) {
                return this.f4795d;
            }
            return null;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("Factory[type=");
            a2.append(this.f4794c.getName());
            a2.append(",adapter=");
            a2.append(this.f4795d);
            a2.append("]");
            return a2.toString();
        }
    }

    public class z extends e.h.a.c0<Boolean> {
        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.h.a.c0
        public Boolean a(e.h.a.h0.a aVar) {
            e.h.a.h0.b A = aVar.A();
            if (A == e.h.a.h0.b.NULL) {
                aVar.x();
                return null;
            }
            return Boolean.valueOf(A == e.h.a.h0.b.STRING ? Boolean.parseBoolean(aVar.y()) : aVar.s());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [e.h.a.h0.c, java.lang.Object] */
        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, Boolean bool) {
            cVar.a(bool);
        }
    }

    static {
        e.h.a.b0 b0Var = new e.h.a.b0(new k());
        f4783a = b0Var;
        b = new y(Class.class, b0Var);
        e.h.a.b0 b0Var2 = new e.h.a.b0(new v());
        f4784c = b0Var2;
        f4785d = new y(BitSet.class, b0Var2);
        e.h.a.b0 b0Var3 = new e.h.a.b0(new e0());
        n = b0Var3;
        o = new y(AtomicInteger.class, b0Var3);
        e.h.a.b0 b0Var4 = new e.h.a.b0(new f0());
        p = b0Var4;
        q = new y(AtomicBoolean.class, b0Var4);
        e.h.a.b0 b0Var5 = new e.h.a.b0(new a());
        r = b0Var5;
        s = new y(AtomicIntegerArray.class, b0Var5);
        e eVar = new e();
        w = eVar;
        x = new y(Number.class, eVar);
        j jVar = new j();
        E = jVar;
        F = new y(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = new y(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = new y(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = new y(URI.class, nVar);
        C0144o oVar = new C0144o();
        M = oVar;
        N = new r(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = new y(UUID.class, pVar);
        e.h.a.b0 b0Var6 = new e.h.a.b0(new q());
        Q = b0Var6;
        R = new y(Currency.class, b0Var6);
        s sVar = new s();
        T = sVar;
        U = new q(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new y(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = new r(e.h.a.q.class, uVar);
    }

    public static <TT> e.h.a.d0 a(e.h.a.g0.a<TT> aVar, e.h.a.c0<TT> c0Var) {
        return new x(aVar, c0Var);
    }

    public static <TT> e.h.a.d0 a(Class<TT> cls, e.h.a.c0<TT> c0Var) {
        return new y(cls, c0Var);
    }

    public class u extends e.h.a.c0<e.h.a.q> {
        @Override // e.h.a.c0
        public e.h.a.q a(e.h.a.h0.a aVar) {
            int ordinal = aVar.A().ordinal();
            if (ordinal == 0) {
                e.h.a.n nVar = new e.h.a.n();
                aVar.a();
                while (aVar.q()) {
                    e.h.a.q a2 = a(aVar);
                    if (a2 == null) {
                        a2 = e.h.a.s.f4844a;
                    }
                    nVar.f4843c.add(a2);
                }
                aVar.n();
                return nVar;
            } else if (ordinal == 2) {
                e.h.a.t tVar = new e.h.a.t();
                aVar.k();
                while (aVar.q()) {
                    String w = aVar.w();
                    e.h.a.q a3 = a(aVar);
                    e.h.a.f0.s<String, e.h.a.q> sVar = tVar.f4845a;
                    if (a3 == null) {
                        a3 = e.h.a.s.f4844a;
                    }
                    sVar.put(w, a3);
                }
                aVar.o();
                return tVar;
            } else if (ordinal == 5) {
                return new e.h.a.w(aVar.y());
            } else {
                if (ordinal == 6) {
                    return new e.h.a.w(new e.h.a.f0.r(aVar.y()));
                }
                if (ordinal == 7) {
                    return new e.h.a.w(Boolean.valueOf(aVar.s()));
                }
                if (ordinal == 8) {
                    aVar.x();
                    return e.h.a.s.f4844a;
                }
                throw new IllegalArgumentException();
            }
        }

        public void a(e.h.a.h0.c cVar, e.h.a.q qVar) {
            if (qVar == null || (qVar instanceof e.h.a.s)) {
                cVar.p();
            } else if (qVar instanceof e.h.a.w) {
                e.h.a.w a2 = qVar.a();
                Object obj = a2.f4846a;
                if (obj instanceof Number) {
                    cVar.a(a2.d());
                } else if (obj instanceof Boolean) {
                    cVar.a(a2.c());
                } else {
                    cVar.d(a2.e());
                }
            } else {
                boolean z = qVar instanceof e.h.a.n;
                if (z) {
                    cVar.k();
                    if (z) {
                        Iterator<e.h.a.q> it = ((e.h.a.n) qVar).iterator();
                        while (it.hasNext()) {
                            a(cVar, it.next());
                        }
                        cVar.m();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + qVar);
                }
                boolean z2 = qVar instanceof e.h.a.t;
                if (z2) {
                    cVar.l();
                    if (z2) {
                        for (Map.Entry<String, e.h.a.q> entry : ((e.h.a.t) qVar).f4845a.entrySet()) {
                            cVar.b(entry.getKey());
                            a(cVar, entry.getValue());
                        }
                        cVar.n();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Object: " + qVar);
                }
                StringBuilder a3 = e.a.a.a.a.a("Couldn't write ");
                a3.append(qVar.getClass());
                throw new IllegalArgumentException(a3.toString());
            }
        }
    }
}
