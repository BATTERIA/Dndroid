package g;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class q extends AbstractList<h> implements RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    public final h[] f5457c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f5458d;

    public q(h[] hVarArr, int[] iArr) {
        this.f5457c = hVarArr;
        this.f5458d = iArr;
    }

    public static void a(long j, e eVar, int i, List<h> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        int i6;
        e eVar2;
        int i7 = i2;
        if (i7 < i3) {
            for (int i8 = i7; i8 < i3; i8++) {
                if (list.get(i8).h() < i) {
                    throw new AssertionError();
                }
            }
            h hVar = list.get(i2);
            h hVar2 = list.get(i3 - 1);
            int i9 = -1;
            if (i == hVar.h()) {
                i9 = list2.get(i7).intValue();
                i7++;
                hVar = list.get(i7);
            }
            long j2 = 4;
            if (hVar.a(i) != hVar2.a(i)) {
                int i10 = 1;
                for (int i11 = i7 + 1; i11 < i3; i11++) {
                    if (list.get(i11 - 1).a(i) != list.get(i11).a(i)) {
                        i10++;
                    }
                }
                long j3 = j + ((long) ((int) (eVar.f5428d / 4))) + 2 + ((long) (i10 * 2));
                eVar.writeInt(i10);
                eVar.writeInt(i9);
                for (int i12 = i7; i12 < i3; i12++) {
                    byte a2 = list.get(i12).a(i);
                    if (i12 == i7 || a2 != list.get(i12 - 1).a(i)) {
                        eVar.writeInt(a2 & 255);
                    }
                }
                e eVar3 = new e();
                int i13 = i7;
                while (i13 < i3) {
                    byte a3 = list.get(i13).a(i);
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        if (i15 >= i3) {
                            i5 = i3;
                            break;
                        } else if (a3 != list.get(i15).a(i)) {
                            i5 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i14 == i5 && i + 1 == list.get(i13).h()) {
                        eVar.writeInt(list2.get(i13).intValue());
                        i6 = i5;
                        eVar2 = eVar3;
                    } else {
                        eVar.writeInt((int) ((((long) ((int) (eVar3.f5428d / j2))) + j3) * -1));
                        i6 = i5;
                        eVar2 = eVar3;
                        a(j3, eVar3, i + 1, list, i13, i5, list2);
                    }
                    eVar3 = eVar2;
                    i13 = i6;
                    j2 = 4;
                }
                eVar.a(eVar3, eVar3.f5428d);
                return;
            }
            int i16 = 0;
            int min = Math.min(hVar.h(), hVar2.h());
            int i17 = i;
            while (i17 < min && hVar.a(i17) == hVar2.a(i17)) {
                i16++;
                i17++;
            }
            long j4 = 1 + j + ((long) ((int) (eVar.f5428d / 4))) + 2 + ((long) i16);
            eVar.writeInt(-i16);
            eVar.writeInt(i9);
            int i18 = i;
            while (true) {
                i4 = i + i16;
                if (i18 >= i4) {
                    break;
                }
                eVar.writeInt(hVar.a(i18) & 255);
                i18++;
            }
            if (i7 + 1 != i3) {
                e eVar4 = new e();
                eVar.writeInt((int) ((((long) ((int) (eVar4.f5428d / 4))) + j4) * -1));
                a(j4, eVar4, i4, list, i7, i3, list2);
                eVar.a(eVar4, eVar4.f5428d);
            } else if (i4 == list.get(i7).h()) {
                eVar.writeInt(list2.get(i7).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public h get(int i) {
        return this.f5457c[i];
    }

    public final int size() {
        return this.f5457c.length;
    }

    public static q a(h... hVarArr) {
        if (hVarArr.length == 0) {
            return new q(new h[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(hVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, hVarArr[i2]), Integer.valueOf(i2));
        }
        if (((h) arrayList.get(0)).h() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                h hVar = (h) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    h hVar2 = (h) arrayList.get(i5);
                    if (hVar2 == null) {
                        throw null;
                    } else if (!hVar2.a(0, hVar, 0, hVar.h())) {
                        continue;
                        break;
                    } else if (hVar2.h() == hVar.h()) {
                        throw new IllegalArgumentException("duplicate option: " + hVar2);
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            e eVar = new e();
            a(0, eVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i6 = (int) (eVar.f5428d / 4);
            int[] iArr = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                iArr[i7] = eVar.readInt();
            }
            if (eVar.i()) {
                return new q((h[]) hVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }
}
