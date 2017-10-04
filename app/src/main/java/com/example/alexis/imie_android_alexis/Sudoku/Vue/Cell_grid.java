package com.example.alexis.imie_android_alexis.Sudoku.Vue;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.constraint.ConstraintSet;

import com.example.alexis.imie_android_alexis.R;


/**
 * Created by alexis on 04/10/17.
 */

public class Cell_grid {
    private Context ctx;
    private LinearLayout cellLayout;

    public Cell_grid(Context ctx){
        this.ctx = ctx;
        createCell();
    }

    public void createCell(){
        LinearLayout cellHolder = new LinearLayout(this.ctx);
        LinearLayout.LayoutParams cellHolderParams= new LinearLayout.LayoutParams(
                ConstraintLayout.LayoutParams.WRAP_CONTENT, // width
                ConstraintLayout.LayoutParams.WRAP_CONTENT
        );
        cellHolder.setBackgroundResource(R.drawable.sudoku_cell);
        cellHolder.setLayoutParams(cellHolderParams);

        ConstraintLayout cellConstraint = new ConstraintLayout(this.ctx);
        ConstraintLayout.LayoutParams cellLayout = new ConstraintLayout.LayoutParams(
                135, //width
                ConstraintLayout.LayoutParams.WRAP_CONTENT //height
        );
        cellConstraint.setLayoutParams(cellLayout);
        /*ConstraintSet set = new ConstraintSet();
        set.clone(cellConstraint);
        set.connect(ConstraintSet.PARENT_ID,ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP);//Top to TopOf
        set.connect(ConstraintSet.PARENT_ID,ConstraintSet.START, ConstraintSet.PARENT_ID, ConstraintSet.START);//Start to StartOf
        set.connect(ConstraintSet.PARENT_ID,ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END);//End to EndOf
        set.setDimensionRatio(cellConstraint.getId(), "H, 1:1");
        set.applyTo(cellConstraint);*/

        EditText cell = new EditText(this.ctx);
        cell.setText("");
        cellConstraint.addView(cell);

        cellHolder.addView(cellConstraint);

        this.cellLayout = cellHolder;
    }

    public LinearLayout getCell(){
        return this.cellLayout;
    }
}
