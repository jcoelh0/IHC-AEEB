package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class Anuncios extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();
    private static String[] arrayNovoAnuncio = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios);

        //ArrayList<String[]> arrayAnuncios = new ArrayList<String[]>();
        //arrayAnuncios.add(new String[]{"Levar autorização de visita ao Museu assinada","Na data especificada será feita uma visita ao Museu da cidade e para que o seu educando possa ir é preciso trazaer a autorização assinada.","yyyy/MM/dd"});


        TextView anuncio1 = (TextView) findViewById(R.id.textView4);
        TextView dataAnuncio1 = (TextView) findViewById(R.id.textView5);

        anuncio1.setText("Levar autorização de visita ao Museu assinada pelo encarregado de educação");
        dataAnuncio1.setText("Data: 24/05/2019");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        if(tipoUsuario){
            getMenuInflater().inflate(R.menu.menu_novo, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.novo_anuncio:
                Intent anuncios_add = new Intent(getApplicationContext(), Anuncios_Add.class);
                startActivity(anuncios_add);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

}
