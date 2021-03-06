package com.example.yoga;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private int tabNumber;
    public PagerAdapter(@NonNull FragmentManager fm, int behavior,int tabs) {
        super(fm, behavior);
        this.tabNumber=tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new FragmentYoga();
            case 1:
                return new FragmentMediate();
            case 2:
                return new FragmentCourse();
            case 3:
                return new FragmentQuestion();
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}
