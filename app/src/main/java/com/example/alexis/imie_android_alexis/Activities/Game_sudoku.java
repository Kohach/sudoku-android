package com.example.alexis.imie_android_alexis.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.alexis.imie_android_alexis.R;
import com.example.alexis.imie_android_alexis.Sudoku.Vue.Sudoku_grid;

public class Game_sudoku extends AppCompatActivity {

    private int size = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_sudoku);
        init();

    }

    public void init(){
        Sudoku_grid sudoku = new Sudoku_grid(size, this, this.findViewById(R.id.sudoku));

    }

}
