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

    }
}
