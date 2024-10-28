package com.example.rossmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
        public void goHome(View view){
            Intent intent = new Intent(about.this, MainActivity.class);
            startActivity(intent);
//            finish();
        }

}