package com.example.japaonamesa_pap.pesquisa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.japaonamesa_pap.ecraprincipal.MainActivity;
import com.example.japaonamesa_pap.R;
import com.example.japaonamesa_pap.definicoes.Definicoes;
import com.example.japaonamesa_pap.ecraprincipal.udon.recepie.kare_udon_recepies;
import com.example.japaonamesa_pap.ecraprincipal.udon.recepie.katsu_udon_recepies;
import com.example.japaonamesa_pap.ecraprincipal.udon.recepie.tsukimi_udon_recepies;
import com.example.japaonamesa_pap.ecraprincipal.udon.recepie.wakame_udon_recepies;
import com.example.japaonamesa_pap.favoritos.Favoritos;

import java.util.ArrayList;
import java.util.List;

public class Pesquisa extends AppCompatActivity {


    SearchView searchView;
    CardView KatsuUdonCard, TsukimiUdonCard, WakameUdonCard, KareUdonCard;
    ImageView definicoes, favImg, homeImg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa);

        homeImg = findViewById(R.id.IMGhome);
        favImg = findViewById(R.id.IMGFavorite);
        definicoes = findViewById(R.id.IMGDefinitions);

        KatsuUdonCard = findViewById(R.id.KatsuUdonCard);
        TsukimiUdonCard = findViewById(R.id.TsukimiUdonCard);
        WakameUdonCard = findViewById(R.id.WakameUdonCard);
        KareUdonCard = findViewById(R.id.KareUdonCard);

        KatsuUdonCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), katsu_udon_recepies.class);
                startActivity(intent);
                finish();
            }
        });
        TsukimiUdonCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), tsukimi_udon_recepies.class);
                startActivity(intent);
                finish();
            }
        });
        WakameUdonCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), wakame_udon_recepies.class);
                startActivity(intent);
                finish();
            }
        });
        KareUdonCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), kare_udon_recepies.class);
                startActivity(intent);
                finish();
            }
        });

        searchView = findViewById(R.id.SearchView);
        searchView.clearFocus();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return true;
            }
        });




        homeImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
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