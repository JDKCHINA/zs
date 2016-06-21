package cjxy.com.zs.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import cjxy.com.zs.R;
import cjxy.com.zs.xy.Five1;
import cjxy.com.zs.xy.Four1;
import cjxy.com.zs.xy.One1;
import cjxy.com.zs.xy.Three1;
import cjxy.com.zs.xy.Two1;

/**
 * 校园页面
 * Created by yuan-pc on 2016/06/21.
 */
public class CampusFragment extends Fragment {
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.personalinfo_activity, null);
        initView(view);

        return view;
    }

    private void initView(View view) {
        webView = (WebView) view.findViewById(R.id.webView1);
        //设置WebView属性，能够执行Javascript脚本
        webView.getSettings().setJavaScriptEnabled(true);
        //加载需要显示的网页
        webView.loadUrl("file:///android_asset/page3/demo.html");
        //设置Web视图
        webView.setWebViewClient(new HelloWebViewClient());
        Button goSecondActivityButton = (Button) view.findViewById(R.id.button3);
        Button goOneActivityButton = (Button) view.findViewById(R.id.button1);
        Button goThreeActivityButton = (Button) view.findViewById(R.id.button2);
        Button goFourActivityButton = (Button) view.findViewById(R.id.button4);
        Button gofiveActivityButton = (Button) view.findViewById(R.id.button5);
        goSecondActivityButton.setOnClickListener(clickListener);
        goOneActivityButton.setOnClickListener(clickListener);
        goThreeActivityButton.setOnClickListener(clickListener);
        goFourActivityButton.setOnClickListener(clickListener);
        gofiveActivityButton.setOnClickListener(clickListener);
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        Intent intent = new Intent();

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button3:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Two1.class);
                    break;
                case R.id.button1:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), One1.class);
                    break;
                case R.id.button2:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Three1.class);
                    break;
                case R.id.button4:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Four1.class);
                    break;
                case R.id.button5:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Five1.class);
                    break;
            }
            if (intent != null) {
               getActivity().startActivity(intent);
            }
        }
    };

    private class HelloWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
