package com.bilibili.bililive.batteria.webview;

import a.g;
import a.w.c.i;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bilibili.bililive.tests.R;
import d.b.k.h;

@g(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/bilibili/bililive/batteria/webview/WebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, mv = {1, 1, 16})
public final class WebViewActivity extends h {
    public WebView s;

    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f2607a;

        public a(TextView textView) {
            this.f2607a = textView;
        }

        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TextView textView = this.f2607a;
            i.a((Object) textView, "text");
            textView.setText("加载完成");
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            TextView textView = this.f2607a;
            i.a((Object) textView, "text");
            textView.setText("开始加载...");
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            TextView textView = this.f2607a;
            i.a((Object) textView, "text");
            textView.setText("发生错误");
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            TextView textView = this.f2607a;
            i.a((Object) textView, "text");
            textView.setText("处理https");
            if (sslErrorHandler != null) {
                sslErrorHandler.proceed();
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null) {
                return true;
            }
            if (str == null) {
                str = "";
            }
            webView.loadUrl(str);
            return true;
        }
    }

    public static final class b extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ProgressBar f2608a;
        public final /* synthetic */ TextView b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ImageView f2609c;

        public b(ProgressBar progressBar, TextView textView, ImageView imageView) {
            this.f2608a = progressBar;
            this.b = textView;
            this.f2609c = imageView;
        }

        public void onProgressChanged(WebView webView, int i) {
            ProgressBar progressBar = this.f2608a;
            i.a((Object) progressBar, "progressBar");
            progressBar.setProgress(i);
        }

        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            if (bitmap != null) {
                this.f2609c.setImageBitmap(bitmap);
            }
        }

        public void onReceivedTitle(WebView webView, String str) {
            if (str != null) {
                TextView textView = this.b;
                i.a((Object) textView, "titleView");
                textView.setText(str);
            }
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WebViewActivity f2610c;

        public c(WebViewActivity webViewActivity) {
            this.f2610c = webViewActivity;
        }

        public final void onClick(View view) {
            WebView webView = this.f2610c.s;
            if (webView != null) {
                webView.loadUrl("https://www.baidu.com");
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_webview);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress);
        TextView textView = (TextView) findViewById(R.id.title);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        this.s = (WebView) findViewById(R.id.web_view);
        TextView textView2 = (TextView) findViewById(R.id.text_view);
        WebView webView = this.s;
        if (webView != null) {
            webView.setWebViewClient(new a(textView2));
        }
        WebView webView2 = this.s;
        if (webView2 != null) {
            webView2.setWebChromeClient(new b(progressBar, textView, imageView));
        }
        ((Button) findViewById(R.id.button)).setOnClickListener(new c(this));
    }
}
