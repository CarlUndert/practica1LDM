package com.example.myapplicationedmtdev;

public class preguntasRespuestas {
    private String preguntas[] = {
            "¿Quién de estos actores recibió un oscar a titulo postumo?",
            "¿Dónde se rodó gran parte de la trilogía del señor de los anillos?",
            "¿Cómo se llama la primera película de la serie Star Wars?",
            "¿Qué papel interpreta Jhonny Depp en las películas Piratas del Caribe?",
            "¿Cómo se llama el actor que da 'vida' al protagonista de Ghost, mas allá del amor (Sam Wheat)?"
    };

    private String respuestas[][] = {
            {"Heath Ledger", "Christian Bale", "Paul Walker", "Robin Williams"},
            {"España", "Estados Unidos", "Nueva Zelanda", "Alemania"},
            {"El retorno del Jedi", "Una nueva esperanza", "El ataque de los clones", "La amenaza fantasma"},
            {"Will Turner", "Capitán Barbosa", "Jack Sparrow", "Davy Jones"},
            {"Kevin Bacon", "Harrison Ford", "Bruce Willis", "Patrick Swayze"}
    };

    private String respuestasCorrectas[] = {
            "Heath Ledger", "Nueva Zelanda", "Una nueva esperanza", "Jack Sparrow", "Patrick Swayze"
    };

    public int botonCorrecto(int x){
        switch(x){
            case 0:
                return 1;

            case 1:
                return 3;

            case 2:
                return 2;

            case 3:
                return 3;

            case 4:
                return 4;

            default:
                return 4;
        }
    }

    public String getPregunta(int x){
        return preguntas[x];
    }

    public String getRespuestas1(int x){
        return respuestas[x][0];
    }

    public String getRespuestas2(int x){
        return respuestas[x][1];
    }

    public String getRespuestas3(int x){
        return respuestas[x][2];
    }

    public String getRespuestas4(int x){
        return respuestas[x][3];
    }

    public String getRespuestasCorrectas(int x) {
        return respuestasCorrectas[x];
    }

    public String[] getTodasPreguntas(){
        return preguntas;
    }
}
