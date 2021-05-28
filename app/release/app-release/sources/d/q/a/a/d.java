package d.q.a.a;

import android.animation.TypeEvaluator;
import c.a.a.a.a;
import d.g.f.b;

public class d implements TypeEvaluator<b[]> {

    /* renamed from: a  reason: collision with root package name */
    public b[] f3695a;

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public b[] evaluate(float f2, b[] bVarArr, b[] bVarArr2) {
        b[] bVarArr3 = bVarArr;
        b[] bVarArr4 = bVarArr2;
        if (a.a(bVarArr3, bVarArr4)) {
            b[] bVarArr5 = this.f3695a;
            if (bVarArr5 == null || !a.a(bVarArr5, bVarArr3)) {
                this.f3695a = a.a(bVarArr3);
            }
            for (int i = 0; i < bVarArr3.length; i++) {
                b bVar = this.f3695a[i];
                b bVar2 = bVarArr3[i];
                b bVar3 = bVarArr4[i];
                if (bVar != null) {
                    bVar.f3261a = bVar2.f3261a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = bVar2.b;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        bVar.b[i2] = (bVar3.b[i2] * f2) + ((1.0f - f2) * fArr[i2]);
                        i2++;
                    }
                } else {
                    throw null;
                }
            }
            return this.f3695a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
