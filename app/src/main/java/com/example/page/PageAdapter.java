package com.example.page;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {

    public  PageAdapter(FragmentManager manager){
        super(manager);
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0) return new FirstFragment();
        else if(position==1) return new SecondFragment();
        else return new ThirdFragment();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "页面"+position;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
