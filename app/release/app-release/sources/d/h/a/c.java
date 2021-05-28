package d.h.a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {
    public int k;
    public int l;
    public LayoutInflater m;

    @Deprecated
    public c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.l = i;
        this.k = i;
        this.m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // d.h.a.a
    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.m.inflate(this.k, viewGroup, false);
    }
}
