package com.example.pratik.allmixedup;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by prati on 08-06-2017.
 */

public class Base extends AppCompatActivity {
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
                Toast.makeText(this,"LOGIN",Toast.LENGTH_SHORT).show();
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
