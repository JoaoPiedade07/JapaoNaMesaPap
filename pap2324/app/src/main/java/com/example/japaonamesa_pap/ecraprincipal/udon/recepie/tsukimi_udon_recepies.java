package com.example.japaonamesa_pap.ecraprincipal.udon.recepie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.japaonamesa_pap.R;
import com.example.japaonamesa_pap.ecraprincipal.udon.udonRecepies;
import com.example.japaonamesa_pap.pesquisa.Pesquisa;

public class tsukimi_udon_recepies extends AppCompatActivity {

    Button buttomVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsukimi_udon_recepies);

        buttomVoltar = findViewById(R.id.tsukimiUdonButtom);

        buttomVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pesquisa.class);
                startActivity(intent);
                finish();
            }
        });
    }
}