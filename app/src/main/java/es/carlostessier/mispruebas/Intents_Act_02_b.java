package es.carlostessier.mispruebas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Intents_Act_02_b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_02_b);
    }

    public void clickAceptar (View view){
        Intent intent = new Intent();
        try{
            EditText et = (EditText)findViewById(R.id.editText);
            String name = et.getText().toString();
            intent.setData(Uri.parse(name));
            setResult(RESULT_OK,intent);
        }catch (Exception e){
            setResult(-1, intent);
        }
        finish();
    }
}
