package com.example.pizzalab6.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzalab6.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_splash);

        Thread n = new Thread(() -> {
            try {
                Thread.sleep(2500);
            } catch (InterruptedException ignored) {}
            startActivity(new Intent(SplashActivity.this, ListPizzaActivity.class));
            finish();
        });
        n.start();
    }
}