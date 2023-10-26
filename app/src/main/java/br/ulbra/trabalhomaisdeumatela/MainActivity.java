package br.ulbra.trabalhomaisdeumatela;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;
public class MainActivity extends Activity {
    Button bttelaprincipal, bttela2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTela1();
    }
    public void CarregarTela1() {
        setContentView(R.layout.tela1);
        bttela2 = (Button) findViewById(R.id.bttela2);
        bttela2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                CarregarTela2(); } });
    }

    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        bttelaprincipal = (Button) findViewById (R.id.bttela2);
        bttelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela1();
            }
        });
    } }