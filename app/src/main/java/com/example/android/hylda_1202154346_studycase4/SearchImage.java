package com.example.android.hylda_1202154346_studycase4;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;


public class SearchImage extends AppCompatActivity {

    ImageView image;
    EditText link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_image);
        setTitle("AsyncTask"); //set title pada tampilan

        //memanggil variabel yang ada pada layout
        image = (ImageView)findViewById(R.id.pict);
        link = (EditText)findViewById(R.id.url);
    }

    public void cari(View view) {
        Picasso.with(SearchImage.this).load(link.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(image);
    }
}
