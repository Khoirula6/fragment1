package com.example.fragment1;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterHome extends FragmentPagerAdapter {
    private List<Fragment> fragmentsList;
    private List<String> titleList;

    public AdapterHome(FragmentManager fm) {
        super(fm);
        fragmentsList = new ArrayList<>();
        titleList = new ArrayList<>();
    }

    public void addItem(Fragment fragment, String title) {
        fragmentsList.add(fragment);
        titleList.add(title);

        notifyDataSetChanged();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentsList.size();
    }
}
