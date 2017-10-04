package com.example.alexis.imie_android_alexis.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alexis.imie_android_alexis.MyConstant;
import com.example.alexis.imie_android_alexis.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onclick method always public and take View parameter
    public void goCheck(View v){

        EditText v_login = (EditText)findViewById(R.id.user_login);
        EditText v_password = (EditText)findViewById(R.id.user_password);

        String login_saisi = v_login.getText().toString();
        String password_saisi = v_password.getText().toString();

        SharedPreferences sp = this.getSharedPreferences("JEUX_PREFS",this.MODE_PRIVATE);
        String login_stock = sp.getString(MyConstant.LOGIN, "");
        String password_stock = sp.getString(MyConstant.PASSWORD, "");


        if(login_saisi.equals(login_stock) && password_saisi.equals(password_stock)){
            Toast.makeText(this, login_saisi + " " + password_saisi, Toast.LENGTH_SHORT).show();
            Intent menu = new Intent(this, Activities_Menu.class);
            startActivity(menu);
        }else{
            Toast.makeText(this, "Erreur saisie", Toast.LENGTH_SHORT).show();
        }
    }

    public void save(View v){
        EditText v_login = (EditText)findViewById(R.id.user_login);
        EditText v_password = (EditText)findViewById(R.id.user_password);

        String login_saisi = v_login.getText().toString();
        String password_saisi = v_password.getText().toString();

        SharedPreferences sp = this.getSharedPreferences("JEUX_PREFS",this.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(MyConstant.LOGIN,login_saisi);
        editor.putString(MyConstant.PASSWORD, password_saisi);
        editor.apply();
    }

    public void delete(View v){
        EditText v_login = (EditText)findViewById(R.id.user_login);
        EditText v_password = (EditText)findViewById(R.id.user_password);

        String login_saisi = v_login.getText().toString();
        String password_saisi = v_password.getText().toString();

        SharedPreferences sp = this.getSharedPreferences("JEUX_PREFS",this.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(MyConstant.LOGIN, null);
        editor.putString(MyConstant.PASSWORD, null);
        editor.apply();
    }
}
