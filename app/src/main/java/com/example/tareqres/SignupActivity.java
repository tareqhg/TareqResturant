package com.example.tareqres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signupAndGoHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    public void goToLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}