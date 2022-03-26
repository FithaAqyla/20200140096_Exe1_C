package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    TextView Regis;
    EditText ednama, edpassword;
    String nama, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Regis= findViewById(R.id.textView2);
        Regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        btnLogin=findViewById(R.id.button);

        ednama =findViewById(R.id.editTextTextPersonName);

        edpassword=findViewById(R.id.editTextTextPersonName2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = ednama.getText().toString();
                password = edpassword.getText().toString();

                String email = "aqilaa";
                String pwd = "123";

                if (nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Nama dan Password wajib diisi", Toast.LENGTH_LONG);
                    t.show();
                }
                else {

                    if(nama.equals(email) && password.equals(pwd)){
                        Toast t = Toast.makeText(getApplicationContext(),"Login Sukses",
                                Toast.LENGTH_LONG);
                        t.show();

                        Intent intent=new Intent(getApplicationContext(), Task1.class);
                        startActivity(intent);
                        finish();
                    } else{
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Password Salah", Toast.LENGTH_LONG);

                        t.show();
                    }
                }
            }
        });
    }

}