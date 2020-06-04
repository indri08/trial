package com.example.kalori;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import org.w3c.dom.Text;

public class HasildanJadwalMakan extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        final TextView txtimt = (TextView)findViewById(R.id.txt11);
        final TextView txtlevel = (TextView)findViewById(R.id.txt12);
        final TextView txtkalori = (TextView)findViewById(R.id.txt13);
        Button btnjadwal = (Button)findViewById(R.id.btnjadwal);

    }
}
