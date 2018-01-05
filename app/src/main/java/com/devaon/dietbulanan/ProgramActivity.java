package com.devaon.dietbulanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProgramActivity extends AppCompatActivity {

    int idProgram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        Button buttonMenu1 = (Button) findViewById(R.id.b_soyo);
        Button buttonMenu2 = (Button) findViewById(R.id.b_cleaneat);
        Button buttonMenu3 = (Button) findViewById(R.id.b_foodcom);
        Button buttonMenu4 = (Button) findViewById(R.id.b_paleo);

        ImageButton imButton1 = (ImageButton) findViewById(R.id.im_soyo);
        ImageButton imButton2 = (ImageButton) findViewById(R.id.im_cleaneat);
        ImageButton imButton3 = (ImageButton) findViewById(R.id.im_foodcom);
        ImageButton imButton4 = (ImageButton) findViewById(R.id.im_paleo);

        buttonMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 1;
                moveActivity(idProgram);
            }
        });

        buttonMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 2;
                moveActivity(idProgram);
            }
        });

        buttonMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 3;
                moveActivity(idProgram);
            }
        });

        buttonMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 4;
                moveActivity(idProgram);
            }
        });

        imButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 1;
                moveActivity(idProgram);
            }
        });

        imButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 2;
                moveActivity(idProgram);
            }
        });

        imButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 3;
                moveActivity(idProgram);
            }
        });

        imButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 4;
                moveActivity(idProgram);
            }
        });

        buttonMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idProgram = 4;
                moveActivity(idProgram);
            }
        });

    }

    public void moveActivity(int idProgram){
        Intent i = new Intent(ProgramActivity.this, JadwalActivity.class);

        //sent data id program
        i.putExtra("idProgram", idProgram);
        startActivity(i);

    }
}