package com.devaon.dietbulanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    int idMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

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
                idMenu = 1;
                moveActivity(idMenu);
            }
        });

        buttonMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idMenu = 2;
                moveActivity(idMenu);
            }
        });

        buttonMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idMenu = 3;
                moveActivity(idMenu);
            }
        });

        buttonMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idMenu = 4;
                moveActivity(idMenu);
            }
        });

        imButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idMenu = 1;
                moveActivity(idMenu);
            }
        });

        imButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idMenu = 2;
                moveActivity(idMenu);
            }
        });

        imButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idMenu = 3;
                moveActivity(idMenu);
            }
        });

        imButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idMenu = 4;
                moveActivity(idMenu);
            }
        });

    }

    public void moveActivity(int idMenu){
        Intent i = new Intent(MenuActivity.this, ContentMenuActivity.class);

        //sent data id menu
        i.putExtra("idMenu", idMenu);
        startActivity(i);
    }
}