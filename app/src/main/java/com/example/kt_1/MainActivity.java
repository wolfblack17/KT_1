package com.example.kt_1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kt_1.adapter.conganadapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lvCongAn;
    ArrayList<CongAn> arrayCongAn;
    conganadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        anhxa();

        adapter = new conganadapter(this, R.layout.list_cong_an, arrayCongAn);
        lvCongAn.setAdapter(adapter);
            }

    private void anhxa() {
        lvCongAn = (ListView) findViewById(R.id.listviewCongAn);
        arrayCongAn = new ArrayList<CongAn>();

        arrayCongAn.add(new CongAn("Vo Nguyen Giap", "Dai Tuong","Da Nang",R.drawable.vonguyengiap));
        arrayCongAn.add(new CongAn("Bui Thanh Tuong", "Thieu Tuong","Da Nang",R.drawable.congan1));
    }
}