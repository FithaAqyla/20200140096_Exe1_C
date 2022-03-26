package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Task2 extends AppCompatActivity {

    TextView txTask, txJenis, txTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        txTask = findViewById(R.id.edittxt1);
        txJenis = findViewById(R.id.edittxt2);
        txTime = findViewById(R.id.edittxt3);

        Bundle bundle = getIntent().getExtras();

        String Task = bundle.getString("a");
        String Jenis = bundle.getString("b");
        String Time = bundle.getString("c");

        txTask.setText(Task);
        txJenis.setText(Jenis);
        txTime.setText(Time);
    }
}