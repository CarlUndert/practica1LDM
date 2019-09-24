package com.example.myapplicationedmtdev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity {


    TextView tvPuntos;
    Button playAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        tvPuntos = (TextView) findViewById(R.id.tvScore);
        playAgain = (Button) findViewById(R.id.btnPlayAgain);

        Bundle bundle = getIntent().getExtras();
        int puntuacionTotal = bundle.getInt("score");

        tvPuntos.setText(puntuacionTotal + "/15");

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newGame(v);
            }
        });
    }

    private void newGame(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
