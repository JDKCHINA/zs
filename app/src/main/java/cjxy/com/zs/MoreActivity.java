package cjxy.com.zs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

import cjxy.com.zs.utils.DensityUtil;


public class MoreActivity extends Activity {
    ViewFlipper mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more_activity);
        mView = (ViewFlipper) findViewById(R.id.more_my_viewflipper);
        View view1 = new View(getApplication());
        View view2 = new View(getApplication());
        View view3 = new View(getApplication());
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        view1.setLayoutParams(params);
        view2.setLayoutParams(params);
        view3.setLayoutParams(params);
        view1.setBackgroundResource(R.mipmap.welcome2);
        view2.setBackgroundResource(R.mipmap.welcome3);
        view3.setBackgroundResource(R.mipmap.welcome4);
        mView.addView(view1);
        mView.addView(view2);
        mView.addView(view3);
        mView.setFlipInterval(2000);
        mView.startFlipping();
    }
}