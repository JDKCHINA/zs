package cjxy.com.zs;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Second extends Activity {
    private WebView webview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
        initView();

    }

    private void initView() {
        webview = (WebView) findViewById(R.id.webView2);
        //设置WebView属性，能够执行Javascript脚本
        webview.getSettings().setJavaScriptEnabled(true);
        //加载需要显示的网页
        webview.loadUrl("http://news.cjxy.edu.cn/article/list_39.html");
        //设置Web视图
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                webview.loadUrl(url);
                return true;
            }

            @Override
            public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {

                return super.shouldOverrideKeyEvent(view, event);
            }
        });
    }

    @Override
    public void finish() {
        if (webview.canGoBack()) {
            webview.goBack();
        } else {
            super.finish();
        }

    }
}