package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.i("phx", "A2 - Se ejecuta onCreate()");
    }

    // alt + insert -> override methods || ctrl + o
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("phx", "A2 - Se ejecuta onStart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("phx", "A2 - Se ejecuta onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("phx", "A2 - Se ejecuta onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("phx", "A2 - Se ejecuta onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("phx", "A2 - Se ejecuta onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("phx", "A2 - Se ejecuta onRestart()");
    }
}