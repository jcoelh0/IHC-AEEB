package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Faltas_Add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faltas_add);

        //alunos
        final ListView lv1 = (ListView) findViewById(R.id.listView1);

        String[] alunos = new String[] {
                "Afonso Dias Coelho",
                "Ana Marisa Rondão",
                "Ana Rita Carvalho",
                "Bruno Souza Moreira",
                "Carolina Barbosa Ferreira",
                "Daniel Mota Souza",
                "Filipa Santos Marques",
                "Gonçalo André Lima",
                "João Pedro Paiva",
                "Juliana Soares Pinho",
                "Leonardo Filipe Silva",
                "Mariana Andrade Pinto",
                "Paula Pinheiro Santos",
                "Pedro Brandão Lacerda",
                "Tiago Ferreira Martins",
                "Vitor Souza Lacerda"
        };

        final List<String> lista = new ArrayList<String>(Arrays.asList(alunos));

        final ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, lista);

        lv1.setAdapter(arrayAdapter1);
        arrayAdapter1.notifyDataSetChanged();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_certo, menu);

        return true;
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextInputLayout descAnuncio = (TextInputLayout) findViewById(R.id.textInputLayout2);
        DatePicker dataAnuncio = (DatePicker) findViewById(R.id.datePicker1);

        if(item.getItemId()==R.id.novo_anuncio){
            strNovoAnuncio = descAnuncio.getEditText().getText().toString();
            dataNovoAnuncio = "Data: "+ dataAnuncio.getDayOfMonth()+"/"+ dataAnuncio.getMonth()+"/"+dataAnuncio.getYear();
        } else {
            strNovoAnuncio = "";
            dataNovoAnuncio= "";
        }

        navigateUpTo(new Intent(getBaseContext(), Anuncios.class));
        Toast.makeText(this,"Anúncio Adicionado.", Toast.LENGTH_SHORT).show();
        return true;
    }
    */
}
