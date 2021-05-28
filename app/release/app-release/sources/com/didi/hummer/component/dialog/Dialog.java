package com.didi.hummer.component.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.annotation.JsProperty;
import com.didi.hummer.render.style.HummerLayout;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaJustify;
import e.e.a.o.f.b;
import e.e.a.o.f.c;
import e.e.a.q.b.a;
import e.e.a.y.a.b.j;

@Component
public class Dialog {
    @JsProperty
    public boolean cancelable = true;
    public Context context;
    public HummerLayout customContainer;
    public j customView;
    public AlertDialog dialog;

    public Dialog(Context context2) {
        this.context = context2;
    }

    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.a(new Object[0]);
        }
    }

    public static /* synthetic */ void b(a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.a(new Object[0]);
        }
    }

    public static /* synthetic */ void c(a aVar, DialogInterface dialogInterface, int i) {
        if (aVar != null) {
            aVar.a(new Object[0]);
        }
    }

    @JsMethod
    public void alert(String str, String str2, a aVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = this.context.getString(17039370);
        }
        AlertDialog show = new AlertDialog.Builder(this.context).setCancelable(this.cancelable).setMessage(str).setPositiveButton(str2, new b(aVar)).show();
        this.dialog = show;
        show.getButton(-1).setTextColor(-16777216);
    }

    @JsMethod
    public void confirm(String str, String str2, String str3, String str4, a aVar, a aVar2) {
        if (TextUtils.isEmpty(str3)) {
            str3 = this.context.getString(17039370);
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = this.context.getString(17039360);
        }
        AlertDialog show = new AlertDialog.Builder(this.context).setCancelable(this.cancelable).setTitle(str).setMessage(str2).setPositiveButton(str3, new c(aVar)).setNegativeButton(str4, new e.e.a.o.f.a(aVar2)).show();
        this.dialog = show;
        show.getButton(-1).setTextColor(-16777216);
        this.dialog.getButton(-2).setTextColor(-7829368);
    }

    @JsMethod
    public void custom(j jVar) {
        jVar.getJSValue().l();
        this.customView = jVar;
        HummerLayout hummerLayout = this.customContainer;
        if (hummerLayout == null) {
            HummerLayout hummerLayout2 = new HummerLayout(this.context);
            this.customContainer = hummerLayout2;
            hummerLayout2.getYogaNode().setJustifyContent(YogaJustify.CENTER);
            this.customContainer.getYogaNode().setAlignItems(YogaAlign.CENTER);
        } else {
            hummerLayout.removeAllViews();
        }
        this.customContainer.addView(jVar.getView());
        AlertDialog alertDialog = this.dialog;
        if (alertDialog == null) {
            this.dialog = new AlertDialog.Builder(this.context).setCancelable(this.cancelable).setView(this.customContainer).show();
        } else {
            alertDialog.show();
        }
        if (this.dialog.getWindow() != null) {
            this.dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = this.dialog.getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            this.dialog.getWindow().setAttributes(attributes);
        }
    }

    @JsMethod
    public void dismiss() {
        AlertDialog alertDialog = this.dialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        j jVar = this.customView;
        if (jVar != null) {
            jVar.getJSValue().k();
            this.customView = null;
        }
    }

    @JsMethod
    public void loading(String str) {
        View inflate = View.inflate(this.context, e.e.a.o.c.loading_dialog, null);
        ((TextView) inflate.findViewById(e.e.a.o.b.tv_msg)).setText(str);
        AlertDialog show = new AlertDialog.Builder(this.context).setCancelable(this.cancelable).setView(inflate).show();
        this.dialog = show;
        if (show.getWindow() != null) {
            this.dialog.getWindow().setBackgroundDrawable(null);
        }
    }
}
