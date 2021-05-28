package d.h.a;

import android.database.Cursor;
import android.widget.Filter;
import d.b.o.n0;

public class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f3401a;

    public interface a {
    }

    public b(a aVar) {
        this.f3401a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return ((n0) this.f3401a).b((Cursor) obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            d.h.a.b$a r0 = r4.f3401a
            d.b.o.n0 r0 = (d.b.o.n0) r0
            r1 = 0
            if (r0 == 0) goto L_0x004e
            if (r5 != 0) goto L_0x000c
            java.lang.String r5 = ""
            goto L_0x0010
        L_0x000c:
            java.lang.String r5 = r5.toString()
        L_0x0010:
            androidx.appcompat.widget.SearchView r2 = r0.n
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0037
            androidx.appcompat.widget.SearchView r2 = r0.n
            int r2 = r2.getWindowVisibility()
            if (r2 == 0) goto L_0x0021
            goto L_0x0037
        L_0x0021:
            android.app.SearchableInfo r2 = r0.o     // Catch:{ RuntimeException -> 0x002f }
            r3 = 50
            android.database.Cursor r5 = r0.a(r2, r5, r3)     // Catch:{ RuntimeException -> 0x002f }
            if (r5 == 0) goto L_0x0037
            r5.getCount()     // Catch:{ RuntimeException -> 0x002f }
            goto L_0x0038
        L_0x002f:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r5)
        L_0x0037:
            r5 = r1
        L_0x0038:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L_0x0048
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L_0x004d
        L_0x0048:
            r5 = 0
            r0.count = r5
            r0.values = r1
        L_0x004d:
            return r0
        L_0x004e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.h.a.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f3401a;
        Cursor cursor = ((a) aVar).f3395e;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((n0) aVar).a((Cursor) obj);
        }
    }
}
