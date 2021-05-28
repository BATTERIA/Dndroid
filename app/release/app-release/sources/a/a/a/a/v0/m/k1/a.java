package a.a.a.a.v0.m.k1;

import java.util.ArrayList;

public final class a extends ArrayList<j> implements i {
    public a(int i) {
        super(i);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof j) {
            return super.contains((j) obj);
        }
        return false;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof j) {
            return super.indexOf((j) obj);
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof j) {
            return super.lastIndexOf((j) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.ArrayList
    public final boolean remove(Object obj) {
        if (obj instanceof j) {
            return super.remove((j) obj);
        }
        return false;
    }

    public final int size() {
        return super.size();
    }
}
