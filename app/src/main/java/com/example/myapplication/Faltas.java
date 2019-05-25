package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Faltas extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faltas);
    }
}
