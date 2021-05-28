package d.h.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import d.h.a.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: c  reason: collision with root package name */
    public boolean f3393c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3394d;

    /* renamed from: e  reason: collision with root package name */
    public Cursor f3395e;

    /* renamed from: f  reason: collision with root package name */
    public Context f3396f;

    /* renamed from: g  reason: collision with root package name */
    public int f3397g;

    /* renamed from: h  reason: collision with root package name */
    public C0108a f3398h;
    public DataSetObserver i;
    public b j;

    /* renamed from: d.h.a.a$a  reason: collision with other inner class name */
    public class C0108a extends ContentObserver {
        public C0108a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f3394d && (cursor = aVar.f3395e) != null && !cursor.isClosed()) {
                aVar.f3393c = aVar.f3395e.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f3393c = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3393c = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        b bVar;
        boolean z2 = true;
        int i2 = z ? 1 : 2;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f3394d = true;
        } else {
            this.f3394d = false;
        }
        z2 = cursor == null ? false : z2;
        this.f3395e = cursor;
        this.f3393c = z2;
        this.f3396f = context;
        this.f3397g = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f3398h = new C0108a();
            bVar = new b();
        } else {
            bVar = null;
            this.f3398h = null;
        }
        this.i = bVar;
        if (z2) {
            C0108a aVar = this.f3398h;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.i;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    public void a(Cursor cursor) {
        Cursor cursor2 = this.f3395e;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0108a aVar = this.f3398h;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.i;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f3395e = cursor;
            if (cursor != null) {
                C0108a aVar2 = this.f3398h;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.i;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f3397g = cursor.getColumnIndexOrThrow("_id");
                this.f3393c = true;
                notifyDataSetChanged();
            } else {
                this.f3397g = -1;
                this.f3393c = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public abstract CharSequence b(Cursor cursor);

    public int getCount() {
        Cursor cursor;
        if (!this.f3393c || (cursor = this.f3395e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3393c) {
            return null;
        }
        this.f3395e.moveToPosition(i2);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.m.inflate(cVar.l, viewGroup, false);
        }
        a(view, this.f3396f, this.f3395e);
        return view;
    }

    public Filter getFilter() {
        if (this.j == null) {
            this.j = new b(this);
        }
        return this.j;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f3393c || (cursor = this.f3395e) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f3395e;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f3393c || (cursor = this.f3395e) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f3395e.getLong(this.f3397g);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3393c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f3395e.moveToPosition(i2)) {
            if (view == null) {
                view = a(this.f3396f, this.f3395e, viewGroup);
            }
            a(view, this.f3396f, this.f3395e);
            return view;
        } else {
            throw new IllegalStateException(e.a.a.a.a.a("couldn't move cursor to position ", i2));
        }
    }
}
