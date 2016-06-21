package cjxy.com.zs.xy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import cjxy.com.zs.MainActivity;
import cjxy.com.zs.R;


public class Two1 extends Activity {
    private WebView webview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two1);
        webview = (WebView) findViewById(R.id.webView3);
        //设置WebView属性，能够执行Javascript脚本
        webview.getSettings().setJavaScriptEnabled(true);
        //加载需要显示的网页
        webview.loadUrl("file:///android_asset/xy/ms.html");
        //设置Web视图
        webview.setWebViewClient(new HelloWebViewClient());
    }

    //Web视图
    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
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