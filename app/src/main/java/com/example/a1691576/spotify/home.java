package com.example.a1691576.spotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity {





        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.home);
        }
    public void search(View view) {
        Intent intent=new Intent(this,search.class);
        startActivity(intent);
    }
    public void browse(View view) {
        Intent intent=new Intent(this,browse.class);
        startActivity(intent);
    }
    public void library(View view) {
        Intent intent=new Intent(this,library.class);
        startActivity(intent);
    }
    public void radio(View view) {
        Intent intent=new Intent(this,radio.class);
        startActivity(intent);
    }
        }

