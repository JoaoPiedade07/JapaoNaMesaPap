package com.example.japaonamesa_pap.favoritos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.japaonamesa_pap.ecraprincipal.MainActivity;
import com.example.japaonamesa_pap.R;
import com.example.japaonamesa_pap.definicoes.Definicoes;
import com.example.japaonamesa_pap.pesquisa.Pesquisa;

public class Favoritos extends AppCompatActivity {

    ImageView definicoes, pesquisaImg, homeImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        homeImg = findViewById(R.id.imgHOME);
        pesquisaImg = findViewById(R.id.imgSEARCH);
        definicoes = findViewById(R.id.imgDEFINICOES);



        homeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        pesquisaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pesquisa.class);
                startActivity(intent);
                finish();
            }
        });

        definicoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Definicoes.class);
                startActivity(intent);
                finish();
            }
        });

    }
}