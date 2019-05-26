package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Ementa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ementa);

        ListView resultsListView = (ListView) findViewById(R.id.listView1);

        HashMap<String, String> nameAddresses = new HashMap<>();
        nameAddresses.put("SOPA", "Sopa de peixe");
        nameAddresses.put("PRATO PRINCIPAL", "Esparguete com atum");
        nameAddresses.put("PRATO SECUNDÁRIO", "Arroz de marisco");
        nameAddresses.put("FRUTA", "Banana e cerejas");
        nameAddresses.put("SOBREMESA", "Café ou gelatina");
        nameAddresses.put("LANCHE DA TARDE", "Pão com queijo");

        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});


        Iterator it = nameAddresses.entrySet().iterator();
        while (it.hasNext())
        {
            HashMap<String, String> resultsMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultsMap.put("First Line", pair.getKey().toString());
            resultsMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultsMap);
        }

        resultsListView.setAdapter(adapter);
    }

}
