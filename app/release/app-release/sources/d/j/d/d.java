package d.j.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import d.a.c;
import d.l.e;
import d.l.i;
import d.l.u;
import d.l.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class d extends ComponentActivity {

    /* renamed from: h  reason: collision with root package name */
    public final l f3418h;
    public final i i = new i(this);
    public boolean j;
    public boolean k;
    public boolean l = true;
    public boolean m;
    public int n;
    public d.d.i<String> o;

    public class a extends n<d> implements v, c {
        public a() {
            super(d.this);
        }

        @Override // d.j.d.j
        public View a(int i) {
            return d.this.findViewById(i);
        }

        @Override // d.l.h
        public e a() {
            return d.this.i;
        }

        @Override // d.a.c
        public OnBackPressedDispatcher b() {
            return d.this.f2231g;
        }

        @Override // d.j.d.j
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // d.l.v
        public u e() {
            return d.this.e();
        }
    }

    public d() {
        a aVar = new a();
        c.a.a.a.a.a(aVar, "callbacks == null");
        this.f3418h = new l(aVar);
    }

    public static void a(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public final int a(Fragment fragment) {
        if (this.o.c() < 65534) {
            while (true) {
                d.d.i<String> iVar = this.o;
                int i2 = this.n;
                if (iVar.f3103c) {
                    iVar.b();
                }
                if (d.d.d.a(iVar.f3104d, iVar.f3106f, i2) >= 0) {
                    this.n = (this.n + 1) % 65534;
                } else {
                    int i3 = this.n;
                    this.o.c(i3, fragment.f2395g);
                    this.n = (this.n + 1) % 65534;
                    return i3;
                }
            }
        } else {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.j);
        printWriter.print(" mResumed=");
        printWriter.print(this.k);
        printWriter.print(" mStopped=");
        printWriter.print(this.l);
        if (getApplication() != null) {
            d.m.a.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f3418h.f3472a.f3483f.a(str, fileDescriptor, printWriter, strArr);
    }

    public q f() {
        return this.f3418h.f3472a.f3483f;
    }

    @Deprecated
    public void g() {
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f3418h.a();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String a2 = this.o.a(i5);
            this.o.c(i5);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment c2 = this.f3418h.f3472a.f3483f.c(a2);
            if (c2 == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
                return;
            }
            c2.a(i2 & 65535, i3, intent);
            return;
        }
        d.g.d.a.a();
        super.onActivityResult(i2, i3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3418h.a();
        this.f3418h.f3472a.f3483f.a(configuration);
    }

    @Override // androidx.activity.ComponentActivity, d.g.d.b
    public void onCreate(Bundle bundle) {
        n<?> nVar = this.f3418h.f3472a;
        nVar.f3483f.a(nVar, nVar, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            n<?> nVar2 = this.f3418h.f3472a;
            if (nVar2 instanceof v) {
                nVar2.f3483f.a(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.n = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    } else {
                        this.o = new d.d.i<>(intArray.length);
                        for (int i2 = 0; i2 < intArray.length; i2++) {
                            this.o.c(intArray[i2], stringArray[i2]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.o == null) {
            this.o = new d.d.i<>(10);
            this.n = 0;
        }
        super.onCreate(bundle);
        this.i.a(e.a.ON_CREATE);
        this.f3418h.f3472a.f3483f.b();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        l lVar = this.f3418h;
        return onCreatePanelMenu | lVar.f3472a.f3483f.a(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f3418h.f3472a.f3483f.f3495f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3418h.f3472a.f3483f.c();
        this.i.a(e.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f3418h.f3472a.f3483f.d();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f3418h.f3472a.f3483f.b(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f3418h.f3472a.f3483f.a(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f3418h.f3472a.f3483f.a(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f3418h.a();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f3418h.f3472a.f3483f.a(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.k = false;
        this.f3418h.f3472a.f3483f.a(3);
        this.i.a(e.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f3418h.f3472a.f3483f.b(z);
    }

    public void onPostResume() {
        super.onPostResume();
        this.i.a(e.a.ON_RESUME);
        q qVar = this.f3418h.f3472a.f3483f;
        qVar.u = false;
        qVar.v = false;
        qVar.a(4);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.f3418h.f3472a.f3483f.b(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f3418h.a();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a2 = this.o.a(i4);
            this.o.c(i4);
            if (a2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.f3418h.f3472a.f3483f.c(a2) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + a2);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.k = true;
        this.f3418h.a();
        this.f3418h.f3472a.f3483f.d(true);
    }

    @Override // androidx.activity.ComponentActivity, d.g.d.b
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (a(f(), e.b.CREATED));
        this.i.a(e.a.ON_STOP);
        Parcelable l2 = this.f3418h.f3472a.f3483f.l();
        if (l2 != null) {
            bundle.putParcelable("android:support:fragments", l2);
        }
        if (this.o.c() > 0) {
            bundle.putInt("android:support:next_request_index", this.n);
            int[] iArr = new int[this.o.c()];
            String[] strArr = new String[this.o.c()];
            for (int i2 = 0; i2 < this.o.c(); i2++) {
                iArr[i2] = this.o.b(i2);
                strArr[i2] = this.o.d(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    public void onStart() {
        super.onStart();
        this.l = false;
        if (!this.j) {
            this.j = true;
            q qVar = this.f3418h.f3472a.f3483f;
            qVar.u = false;
            qVar.v = false;
            qVar.a(2);
        }
        this.f3418h.a();
        this.f3418h.f3472a.f3483f.d(true);
        this.i.a(e.a.ON_START);
        q qVar2 = this.f3418h.f3472a.f3483f;
        qVar2.u = false;
        qVar2.v = false;
        qVar2.a(3);
    }

    public void onStateNotSaved() {
        this.f3418h.a();
    }

    public void onStop() {
        super.onStop();
        this.l = true;
        do {
        } while (a(f(), e.b.CREATED));
        q qVar = this.f3418h.f3472a.f3483f;
        qVar.v = true;
        qVar.a(2);
        this.i.a(e.a.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.m && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.m && i2 != -1) {
            a(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 != -1) {
            a(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public static boolean a(q qVar, e.b bVar) {
        d dVar;
        boolean z = false;
        for (Fragment fragment : qVar.f3492c.c()) {
            if (fragment != null) {
                n<?> nVar = fragment.u;
                if (nVar == null) {
                    dVar = null;
                } else {
                    dVar = d.this;
                }
                if (dVar != null) {
                    z |= a(fragment.h(), bVar);
                }
                if (fragment.S.b.a(e.b.STARTED)) {
                    fragment.S.a(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f3418h.f3472a.f3483f.f3495f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
