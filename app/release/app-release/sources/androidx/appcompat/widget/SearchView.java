package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import d.b.o.a1;
import d.b.o.f0;
import d.b.o.n0;
import d.b.o.t0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends f0 implements d.b.n.b {
    public static final k s0 = new k();
    public p A;
    public Rect B;
    public Rect C;
    public int[] D;
    public int[] E;
    public final ImageView F;
    public final Drawable G;
    public final int H;
    public final int I;
    public final Intent J;
    public final Intent K;
    public final CharSequence L;
    public m M;
    public l N;
    public View.OnFocusChangeListener O;
    public n P;
    public View.OnClickListener Q;
    public boolean R;
    public boolean S;
    public d.h.a.a T;
    public boolean U;
    public CharSequence V;
    public boolean W;
    public boolean a0;
    public int b0;
    public boolean c0;
    public CharSequence d0;
    public CharSequence e0;
    public boolean f0;
    public int g0;
    public SearchableInfo h0;
    public Bundle i0;
    public final Runnable j0;
    public Runnable k0;
    public final WeakHashMap<String, Drawable.ConstantState> l0;
    public final View.OnClickListener m0;
    public View.OnKeyListener n0;
    public final TextView.OnEditorActionListener o0;
    public final AdapterView.OnItemClickListener p0;
    public final AdapterView.OnItemSelectedListener q0;
    public final SearchAutoComplete r;
    public TextWatcher r0;
    public final View s;
    public final View t;
    public final View u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final View z;

    public static class SearchAutoComplete extends d.b.o.d {

        /* renamed from: f  reason: collision with root package name */
        public int f2318f;

        /* renamed from: g  reason: collision with root package name */
        public SearchView f2319g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2320h;
        public final Runnable i;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f2320h) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f2320h = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, d.b.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.i = new a();
            this.f2318f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        public boolean enoughToFilter() {
            return this.f2318f <= 0 || super.enoughToFilter();
        }

        @Override // d.b.o.d
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2320h) {
                removeCallbacks(this.i);
                post(this.i);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            SearchView searchView = this.f2319g;
            searchView.b(searchView.S);
            searchView.post(searchView.j0);
            if (searchView.r.hasFocus()) {
                searchView.c();
            }
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2319g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.f2319g.hasFocus() && getVisibility() == 0) {
                this.f2320h = true;
                if (SearchView.a(getContext()) && (method = SearchView.s0.f2333c) != null) {
                    try {
                        method.invoke(this, true);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f2320h = false;
                removeCallbacks(this.i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2320h = false;
                removeCallbacks(this.i);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2320h = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2319g = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f2318f = i2;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.r.getText();
            searchView.e0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.a(z);
            searchView.c(!z);
            searchView.g();
            searchView.j();
            if (searchView.M != null && !TextUtils.equals(charSequence, searchView.d0)) {
                searchView.M.a(charSequence.toString());
            }
            searchView.d0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.h();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            d.h.a.a aVar = SearchView.this.T;
            if (aVar != null && (aVar instanceof n0)) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView searchView = SearchView.this;
            if (searchView.z.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.t.getPaddingLeft();
                Rect rect = new Rect();
                boolean a2 = a1.a(searchView);
                int dimensionPixelSize = searchView.R ? resources.getDimensionPixelSize(d.b.d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(d.b.d.abc_dropdownitem_icon_width) : 0;
                searchView.r.getDropDownBackground().getPadding(rect);
                searchView.r.setDropDownHorizontalOffset(a2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.r.setDropDownWidth((((searchView.z.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.v) {
                searchView.e();
            } else if (view == searchView.x) {
                searchView.d();
            } else if (view == searchView.w) {
                searchView.f();
            } else if (view == searchView.y) {
                SearchableInfo searchableInfo = searchView.h0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.J);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.a(searchView.K, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.r) {
                searchView.c();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.h0 == null) {
                return false;
            }
            if (!searchView.r.isPopupShowing() || SearchView.this.r.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.r.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.a(0, null, searchView2.r.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.h0 == null || searchView3.T == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView3.b(searchView3.r.getListSelection());
            }
            if (i == 21 || i == 22) {
                searchView3.r.setSelection(i == 21 ? 0 : searchView3.r.length());
                searchView3.r.setListSelection(0);
                searchView3.r.clearListSelection();
                k kVar = SearchView.s0;
                SearchAutoComplete searchAutoComplete = searchView3.r;
                Method method = kVar.f2333c;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, true);
                    } catch (Exception unused) {
                    }
                }
                return true;
            } else if (i != 19) {
                return false;
            } else {
                searchView3.r.getListSelection();
                return false;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.f();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.b(i);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.c(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public Method f2332a;
        public Method b;

        /* renamed from: c  reason: collision with root package name */
        public Method f2333c;

        public k() {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f2332a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f2333c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i);

        boolean b(int i);
    }

    public static class o extends d.i.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public boolean f2334e;

        public static class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new o[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2334e = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("SearchView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" isIconified=");
            a2.append(this.f2334e);
            a2.append("}");
            return a2.toString();
        }

        @Override // d.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3403c, i);
            parcel.writeValue(Boolean.valueOf(this.f2334e));
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f2335a;
        public final Rect b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f2336c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f2337d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f2338e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2339f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f2338e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f2335a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f2337d.set(rect);
            Rect rect3 = this.f2337d;
            int i = this.f2338e;
            rect3.inset(-i, -i);
            this.f2336c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.b.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.B = new Rect();
        this.C = new Rect();
        this.D = new int[2];
        this.E = new int[2];
        this.j0 = new b();
        this.k0 = new c();
        this.l0 = new WeakHashMap<>();
        this.m0 = new f();
        this.n0 = new g();
        this.o0 = new h();
        this.p0 = new i();
        this.q0 = new j();
        this.r0 = new a();
        t0 t0Var = new t0(context, context.obtainStyledAttributes(attributeSet, d.b.j.SearchView, i2, 0));
        LayoutInflater.from(context).inflate(t0Var.f(d.b.j.SearchView_layout, d.b.g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(d.b.f.search_src_text);
        this.r = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.s = findViewById(d.b.f.search_edit_frame);
        this.t = findViewById(d.b.f.search_plate);
        this.u = findViewById(d.b.f.submit_area);
        this.v = (ImageView) findViewById(d.b.f.search_button);
        this.w = (ImageView) findViewById(d.b.f.search_go_btn);
        this.x = (ImageView) findViewById(d.b.f.search_close_btn);
        this.y = (ImageView) findViewById(d.b.f.search_voice_btn);
        this.F = (ImageView) findViewById(d.b.f.search_mag_icon);
        d.g.l.p.a(this.t, t0Var.b(d.b.j.SearchView_queryBackground));
        this.u.setBackground(t0Var.b(d.b.j.SearchView_submitBackground));
        this.v.setImageDrawable(t0Var.b(d.b.j.SearchView_searchIcon));
        this.w.setImageDrawable(t0Var.b(d.b.j.SearchView_goIcon));
        this.x.setImageDrawable(t0Var.b(d.b.j.SearchView_closeIcon));
        this.y.setImageDrawable(t0Var.b(d.b.j.SearchView_voiceIcon));
        this.F.setImageDrawable(t0Var.b(d.b.j.SearchView_searchIcon));
        this.G = t0Var.b(d.b.j.SearchView_searchHintIcon);
        c.a.a.a.a.a((View) this.v, (CharSequence) getResources().getString(d.b.h.abc_searchview_description_search));
        this.H = t0Var.f(d.b.j.SearchView_suggestionRowLayout, d.b.g.abc_search_dropdown_item_icons_2line);
        this.I = t0Var.f(d.b.j.SearchView_commitIcon, 0);
        this.v.setOnClickListener(this.m0);
        this.x.setOnClickListener(this.m0);
        this.w.setOnClickListener(this.m0);
        this.y.setOnClickListener(this.m0);
        this.r.setOnClickListener(this.m0);
        this.r.addTextChangedListener(this.r0);
        this.r.setOnEditorActionListener(this.o0);
        this.r.setOnItemClickListener(this.p0);
        this.r.setOnItemSelectedListener(this.q0);
        this.r.setOnKeyListener(this.n0);
        this.r.setOnFocusChangeListener(new d());
        setIconifiedByDefault(t0Var.a(d.b.j.SearchView_iconifiedByDefault, true));
        int c2 = t0Var.c(d.b.j.SearchView_android_maxWidth, -1);
        if (c2 != -1) {
            setMaxWidth(c2);
        }
        this.L = t0Var.d(d.b.j.SearchView_defaultQueryHint);
        this.V = t0Var.d(d.b.j.SearchView_queryHint);
        int d2 = t0Var.d(d.b.j.SearchView_android_imeOptions, -1);
        if (d2 != -1) {
            setImeOptions(d2);
        }
        int d3 = t0Var.d(d.b.j.SearchView_android_inputType, -1);
        if (d3 != -1) {
            setInputType(d3);
        }
        setFocusable(t0Var.a(d.b.j.SearchView_android_focusable, true));
        t0Var.b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.J = intent;
        intent.addFlags(268435456);
        this.J.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.K = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.r.getDropDownAnchor());
        this.z = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new e());
        }
        b(this.R);
        i();
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(d.b.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(d.b.d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.r.setText(charSequence);
        this.r.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.i0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent a(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.e0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.i0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.h0.getSearchActivity());
        return intent;
    }

    @Override // d.b.n.b
    public void a() {
        if (!this.f0) {
            this.f0 = true;
            int imeOptions = this.r.getImeOptions();
            this.g0 = imeOptions;
            this.r.setImeOptions(imeOptions | 33554432);
            this.r.setText("");
            setIconified(false);
        }
    }

    public void a(int i2, String str, String str2) {
        getContext().startActivity(a("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    public void a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.c0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.U
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.c0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.S
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.c0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.w
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.a(boolean):void");
    }

    @Override // d.b.n.b
    public void b() {
        this.r.setText("");
        SearchAutoComplete searchAutoComplete = this.r;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.e0 = "";
        clearFocus();
        b(true);
        this.r.setImeOptions(this.g0);
        this.f0 = false;
    }

    public final void b(boolean z2) {
        this.S = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.r.getText());
        this.v.setVisibility(i3);
        a(z3);
        this.s.setVisibility(z2 ? 8 : 0);
        if (this.F.getDrawable() == null || this.R) {
            i2 = 8;
        }
        this.F.setVisibility(i2);
        g();
        c(!z3);
        j();
    }

    public void c() {
        k kVar = s0;
        SearchAutoComplete searchAutoComplete = this.r;
        Method method = kVar.f2332a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        k kVar2 = s0;
        SearchAutoComplete searchAutoComplete2 = this.r;
        Method method2 = kVar2.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void clearFocus() {
        this.a0 = true;
        super.clearFocus();
        this.r.clearFocus();
        this.r.setImeVisibility(false);
        this.a0 = false;
    }

    public void d() {
        if (!TextUtils.isEmpty(this.r.getText())) {
            this.r.setText("");
            this.r.requestFocus();
            this.r.setImeVisibility(true);
        } else if (this.R) {
            l lVar = this.N;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                b(true);
            }
        }
    }

    public void e() {
        b(false);
        this.r.requestFocus();
        this.r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void f() {
        Editable text = this.r.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.M;
            if (mVar == null || !mVar.b(text.toString())) {
                if (this.h0 != null) {
                    a(0, null, text.toString());
                }
                this.r.setImeVisibility(false);
                this.r.dismissDropDown();
            }
        }
    }

    public final void g() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.r.getText());
        int i2 = 0;
        if (!z3 && (!this.R || this.f0)) {
            z2 = false;
        }
        ImageView imageView = this.x;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.x.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public int getImeOptions() {
        return this.r.getImeOptions();
    }

    public int getInputType() {
        return this.r.getInputType();
    }

    public int getMaxWidth() {
        return this.b0;
    }

    public CharSequence getQuery() {
        return this.r.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.h0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.L : getContext().getText(this.h0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.I;
    }

    public int getSuggestionRowLayout() {
        return this.H;
    }

    public d.h.a.a getSuggestionsAdapter() {
        return this.T;
    }

    public void h() {
        int[] iArr = this.r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.t.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.u.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void i() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.r;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.R && this.G != null) {
            double textSize = (double) this.r.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i2 = (int) (textSize * 1.25d);
            this.G.setBounds(0, 0, i2, i2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.G), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void j() {
        int i2 = 0;
        if (!((this.U || this.c0) && !this.S) || !(this.w.getVisibility() == 0 || this.y.getVisibility() == 0)) {
            i2 = 8;
        }
        this.u.setVisibility(i2);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.j0);
        post(this.k0);
        super.onDetachedFromWindow();
    }

    @Override // d.b.o.f0
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.r;
            Rect rect = this.B;
            searchAutoComplete.getLocationInWindow(this.D);
            getLocationInWindow(this.E);
            int[] iArr = this.D;
            int i6 = iArr[1];
            int[] iArr2 = this.E;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.C;
            Rect rect3 = this.B;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.A;
            if (pVar == null) {
                p pVar2 = new p(this.C, this.B, this.r);
                this.A = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.C, this.B);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    @Override // d.b.o.f0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.S
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.b0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.b0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.b0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f3403c);
        b(oVar.f2334e);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f2334e = this.S;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.j0);
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.a0 || !isFocusable()) {
            return false;
        }
        if (this.S) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.r.requestFocus(i2, rect);
        if (requestFocus) {
            b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.i0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            d();
        } else {
            e();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.R != z2) {
            this.R = z2;
            b(z2);
            i();
        }
    }

    public void setImeOptions(int i2) {
        this.r.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.r.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.b0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.N = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.M = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.Q = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.P = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.V = charSequence;
        i();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.W = z2;
        d.h.a.a aVar = this.T;
        if (aVar instanceof n0) {
            ((n0) aVar).t = z2 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.U = z2;
        b(this.S);
    }

    public void setSuggestionsAdapter(d.h.a.a aVar) {
        this.T = aVar;
        this.r.setAdapter(aVar);
    }

    public boolean b(int i2) {
        int i3;
        String a2;
        n nVar = this.P;
        if (nVar != null && nVar.b(i2)) {
            return false;
        }
        Cursor cursor = this.T.f3395e;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                String a3 = n0.a(cursor, "suggest_intent_action");
                if (a3 == null) {
                    a3 = this.h0.getSuggestIntentAction();
                }
                if (a3 == null) {
                    a3 = "android.intent.action.SEARCH";
                }
                String a4 = n0.a(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (a4 == null) {
                    a4 = this.h0.getSuggestIntentData();
                }
                if (!(a4 == null || (a2 = n0.a(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    a4 = a4 + "/" + Uri.encode(a2);
                }
                intent = a(a3, a4 == null ? null : Uri.parse(a4), n0.a(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), n0.a(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.r.setImeVisibility(false);
        this.r.dismissDropDown();
        return true;
    }

    public boolean c(int i2) {
        CharSequence b2;
        n nVar = this.P;
        if (nVar != null && nVar.a(i2)) {
            return false;
        }
        Editable text = this.r.getText();
        Cursor cursor = this.T.f3395e;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i2) || (b2 = this.T.b(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(b2);
        return true;
    }

    public final void c(boolean z2) {
        int i2 = 8;
        if (this.c0 && !this.S && z2) {
            this.w.setVisibility(8);
            i2 = 0;
        }
        this.y.setVisibility(i2);
    }
}
