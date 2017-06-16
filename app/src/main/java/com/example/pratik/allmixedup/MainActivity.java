package com.example.pratik.allmixedup;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.Toast;

import  com.example.pratik.allmixedup.menuFragments.Menu;
import com.example.pratik.allmixedup.menuFragments.*;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    Context context;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");



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
        adapter.addpage(new Menu());
        adapter.addpage(new Specials());

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



    public boolean onCreateOptionsMenu(android.view.Menu menu)
    {
        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_about_us:
                Intent i=new Intent(this,AboutUsActivity.class);
                startActivity(i);
                Toast.makeText(this,"ABOUT US",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_faq:
                Toast.makeText(this,"FAQ",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_cart:
                Toast.makeText(this,"CART",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_contact_us:
                Intent i3=new Intent(this,ContactUs.class);
                startActivity(i3);
                Toast.makeText(this,"CONTACT US",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_login:
                Intent i4=new Intent(this,LoginActivity.class);
                startActivity(i4);
                Toast.makeText(this,"CONTACT US",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_location:
                Intent i5=new Intent(this,LocationActivity.class);
                startActivity(i5);
                Toast.makeText(this,"LOCATION",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}

