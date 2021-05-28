package d.e.a.h;

import d.e.a.c;
import java.util.ArrayList;

public class n extends d {
    public ArrayList<d> k0 = new ArrayList<>();

    @Override // d.e.a.h.d
    public void a(c cVar) {
        super.a(cVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).a(cVar);
        }
    }

    @Override // d.e.a.h.d
    public void b(int i, int i2) {
        this.O = i;
        this.P = i2;
        int size = this.k0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.k0.get(i3).b(this.I + this.O, this.J + this.P);
        }
    }

    @Override // d.e.a.h.d
    public void l() {
        this.k0.clear();
        super.l();
    }

    @Override // d.e.a.h.d
    public void o() {
        int i = this.I;
        int i2 = this.J;
        this.M = i;
        this.N = i2;
        ArrayList<d> arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                d dVar = this.k0.get(i3);
                dVar.b(this.M + this.O, this.N + this.P);
                if (!(dVar instanceof e)) {
                    dVar.o();
                }
            }
        }
    }

    public void p() {
        o();
        ArrayList<d> arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d dVar = this.k0.get(i);
                if (dVar instanceof n) {
                    ((n) dVar).p();
                }
            }
        }
    }
}
