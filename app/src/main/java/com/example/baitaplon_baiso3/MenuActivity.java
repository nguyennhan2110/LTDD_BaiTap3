package com.example.baitaplon_baiso3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {

    private ImageView rollback137;
    private ImageView customMenu137;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        rollback137 = (ImageView) findViewById(R.id.rollback);
        rollback137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        customMenu137 = (ImageView) findViewById(R.id.capp);
        customMenu137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, OptionMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}