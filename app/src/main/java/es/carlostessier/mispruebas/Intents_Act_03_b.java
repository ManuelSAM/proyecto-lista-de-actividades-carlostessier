package es.carlostessier.mispruebas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Intents_Act_03_b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03_b);
        Bundle bundle = getIntent().getExtras();
        String nuevoString = bundle.getString("str1");
        int nuevoInt = bundle.getInt("num1",0);
        Toast.makeText(this, nuevoString, Toast.LENGTH_LONG).show();
        Toast.makeText(this, Integer.toString(nuevoInt), Toast.LENGTH_LONG).show();
    }

    public void volverPrincipal(View view){
        Intent intent = new Intent();
        intent.setData(Uri.parse("str2"));
        intent.putExtra("num2", 35);
        setResult(RESULT_OK,intent);
        finish();
    }
}
