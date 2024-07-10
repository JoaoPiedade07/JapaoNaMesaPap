package com.example.japaonamesa_pap.ecraprincipal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.japaonamesa_pap.R;
import com.example.japaonamesa_pap.definicoes.Definicoes;
import com.example.japaonamesa_pap.favoritos.Favoritos;
import com.example.japaonamesa_pap.pesquisa.Pesquisa;
import com.google.android.material.imageview.ShapeableImageView;

public class teste extends AppCompatActivity {

    ImageView imageView;

    ShapeableImageView myTest2, myTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        myTest = findViewById(R.id.katsuUdonImg);
        imageView = findViewById(R.id.imgVoltar);

        myTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Pesquisa.class);
                startActivity(intent);
                finish();
            }
        });

        imageView = findViewById(R.id.imgVoltar);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}