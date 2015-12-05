package es.carlostessier.mispruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Intents_Act_02 extends AppCompatActivity {

    private final static int ACTCODE = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_02);
    }

    public void secondAct (View view){
        Intent intent = new Intent(this,Intents_Act_02_b.class);
        startActivityForResult(intent, ACTCODE);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == ACTCODE){
            if(resultCode == RESULT_OK){
                try {
                    String a = data.getData().toString();
                    Toast.makeText(this,a,Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(this,"Excepción",Toast.LENGTH_LONG).show();
                }
            }
            else if(resultCode==RESULT_CANCELED){
                Toast.makeText(this,"Eeeeerroooooor",Toast.LENGTH_LONG).show();
            }
        }
    }
}
