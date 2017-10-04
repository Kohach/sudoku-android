package com.example.alexis.imie_android_alexis.Listeners;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.alexis.imie_android_alexis.Activities.Activities_Menu;
import com.example.alexis.imie_android_alexis.Activities.Game_battleship;
import com.example.alexis.imie_android_alexis.Models.Game;
import com.example.alexis.imie_android_alexis.MyConstant;
import com.example.alexis.imie_android_alexis.R;

/**
 * Created by alexis on 03/10/17.
 */

public class GameClickListener implements AdapterView.OnItemClickListener {
    private Activity activity;

    public GameClickListener(Activity a){
        this.activity = a;
    }

    @Override
    public void onItemClick(AdapterView<?> av, View v, int position, long id){

        Game game = (Game) av.getAdapter().getItem(position);
        Toast.makeText(v.getContext(), game.getNom(), Toast.LENGTH_SHORT).show();

        Intent igame = game.getGameIntent();
        this.activity.startActivity(igame);
    }

}
