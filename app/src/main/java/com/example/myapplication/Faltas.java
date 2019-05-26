package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Faltas extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faltas);

        TextInputLayout text1 = (TextInputLayout) findViewById(R.id.textInputLayout1);
        TextInputLayout text2 = (TextInputLayout) findViewById(R.id.textInputLayout2);
        Button button = (Button) findViewById(R.id.button);

        if(tipoUsuario){
            text1.setVisibility(View.GONE);
            text2.setVisibility(View.GONE);

            // Capture button click
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent faltas_add = new Intent(getApplicationContext(), Faltas_Add.class);
                    startActivity(faltas_add);
                }
            });

        }






    }
}
