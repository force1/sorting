package com.mycompany.sorting;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    ListView lv;
    String[] months = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };

    ArrayAdapter<String> adapter;
    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById (R.id.name_list);
        lv.setFastScrollEnabled(true);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, months);
        lv.setAdapter(adapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.asc_button:
                list = new ArrayList<String>(Arrays.asList(months));
                Collections.sort(list);
                for(int i=0; i < list.size(); i++){
                    System.out.println(list.get(i));
                }
                adapter.clear();
                adapter = new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1, list);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.desc_button:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}





















