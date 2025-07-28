package com.example.tareqres;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void changePassword(View view) {
        Toast.makeText(this, "ميزة تغيير كلمة المرور لاحقاً", Toast.LENGTH_SHORT).show();
    }

    public void aboutApp(View view) {
        Toast.makeText(this, "تطبيق مطعمي - نسخة بسيطة للتعلم", Toast.LENGTH_SHORT).show();
    }
}