package com.syipa.tugas_ppb2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class PpbTugas2Activity extends AppCompatActivity {
    String[] isi = {"Menu1","Menu2","Menu3","Menu4","Menu5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ppb_tugas2);
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.list_view,isi);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        registerForContextMenu(listView);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Pilih action yang akan dilakukan");
        menu.add(0,v.getId(),0,"Bold");
        menu.add(0,v.getId(),0,"Italic");
        menu.add(0,v.getId(),0,"Normal");
            }

      public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle()=="Bold"){
            Toast.makeText(getApplicationContext(), "Memilih Bold", Toast.LENGTH_LONG).show();
        } else if (item.getTitle()=="Italic"){
            Toast.makeText(getApplicationContext(),"Memilih Italic", Toast.LENGTH_LONG).show();
        } else if (item.getTitle()=="Normal"){
            Toast.makeText(getApplicationContext(),"Memilih Normal",Toast.LENGTH_LONG).show();
        } else {
            return false;
        }
        return true;
        }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
       public boolean onOptionsItemSelected(MenuItem item){
           switch (item.getItemId()) {
               case R.id.menu1:
                   Toast.makeText(getApplicationContext(), "Menu Boormaks dipilih",Toast.LENGTH_LONG).show();
                   return true;
               case R.id.menu2:
                   Toast.makeText(getApplicationContext(),"Menu Search Dipilih", Toast.LENGTH_LONG).show();
                   return true;
               case R.id.menu3:
                   Toast.makeText(getApplicationContext(),"Menu Share Dipilih", Toast.LENGTH_LONG).show();
                   return true;
               case R.id.menu4:
                   Toast.makeText(getApplicationContext(),"Menu Preference Dipilih", Toast.LENGTH_LONG).show();
                   return true;
               case R.id.menu5:
                   Toast.makeText(getApplicationContext(),"Menu Share Dipilih", Toast.LENGTH_LONG).show();
                   return true;
               default:
                   return super.onOptionsItemSelected(item);

           }

       }
}
