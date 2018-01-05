package com.devaon.dietbulanan;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class JadwalActivity extends AppCompatActivity {

    int idProgram, idHari;
    String sProgram;

    protected Cursor cursor;

    DataHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal);

        Bundle receiveData = getIntent().getExtras();
        idProgram = receiveData.getInt("idProgram");

        Button butHari1 = (Button) findViewById(R.id.hari_1);
        Button butHari2 = (Button) findViewById(R.id.hari_2);
        Button butHari3 = (Button) findViewById(R.id.hari_3);
        Button butHari4 = (Button) findViewById(R.id.hari_4);
        Button butHari5 = (Button) findViewById(R.id.hari_5);
        Button butHari6 = (Button) findViewById(R.id.hari_6);
        Button butHari7 = (Button) findViewById(R.id.hari_7);
        Button butHari8 = (Button) findViewById(R.id.hari_8);
        Button butHari9 = (Button) findViewById(R.id.hari_9);
        Button butHari10 = (Button) findViewById(R.id.hari_10);
        Button butHari11 = (Button) findViewById(R.id.hari_11);
        Button butHari12 = (Button) findViewById(R.id.hari_12);
        Button butHari13 = (Button) findViewById(R.id.hari_13);
        Button butHari14 = (Button) findViewById(R.id.hari_14);
        Button butHari15 = (Button) findViewById(R.id.hari_15);
        Button butHari16 = (Button) findViewById(R.id.hari_16);
        Button butHari17 = (Button) findViewById(R.id.hari_17);
        Button butHari18 = (Button) findViewById(R.id.hari_18);
        Button butHari19 = (Button) findViewById(R.id.hari_19);
        Button butHari20 = (Button) findViewById(R.id.hari_20);
        Button butHari21 = (Button) findViewById(R.id.hari_21);
        Button butHari22 = (Button) findViewById(R.id.hari_22);
        Button butHari23 = (Button) findViewById(R.id.hari_23);
        Button butHari24 = (Button) findViewById(R.id.hari_24);
        Button butHari25 = (Button) findViewById(R.id.hari_25);
        Button butHari26 = (Button) findViewById(R.id.hari_26);
        Button butHari27 = (Button) findViewById(R.id.hari_27);
        Button butHari28 = (Button) findViewById(R.id.hari_28);
        Button butHari29 = (Button) findViewById(R.id.hari_29);
        Button butHari30 = (Button) findViewById(R.id.hari_30);

        butHari1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 1;
                moveActivity(idProgram, idHari);
            }
        });

        butHari2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 2;
                moveActivity(idProgram, idHari);
            }
        });

        butHari3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 3;
                moveActivity(idProgram, idHari);
            }
        });

        butHari4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 4;
                moveActivity(idProgram, idHari);
            }
        });

        butHari5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 5;
                moveActivity(idProgram, idHari);
            }
        });

        butHari6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 6;
                moveActivity(idProgram, idHari);
            }
        });

        butHari7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 7;
                moveActivity(idProgram, idHari);
            }
        });

        butHari8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 8;
                moveActivity(idProgram, idHari);
            }
        });

        butHari9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 9;
                moveActivity(idProgram, idHari);
            }
        });

        butHari10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 10;
                moveActivity(idProgram, idHari);
            }
        });

        butHari11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 11;
                moveActivity(idProgram, idHari);
            }
        });

        butHari12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 12;
                moveActivity(idProgram, idHari);
            }
        });

        butHari13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 13;
                moveActivity(idProgram, idHari);
            }
        });

        butHari14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 14;
                moveActivity(idProgram, idHari);
            }
        });

        butHari15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 15;
                moveActivity(idProgram, idHari);
            }
        });

        butHari16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 16;
                moveActivity(idProgram, idHari);
            }
        });

        butHari17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 17;
                moveActivity(idProgram, idHari);
            }
        });

        butHari18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 18;
                moveActivity(idProgram, idHari);
            }
        });

        butHari19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 19;
                moveActivity(idProgram, idHari);
            }
        });

        butHari20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 20;
                moveActivity(idProgram, idHari);
            }
        });

        butHari21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 21;
                moveActivity(idProgram, idHari);
            }
        });

        butHari22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 22;
                moveActivity(idProgram, idHari);
            }
        });

        butHari23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 23;
                moveActivity(idProgram, idHari);
            }
        });

        butHari24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 24;
                moveActivity(idProgram, idHari);
            }
        });

        butHari25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 25;
                moveActivity(idProgram, idHari);
            }
        });

        butHari26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 26;
                moveActivity(idProgram, idHari);
            }
        });

        butHari27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 27;
                moveActivity(idProgram, idHari);
            }
        });

        butHari28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 28;
                moveActivity(idProgram, idHari);
            }
        });

        butHari29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 29;
                moveActivity(idProgram, idHari);
            }
        });

        butHari30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idHari = 30;
                moveActivity(idProgram, idHari);
            }
        });

        TextView vJudul = (TextView) findViewById(R.id.judul_program);
        switch(idProgram){
            case 1 : {
                sProgram = "Metode Diet Mayo";
            }
            break;
            case 2 : {
                sProgram = "Metode Diet Clean Eating";
            }
            break;
            case 3 : {
                sProgram = "Metode Diet Food Combining";
            }
            break;
            case 4 : {
                sProgram = "Metode Diet Paleo";
            }
            break;
        }

        vJudul.setText(sProgram+"\n(selama 30 hari)");

//        dbHelper = new DataHelper(this);
//
//        SQLiteDatabase dbr = dbHelper.getReadableDatabase();
//
//        cursor = dbr.rawQuery("select id_hari from data_program_diet", null);
//        cursor.moveToFirst();
//        if(cursor.getCount()>0){
//            sHari = cursor.getString(1).toString();
//        }
//
//        for(int i=0;i<cursor.getCount();i++){
//
//        }

    }

    public void moveActivity(int idProgram, int idHari){
        Intent i = new Intent(JadwalActivity.this, ContentProgramActivity.class);

        //sent data id program & id hari
        i.putExtra("idProgram", idProgram);
        i.putExtra("idHari", idHari);
        startActivity(i);
    }
}
