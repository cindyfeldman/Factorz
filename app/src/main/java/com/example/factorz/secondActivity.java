package com.example.factorz;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.List;

public class secondActivity extends AppCompatActivity {
    private ListView myList ;
    private ArrayAdapter arrayAdapter;
    Bundle bundle = getIntent().getExtras();
    private String[] strings = bundle.getStringArray("numbers");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
    myList = (ListView) findViewById(R.id.myNumberList);

    }
}
