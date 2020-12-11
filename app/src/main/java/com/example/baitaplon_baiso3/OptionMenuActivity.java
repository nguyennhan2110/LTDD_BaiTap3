package com.example.baitaplon_baiso3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class OptionMenuActivity extends AppCompatActivity {

    private ImageView rollback137;
    private Button rollbackbtn137;
    private Button placeholder137;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);

        rollback137 = (ImageView) findViewById(R.id.rollback2);
        rollback137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionMenuActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
        rollbackbtn137 = (Button) findViewById(R.id.rollbackbtn);
        rollbackbtn137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionMenuActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });
        placeholder137 = (Button) findViewById(R.id.placeholderbtn);
        placeholder137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionMenuActivity.this, PlaceHolderActivity.class);
                startActivity(intent);
            }
        });
    }
}