package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btnregis;
    EditText edpass, edpassword;
    String password, repassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnregis =findViewById(R.id.button);

        edpass=findViewById(R.id.psswrd);
        edpassword=findViewById(R.id.editTextTextPersonName2);
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                password = edpass.getText().toString();
                repassword = edpassword.getText().toString();

                String  pwd= "123";
                String repwd = "123";

                if (password.isEmpty() || repassword.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password dan re-Password wajib diisi", Toast.LENGTH_LONG);
                    t.show();
                }
//                else if (password.equals(pwd) || repassword.isEmpty()){
//                    Toast t = Toast.makeText(getApplicationContext(),
//                            "Password Salah", Toast.LENGTH_LONG);
//                    t.show();
//                }
                else {

                    if(password.equals(pwd) && repassword.equals(repwd)){
                        Toast t = Toast.makeText(getApplicationContext(),"Login Sukses",
                                Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", password.trim());

                        b.putString("b", repassword.trim());

                        Intent intent=new Intent(getApplicationContext(), Task1.class);
                        startActivity(intent);
                        intent.putExtras(b);
                        finish();
                    } else{
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login gagal", Toast.LENGTH_LONG);

                        t.show();
                    }
                }
            }
        });
    }

}