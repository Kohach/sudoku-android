package com.example.alexis.imie_android_alexis.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.example.alexis.imie_android_alexis.Adapters.GamesAdapter;
import com.example.alexis.imie_android_alexis.Listeners.GameClickListener;
import com.example.alexis.imie_android_alexis.Models.Game;
import com.example.alexis.imie_android_alexis.MyConstant;
import com.example.alexis.imie_android_alexis.R;

/**
 * Created by alexis on 02/10/17.
 */

public class Activities_Menu extends AppCompatActivity {

    private Game[] games = null;
    private GridView gv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.games = MyConstant.initArrGames(this);
        //Toast.makeText(this, games[0].getImage(), Toast.LENGTH_SHORT).show();
        initGridView();
    }

    public void initGridView(){
        this.gv = (GridView)findViewById(R.id.games);
        this.gv.setOnItemClickListener(new GameClickListener(this));
        GamesAdapter gameAdapt = new GamesAdapter(this, R.layout.game_grid, this.games);
        this.gv.setAdapter(gameAdapt);
    }


    @Override
    public void onActivityResult(int rqCode, int resCode, Intent i){
        if(rqCode == MyConstant.RQC_BATTLESHIP){
            if(resCode == RESULT_OK){
                String msg = i.getStringExtra(MyConstant.RES_BATTLESHIP);
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            }
        }
    }

}
