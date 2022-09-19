package com.example.a17416255201107_covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

    }

    public void Test(View view) {
        Intent rapid = new Intent(getApplicationContext(), RapidActivity.class);
        startActivity(rapid);
        finish();
    }

    public void Tentang(View view) {
        Intent Main3Activity = new Intent(getApplicationContext(), TentangActivity.class);
        startActivity(Main3Activity);
        finish();
    }
}
