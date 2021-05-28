package d.g.l;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f3337a;
    public ViewParent b;

    /* renamed from: c  reason: collision with root package name */
    public final View f3338c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3339d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3340e;

    public g(View view) {
        this.f3338c = view;
    }

    public final ViewParent a(int i) {
        if (i == 0) {
            return this.f3337a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public void a(boolean z) {
        if (this.f3339d) {
            p.v(this.f3338c);
        }
        this.f3339d = z;
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent a2;
        if (!this.f3339d || (a2 = a(0)) == null) {
            return false;
        }
        View view = this.f3338c;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a2.onNestedFling(view, f2, f3, z);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onNestedFling", e2);
                return false;
            }
        } else if (a2 instanceof j) {
            return ((j) a2).onNestedFling(view, f2, f3, z);
        } else {
            return false;
        }
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return a(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean b(int i) {
        return a(i) != null;
    }

    public void c(int i) {
        ViewParent a2 = a(i);
        if (a2 != null) {
            View view = this.f3338c;
            if (a2 instanceof h) {
                ((h) a2).a(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        a2.onStopNestedScroll(view);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onStopNestedScroll", e2);
                    }
                } else if (a2 instanceof j) {
                    ((j) a2).onStopNestedScroll(view);
                }
            }
            if (i == 0) {
                this.f3337a = null;
            } else if (i == 1) {
                this.b = null;
            }
        }
    }

    public boolean a(float f2, float f3) {
        ViewParent a2;
        if (!this.f3339d || (a2 = a(0)) == null) {
            return false;
        }
        View view = this.f3338c;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return a2.onNestedPreFling(view, f2, f3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onNestedPreFling", e2);
                return false;
            }
        } else if (a2 instanceof j) {
            return ((j) a2).onNestedPreFling(view, f2, f3);
        } else {
            return false;
        }
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent a2;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f3339d || (a2 = a(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f3338c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.f3340e == null) {
                    this.f3340e = new int[2];
                }
                iArr3 = this.f3340e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f3338c;
            if (a2 instanceof h) {
                ((h) a2).a(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        a2.onNestedPreScroll(view, i, i2, iArr3);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onNestedPreScroll", e2);
                    }
                } else if (a2 instanceof j) {
                    ((j) a2).onNestedPreScroll(view, i, i2, iArr3);
                }
            }
            if (iArr2 != null) {
                this.f3338c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr3[0] == 0 && iArr3[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent a2;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f3339d || (a2 = a(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3338c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.f3340e == null) {
                this.f3340e = new int[2];
            }
            int[] iArr4 = this.f3340e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f3338c;
        if (a2 instanceof i) {
            ((i) a2).a(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (a2 instanceof h) {
                ((h) a2).a(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        a2.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onNestedScroll", e2);
                    }
                } else if (a2 instanceof j) {
                    ((j) a2).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
        if (iArr != null) {
            this.f3338c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    public boolean a(int i, int i2) {
        boolean z;
        if (a(i2) != null) {
            return true;
        }
        if (this.f3339d) {
            View view = this.f3338c;
            for (ViewParent parent = this.f3338c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f3338c;
                boolean z2 = parent instanceof h;
                if (z2) {
                    z = ((h) parent).b(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z = parent.onStartNestedScroll(view, view2, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                            }
                        } else if (parent instanceof j) {
                            z = ((j) parent).onStartNestedScroll(view, view2, i);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.f3337a = parent;
                    } else if (i2 == 1) {
                        this.b = parent;
                    }
                    View view3 = this.f3338c;
                    if (z2) {
                        ((h) parent).a(view, view3, i, i2);
                    } else if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                parent.onNestedScrollAccepted(view, view3, i);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                            }
                        } else if (parent instanceof j) {
                            ((j) parent).onNestedScrollAccepted(view, view3, i);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }
}
