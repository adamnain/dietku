package com.devaon.dietbulanan;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContentProgramActivity extends AppCompatActivity {

    int idProgram, idHari;
    String sProgram, sSarapan, sMakanSiang, sMakanMalam, sOptional;
    int iSarapan, iMakanSiang, iMakanMalam, iOptional;
    String siSarapan, siMakanSiang, siMakanMalam, siOptional;

    protected Cursor cursor;

    DataHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_program);

        Bundle receiveData = getIntent().getExtras();
        idProgram = receiveData.getInt("idProgram");
        idHari = receiveData.getInt("idHari");

        dbHelper = new DataHelper(this);

        SQLiteDatabase dbr = dbHelper.getReadableDatabase();

        cursor = dbr.rawQuery("select * from data_program where id_program = '"+idProgram+"' AND id_hari = '"+idHari+"'", null);
        cursor.moveToFirst();
        if(cursor.getCount()>0){
            sSarapan = cursor.getString(2).toString();
            sMakanSiang = cursor.getString(3).toString();
            sMakanMalam = cursor.getString(4).toString();
            sOptional = cursor.getString(5).toString();
        }

        TextView vProgram = (TextView) findViewById(R.id.judul_program);
        TextView vHari = (TextView) findViewById(R.id.hari);
        TextView vSarapan = (TextView) findViewById(R.id.sarapan);
        TextView vMakanSiang = (TextView) findViewById(R.id.makan_siang);
        TextView vMakanMalam = (TextView) findViewById(R.id.makan_malam);
        TextView vOptional = (TextView) findViewById(R.id.optional);

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

        vHari.setText("Diet Hari ke-"+idHari);
        vProgram.setText(sProgram);
        vSarapan.setText(sSarapan);
        vMakanSiang.setText(sMakanSiang);
        vMakanMalam.setText(sMakanMalam);
        vOptional.setText(sOptional);

        Button selesai = (Button) findViewById(R.id.selesai);

        selesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        CheckBox cSarapan = (CheckBox) findViewById(R.id.check_sarapan);
//        CheckBox cMakanSiang = (CheckBox) findViewById(R.id.check_makan_siang);
//        CheckBox cMakanMalam = (CheckBox) findViewById(R.id.check_makan_malam);
//        CheckBox cOptional = (CheckBox) findViewById(R.id.check_optional);
//
//        if(cSarapan.isChecked()){
//            iSarapan = 1;
//        }
//        else{
//            iSarapan = 0;
//        }
//        if(cMakanSiang.isChecked()){
//            iMakanSiang = 1;
//        }
//        else{
//            iMakanSiang = 0;
//        }
//        if(cMakanMalam.isChecked()){
//            iMakanMalam = 1;
//        }
//        else{
//            iMakanMalam = 0;
//        }
//        if(cOptional.isChecked()){
//            iOptional = 1;
//        }
//        else{
//            iOptional = 0;
//        }
//
//        Button simpan = (Button) findViewById(R.id.simpan);
//
//        simpan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SQLiteDatabase dbw = dbHelper.getWritableDatabase();
//                dbw.execSQL("insert into data_program_diet (id_hari, id_program, menu_satu, menu_dua, menu_tiga, optional) VALUES ('" +
//                        idHari + "','" +
//                        idProgram + "','" +
//                        iSarapan + "','" +
//                        iMakanSiang + "','" +
//                        iMakanMalam + "','" +
//                        iOptional + "');");
//            }
//        });

    }
}