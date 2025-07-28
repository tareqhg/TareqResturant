package com.example.tareqres;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MealDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_details);

        Toolbar toolbar = findViewById(R.id.detailToolbar);
        setSupportActionBar(toolbar);

        // إظهار سهم الرجوع
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        // استقبل الاسم فقط
        String mealName = getIntent().getStringExtra("name");

        String name = getIntent().getStringExtra("name");
        String desc = getIntent().getStringExtra("desc");
        int imgId = getIntent().getIntExtra("image", R.drawable.logo);

        ((TextView) findViewById(R.id.txtDetailName)).setText(name);
        ((TextView) findViewById(R.id.txtDetailDesc)).setText(desc);
        ((ImageView) findViewById(R.id.imgDetail)).setImageResource(imgId);




    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // رجوع للشاشة السابقة
            return true;
        }
        return super.onOptionsItemSelected(item);

    }
}