package com.joshi.activity09052017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_app);
    }

    public void nextActivity(View view){
        Intent intent = new Intent(this, Activity2.class);
                startActivity(intent);

    }
}
