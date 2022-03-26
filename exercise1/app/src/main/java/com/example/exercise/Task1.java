package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Task1 extends AppCompatActivity {

    FloatingActionButton btnPLusss;
    EditText edTask, edJenisT, edTime;
    String Task, JenisTask, Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnPLusss =findViewById(R.id.fabSimpan);

        edTask =findViewById(R.id.edittxt1);

        edJenisT =findViewById(R.id.edittxt2);


        edTime = findViewById(R.id.edittxt3);



        btnPLusss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Task = edTask.getText().toString();
                JenisTask = edJenisT.getText().toString();
                Time = edTime.getText().toString();
//
                String Tsk = "oke";
                String jTsk = "123";
                String TTask = "2 hari";

                if (Task.length()==0 && JenisTask.length()==0 && Time.length()==0) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Isi Semua Data", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(Task.equals(Tsk) && JenisTask.equals(jTsk) && Time.equals(TTask) ) {
                    Toast.makeText(getApplicationContext(), "Berhasil!",
                            Toast.LENGTH_SHORT).show();
                    Bundle b = new Bundle();

                    b.putString("a", Task.trim());

                    b.putString("b", JenisTask.trim());

                    b.putString("c", Time.trim());

                    Intent intent=new Intent(getApplicationContext(), Task2.class);
                    intent.putExtras(b);
                    startActivity(intent);
                    finish();
                }
                else if(edTime.getText().toString().length()==0){

                        edTime.setError("Lama Task!");
                }
                else if(edJenisT.getText().toString().length()==0) {
                    edJenisT.setError("Jenis Task!");
                }else{
                    Toast.makeText(getApplicationContext(), "Gagal!",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

}