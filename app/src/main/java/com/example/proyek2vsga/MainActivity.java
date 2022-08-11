package com.example.proyek2vsga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout Username = findViewById(R.id.textInputLayout);
        TextInputLayout Password = findViewById(R.id.textInputLayout2);
        Button btn_login = findViewById(R.id.button);

        btn_login.setOnClickListener(view -> {
            if ((Objects.requireNonNull(Username.getEditText()).getText().toString().equals(getString(R.string.my_username))) &&
                    Objects.requireNonNull(Password.getEditText()).getText().toString().equals(getString(R.string.my_password))) {
                Toast.makeText(this, "Redirecting.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,NegaraActivity.class);
                startActivity(intent);
            }

            if (Username.getEditText().getText().toString().equals("")){
                Toast.makeText(this, "Username Cannot Blank", Toast.LENGTH_SHORT).show();
            }else if (!Username.getEditText().getText().toString().equals("Jamaludin21")) {
                Toast.makeText(this, "Username are Incorrect!", Toast.LENGTH_SHORT).show();
            }

            if (Password.getEditText().getText().toString().equals("")) {
                Toast.makeText(this, "Password Cannot Blank", Toast.LENGTH_SHORT).show();
            }else if (!Password.getEditText().getText().toString().equals("bekasi21")){
                Toast.makeText(this, "Password are Incorrect!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}