package com.example.pratik.allmixedup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by prati on 07-06-2017.
 */

public class LoginActivity extends AppCompatActivity{

    Button create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");

        /*create_account= (Button) findViewById(R.id.createaccountbtn);

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(LoginActivity.this,CreateAccountActivity.class);
                startActivity(i);
            }
        });*/
    }

}
