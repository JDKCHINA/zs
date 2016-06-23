package cjxy.com.zs.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import cjxy.com.zs.One;
import cjxy.com.zs.R;
import cjxy.com.zs.Second;
import cjxy.com.zs.home.DD8;
import cjxy.com.zs.home.Five;
import cjxy.com.zs.home.Four;
import cjxy.com.zs.home.Nina;
import cjxy.com.zs.home.Seven;
import cjxy.com.zs.home.Six;
import cjxy.com.zs.home.Three;

/**
 * 主页面内容
 * Created by yuan-pc on 2016/06/21.
 */
public class HomeFragment extends Fragment {
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_activity, null);
        webView = (WebView) view.findViewById(R.id.webView10);
        //设置WebView属性，能够执行Javascript脚本
        webView.getSettings().setJavaScriptEnabled(true);
        //加载需要显示的网页
        webView.loadUrl("file:///android_asset/dtt/demo.html");
        //设置Web视图
        webView.setWebViewClient(new HelloWebViewClient());

        ImageButton goSecondActivityButton = (ImageButton) view.findViewById(R.id.imageButton3);
        ImageButton goOneActivityButton = (ImageButton) view.findViewById(R.id.imageButton1);
        ImageButton goThreeActivityButton = (ImageButton) view.findViewById(R.id.imageButton2);
        ImageButton goFourActivityButton = (ImageButton) view.findViewById(R.id.imageButton4);
        ImageButton gofiveActivityButton = (ImageButton) view.findViewById(R.id.imageButton5);
        ImageButton gosixActivityButton = (ImageButton) view.findViewById(R.id.imageButton6);
        ImageButton gosevenActivityButton = (ImageButton) view.findViewById(R.id.imageButton7);
        ImageButton goeightActivityButton = (ImageButton) view.findViewById(R.id.imageButton8);
        ImageButton gonineActivityButton = (ImageButton) view.findViewById(R.id.imageButton9);

        goSecondActivityButton.setOnClickListener(onClickListener);
        goOneActivityButton.setOnClickListener(onClickListener);
        goThreeActivityButton.setOnClickListener(onClickListener);
        goFourActivityButton.setOnClickListener(onClickListener);
        gofiveActivityButton.setOnClickListener(onClickListener);
        gosixActivityButton.setOnClickListener(onClickListener);
        gosevenActivityButton.setOnClickListener(onClickListener);
        goeightActivityButton.setOnClickListener(onClickListener);
        gonineActivityButton.setOnClickListener(onClickListener);
        return view;
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()) {
                case R.id.imageButton3:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Second.class);
                    break;
                case R.id.imageButton1:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), One.class);
                    break;
                case R.id.imageButton2:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Three.class);

                    break;
                case R.id.imageButton4:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Four.class);

                    break;
                case R.id.imageButton5:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Five.class);

                    break;
                case R.id.imageButton6:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Six.class);

                    break;
                case R.id.imageButton7:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Seven.class);

                    break;
                case R.id.imageButton8:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), DD8.class);

                    break;
                case R.id.imageButton9:
                    //新建一个Intent(当前Activity, SecondActivity)=====显示Intent
                    intent = new Intent(getActivity(), Nina.class);

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
