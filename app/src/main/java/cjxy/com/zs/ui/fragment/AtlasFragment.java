package cjxy.com.zs.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import cjxy.com.zs.R;
import cjxy.com.zs.xq.Dxq;
import cjxy.com.zs.xq.Lxq;
import cjxy.com.zs.xq.Xxq;

/**
 * 地图页面
 * Created by yuan-pc on 2016/06/21.
 */
public class AtlasFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mention_activity, null);
        initView();

        return view;
    }

    private void initView() {
        TabHost tabHost = new TabHost(getActivity());
        // no need to call TabHost.Setup()

        //First Tab
        TabHost.TabSpec spec1 = tabHost.newTabSpec("Tab 1");
        spec1.setIndicator("Tab 1", getResources().getDrawable(R.drawable.arrow));
        Intent in1 = new Intent(getActivity(), Lxq.class);
        spec1.setContent(in1);

        TabHost.TabSpec spec2 = tabHost.newTabSpec("Tab 2");
        spec2.setIndicator("Tab 2", getResources().getDrawable(R.drawable.arrow));
        Intent in2 = new Intent(getActivity(), Dxq.class);
        spec2.setContent(in2);

        TabHost.TabSpec spec3 = tabHost.newTabSpec("Tab 3");
        spec3.setIndicator("Tab 3", getResources().getDrawable(R.drawable.arrow));
        Intent in3 = new Intent(getActivity(), Xxq.class);
        spec3.setContent(in3);

        tabHost.addTab(spec1);
        tabHost.addTab(spec2);
        tabHost.addTab(spec3);
    }
}
