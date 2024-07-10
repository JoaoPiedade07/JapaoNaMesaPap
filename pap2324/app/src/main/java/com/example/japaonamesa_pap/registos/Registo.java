package com.example.japaonamesa_pap.registos;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.japaonamesa_pap.ecraprincipal.MainActivity;
import com.example.japaonamesa_pap.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registo extends AppCompatActivity {

    TextInputEditText editEmail, editConfirmationEmail, editPassword, editPass;
    Button btnReg;

    TextView txtLogin;

    FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registo);

        mAuth = FirebaseAuth.getInstance();


        editEmail = findViewById(R.id.editEmail);
        editConfirmationEmail = findViewById(R.id.editConfirmationEmail);
        editPassword = findViewById(R.id.editPassword);
        editPass = findViewById(R.id.editPass);
        btnReg = findViewById(R.id.btnReg);
        txtLogin = findViewById(R.id.txtLogin);


        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();
            }
        });

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editEmail.getText().toString().trim();
                String confirmationEmail = editConfirmationEmail.getText().toString().trim();
                String password = editPassword.getText().toString().trim();
                String pass = editPass.getText().toString().trim();

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(confirmationEmail) ||
                        TextUtils.isEmpty(password) || TextUtils.isEmpty(pass)) {
                    Toast.makeText(Registo.this, "Por favor, preencha todos os campos", Toast.LENGTH_LONG).show();
                    return;
                }

                if (!email.equals(confirmationEmail)) {
                    Toast.makeText(Registo.this, "Os emails não coincidem", Toast.LENGTH_LONG).show();
                    return;
                }

                if (!password.equals(pass)) {
                    Toast.makeText(Registo.this, "As senhas não coincidem", Toast.LENGTH_LONG).show();
                    return;
                }

                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    sendEmailVerification();
                                    Toast.makeText(Registo.this, "Conta criada com sucesso", Toast.LENGTH_LONG).show();
                                    Intent intent = new Intent(Registo.this, MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(Registo.this, "Falha ao criar conta", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });
    }
    private void sendEmailVerification() {
        mAuth.getCurrentUser().sendEmailVerification()
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            // Exibe uma mensagem se o e-mail de verificação for enviado com sucesso
                            Toast.makeText(Registo.this, "Verificação de email enviada.",
                                    Toast.LENGTH_LONG).show();
                        } else {
                            // Exibe uma mensagem se houver falha no envio do e-mail de verificação
                            Toast.makeText(Registo.this, "Falha ao enviar email.",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}
