package com.example.anup.searchapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DetailActivity extends AppCompatActivity {

    ListView suchErgebnis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //neuen API Connector erstellen
       APIConnector Connector;


        suchErgebnis = (ListView) findViewById(R.id.Suchergebnis);

        Bundle bundle =getIntent().getExtras();
        if (bundle!= null)
        {   // in s ist das worauf man geklickt hat
            String s= bundle.getString("angebotsname");
            String[] details = bundle.getStringArray("details");


            // tst comment
            //Alle Daten vom ausgewählten Angebot vom API Connector anfragen und ausgeben


            String[] myStringArray = {"suchErgebnis 1", "2", "3", s};
            ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, details);
            suchErgebnis.setAdapter((myadapter));


        }

    }
}
