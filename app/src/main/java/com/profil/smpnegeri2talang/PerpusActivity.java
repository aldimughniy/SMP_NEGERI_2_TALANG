package com.profil.smpnegeri2talang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerpusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpus);
    }

    public void buku7(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku7Activity.class);
        startActivity(intent);
    }

    public void buku8(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku8Activity.class);
        startActivity(intent);
    }

    public void buku9(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku9Activity.class);
        startActivity(intent);
    }
}