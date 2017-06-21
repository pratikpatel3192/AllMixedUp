package com.example.pratik.allmixedup;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by prati on 07-06-2017.
 */

public class LoginActivity extends Base{

    Button Login_bth;
    TextView forgotPassword,CreateAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("Login");

        CreateAccount= (TextView) findViewById(R.id.Create_account_login);
        forgotPassword= (TextView) findViewById(R.id.forgot_pass);
        Login_bth= (Button) findViewById(R.id.loginbtn);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(LoginActivity.this,CreateAccountActivity.class);
                startActivity(i);
            }
        });

        CreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(LoginActivity.this,CreateAccountActivity.class);
                startActivity(i);
            }
        });

        Login_bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LOGGED=true;



                Intent i=new Intent(LoginActivity.this,MainActivity.class);
                startActivity(i);
            }
        });



    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        super.onPrepareOptionsMenu(menu);
        MenuItem logout = menu.findItem(R.id.action_logout);
        MenuItem orderHistory = menu.findItem(R.id.action_order_history);
        MenuItem user = menu.findItem(R.id.action_user_detail);
        MenuItem login = menu.findItem(R.id.action_login);


        if (LOGGED==true) { //could be button state or..?

            login.setVisible(false);
            logout.setVisible(true);
            orderHistory.setVisible(true);
            user.setVisible(true);
        } else {
            login.setVisible(true);
            logout.setVisible(false);
            orderHistory.setVisible(false);
            user.setVisible(false);
        }
        return true;
    }
}
