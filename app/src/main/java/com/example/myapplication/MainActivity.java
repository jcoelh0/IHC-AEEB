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
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private static boolean tipoUsuario;

    public static boolean getTipoUsuario(){
        return tipoUsuario;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(this,"Your Message", Toast.LENGTH_LONG).show();

        // variavel para objeto Switch seleciona tipo de usuario
        Switch usuarioSwitch = (Switch) findViewById(R.id.switch1);
        if(tipoUsuario){
            usuarioSwitch.setChecked(true);
            setTextElement(tipoUsuario);
        }

        // verifica o estado atual do Switch (true or false)
        usuarioSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tipoUsuario = true;
                } else {
                    tipoUsuario = false;
                }
                setTextElement(tipoUsuario);
            }
        });

        setTextElement(tipoUsuario);

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

        Button ementaBttn = findViewById(R.id.button3);
        ementaBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent ementa = new Intent(getApplicationContext(), Ementa.class);
                startActivity(ementa);
            }
        });

        Button horarioBttn = findViewById(R.id.button1);
        horarioBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent horario = new Intent(getApplicationContext(), Horario.class);
                startActivity(horario);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        //Toast toast = Toast.makeText(this, "menu opened", Toast.LENGTH_LONG);
        //toast.show();

        return true;
    }

    public void setTextElement(boolean tipoUsuario){
        // variavel para objeto TextView
        TextView textElement = (TextView) findViewById(R.id.textView2);
        if(tipoUsuario) {
            textElement.setText("Professor: Carlos Fonseca");
        } else {
            textElement.setText("Aluno: Ana Marisa Rondão");
        }
    }

}
