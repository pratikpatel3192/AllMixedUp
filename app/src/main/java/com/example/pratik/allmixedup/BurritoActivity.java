package com.example.pratik.allmixedup;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;

import com.example.pratik.allmixedup.Toppings.Dressings;
import com.example.pratik.allmixedup.Toppings.Greens;
import com.example.pratik.allmixedup.Toppings.Toppings;
import com.example.pratik.allmixedup.Toppings.Tortilla;

/**
 * Created by prati on 06-06-2017.
 */

public class BurritoActivity extends Base{
    private TabLayout tabLayout;
    Context context;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Burrito");


        /// s= (Button) findViewById(R.id.salad);
        //Adding toolbar to the activity
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initializing the tablayout
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Initializing viewPager
        viewPager = (ViewPager) findViewById(R.id.pager);
        Pager adapter = new Pager(getSupportFragmentManager());
        adapter.addpage(new Tortilla());
        adapter.addpage(new Toppings());
        adapter.addpage(new Dressings());

        //Creating our pager adapter

        //Adding adapter to pager
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Adding onTabSelectedListener to swipe views
        tabLayout.setOnTabSelectedListener(listener(viewPager));





    }

    private TabLayout.OnTabSelectedListener listener(final ViewPager vp)
    {

        return new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }

    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.main, menu);

        return true;
    }


}
