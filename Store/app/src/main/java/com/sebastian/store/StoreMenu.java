package com.sebastian.store;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import model.App;


public class StoreMenu extends Activity {

    ArrayList<String> listaCarrito = new ArrayList <String>();
    String[] productos= {
            "Arroz",
            "Carne",
            "Papa",
            "Maiz",
            "Tomate",
            "Cebolla",
            "Mango",
            "Pescado",
            "Banano",
            "Limon",
            "Azucar",
            "Leche",
            "Huevos",
            "Sal",
            "Panela",
            "Frijoles",
            "Avena",
            "Chocolate",
            "Jamon",
            "Atun",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_menu);


        final ListView list = (ListView) findViewById(R.id.lvLista);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, productos);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Toast.makeText(getApplicationContext(), "Añadiste " +productos[position] +" al Carrito",
                        Toast.LENGTH_SHORT).show();
                listaCarrito.add(productos[position]);
                App.getInstance().addItem(productos[position]);

            }
        });

        final Button btnver = (Button) findViewById(R.id.btnverlista);

        btnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Carrito.class);
                Bundle extras = new Bundle();
                intent.putExtras(extras);
                startActivity(intent);


            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.store_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
