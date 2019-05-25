package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pauta extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pauta);

        //cadeiras
        final ListView lv1 = (ListView) findViewById(R.id.listView1);

        String[] cadeiras = new String[] {
                "Estudo do Meio",
                "Matemática",
                "Ciências",
                "Portugês",
                "Artes",
        };

        final List<String> pauta = new ArrayList<String>(Arrays.asList(cadeiras));

        final ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, pauta);

        lv1.setAdapter(arrayAdapter1);
        arrayAdapter1.notifyDataSetChanged();

        //notas
        final ListView lv2 = (ListView) findViewById(R.id.listView2);

        String[] notas = new String[] {
                "4",
                "5",
                "4",
                "3",
                "5",
        };

        final List<String> media = new ArrayList<String>(Arrays.asList(notas));

        final ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, media);

        lv2.setAdapter(arrayAdapter2);
        arrayAdapter2.notifyDataSetChanged();
    }
}
