package com.example.daniel.w6d3_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doFragment(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuFragmentsActivity.class);
        startActivity(intent);
    }

    public void doShareAction(View view) {
        Intent intent = new Intent(getApplicationContext(), ShareActionProviderActivity.class);
        startActivity(intent);
    }

    public void doArrays(View view) {
        Intent intent = new Intent(getApplicationContext(), SparseMapArrayActivity.class);
        startActivity(intent);
    }
}
