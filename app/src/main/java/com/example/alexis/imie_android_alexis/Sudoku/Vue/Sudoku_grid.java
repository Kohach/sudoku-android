package com.example.alexis.imie_android_alexis.Sudoku.Vue;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alexis.imie_android_alexis.R;


/**
 * Created by alexis on 04/10/17.
 */

public class Sudoku_grid {
    public int[] sizes = {2,4,5,6,7,9,16,25};

    private int size;
    private Context ctx;
    private LinearLayout gridContainer;

    public Sudoku_grid(int size, Context ctx, View gridContainer){
        this.ctx = ctx;
        this.gridContainer = (LinearLayout)gridContainer;
        if(findSize(size, sizes)){
            this.size = size;
            createGrid();
        }
    }

    public boolean findSize(int value, int[] sizes){
        for(int i=0; i < sizes.length ; i++){
            if(sizes[i] == value){
                return true;
            }
        }
        return false;
    }

    public void createGrid(){


        LinearLayout line = new LinearLayout(this.ctx);
        LinearLayout.LayoutParams lineParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // width
                LinearLayout.LayoutParams.WRAP_CONTENT// height
                 // weight
        );
        line.setLayoutParams(lineParams);
        line.setOrientation(LinearLayout.HORIZONTAL);

        for(int i=0; i <= size; i++){
            if(i%3 == 0 && i != 0) {
                this.gridContainer.addView(line);
                line = new LinearLayout(this.ctx);
                lineParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, // width
                        LinearLayout.LayoutParams.WRAP_CONTENT // height
                );
                line.setLayoutParams(lineParams);
                line.setOrientation(LinearLayout.HORIZONTAL);

            }
                Square_grid square = new Square_grid(this.ctx);
                line.addView(square.getCreatedSquare());
        }
        /*TextView tv =  new TextView(this.ctx);
        tv.setText("trolol");
        ll.addView(tv);*/
        //this.gridContainer.addView(ll);

    }
}
