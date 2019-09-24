package com.example.myapplicationedmtdev;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;



public class jugar extends AppCompatActivity {


    private preguntasRespuestas pr = new preguntasRespuestas();

    private String[] todasPreguntas = pr.getTodasPreguntas();
    private final int _RESPUESTAS = 4;
    private final String _TRANSPARENTE = "#00000000";
    private final String _AMARILLO = "#fcea85";
    private final String _ROJO = "#b52a2c";
    private final String _VERDE = "#6be060";
    private final String _DEFAULT_COLOR = "#aaaaaa";

    private TextView numPregunta;
    private TextView pregunta;
    private ImageView preguntaImagen;
    private Button respuesta1;
    private Button respuesta2;
    private Button respuesta3;
    private Button respuesta4;
    private Button siguientePregunta;
    private Button restart;
    private TextView puntuacion;
    private RadioGroup group1;
    private RadioGroup group2;
    private RadioButton respuestaRadio1;
    private RadioButton respuestaRadio2;
    private RadioButton respuestaRadio3;
    private RadioButton respuestaRadio4;

    private int puntuacionTotal = 0;
    private int numeroPregunta = 0;
    private String respuestaCorrecta = "";
    private boolean correcto = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);

        siguientePregunta = (Button) findViewById(R.id.next);
        restart = (Button) findViewById(R.id.restart);
        group1 = (RadioGroup) findViewById(R.id.grupoRespuestas);
        group2 = (RadioGroup) findViewById(R.id.grupoRespuestasTipo2);
        numPregunta = (TextView) findViewById(R.id.tvTitle);
        pregunta = (TextView) findViewById(R.id.tvQuestion);
        puntuacion = (TextView) findViewById(R.id.tvScore);
        respuesta1 = (Button) findViewById(R.id.respuestaNumero1);
        respuesta2 = (Button) findViewById(R.id.respuestaNumero2);
        respuesta3 = (Button) findViewById(R.id.respuestaNumero3);
        respuesta4 = (Button) findViewById(R.id.respuestaNumero4);
        preguntaImagen = (ImageView) findViewById(R.id.imgQuestion);
        respuestaRadio1 = (RadioButton) findViewById(R.id.respuesta_rdBtn1);
        respuestaRadio2 = (RadioButton) findViewById(R.id.respuesta_rdBtn2);
        respuestaRadio3 = (RadioButton) findViewById(R.id.respuesta_rdBtn3);
        respuestaRadio4 = (RadioButton) findViewById(R.id.respuesta_rdBtn4);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.jack_sparrow);
        preguntaImagen.setImageBitmap(bitmap);

        init();


        respuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuesta1.getText() == respuestaCorrecta ){
                    correcto = true;
                    respuesta1.setBackgroundColor(Color.parseColor(_VERDE));
                }else{
                    correcto = false;
                    respuesta1.setBackgroundColor(Color.parseColor(_ROJO));
                    int numBotonCorrecto = pr.botonCorrecto(numeroPregunta);

                    switch(numBotonCorrecto){
                        case 1:
                            respuesta1.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 2:
                            respuesta2.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 3:
                            respuesta3.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 4:
                            respuesta4.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                    }

                }
                noClick();
                showMsg(correcto);
            }
        });

        respuesta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuesta2.getText() == respuestaCorrecta ){
                    correcto = true;
                    respuesta2.setBackgroundColor(Color.parseColor(_VERDE));
                }else{
                    correcto = false;
                    respuesta2.setBackgroundColor(Color.parseColor(_ROJO));
                    int numBotonCorrecto = pr.botonCorrecto(numeroPregunta);

                    switch(numBotonCorrecto){
                        case 1:
                            respuesta1.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 2:
                            respuesta2.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 3:
                            respuesta3.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 4:
                            respuesta4.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                    }

                }
                noClick();
                showMsg(correcto);
            }
        });

        respuesta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuesta3.getText() == respuestaCorrecta ){
                    correcto = true;
                    respuesta3.setBackgroundColor(Color.parseColor(_VERDE));
                }else{
                    correcto = false;
                    respuesta3.setBackgroundColor(Color.parseColor(_ROJO));
                    int numBotonCorrecto = pr.botonCorrecto(numeroPregunta);

                    switch(numBotonCorrecto){
                        case 1:
                            respuesta1.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 2:
                            respuesta2.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 3:
                            respuesta3.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 4:
                            respuesta4.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                    }

                }
                noClick();
                showMsg(correcto);
            }
        });

        respuesta4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuesta4.getText() == respuestaCorrecta ){
                    correcto = true;
                    respuesta4.setBackgroundColor(Color.parseColor(_VERDE));

                }else{
                    correcto = false;
                    respuesta4.setBackgroundColor(Color.parseColor(_ROJO));
                    int numBotonCorrecto = pr.botonCorrecto(numeroPregunta);

                    switch(numBotonCorrecto){
                        case 1:
                            respuesta1.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 2:
                            respuesta2.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 3:
                            respuesta3.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 4:
                            respuesta4.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                    }

                }
                noClick();
                showMsg(correcto);
            }
        });


        respuestaRadio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuestaRadio1.getText() == respuestaCorrecta ){
                    correcto = true;
                    respuestaRadio1.setBackgroundColor(Color.parseColor(_VERDE));

                }else{
                    correcto = false;
                    respuestaRadio1.setBackgroundColor(Color.parseColor(_ROJO));
                    int numBotonCorrecto = pr.botonCorrecto(numeroPregunta);

                    switch(numBotonCorrecto){
                        case 1:
                            respuestaRadio1.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 2:
                            respuestaRadio2.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 3:
                            respuestaRadio3.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 4:
                            respuestaRadio4.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                    }

                }

                noClick();
                showMsg(correcto);
            }
        });

        respuestaRadio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuestaRadio2.getText() == respuestaCorrecta ){
                    correcto = true;
                    respuestaRadio1.setBackgroundColor(Color.parseColor(_VERDE));

                }else{
                    correcto = false;
                    respuestaRadio2.setBackgroundColor(Color.parseColor(_ROJO));
                    int numBotonCorrecto = pr.botonCorrecto(numeroPregunta);

                    switch(numBotonCorrecto){
                        case 1:
                            respuestaRadio1.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 2:
                            respuestaRadio2.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 3:
                            respuestaRadio3.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 4:
                            respuestaRadio4.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                    }

                }

                noClick();
                showMsg(correcto);
            }
        });

        respuestaRadio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuestaRadio3.getText() == respuestaCorrecta ){
                    correcto = true;
                    respuestaRadio3.setBackgroundColor(Color.parseColor(_VERDE));

                }else{
                    correcto = false;
                    respuestaRadio3.setBackgroundColor(Color.parseColor(_ROJO));
                    int numBotonCorrecto = pr.botonCorrecto(numeroPregunta);

                    switch(numBotonCorrecto){
                        case 1:
                            respuestaRadio1.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 2:
                            respuestaRadio2.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 3:
                            respuestaRadio3.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 4:
                            respuestaRadio4.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                    }

                }

                noClick();
                showMsg(correcto);
            }
        });

        respuestaRadio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(respuestaRadio4.getText() == respuestaCorrecta ){
                    correcto = true;
                    respuestaRadio4.setBackgroundColor(Color.parseColor(_VERDE));

                }else{
                    correcto = false;
                    respuestaRadio4.setBackgroundColor(Color.parseColor(_ROJO));
                    int numBotonCorrecto = pr.botonCorrecto(numeroPregunta);

                    switch(numBotonCorrecto){
                        case 1:
                            respuestaRadio1.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 2:
                            respuestaRadio2.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 3:
                            respuestaRadio3.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                        case 4:
                            respuestaRadio4.setBackgroundColor(Color.parseColor(_VERDE));
                            break;
                    }

                }

                noClick();
                showMsg(correcto);
            }
        });

        siguientePregunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScore();
                if(numeroPregunta>=4){
                    showScore(v);
                }else{
                    if(numeroPregunta==3){
                        siguientePregunta.setText("Finish Quiz");
                    }
                    numeroPregunta = numeroPregunta +1; //Avanza al siguiente numero de pregunta
                    init();
                }


            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroPregunta = 0;
                puntuacionTotal = 0;
                siguientePregunta.setText("Next");
                init();

            }
        });
    }

    private void init(){
        if(numeroPregunta!=3){
            group2.setVisibility(View.INVISIBLE);
            group1.setVisibility(View.VISIBLE);
            preguntaImagen.setVisibility(View.INVISIBLE);


            for(int i=0; i<_RESPUESTAS; i++){
                switch(i){
                    case 0:
                        respuesta1.setText(pr.getRespuestas1(numeroPregunta));
                        respuesta1.setBackgroundColor(Color.parseColor(_AMARILLO));
                        respuesta1.setClickable(true);
                        respuestaRadio1.setChecked(false);
                        break;
                    case 1:
                        respuesta2.setText(pr.getRespuestas2(numeroPregunta));
                        respuesta2.setBackgroundColor(Color.parseColor(_AMARILLO));
                        respuesta2.setClickable(true);
                        respuestaRadio2.setChecked(false);
                        break;
                    case 2:
                        respuesta3.setText(pr.getRespuestas3(numeroPregunta));
                        respuesta3.setBackgroundColor(Color.parseColor(_AMARILLO));
                        respuesta3.setClickable(true);
                        respuestaRadio3.setChecked(false);
                        break;
                    case 3:
                        respuesta4.setText(pr.getRespuestas4(numeroPregunta));
                        respuesta4.setBackgroundColor(Color.parseColor(_AMARILLO));
                        respuesta4.setClickable(true);
                        respuestaRadio4.setChecked(false);
                        break;
                }
            }

        }else{
            group2.setVisibility(View.VISIBLE);
            group1.setVisibility(View.INVISIBLE);
            preguntaImagen.setVisibility(View.VISIBLE);

            for(int i=0; i<_RESPUESTAS; i++){
                switch(i){
                    case 0:
                        respuestaRadio1.setChecked(false);
                        respuestaRadio1.setClickable(true);
                        respuestaRadio1.setBackgroundColor(Color.parseColor(_TRANSPARENTE));
                        respuestaRadio1.setText(pr.getRespuestas1(numeroPregunta));
                        break;
                    case 1:
                        respuestaRadio2.setChecked(false);
                        respuestaRadio2.setClickable(true);
                        respuestaRadio2.setBackgroundColor(Color.parseColor(_TRANSPARENTE));
                        respuestaRadio2.setText(pr.getRespuestas2(numeroPregunta));
                        break;
                    case 2:
                        respuestaRadio3.setChecked(false);
                        respuestaRadio3.setClickable(true);
                        respuestaRadio3.setBackgroundColor(Color.parseColor(_TRANSPARENTE));
                        respuestaRadio3.setText(pr.getRespuestas3(numeroPregunta));
                        break;
                    case 3:
                        respuestaRadio4.setChecked(false);
                        respuestaRadio4.setClickable(true);
                        respuestaRadio4.setBackgroundColor(Color.parseColor(_TRANSPARENTE));
                        respuestaRadio4.setText(pr.getRespuestas4(numeroPregunta));
                        break;
                }
            }
        }


        siguientePregunta.setVisibility(View.INVISIBLE);
        restart.setVisibility(View.VISIBLE);
        numPregunta.setText("Pregunta " + (numeroPregunta+1) +"/5");
        pregunta.setText(pr.getPregunta(numeroPregunta));
        respuestaCorrecta = pr.getRespuestasCorrectas(numeroPregunta);
        puntuacion.setText("Score: " + puntuacionTotal);
    }

    private void updateScore(){
        if(correcto){
            puntuacionTotal += 3;
            puntuacion.setText("Score: " + puntuacionTotal);
        }else{
            puntuacionTotal -= 2;
            puntuacion.setText("Score: " + puntuacionTotal);
        }

    }

    private void noClick(){
        respuesta1.setClickable(false);
        respuesta2.setClickable(false);
        respuesta3.setClickable(false);
        respuesta4.setClickable(false);
        respuestaRadio1.setClickable(false);
        respuestaRadio2.setClickable(false);
        respuestaRadio3.setClickable(false);
        respuestaRadio4.setClickable(false);
        siguientePregunta.setVisibility(View.VISIBLE);
    }

    private void showMsg(boolean b){
        if(b){
            Toast.makeText(this, "CORRECTO", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "INCORRECTO", Toast.LENGTH_SHORT).show();
        }
    }

    private void showScore(View v){
        Intent i = new Intent(this, ScoreActivity.class);
        i.putExtra("score", puntuacionTotal);
        startActivity(i);
    }


}