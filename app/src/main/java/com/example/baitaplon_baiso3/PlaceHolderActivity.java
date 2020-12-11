package com.example.baitaplon_baiso3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PlaceHolderActivity extends AppCompatActivity {
    private ImageView rollback137;
    private Button rollbackmain137;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_holder);
        rollback137 = (ImageView) findViewById(R.id.rollback3);
        rollback137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceHolderActivity.this, OptionMenuActivity.class);
                startActivity(intent);
            }
        });
        rollbackmain137 = (Button) findViewById(R.id.backtomain);
        rollbackmain137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaceHolderActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}