package com.example.pratik.allmixedup;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.pratik.allmixedup.menuFragments.Menu;
import com.example.pratik.allmixedup.menuFragments.Specials;

import java.util.ArrayList;


//Extending FragmentStatePagerAdapter
public class Pager extends FragmentPagerAdapter {

    ArrayList<Fragment> page = new ArrayList<>();



    //Constructor to the class
    public Pager(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        return page.get(position);
    }
    public void addpage(Fragment f)
    {
        page.add(f);
    }

    @Override
    public int getCount() {
        return page.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return page.get(position).toString();
    }
}