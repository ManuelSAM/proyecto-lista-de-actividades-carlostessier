package es.carlostessier.mispruebas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Intents_Act_01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_01);

    }
    public void secondAct (View view){
        startActivity(new Intent("es.carlostessier.mispruebas.Intents_Act_01_b"));
    }
}
