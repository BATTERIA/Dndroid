package a.w.c;

import a.n;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f2140a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        if (collection != null) {
            int size = collection.size();
            if (size != 0) {
                Iterator<?> it = collection.iterator();
                if (it.hasNext()) {
                    Object[] objArr = new Object[size];
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        objArr[i] = it.next();
                        if (i2 >= objArr.length) {
                            if (!it.hasNext()) {
                                return objArr;
                            }
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                if (i2 < 2147483645) {
                                    i3 = 2147483645;
                                } else {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr = Arrays.copyOf(objArr, i3);
                            i.a((Object) objArr, "Arrays.copyOf(result, newSize)");
                        } else if (!it.hasNext()) {
                            Object[] copyOf = Arrays.copyOf(objArr, i2);
                            i.a((Object) copyOf, "Arrays.copyOf(result, size)");
                            return copyOf;
                        }
                        i = i2;
                    }
                }
            }
            return f2140a;
        }
        i.a("collection");
        throw null;
    }

    public static final Object[] a(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        if (collection == null) {
            i.a("collection");
            throw null;
        } else if (objArr != null) {
            int size = collection.size();
            int i = 0;
            if (size != 0) {
                Iterator<?> it = collection.iterator();
                if (it.hasNext()) {
                    if (size <= objArr.length) {
                        objArr2 = objArr;
                    } else {
                        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                        if (newInstance != null) {
                            objArr2 = (Object[]) newInstance;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        }
                    }
                    while (true) {
                        int i2 = i + 1;
                        objArr2[i] = it.next();
                        if (i2 >= objArr2.length) {
                            if (!it.hasNext()) {
                                return objArr2;
                            }
                            int i3 = ((i2 * 3) + 1) >>> 1;
                            if (i3 <= i2) {
                                if (i2 < 2147483645) {
                                    i3 = 2147483645;
                                } else {
                                    throw new OutOfMemoryError();
                                }
                            }
                            objArr2 = Arrays.copyOf(objArr2, i3);
                            i.a((Object) objArr2, "Arrays.copyOf(result, newSize)");
                        } else if (!it.hasNext()) {
                            if (objArr2 == objArr) {
                                objArr[i2] = null;
                                return objArr;
                            }
                            Object[] copyOf = Arrays.copyOf(objArr2, i2);
                            i.a((Object) copyOf, "Arrays.copyOf(result, size)");
                            return copyOf;
                        }
                        i = i2;
                    }
                } else if (objArr.length <= 0) {
                    return objArr;
                } else {
                    objArr[0] = null;
                    return objArr;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else {
            throw null;
        }
    }
}
