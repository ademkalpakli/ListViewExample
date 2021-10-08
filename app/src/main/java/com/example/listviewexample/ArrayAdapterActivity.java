package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdapterActivity extends ListActivity {


    public static String[] ANIMALS = new String[] {
            "Ant","Bear","Bird","Cat","Dog"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_array_adapter,ANIMALS));
        ListView l =getListView();
        l.setTextFilterEnabled(true);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ArrayAdapterActivity.this,((TextView) view).getText(), Toast.LENGTH_SHORT ).show();
            }
        });
    }
}