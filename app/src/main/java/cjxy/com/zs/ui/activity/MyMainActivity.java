package cjxy.com.zs.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cjxy.com.zs.R;
import cjxy.com.zs.ui.adapter.MyPageAdapter;
import cjxy.com.zs.ui.fragment.AtlasFragment;
import cjxy.com.zs.ui.fragment.CampusFragment;
import cjxy.com.zs.ui.fragment.HomeFragment;
import cjxy.com.zs.ui.fragment.MoreFragment;

public class MyMainActivity extends FragmentActivity {
    private RadioGroup mRadioGroup;
    private RadioButton[] mRadioButtons;
    private ViewPager mViewPager;
    private List<Fragment> fragmentList;
    private AtlasFragment atlasFragment;
    private CampusFragment campusFragment;
    private HomeFragment homeFragment;
    private MoreFragment moreFragment;
    private MyPageAdapter pageAdapter;

    public MyMainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);
        initView();
        Toast.makeText(getApplicationContext(), Build.MODEL + Build.ID, Toast.LENGTH_SHORT).show();
    }

    private void initView() {
        mRadioGroup = (RadioGroup) findViewById(R.id.my_main_radio);
        mViewPager = (ViewPager) findViewById(R.id.my_main_viewpager);
        mRadioButtons = new RadioButton[4];
        mRadioButtons[0] = (RadioButton) findViewById(R.id.my_main_radio_home);
        mRadioButtons[1] = (RadioButton) findViewById(R.id.my_main_radio_mention);
        mRadioButtons[2] = (RadioButton) findViewById(R.id.my_main_radio_person_info);
        mRadioButtons[3] = (RadioButton) findViewById(R.id.my_main_radio_more);

        atlasFragment = new AtlasFragment();
        campusFragment = new CampusFragment();
        homeFragment = new HomeFragment();
        moreFragment = new MoreFragment();
        fragmentList = new ArrayList<>();

        fragmentList.add(homeFragment);
        fragmentList.add(atlasFragment);
        fragmentList.add(campusFragment);
        fragmentList.add(moreFragment);
        pageAdapter = new MyPageAdapter(getSupportFragmentManager(), fragmentList);
        mViewPager.setAdapter(pageAdapter);
        mViewPager.setOnPageChangeListener(pageChangeListener);
        mRadioGroup.setOnCheckedChangeListener(checkedChangeListener);
    }

    ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            mRadioButtons[position].setChecked(true);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
    RadioGroup.OnCheckedChangeListener checkedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            redioButton();
        }
    };

    private void redioButton() {

        for (int i = 0; i < mRadioButtons.length; i++) {
            if (mRadioButtons[i].isChecked()) {
                mViewPager.setCurrentItem(i);
            }
        }
    }
}
