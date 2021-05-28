package e.d.a.m.i.n;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<e.d.a.m.c, b> f4029a = new HashMap();
    public final C0123c b = new C0123c(null);

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Lock f4030a = new ReentrantLock();
        public int b;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
        }
    }

    /* renamed from: e.d.a.m.i.n.c$c  reason: collision with other inner class name */
    public static class C0123c {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<b> f4031a = new ArrayDeque();

        public /* synthetic */ C0123c(a aVar) {
        }

        public b a() {
            b poll;
            synchronized (this.f4031a) {
                poll = this.f4031a.poll();
            }
            return poll == null ? new b(null) : poll;
        }

        public void a(b bVar) {
            synchronized (this.f4031a) {
                if (this.f4031a.size() < 10) {
                    this.f4031a.offer(bVar);
                }
            }
        }
    }

    public void a(e.d.a.m.c cVar) {
        b bVar;
        synchronized (this) {
            bVar = this.f4029a.get(cVar);
            if (bVar == null) {
                bVar = this.b.a();
                this.f4029a.put(cVar, bVar);
            }
            bVar.b++;
        }
        bVar.f4030a.lock();
    }

    public void b(e.d.a.m.c cVar) {
        b bVar;
        synchronized (this) {
            bVar = this.f4029a.get(cVar);
            if (bVar != null) {
                if (bVar.b > 0) {
                    int i = bVar.b - 1;
                    bVar.b = i;
                    if (i == 0) {
                        b remove = this.f4029a.remove(cVar);
                        if (remove.equals(bVar)) {
                            this.b.a(remove);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + remove + ", key: " + cVar);
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot release a lock that is not held, key: ");
            sb.append(cVar);
            sb.append(", interestedThreads: ");
            sb.append(bVar == null ? 0 : bVar.b);
            throw new IllegalArgumentException(sb.toString());
        }
        bVar.f4030a.unlock();
    }
}
