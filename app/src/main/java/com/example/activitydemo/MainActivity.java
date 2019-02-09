package com.example.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Life Cycle:", "In onCreate()");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Life Cycle:", "In onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Life Cycle:", "In onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Life Cycle:", "In onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Life Cycle:", "In onStop()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Life Cycle:", "In onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Life Cycle:", "In onDestroy()");
    }
}
