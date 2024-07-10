package com.example.japaonamesa_pap.ecraprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

import com.example.japaonamesa_pap.R;
import com.example.japaonamesa_pap.definicoes.Definicoes;
import com.example.japaonamesa_pap.ecraprincipal.houtou.houtouRecepies;
import com.example.japaonamesa_pap.ecraprincipal.ramen.ramenRecepies;
import com.example.japaonamesa_pap.ecraprincipal.soba.sobaRecepies;
import com.example.japaonamesa_pap.ecraprincipal.sukiyaki.sukiyakiRecepies;
import com.example.japaonamesa_pap.favoritos.Favoritos;
import com.example.japaonamesa_pap.ecraprincipal.udon.udonRecepies;
import com.example.japaonamesa_pap.pesquisa.Pesquisa;
import com.google.android.material.imageview.ShapeableImageView;


public class MainActivity extends AppCompatActivity{







    ShapeableImageView udonImg, ramenImg, sobaImg, sukiyakiImg, houtouImg;

    ImageView definicoes, pesquisaImg, favImg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        udonImg = findViewById(R.id.udonImg);
        ramenImg = findViewById(R.id.ramenImg);
        sobaImg = findViewById(R.id.sobaImg);
        sukiyakiImg = findViewById(R.id.sukiyakiImg);
        houtouImg = findViewById(R.id.houtouImg);

        udonImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), udonRecepies.class);
                startActivity(intent);
                finish();
            }
        });

        ramenImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ramenRecepies.class);
                startActivity(intent);
                finish();
            }
        });

        sobaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sobaRecepies.class);
                startActivity(intent);
                finish();
            }
        });

        sukiyakiImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), sukiyakiRecepies.class);
                startActivity(intent);
                finish();
            }
        });

        houtouImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), houtouRecepies.class);
                startActivity(intent);
                finish();
            }
        });

        pesquisaImg = findViewById(R.id.imgSearch);
        favImg = findViewById(R.id.imgFavorite);
        definicoes = findViewById(R.id.imgDefinitions);

        pesquisaImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pesquisa.class);
                startActivity(intent);
                finish();
            }
        });

        favImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Favoritos.class);
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