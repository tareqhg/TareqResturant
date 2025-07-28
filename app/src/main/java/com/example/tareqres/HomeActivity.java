package com.example.tareqres;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.tareqres.LoginActivity;
import com.example.tareqres.MealDetailsActivity;
import com.example.tareqres.R;
import com.example.tareqres.SettingsActivity;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home);
//
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
//    }

//        drawerLayout = findViewById(R.id.drawerLayout);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        toolbar.setNavigationOnClickListener(v -> drawerLayout.open());
//
//        NavigationView nav = findViewById(R.id.navigationView);
//        nav.setNavigationItemSelectedListener(item -> {
//            int id = item.getItemId();
//            if (id == R.id.nav_profile || id == R.id.nav_settings) {
//                startActivity(new Intent(this, SettingsActivity.class));
//            } else if (id == R.id.nav_logout) {
//                Intent i = new Intent(this, LoginActivity.class);
//                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                startActivity(i);
//            }
//            drawerLayout.close();
//            return true;
//        });
//    }

        // عند الضغط على أي وجبة



    public void openMealDetails(View view) {
        String data = (String) view.getTag();
        String[] parts = data.split("\\|");

        Intent i = new Intent(this, MealDetailsActivity.class);
        i.putExtra("name", parts[0]);
        i.putExtra("desc", parts[1]);

        // تحويل اسم الصورة ل resource id
        int imgId = getResources().getIdentifier(parts[2], "drawable", getPackageName());
        i.putExtra("image", imgId);

        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ImageView menuIcon = findViewById(R.id.imgMenu);
        menuIcon.setOnClickListener(v -> showCustomMenu(v));
    }

    private void showCustomMenu(View anchor) {
        PopupMenu popup = new PopupMenu(this, anchor);
        popup.getMenu().add("البروفايل");
        popup.getMenu().add("الإعدادات");
        popup.getMenu().add("تسجيل الخروج");

        // تغيير ألوان النص والخلفية
        popup.setOnMenuItemClickListener(item -> {
            String title = item.getTitle().toString();
            if (title.equals("البروفايل")) {
                startActivity(new Intent(this, ProfileActivity.class));
            } else if (title.equals("الإعدادات")) {
                // لاحقاً
            } else if (title.equals("تسجيل الخروج")) {
                Intent i = new Intent(this, LoginActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }
            return true;
        });

        popup.show();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.home_menu, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        if (id == R.id.menu_profile) {
//            startActivity(new Intent(this, ProfileActivity.class));
//            return true;
//        } else if (id == R.id.menu_settings) {
//            // حالياً لا شيء
//            return true;
//        } else if (id == R.id.menu_logout) {
//            // تسجيل الخروج: نرجع المستخدم لشاشة تسجيل الدخول
//            Intent i = new Intent(this, LoginActivity.class);
//            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//            startActivity(i);
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}