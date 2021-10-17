package com.example.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // la consola aqui es el log, habilitar Logcat
        Log.i("phx", "A1 - se esta ejecuta onCreate()"); // .i(patron de reconocimiento, mensaje)
        // se puede filtrar nuestro mensaje con el tag de reconocimiento
    }

    // alt + insert -> override methods || ctrl + o
     @Override
    protected void onStart() {
        super.onStart();
        Log.i("phx", "A1 - Se ejecuta onStart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("phx", "A1 - Se ejecuta onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("phx", "A1 - Se ejecuta onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("phx", "A1 - Se ejecuta onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("phx", "A1 - Se ejecuta onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("phx", "A1 - Se ejecuta onRestart()");
    }

    public void ocInvocarA2(View view){
        // con Intent invocamos una nueva activity
        Intent invocar = new Intent(this, MainActivity2.class); // (quien invoca, a quien invoca)
        startActivity(invocar); // inicia el Intent
    }
}