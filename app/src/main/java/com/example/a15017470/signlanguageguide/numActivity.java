package com.example.a15017470.signlanguageguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class numActivity extends AppCompatActivity {
    ImageView img0;
    ImageView img1;
    ImageView img10;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Numbers");

        this.img0 = (ImageView) findViewById(R.id.imageView0);
        this.img1 = (ImageView) findViewById(R.id.imageView1);
        this.img2 = (ImageView) findViewById(R.id.imageView2);
        this.img3 = (ImageView) findViewById(R.id.imageView3);
        this.img4 = (ImageView) findViewById(R.id.imageView4);
        this.img5 = (ImageView) findViewById(R.id.imageView5);
        this.img6 = (ImageView) findViewById(R.id.imageView6);
        this.img7 = (ImageView) findViewById(R.id.imageView7);
        this.img8 = (ImageView) findViewById(R.id.imageView8);
        this.img9 = (ImageView) findViewById(R.id.imageView9);
        this.img10 = (ImageView) findViewById(R.id.imageView10);
        this.img0.setImageResource(R.drawable.a0);
        this.img1.setImageResource(R.drawable.a1);
        this.img2.setImageResource(R.drawable.a2);
        this.img3.setImageResource(R.drawable.a3);
        this.img4.setImageResource(R.drawable.a4);
        this.img5.setImageResource(R.drawable.a5);
        this.img6.setImageResource(R.drawable.a6);
        this.img7.setImageResource(R.drawable.a7);
        this.img8.setImageResource(R.drawable.a8);
        this.img9.setImageResource(R.drawable.a9);
        this.img10.setImageResource(R.drawable.a10);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
