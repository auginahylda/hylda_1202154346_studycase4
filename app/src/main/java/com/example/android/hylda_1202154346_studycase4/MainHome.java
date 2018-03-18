package com.example.android.hylda_1202154346_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class MainHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
    }

    public void nama(View view) {

        Intent intent = new Intent(MainHome.this, StudentList.class);
        startActivity(intent);
    }

    public void Gambar(View view) {
        Intent intent = new Intent(MainHome.this, SearchImage.class);
        startActivity(intent);
    }
}
