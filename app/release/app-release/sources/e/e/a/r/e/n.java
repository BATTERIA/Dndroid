package e.e.a.r.e;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.g.l.p;
import e.c.a.b.l;
import e.e.a.q.a.h;
import e.e.a.q.a.j;
import e.e.a.r.d.a;
import e.e.a.t.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class n extends FrameLayout implements a.AbstractC0137a {

    /* renamed from: c  reason: collision with root package name */
    public List<e.e.a.r.b.a> f4519c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public View f4520d;

    /* renamed from: e  reason: collision with root package name */
    public View f4521e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f4522f;

    /* renamed from: g  reason: collision with root package name */
    public ViewGroup f4523g;

    /* renamed from: h  reason: collision with root package name */
    public ScrollView f4524h;
    public TextView i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public e.e.a.p.b o;
    public e.e.a.r.a p;
    public int q;
    public RecyclerView.e<RecyclerView.a0> r = new a();

    public class b extends RecyclerView.a0 {
        public TextView t;

        public b(View view) {
            super(view);
            view.setMinimumWidth(l.f.b(view.getContext()) - l.f.a(view.getContext(), 24.0f));
            this.t = (TextView) view.findViewById(e.e.a.t.b.tv_debug_console);
            view.setOnLongClickListener(new c(this));
        }

        public /* synthetic */ boolean a(View view) {
            n.a(n.this, this.t.getContext(), this.t.getText().toString());
            Toast.makeText(this.t.getContext(), "内容已复制", 0).show();
            return true;
        }
    }

    public n(Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(c.hummer_debug_container, this);
        p.a((View) this, 9.0f);
        this.f4520d = findViewById(e.e.a.t.b.layout_console);
        View findViewById = findViewById(e.e.a.t.b.btn_clear_log);
        this.f4521e = findViewById;
        findViewById.setOnClickListener(new h(this));
        RecyclerView recyclerView = (RecyclerView) findViewById(e.e.a.t.b.rv_console);
        this.f4522f = recyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.f4522f.setAdapter(this.r);
        this.f4523g = (ViewGroup) findViewById(e.e.a.t.b.layout_info);
        this.f4524h = (ScrollView) findViewById(e.e.a.t.b.layout_info_v);
        TextView textView = (TextView) findViewById(e.e.a.t.b.tv_info);
        this.i = textView;
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        this.i.setOnLongClickListener(new j(this));
        View findViewById2 = findViewById(e.e.a.t.b.tab_console);
        this.j = findViewById2;
        findViewById2.setSelected(true);
        this.j.setOnClickListener(new f(this));
        View findViewById3 = findViewById(e.e.a.t.b.tab_params);
        this.k = findViewById3;
        findViewById3.setOnClickListener(new k(this));
        View findViewById4 = findViewById(e.e.a.t.b.tab_comp_tree);
        this.l = findViewById4;
        findViewById4.setOnClickListener(new a(this));
        View findViewById5 = findViewById(e.e.a.t.b.tab_call_stack);
        this.m = findViewById5;
        findViewById5.setOnClickListener(new e(this));
        View findViewById6 = findViewById(e.e.a.t.b.tab_performance);
        this.n = findViewById6;
        findViewById6.setOnClickListener(new d(this));
    }

    public static /* synthetic */ void a(n nVar, Context context, String str) {
        if (nVar != null) {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("Label", str));
                return;
            }
            return;
        }
        throw null;
    }

    public /* synthetic */ void a() {
        this.f4524h.fullScroll(130);
    }

    @Override // e.e.a.r.d.a.AbstractC0137a
    public void a(e.e.a.r.b.a aVar) {
        post(new b(this, aVar));
    }

    public /* synthetic */ void b() {
        this.f4524h.fullScroll(130);
    }

    public /* synthetic */ boolean b(View view) {
        Context context = this.i.getContext();
        String charSequence = this.i.getText().toString();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Label", charSequence));
        }
        Toast.makeText(this.i.getContext(), "内容已复制", 0).show();
        return true;
    }

    public final void c() {
        h a2 = h.a();
        long j2 = ((e.e.a.q.b.e.b) this.o.f4446g).f4488a;
        if (a2 != null) {
            String str = "";
            if (e.e.a.q.d.b.f4498a) {
                try {
                    j jVar = a2.f4461a.get(j2);
                    if (jVar != null) {
                        str = jVar.f4473f.f4459a;
                    }
                } catch (Exception e2) {
                    l.f.a("HummerDebug", "getCallStackTreeFormat, e = ", (Throwable) e2);
                }
            }
            this.i.setText(str);
            this.f4524h.post(new i(this));
            return;
        }
        throw null;
    }

    public /* synthetic */ void c(View view) {
        this.q = 0;
        this.f4523g.setVisibility(8);
        this.f4520d.setVisibility(0);
        this.j.setSelected(true);
        this.k.setSelected(false);
        this.l.setSelected(false);
        this.m.setSelected(false);
        this.n.setSelected(false);
    }

    public final void d() {
        h a2 = h.a();
        long j2 = ((e.e.a.q.b.e.b) this.o.f4446g).f4488a;
        if (a2 != null) {
            String str = "";
            if (e.e.a.q.d.b.f4498a) {
                try {
                    j jVar = a2.f4461a.get(j2);
                    if (jVar != null) {
                        str = jVar.f4472e.f4460a;
                    }
                } catch (Exception e2) {
                    l.f.a("HummerDebug", "getComponentTreeFormat, e = ", (Throwable) e2);
                }
            }
            this.i.setText(str);
            this.f4524h.post(new g(this));
            return;
        }
        throw null;
    }

    public /* synthetic */ void d(View view) {
        this.q = 1;
        this.f4523g.setVisibility(0);
        this.f4520d.setVisibility(8);
        this.j.setSelected(false);
        this.k.setSelected(true);
        this.l.setSelected(false);
        this.m.setSelected(false);
        this.n.setSelected(false);
        e();
    }

    public final void e() {
        StringBuilder sb = new StringBuilder();
        Object a2 = ((e.e.a.q.b.e.b) this.o.f4446g).a("JSON.stringify(Hummer.env)", "");
        if (a2 != null) {
            sb.append("Hummer.env: ");
            sb.append(l.f.a(String.valueOf(a2)));
            sb.append("\n\n\n");
        }
        Object a3 = ((e.e.a.q.b.e.b) this.o.f4446g).a("JSON.stringify(Hummer.pageInfo)", "");
        if (a3 != null) {
            sb.append("Hummer.pageInfo: ");
            sb.append(l.f.a(String.valueOf(a3)));
            sb.append("\n\n\n");
        }
        Object a4 = ((e.e.a.q.b.e.b) this.o.f4446g).a("JSON.stringify(Hummer.pageResult)", "");
        if (a4 != null) {
            sb.append("Hummer.pageResult: ");
            sb.append(l.f.a(String.valueOf(a4)));
            sb.append("\n\n\n");
        }
        e.e.a.r.a aVar = this.p;
        if (aVar != null) {
            aVar.a(sb);
        }
        this.i.setText(sb.toString());
    }

    public /* synthetic */ void e(View view) {
        this.q = 2;
        this.f4523g.setVisibility(0);
        this.f4520d.setVisibility(8);
        this.j.setSelected(false);
        this.k.setSelected(false);
        this.l.setSelected(true);
        this.m.setSelected(false);
        this.n.setSelected(false);
        d();
    }

    public final void f() {
        h a2 = h.a();
        long j2 = ((e.e.a.q.b.e.b) this.o.f4446g).f4488a;
        if (a2 != null) {
            String str = "";
            if (e.e.a.q.d.b.f4498a) {
                try {
                    j jVar = a2.f4461a.get(j2);
                    if (jVar != null) {
                        str = jVar.f4474g.f4476a;
                    }
                } catch (Exception e2) {
                    l.f.a("HummerDebug", "getPerformanceFormat, e = ", (Throwable) e2);
                }
            }
            this.i.setText(str);
            return;
        }
        throw null;
    }

    public /* synthetic */ void f(View view) {
        this.q = 3;
        this.f4523g.setVisibility(0);
        this.f4520d.setVisibility(8);
        this.j.setSelected(false);
        this.k.setSelected(false);
        this.l.setSelected(false);
        this.m.setSelected(true);
        this.n.setSelected(false);
        c();
    }

    public /* synthetic */ void g(View view) {
        this.q = 4;
        this.f4523g.setVisibility(0);
        this.f4520d.setVisibility(8);
        this.j.setSelected(false);
        this.k.setSelected(false);
        this.l.setSelected(false);
        this.m.setSelected(false);
        this.n.setSelected(true);
        f();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i2 = this.q;
        if (i2 == 1) {
            e();
        } else if (i2 == 2) {
            d();
        } else if (i2 == 3) {
            c();
        } else if (i2 == 4) {
            f();
        }
    }

    public void setData(List<e.e.a.r.b.a> list) {
        this.f4519c.addAll(list);
        this.r.f2461a.a();
        this.f4522f.d(list.size() - 1);
    }

    public class a extends RecyclerView.e<RecyclerView.a0> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int a() {
            return n.this.f4519c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public RecyclerView.a0 a(ViewGroup viewGroup, int i) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(c.hummer_debug_console_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void a(RecyclerView.a0 a0Var, int i) {
            TextView textView;
            int i2 = -16777216;
            switch (n.this.f4519c.get(i).f4501a) {
                case 1:
                case 2:
                case 3:
                default:
                    textView = ((b) a0Var).t;
                    break;
                case 4:
                    textView = ((b) a0Var).t;
                    i2 = -168640;
                    break;
                case 5:
                case 6:
                    textView = ((b) a0Var).t;
                    i2 = -65536;
                    break;
            }
            textView.setTextColor(i2);
            e.e.a.r.b.a aVar = n.this.f4519c.get(i);
            ((b) a0Var).t.setText(String.format("[%s] %s", new SimpleDateFormat("HH:mm:ss").format(Long.valueOf(aVar.f4502c)) + "." + (aVar.f4502c % 1000), aVar.b));
        }
    }

    public /* synthetic */ void a(View view) {
        this.f4519c.clear();
        this.r.f2461a.a();
    }

    public /* synthetic */ void b(e.e.a.r.b.a aVar) {
        this.f4519c.add(aVar);
        this.r.f2461a.a(this.f4519c.size() - 1, 1);
        this.f4522f.d(this.f4519c.size() - 1);
    }
}
