package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ementa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ementa);
        final ListView lv = (ListView) findViewById(R.id.listView1);

        String[] pratos = new String[] {
                "SOPA",
                "Sopa de peixe",
                "PRATO PRINCIPAL",
                "Massa com atum",
                "LANCHE DA TARDE",
                "Pão com queijo"
        };

        final List<String> ementa = new ArrayList<String>(Arrays.asList(pratos));

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, ementa);

        lv.setAdapter(arrayAdapter);

        ementa.add("Sobremesa");
        ementa.add("Café ou gelatina");
        arrayAdapter.notifyDataSetChanged();
    }

}
