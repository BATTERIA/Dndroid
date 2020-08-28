package com.bilibili.bililive.tests.webview

import android.graphics.Bitmap
import android.net.http.SslError
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.*
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import com.bilibili.bililive.tests.R

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/1 7:01 PM
 * @description:
 */
class WebViewActivity : AppCompatActivity() {
    var webView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val progressBar = findViewById<ProgressBar>(R.id.progress)
        val titleView = findViewById<TextView>(R.id.title)
        val imageView = findViewById<ImageView>(R.id.image)
        webView = findViewById(R.id.web_view)
        val text = findViewById<TextView>(R.id.text_view)

        webView?.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }

            override fun onReceivedSslError(
                view: WebView?,
                handler: SslErrorHandler?,
                error: SslError?
            ) {
                text.text = "处理https"
                handler?.proceed()
                super.onReceivedSslError(view, handler, error)
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                text.text = "开始加载..."
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                text.text = "加载完成"
            }

            override fun onLoadResource(view: WebView?, url: String?) {
                super.onLoadResource(view, url)
//                    text.text = "加载资源"
            }

            override fun onReceivedError(
                view: WebView?,
                request: WebResourceRequest?,
                error: WebResourceError?
            ) {
                super.onReceivedError(view, request, error)
                text.text = "发生错误"
            }

        }

        webView?.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                progressBar.progress = newProgress
            }

            override fun onReceivedTitle(view: WebView?, title: String?) {
                title?.let { titleView.text = it }
            }

            override fun onReceivedIcon(view: WebView?, icon: Bitmap?) {
                icon?.let {
                    imageView.setImageBitmap(it)
                }
            }
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            webView?.loadUrl("https://www.baidu.com")
        }
    }

    companion object {
        private const val TAG = "WebViewActivity"
    }
}