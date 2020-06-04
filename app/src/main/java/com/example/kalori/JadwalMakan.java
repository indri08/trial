package com.example.kalori;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import org.angmarch.views.NiceSpinner;
import org.angmarch.views.OnSpinnerItemSelectedListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JadwalMakan extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_makan);
        TextView txtkategori = (TextView)findViewById(R.id.txtkategori);
        TextView txttotal = (TextView)findViewById(R.id.txttotal);
        NiceSpinner niceSpinner1 = (NiceSpinner)findViewById(R.id.spinner1);
        NiceSpinner niceSpinner2 = (NiceSpinner)findViewById(R.id.spinner2);
        NiceSpinner niceSpinner3 = (NiceSpinner)findViewById(R.id.spinner3);
        NiceSpinner niceSpinner4 = (NiceSpinner)findViewById(R.id.spinner4);
        NiceSpinner niceSpinner5 = (NiceSpinner)findViewById(R.id.spinner5);
        NiceSpinner niceSpinner6 = (NiceSpinner)findViewById(R.id.spinner6);
        NiceSpinner niceSpinner7 = (NiceSpinner)findViewById(R.id.spinner7);
        NiceSpinner niceSpinner8 = (NiceSpinner)findViewById(R.id.spinner8);

        niceSpinner1.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(JadwalMakan.this, "Anda memilih "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        niceSpinner2.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(JadwalMakan.this, "Anda memilih "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        niceSpinner3.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(JadwalMakan.this, "Anda memilih "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        niceSpinner4.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(JadwalMakan.this, "Anda memilih "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        niceSpinner5.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(JadwalMakan.this, "Anda memilih "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        niceSpinner6.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(JadwalMakan.this, "Anda memilih "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        niceSpinner7.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(JadwalMakan.this, "Anda memilih "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        niceSpinner8.setOnSpinnerItemSelectedListener(new OnSpinnerItemSelectedListener() {
            @Override
            public void onItemSelected(NiceSpinner parent, View view, int position, long id) {
                String item = (String)parent.getSelectedItem();
                Toast.makeText(JadwalMakan.this, "Anda memilih "+ item, Toast.LENGTH_SHORT).show();
            }
        });
        //List<String>listMakanan = Arrays.asList(getApplicationContext().getResources().getStringArray(R.array.makanan));
        //niceSpinner1.attachDataSource(listMakanan);

        int[] kalori = getApplicationContext().getResources().getIntArray(R.array.kalori);

        List<String> MakanandanKalori = new ArrayList<>();
        int[] arrayKalori = {150,100,150,200,250,100,150};
        String[] arrayMakanan = {"oatmeal","susu","1/4 cup nasi","1/2 cup nasi","1 cup nasi","1/4 dada ayam","1/2 dada ayam"};
        for (int i = kalori.length - 1; i >= 0; i--) {
            String gabung = arrayMakanan[i] + "                 " + arrayKalori[i] + " Kalori ";
            MakanandanKalori.add(gabung);
        }
        niceSpinner1.attachDataSource(MakanandanKalori);

    }
}
