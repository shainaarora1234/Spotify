package com.example.a1691576.spotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class browse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse);
    }
    public void search(View view) {
        Intent intent=new Intent(this,search.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent=new Intent(this,home.class);
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
    public void charts(View view) {
        Intent intent=new Intent(this,Charts.class);
        startActivity(intent);
    }
}
