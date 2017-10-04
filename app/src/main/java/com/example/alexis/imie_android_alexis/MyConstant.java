package com.example.alexis.imie_android_alexis;

import android.content.Context;
import android.content.Intent;

import com.example.alexis.imie_android_alexis.Activities.Game_battleship;
import com.example.alexis.imie_android_alexis.Activities.Game_checkers;
import com.example.alexis.imie_android_alexis.Activities.Game_chess;
import com.example.alexis.imie_android_alexis.Activities.Game_connect4;
import com.example.alexis.imie_android_alexis.Activities.Game_horses;
import com.example.alexis.imie_android_alexis.Activities.Game_sudoku;
import com.example.alexis.imie_android_alexis.Models.Game;

import java.lang.reflect.Array;

/**
 * Created by alexis on 02/10/17.
 */

public class MyConstant {

    public final static String MY_LOGIN = "Alexis";
    public final static String MY_PASSWORD = "P@ssword";
    public final static int RQC_BATTLESHIP = 999;
    public final static String RES_BATTLESHIP = "result";
    public final static String LOGIN = "login";
    public final static String PASSWORD = "password";

    public static Game[] initArrGames(Context c){
        Game[] games = new Game[6];

        games[0] = new Game(c.getResources().getString(R.string.checkers), R.drawable.checkers, new Intent(c, Game_checkers.class));
        games[1] = new Game(c.getResources().getString(R.string.sudoku), R.drawable.sudoku, new Intent(c, Game_sudoku.class));
        games[2] = new Game(c.getResources().getString(R.string.connect4), R.drawable.connect4, new Intent(c, Game_connect4.class));
        games[3] = new Game(c.getResources().getString(R.string.horses), R.drawable.horses, new Intent(c, Game_horses.class));
        games[4] = new Game(c.getResources().getString(R.string.battleship), R.drawable.battleship, new Intent(c, Game_battleship.class));
        games[5] = new Game(c.getResources().getString(R.string.chess), R.drawable.chess, new Intent(c, Game_chess.class));

        return games;
    }
}
