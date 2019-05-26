package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static boolean tipoUsuario;

    public static boolean getTipoUsuario(){
        return tipoUsuario;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // variavel para objeto Switch seleciona tipo de usuario
        Switch usuarioSwitch = (Switch) findViewById(R.id.switch1);

        // verifica o estado atual do Switch (true or false)
        usuarioSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    tipoUsuario = true;
                } else {
                    tipoUsuario = false;
                }
                setElement(tipoUsuario);
            }
        });

        setElement(tipoUsuario);

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

        Button meusDadosBttn = findViewById(R.id.button9);
        meusDadosBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent meusDados = new Intent(getApplicationContext(), MeusDados.class);
                startActivity(meusDados);
            }
        });

        Button eventosBttn = findViewById(R.id.button4);
        eventosBttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent eventos = new Intent(getApplicationContext(), Eventos.class);
                startActivity(eventos);
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

    public void setElement(boolean tipoUsuario){
        // variavel para objeto TextView
        TextView textElement = findViewById(R.id.textView4);
        if(tipoUsuario) {
            textElement.setText("Professor: Carlos Fonseca");
        } else {
            textElement.setText("Aluno: Ana Marisa Rondão");
        }
    }

}
