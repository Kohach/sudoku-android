package com.example.alexis.imie_android_alexis.Models;

import android.content.Intent;

/**
 * Created by alexis on 02/10/17.
 */

public class Game {

    private String nom;
    private int image;
    private Intent game_intent;

    public Game(String nom, int image, Intent game_intent){
        this.nom = nom;
        this.image = image;
        this.game_intent = game_intent;
    }

    public String getNom(){
        return this.nom;
    }

    public int getImage(){
        return this.image;
    }

    public Intent getGameIntent(){
        return this.game_intent;
    }
}
