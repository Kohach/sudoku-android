package com.example.alexis.imie_android_alexis.Sudoku.Vue;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alexis.imie_android_alexis.R;

/**
 * Created by alexis on 04/10/17.
 */

public class Square_grid {

    private Cell_grid[] cells;
    private Context ctx;
    public LinearLayout squareLayout;
    private LinearLayout.LayoutParams squareLayoutParams;

    public Square_grid(Context ctx){
        this.ctx = ctx;
        createSquare();
    }

    public LinearLayout createSquare(){
        this.squareLayout = new LinearLayout(this.ctx);
        this.squareLayoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, // width
                LinearLayout.LayoutParams.WRAP_CONTENT // height
        );
        this.squareLayout.setBackgroundResource(R.drawable.sudoku_square);
        this.squareLayout.setLayoutParams(this.squareLayoutParams);
        this.squareLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout line = new LinearLayout(this.ctx);
        LinearLayout.LayoutParams lineParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // width
                LinearLayout.LayoutParams.WRAP_CONTENT// height
                // weight
        );
        line.setLayoutParams(lineParams);
        line.setOrientation(LinearLayout.HORIZONTAL);
        for(int i=0; i <= 9; i++){
            if(i%3 == 0 && i != 0) {
                this.squareLayout.addView(line);
                line = new LinearLayout(this.ctx);
                lineParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, // width
                        LinearLayout.LayoutParams.WRAP_CONTENT // height
                );
                line.setLayoutParams(lineParams);
                line.setOrientation(LinearLayout.HORIZONTAL);
            }
            Cell_grid cell = new Cell_grid(this.ctx);
            line.addView(cell.getCell());
        }

        return squareLayout;
    }

    public LinearLayout getCreatedSquare(){
        return this.squareLayout;
    }

}
