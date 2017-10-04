package com.example.alexis.imie_android_alexis.Adapters;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alexis.imie_android_alexis.Models.Game;
import com.example.alexis.imie_android_alexis.R;

/**
 * Created by alexis on 02/10/17.
 */

public class GamesAdapter extends ArrayAdapter {

    private Context ctx;
    private Game[] games;
    private int game_layout;

    public GamesAdapter(Context context, int resourceID, Game[] games){
        super(context, resourceID, games);
        this.ctx = context;
        this.game_layout = resourceID;
        this.games = games;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Log.e("DEBUG", "getView");

        LinearLayout ll;
        ViewHolderArrayAdapt vh;
        if(convertView == null){
            ll = (LinearLayout)LayoutInflater.from(this.ctx).inflate(this.game_layout, parent, false);
            ImageView imgV = (ImageView) ll.findViewById(R.id.game_img);
            TextView tv = (TextView) ll.findViewById(R.id.game_name);
            vh = new ViewHolderArrayAdapt(tv, imgV);
            ll.setTag(vh);

        }else {
            ll = (LinearLayout) convertView;
            vh = (ViewHolderArrayAdapt) ll.getTag();
        }

        Game game = this.games[position];
        vh.iv.setBackgroundResource(game.getImage());
        vh.tv.setText(game.getNom());

        return ll;
    }

    public class ViewHolderArrayAdapt{
        public TextView tv;
        public ImageView iv;

        public ViewHolderArrayAdapt(TextView tv, ImageView iv){
            this.tv = tv;
            this.iv = iv;
        }

    }

}
