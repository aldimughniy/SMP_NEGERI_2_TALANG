package com.profil.smpnegeri2talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ekskullActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eskull);
    }

    public void osis(View view) {
        Intent intent = new Intent(ekskullActivity.this, osisActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(ekskullActivity.this, PmrActivity.class);
        startActivity(intent);
    }

    public void pramuka(View view) {
        Intent intent = new Intent(ekskullActivity.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void volly(View view) {
        Intent intent = new Intent(ekskullActivity.this, VollyActivity.class);
        startActivity(intent);
        }

    public void silat(View view) {
        Intent intent = new Intent(ekskullActivity.this, silatActivity.class);
        startActivity(intent);
    }
}