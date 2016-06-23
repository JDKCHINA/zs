package cjxy.com.zs.xy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import cjxy.com.zs.MainActivity;
import cjxy.com.zs.R;
import android.net.*;

public class Five1 extends Activity {
    private WebView webview;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five1);
        webview = (WebView) findViewById(R.id.webView3);
        //设置WebView属性，能够执行Javascript脚本
        webview.getSettings().setJavaScriptEnabled(true);
        //加载需要显示的网页
        webview.loadUrl("file:///android_asset/txl.html");
        //设置Web视图
        webview.setWebViewClient(new HelloWebViewClient ());
    }

    @Override
    //设置回退
    //覆盖Activity类的onKeyDown(int keyCoder,KeyEvent event)方法
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {
            webview.goBack();
            //goBack()表示返回WebView的上一页面
            return true;
        }
        else
        {
            Intent myIntent = new Intent();
            myIntent = new Intent(Five1.this, MainActivity.class);
            startActivity(myIntent);
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    //Web视图
    private class HelloWebViewClient extends WebViewClient {
       
		@Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //也可截断 message://action?key=value&title=hello   从而隐士调用activity
            if (url != null && url.trim().startsWith("tel:")) {
                String phoneStr = url.replace("tel:", "");
                try {
                    //直接打电话
//                        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneStr)));

                    //拨号盘界面
                    String tel = phoneStr.replace("-", "");
                    startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + tel)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(view, url);
        }
		
		
		}
    
}
