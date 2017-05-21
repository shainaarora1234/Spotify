package com.example.a1691576.spotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Charts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charts);

    }
    public void charts(View view) {
        Intent intent = new Intent(this, Charts.class);
        startActivity(intent);
    }
}
