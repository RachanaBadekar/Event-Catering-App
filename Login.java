package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onclicklogin(View view) {
        Intent myIntent=new Intent(view.getContext(),CatererStaffHomeScreen.class);
        startActivity(myIntent);
        Toast.makeText(this, "Login Sucessfull", Toast.LENGTH_SHORT).show();
    }

    public void onclickForgot(View view) {
        Intent myIntent=new Intent(view.getContext(),ForgotPassword.class);
        startActivity(myIntent);
    }

    public void onclickCreate(View view) {
        Intent myIntent = new Intent(view.getContext(),CreateNewAccount.class);
        startActivity(myIntent);
    }
}
