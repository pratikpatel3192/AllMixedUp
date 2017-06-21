package com.example.pratik.allmixedup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by prati on 07-06-2017.
 */

public class LoginActivity extends Base{

    Button create_account;
    TextView forgotPassword,CreateAccount;
    boolean loggin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");

        CreateAccount= (TextView) findViewById(R.id.Create_account_login);
        forgotPassword= (TextView) findViewById(R.id.forgot_pass);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loggin=true;
                Intent i=new Intent(LoginActivity.this,CreateAccountActivity.class);
                startActivity(i);
            }
        });

        CreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loggin=true;
                Intent i=new Intent(LoginActivity.this,CreateAccountActivity.class);
                startActivity(i);
            }
        });


    }

}
