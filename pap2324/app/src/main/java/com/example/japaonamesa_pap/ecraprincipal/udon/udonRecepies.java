package com.example.japaonamesa_pap.ecraprincipal.udon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.japaonamesa_pap.R;
import com.example.japaonamesa_pap.ecraprincipal.MainActivity;
import com.example.japaonamesa_pap.ecraprincipal.udon.recepie.katsu_udon_recepies;
import com.example.japaonamesa_pap.ecraprincipal.udon.recepie.tsukimi_udon_recepies;
import com.example.japaonamesa_pap.ecraprincipal.udon.recepie.wakame_udon_recepies;
import com.google.android.material.imageview.ShapeableImageView;

public class udonRecepies extends AppCompatActivity {

    ImageView imageView;

    ShapeableImageView katsuUdon, tsukimiUdon, wakameUdon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udon_recepies);

        katsuUdon = findViewById(R.id.katsuUdonImg);
        tsukimiUdon = findViewById(R.id.tsukimiUdonImg);
        wakameUdon = findViewById(R.id.wakameUdonImg);
        imageView = findViewById(R.id.imgVoltar);

        katsuUdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), katsu_udon_recepies.class);
                startActivity(intent);
                finish();
            }
        });

        tsukimiUdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), tsukimi_udon_recepies.class);
                startActivity(intent);
                finish();
            }
        });

        wakameUdon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), wakame_udon_recepies.class);
                startActivity(intent);
                finish();
            }
        });


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