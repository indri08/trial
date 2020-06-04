package com.example.kalori;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class BMIdanKalori extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_m_idan_kalori);
        final EditText inputnama = (EditText)findViewById(R.id.edt1);
        final EditText inputbb = (EditText)findViewById(R.id.edt2);
        final EditText inputtb = (EditText)findViewById(R.id.edt3);
        Button btnhitung = (Button)findViewById(R.id.btnhitung);


    }
}
