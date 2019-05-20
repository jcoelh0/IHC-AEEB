package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // variavel para objeto Switch seleciona tipo de usuario
    Switch usuarioSwitch = (Switch) findViewById(R.id.switch1);
    boolean tipoUsuario = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Your Message", Toast.LENGTH_LONG).show();

        // verifica o estado atual do Switch (true or false) e coloca na variavel 'tipoUsuario'
        // false = Aluno; true = Professor;
        usuarioSwitch = (Switch) findViewById(R.id.switch1);
        if(usuarioSwitch.isChecked())
            tipoUsuario = true;
        else
            tipoUsuario = false;

        TextView textElement = (TextView) findViewById(R.id.textView2);
        if(tipoUsuario==false)
            textElement.setText("Aluno: Ana Marisa");
        else
            textElement.setText("Professor: Carlos");


        Button anunciosBttn = findViewById(R.id.button5);
        anunciosBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent anuncios = new Intent(getApplicationContext(), Anuncios.class);
                startActivity(anuncios);
            }
        });

        Button attvExtraBttn = findViewById(R.id.button2);
        attvExtraBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent attvExtra = new Intent(getApplicationContext(), AtividadesExtracur.class);
                startActivity(attvExtra);
            }
        });

        /*Button  = findViewById(R.id.button5);
        .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent anuncios = new Intent(getApplicationContext(), Anuncios.class);
                startActivity(anuncios);
            }
        });*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        //Toast toast = Toast.makeText(this, "menu opened", Toast.LENGTH_LONG);
        //toast.show();

        return true;
    }

    public void launchAnuncios(View view) {
        //Log.d(LOG_TAG, "Button clicked!");
    }
}
