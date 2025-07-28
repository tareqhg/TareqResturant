package com.example.tareqres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToHome(View view) {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

    public void goToSignup(View view) {
        startActivity(new Intent(this, SignupActivity.class));
    }
}