package com.example.a15017470.signlanguageguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class alphaActivity extends AppCompatActivity {
    ImageView imgA;
    ImageView imgB;
    ImageView imgC;
    ImageView imgD;
    ImageView imgE;
    ImageView imgF;
    ImageView imgG;
    ImageView imgH;
    ImageView imgI;
    ImageView imgJ;
    ImageView imgK;
    ImageView imgL;
    ImageView imgM;
    ImageView imgN;
    ImageView imgO;
    ImageView imgP;
    ImageView imgQ;
    ImageView imgR;
    ImageView imgS;
    ImageView imgT;
    ImageView imgU;
    ImageView imgV;
    ImageView imgW;
    ImageView imgX;
    ImageView imgY;
    ImageView imgZ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Alphabets");

        this.imgA = (ImageView) findViewById(R.id.imageViewA);
        this.imgB = (ImageView) findViewById(R.id.imageViewB);
        this.imgC = (ImageView) findViewById(R.id.imageViewC);
        this.imgD = (ImageView) findViewById(R.id.imageViewD);
        this.imgE = (ImageView) findViewById(R.id.imageViewE);
        this.imgF = (ImageView) findViewById(R.id.imageViewF);
        this.imgG = (ImageView) findViewById(R.id.imageViewG);
        this.imgH = (ImageView) findViewById(R.id.imageViewH);
        this.imgI = (ImageView) findViewById(R.id.imageViewI);
        this.imgJ = (ImageView) findViewById(R.id.imageViewJ);
        this.imgK = (ImageView) findViewById(R.id.imageViewK);
        this.imgL = (ImageView) findViewById(R.id.imageViewL);
        this.imgM = (ImageView) findViewById(R.id.imageViewM);
        this.imgN = (ImageView) findViewById(R.id.imageViewN);
        this.imgO = (ImageView) findViewById(R.id.imageViewO);
        this.imgP = (ImageView) findViewById(R.id.imageViewP);
        this.imgQ = (ImageView) findViewById(R.id.imageViewQ);
        this.imgR = (ImageView) findViewById(R.id.imageViewR);
        this.imgS = (ImageView) findViewById(R.id.imageViewS);
        this.imgT = (ImageView) findViewById(R.id.imageViewT);
        this.imgU = (ImageView) findViewById(R.id.imageViewU);
        this.imgV = (ImageView) findViewById(R.id.imageViewV);
        this.imgW = (ImageView) findViewById(R.id.imageViewW);
        this.imgX = (ImageView) findViewById(R.id.imageViewX);
        this.imgY = (ImageView) findViewById(R.id.imageViewY);
        this.imgZ = (ImageView) findViewById(R.id.imageViewZ);
        this.imgA.setImageResource(R.drawable.a);
        this.imgB.setImageResource(R.drawable.b);
        this.imgC.setImageResource(R.drawable.c);
        this.imgD.setImageResource(R.drawable.d);
        this.imgE.setImageResource(R.drawable.e);
        this.imgF.setImageResource(R.drawable.f);
        this.imgG.setImageResource(R.drawable.g);
        this.imgH.setImageResource(R.drawable.h);
        this.imgI.setImageResource(R.drawable.i);
        this.imgJ.setImageResource(R.drawable.j);
        this.imgK.setImageResource(R.drawable.k);
        this.imgL.setImageResource(R.drawable.l);
        this.imgM.setImageResource(R.drawable.m);
        this.imgN.setImageResource(R.drawable.n);
        this.imgO.setImageResource(R.drawable.o);
        this.imgP.setImageResource(R.drawable.p);
        this.imgQ.setImageResource(R.drawable.q);
        this.imgR.setImageResource(R.drawable.r);
        this.imgS.setImageResource(R.drawable.s);
        this.imgT.setImageResource(R.drawable.t);
        this.imgU.setImageResource(R.drawable.u);
        this.imgV.setImageResource(R.drawable.v);
        this.imgW.setImageResource(R.drawable.w);
        this.imgX.setImageResource(R.drawable.x);
        this.imgY.setImageResource(R.drawable.y);
        this.imgZ.setImageResource(R.drawable.z);
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