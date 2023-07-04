package com.example.listviewexercicesimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listViewPlaces;
    private String[] cities = {
            "New York",
            "Los Angeles",
            "Chicago",
            "Houston",
            "Phoenix",
            "Philadelphia",
            "San Antonio",
            "San Diego",
            "Dallas",
            "San Jose",
            "Austin",
            "Jacksonville",
            "San Francisco",
            "Indianapolis",
            "Seattle",
            "Denver",
            "Washington, D.C.",
            "Boston",
            "Nashville",
            "Baltimore"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewPlaces = findViewById(R.id.localList);

        // ADAPTER

        ArrayAdapter <String> adapterCity = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, cities);

        // ADD ADAPTER TO LIST

        listViewPlaces.setAdapter(adapterCity);

        // ADD CLICK ON LIST

        listViewPlaces.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedValue = listViewPlaces.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this, selectedValue, Toast.LENGTH_SHORT).show();
            }
        });
    }
}