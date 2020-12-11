package com.example.baitaplon_baiso3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAccountActivity extends AppCompatActivity {

    private Button btncreate137;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btncreate137 = (Button) findViewById(R.id.create);
        btncreate137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateAccountActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}