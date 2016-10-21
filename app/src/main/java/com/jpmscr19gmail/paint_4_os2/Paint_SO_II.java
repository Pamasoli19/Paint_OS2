package com.jpmscr19gmail.paint_4_os2;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

public class Paint_SO_II extends AppCompatActivity implements  View.OnClickListener {

    ImageButton negro;
    ImageButton blanco;
    ImageButton rojo;
    ImageButton verde;
    ImageButton azul;
    Lienzo lienzo;
    float ppequenyo;
    float pmediano;
    float pgrande;
    float pdefecto;
    ImageButton trazo;
    ImageButton nuevo;
    ImageButton borrar;
    ImageButton guardar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint__so__ii);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        negro = (ImageButton)findViewById(R.id.colornegro);
        blanco = (ImageButton)findViewById(R.id.colorblanco);
        rojo = (ImageButton)findViewById(R.id.colorrojo);
        verde = (ImageButton)findViewById(R.id.colorverde);
        azul = (ImageButton)findViewById(R.id.colorazul);
        trazo = (ImageButton)findViewById(R.id.trazo);
        nuevo = (ImageButton)findViewById(R.id.nuevo);
        borrar = (ImageButton)findViewById(R.id.borrar);
        guardar = (ImageButton)findViewById(R.id.guardar);


        negro.setOnClickListener(this);
        blanco.setOnClickListener(this);
        rojo.setOnClickListener(this);
        verde.setOnClickListener(this);
        azul.setOnClickListener(this);
        trazo.setOnClickListener(this);
        nuevo.setOnClickListener(this);
        borrar.setOnClickListener(this);
        guardar.setOnClickListener(this);

        lienzo = (Lienzo)findViewById(R.id.Lienzo);

        ppequenyo= 10;
        pmediano= 20;
        pgrande= 30;

        pdefecto= pmediano;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_paint__so__ii, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String color = null;
        switch (v.getId()){
            case R.id.colornegro:
                color = v.getTag().toString();
                lienzo.setColor(color);
                break;
            case R.id.colorblanco:
                color = v.getTag().toString();
                lienzo.setColor(color);
                break;
            case R.id.colorazul:
                color = v.getTag().toString();
                lienzo.setColor(color);
                break;
            case R.id.colorverde:
                color = v.getTag().toString();
                lienzo.setColor(color);
                break;
            case R.id.colorrojo:
                color = v.getTag().toString();
                lienzo.setColor(color);
                break;
            case R.id.trazo:
                final Dialog tamanyopunto  = new Dialog(this);
                tamanyopunto.setTitle("Tamaño del punto:");
                tamanyopunto.setContentView(R.layout.punto_size);
                TextView smallBtn = (TextView)tamanyopunto.findViewById(R.id.tpequenyo);
                smallBtn.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {

                        Lienzo.setTamanyoPunto(ppequenyo);
                    }
                }
                break;
            case R.id.nuevo:
                break;
            case R.id.borrar:
                break;
            case R.id.guardar:
                break;
            default:
                break;
        }
    }
}
