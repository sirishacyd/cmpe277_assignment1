package com.example.cmpe277_assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.cmpe277_assignment1.MainActivity;

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Log.e("onCreate ------ ", "AnotherActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ", "AnotherActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResuming","AnotherActivity Cycle: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPausing", "AnotherActivity Cycle: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStopping", "AnotherActivity Cycle: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroying", "AnotherActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        MainActivity.cntRestart++;
        super.onRestart();
        Log.e("onRestart ------ ", "AnotherActivity: onRestart()");

    }

    public void close(View view){
        onDestroy();
        onBackPressed();
    }
}