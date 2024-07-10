package com.example.japaonamesa_pap.definicoes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.japaonamesa_pap.ecraprincipal.MainActivity;
import com.example.japaonamesa_pap.R;
import com.example.japaonamesa_pap.favoritos.Favoritos;
import com.example.japaonamesa_pap.pesquisa.Pesquisa;
import com.example.japaonamesa_pap.registos.Login;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Definicoes extends AppCompatActivity {

    RelativeLayout aboutus, contactus, logoutButtom;

    ImageView homeImg;
    ImageView pesquisaImg;
    ImageView favImg;
    FirebaseUser user;
    FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_definicoes);

        aboutus = findViewById(R.id.AboutUsButtom);
        contactus = findViewById(R.id.ContacUsButtom);
        logoutButtom = findViewById(R.id.LogoutButtom);
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), About_us.class);
                startActivity(intent);
                finish();
            }
        });

        logoutButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });


        homeImg = findViewById(R.id.homeImg);
        pesquisaImg = findViewById(R.id.searchImg);
        favImg = findViewById(R.id.favoriteImg);

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

        favImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Favoritos.class);
                startActivity(intent);
                finish();
            }
        });



    }
}