package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Date;

import java.util.ArrayList;

public class Anuncios extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();
    String strNovoAnuncio = Anuncios_Add.getStrNovoAnuncio();
    Date dataNovoAnuncio = Anuncios_Add.getDataNovoAnuncio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios);

        //ArrayList<String[]> arrayAnuncios = new ArrayList<String[]>();
        //arrayAnuncios.add(new String[]{anuncio1.setText("Levar autorização de visita ao Museu, que foi entregue ao aluno, assinada pelo encarregado de educação");,"Data: 24/05/2019"});


        TextView anuncio1 = (TextView) findViewById(R.id.textView4);
        TextView dataAnuncio1 = (TextView) findViewById(R.id.textView5);
        TextView anuncio2 = (TextView) findViewById(R.id.textView6);
        TextView dataAnuncio2 = (TextView) findViewById(R.id.textView7);
        TextView anuncio3 = (TextView) findViewById(R.id.textView8);
        TextView dataAnuncio3 = (TextView) findViewById(R.id.textView9);
        TextView anuncio4 = (TextView) findViewById(R.id.textView10);
        TextView dataAnuncio4 = (TextView) findViewById(R.id.textView11);

        anuncio1.setText("Levar autorização de visita ao Museu, que foi entregue ao aluno, assinada pelo encarregado de educação");
        dataAnuncio1.setText("Data: 24/05/2019");

        anuncio2.setText(strNovoAnuncio);
        dataAnuncio2.setText(dataNovoAnuncio);



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
