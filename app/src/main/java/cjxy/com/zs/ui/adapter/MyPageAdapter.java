package cjxy.com.zs.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by yuan-pc on 2016/06/21.
 */
public class MyPageAdapter extends FragmentPagerAdapter {
    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public MyPageAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    List<Fragment> fragments;

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    public void setCurrentItem(int i) {


    }
}
