package com.devaon.dietbulanan;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentMenuActivity extends AppCompatActivity {

    int idMenu;
    String sJudul, sKonten, sGambar;

    protected Cursor cursor;

    DataHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_menu);

        Bundle receiveData = getIntent().getExtras();
        idMenu = receiveData.getInt("idMenu");

        dbHelper = new DataHelper(this);

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        cursor = db.rawQuery("select * from data_materi where id_materi = '"+idMenu+"'", null);
        cursor.moveToFirst();
        if(cursor.getCount()>0){
            sJudul = cursor.getString(1).toString();
            sKonten = cursor.getString(2).toString();
            sGambar = cursor.getString(3).toString();
        }

        ImageView vGambar = (ImageView) findViewById(R.id.gambar_menu);
        TextView vJudul = (TextView) findViewById(R.id.judul_menu);
        TextView vKonten = (TextView) findViewById(R.id.konten_menu);

        vGambar.setImageResource(getResources().getIdentifier(sGambar,"drawable",getPackageName()));
        vJudul.setText(sJudul);
        vKonten.setText(sKonten);

    }
}