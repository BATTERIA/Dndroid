package com.bilibili.bililive.batteria;

import a.a.c;
import a.g;
import a.w.c.i;
import a.w.c.s;
import android.util.Log;
import androidx.annotation.Keep;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;

@g(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\b¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u0002H\u0001H\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"getField", "T", "", "fieldName", "", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "setField", "", "value", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z", "app_release"}, mv = {1, 1, 16})
public final class Testp2pKt {
    @Keep
    public static final /* synthetic */ <T> boolean setField(Object obj, String str, T t) {
        T t2 = null;
        if (obj == null) {
            i.a("$this$setField");
            throw null;
        } else if (str != null) {
            StringBuilder a2 = a.a("size ");
            a2.append(((ArrayList) e.f.a.g.d(s.a(obj.getClass()))).size());
            Log.e("p2p-test", a2.toString());
            Iterator<T> it = e.f.a.g.e((c<?>) s.a(obj.getClass())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (i.a((Object) str, (Object) next.d())) {
                    t2 = next;
                    break;
                }
            }
            T t3 = t2;
            if (!(t3 instanceof a.a.g)) {
                return false;
            }
            t3.i().a(obj, t);
            return true;
        } else {
            i.a("fieldName");
            throw null;
        }
    }
}
