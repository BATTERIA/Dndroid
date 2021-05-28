package androidx.core.app;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import d.r.a;
import d.r.b;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f2372a;
        if (aVar.a(1)) {
            obj = aVar.c();
        }
        remoteActionCompat.f2372a = (IconCompat) obj;
        remoteActionCompat.b = aVar.a(remoteActionCompat.b, 2);
        remoteActionCompat.f2373c = aVar.a(remoteActionCompat.f2373c, 3);
        remoteActionCompat.f2374d = (PendingIntent) aVar.a(remoteActionCompat.f2374d, 4);
        remoteActionCompat.f2375e = aVar.a(remoteActionCompat.f2375e, 5);
        remoteActionCompat.f2376f = aVar.a(remoteActionCompat.f2376f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        if (aVar != null) {
            IconCompat iconCompat = remoteActionCompat.f2372a;
            aVar.b(1);
            aVar.a(iconCompat);
            CharSequence charSequence = remoteActionCompat.b;
            aVar.b(2);
            b bVar = (b) aVar;
            TextUtils.writeToParcel(charSequence, bVar.f3736e, 0);
            CharSequence charSequence2 = remoteActionCompat.f2373c;
            aVar.b(3);
            TextUtils.writeToParcel(charSequence2, bVar.f3736e, 0);
            aVar.b(remoteActionCompat.f2374d, 4);
            boolean z = remoteActionCompat.f2375e;
            aVar.b(5);
            bVar.f3736e.writeInt(z ? 1 : 0);
            boolean z2 = remoteActionCompat.f2376f;
            aVar.b(6);
            bVar.f3736e.writeInt(z2 ? 1 : 0);
            return;
        }
        throw null;
    }
}
