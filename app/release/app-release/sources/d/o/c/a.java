package d.o.c;

import androidx.recyclerview.widget.RecyclerView;
import d.o.c.p;
import java.util.ArrayList;
import java.util.List;

public class a implements p.a {

    /* renamed from: a  reason: collision with root package name */
    public d.g.k.b<b> f3575a = new d.g.k.b<>(30);
    public final ArrayList<b> b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f3576c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC0112a f3577d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3578e;

    /* renamed from: f  reason: collision with root package name */
    public final p f3579f;

    /* renamed from: g  reason: collision with root package name */
    public int f3580g = 0;

    /* renamed from: d.o.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0112a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3581a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public Object f3582c;

        /* renamed from: d  reason: collision with root package name */
        public int f3583d;

        public b(int i, int i2, int i3, Object obj) {
            this.f3581a = i;
            this.b = i2;
            this.f3583d = i3;
            this.f3582c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f3581a;
            if (i != bVar.f3581a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3583d - this.b) == 1 && this.f3583d == bVar.b && this.b == bVar.f3583d) {
                return true;
            }
            if (this.f3583d != bVar.f3583d || this.b != bVar.b) {
                return false;
            }
            Object obj2 = this.f3582c;
            Object obj3 = bVar.f3582c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3581a * 31) + this.b) * 31) + this.f3583d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f3581a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.f3583d);
            sb.append(",p:");
            sb.append(this.f3582c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(AbstractC0112a aVar) {
        this.f3577d = aVar;
        this.f3578e = false;
        this.f3579f = new p(this);
    }

    public int a(int i, int i2) {
        int size = this.f3576c.size();
        while (i2 < size) {
            b bVar = this.f3576c.get(i2);
            int i3 = bVar.f3581a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.f3583d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3583d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3583d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3583d;
                }
            }
            i2++;
        }
        return i;
    }

    public b a(int i, int i2, int i3, Object obj) {
        b a2 = this.f3575a.a();
        if (a2 == null) {
            return new b(i, i2, i3, obj);
        }
        a2.f3581a = i;
        a2.b = i2;
        a2.f3583d = i3;
        a2.f3582c = obj;
        return a2;
    }

    public void a() {
        int size = this.f3576c.size();
        for (int i = 0; i < size; i++) {
            ((w) this.f3577d).a(this.f3576c.get(i));
        }
        a(this.f3576c);
        this.f3580g = 0;
    }

    public void a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c(list.get(i));
        }
        list.clear();
    }

    public final boolean a(int i) {
        int size = this.f3576c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f3576c.get(i2);
            int i3 = bVar.f3581a;
            if (i3 == 8) {
                if (a(bVar.f3583d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.f3583d + i4;
                while (i4 < i5) {
                    if (a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        a();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.f3581a;
            if (i2 == 1) {
                ((w) this.f3577d).a(bVar);
                ((w) this.f3577d).a(bVar.b, bVar.f3583d);
            } else if (i2 == 2) {
                ((w) this.f3577d).a(bVar);
                AbstractC0112a aVar = this.f3577d;
                int i3 = bVar.b;
                int i4 = bVar.f3583d;
                w wVar = (w) aVar;
                wVar.f3666a.a(i3, i4, true);
                RecyclerView recyclerView = wVar.f3666a;
                recyclerView.l0 = true;
                recyclerView.i0.f2511c += i4;
            } else if (i2 == 4) {
                ((w) this.f3577d).a(bVar);
                ((w) this.f3577d).a(bVar.b, bVar.f3583d, bVar.f3582c);
            } else if (i2 == 8) {
                ((w) this.f3577d).a(bVar);
                ((w) this.f3577d).b(bVar.b, bVar.f3583d);
            }
        }
        a(this.b);
        this.f3580g = 0;
    }

    public void c(b bVar) {
        if (!this.f3578e) {
            bVar.f3582c = null;
            this.f3575a.a(bVar);
        }
    }

    public boolean c() {
        return this.b.size() > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0194, code lost:
        if (r6 >= r12.b) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x016a, code lost:
        if (r6 > r12.b) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        // Method dump skipped, instructions count: 723
        */
        throw new UnsupportedOperationException("Method not decompiled: d.o.c.a.d():void");
    }

    public final void a(b bVar) {
        int i;
        int i2 = bVar.f3581a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(bVar.b, i2);
        int i3 = bVar.b;
        int i4 = bVar.f3581a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3583d; i6++) {
            int b3 = b((i * i6) + bVar.b, bVar.f3581a);
            int i7 = bVar.f3581a;
            if (i7 == 2 ? b3 == b2 : i7 == 4 && b3 == b2 + 1) {
                i5++;
            } else {
                b a2 = a(bVar.f3581a, b2, i5, bVar.f3582c);
                a(a2, i3);
                if (!this.f3578e) {
                    a2.f3582c = null;
                    this.f3575a.a(a2);
                }
                if (bVar.f3581a == 4) {
                    i3 += i5;
                }
                b2 = b3;
                i5 = 1;
            }
        }
        Object obj = bVar.f3582c;
        if (!this.f3578e) {
            bVar.f3582c = null;
            this.f3575a.a(bVar);
        }
        if (i5 > 0) {
            b a3 = a(bVar.f3581a, b2, i5, obj);
            a(a3, i3);
            if (!this.f3578e) {
                a3.f3582c = null;
                this.f3575a.a(a3);
            }
        }
    }

    public void a(b bVar, int i) {
        ((w) this.f3577d).a(bVar);
        int i2 = bVar.f3581a;
        if (i2 == 2) {
            AbstractC0112a aVar = this.f3577d;
            int i3 = bVar.f3583d;
            w wVar = (w) aVar;
            wVar.f3666a.a(i, i3, true);
            RecyclerView recyclerView = wVar.f3666a;
            recyclerView.l0 = true;
            recyclerView.i0.f2511c += i3;
        } else if (i2 == 4) {
            ((w) this.f3577d).a(i, bVar.f3583d, bVar.f3582c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final void b(b bVar) {
        this.f3576c.add(bVar);
        int i = bVar.f3581a;
        if (i == 1) {
            ((w) this.f3577d).a(bVar.b, bVar.f3583d);
        } else if (i == 2) {
            AbstractC0112a aVar = this.f3577d;
            w wVar = (w) aVar;
            wVar.f3666a.a(bVar.b, bVar.f3583d, false);
            wVar.f3666a.l0 = true;
        } else if (i == 4) {
            ((w) this.f3577d).a(bVar.b, bVar.f3583d, bVar.f3582c);
        } else if (i == 8) {
            ((w) this.f3577d).b(bVar.b, bVar.f3583d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public final int b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f3576c.size() - 1; size >= 0; size--) {
            b bVar = this.f3576c.get(size);
            int i7 = bVar.f3581a;
            if (i7 == 8) {
                int i8 = bVar.b;
                int i9 = bVar.f3583d;
                if (i8 >= i9) {
                    i9 = i8;
                    i8 = i9;
                }
                if (i < i8 || i > i9) {
                    int i10 = bVar.b;
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.b = i10 + 1;
                            i4 = bVar.f3583d + 1;
                        } else if (i2 == 2) {
                            bVar.b = i10 - 1;
                            i4 = bVar.f3583d - 1;
                        }
                        bVar.f3583d = i4;
                    }
                } else {
                    int i11 = bVar.b;
                    if (i8 == i11) {
                        if (i2 == 1) {
                            i6 = bVar.f3583d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.f3583d - 1;
                            }
                            i++;
                        }
                        bVar.f3583d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i11 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i11 - 1;
                            }
                            i--;
                        }
                        bVar.b = i5;
                        i--;
                    }
                }
            } else {
                int i12 = bVar.b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.b = i3;
                } else if (i7 == 1) {
                    i -= bVar.f3583d;
                } else if (i7 == 2) {
                    i += bVar.f3583d;
                }
            }
        }
        for (int size2 = this.f3576c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3576c.get(size2);
            if (bVar2.f3581a == 8) {
                int i13 = bVar2.f3583d;
                if (i13 == bVar2.b || i13 < 0) {
                    this.f3576c.remove(size2);
                    if (this.f3578e) {
                    }
                }
            } else {
                if (bVar2.f3583d <= 0) {
                    this.f3576c.remove(size2);
                    if (this.f3578e) {
                    }
                }
            }
            bVar2.f3582c = null;
            this.f3575a.a(bVar2);
        }
        return i;
    }
}
