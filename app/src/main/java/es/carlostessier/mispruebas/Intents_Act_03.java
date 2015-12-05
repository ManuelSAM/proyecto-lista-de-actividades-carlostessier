package es.carlostessier.mispruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Intents_Act_03 extends AppCompatActivity {

    String saludo = "Hola";
    int numero=222;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03);
    }

    public void secondAct (View view){
        Intent intent = new Intent(this,Intents_Act_03_b.class);
        Bundle extras = new Bundle();
        extras.putString("str1", saludo);
        extras.putInt("num1",numero);
        intent.putExtras(extras);
        startActivityForResult(intent, 1);
    }
    protected void onActivityResult(int reqCode, int resCode, Intent i){
        if(reqCode == 1){
            if (resCode == RESULT_OK){
                String str2 = i.getData().toString();
                String n = String.valueOf(i.getIntExtra("num2", 0));
                Toast.makeText(this, str2 ,Toast.LENGTH_LONG).show();
                Toast.makeText(this, n, Toast.LENGTH_LONG).show();
            }
        }
    }
}
