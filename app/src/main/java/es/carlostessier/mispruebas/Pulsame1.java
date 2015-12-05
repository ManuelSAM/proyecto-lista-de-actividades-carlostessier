package es.carlostessier.mispruebas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pulsame1 extends AppCompatActivity {
    
    Button btn;
    int numeroclicks = 0 ;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsame1);
        btn = (Button)findViewById(R.id.button);
        
    }

    protected void onSaveInstanceState(Bundle currentState){
        super.onSaveInstanceState(currentState);
        String currentButtonSt = String.valueOf(btn.getText());
        currentState.putString("savedString",currentButtonSt);
        currentState.putInt("savedClicks",numeroclicks);
    }

    protected void onRestoreInstanceState(Bundle storedState){
        super.onSaveInstanceState(storedState);
        btn.setText(storedState.getString("savedString"));
        numeroclicks = storedState.getInt("savedClicks");
    }

    public void contClicks(View view){
        numeroclicks++;
        Resources res= getResources();
        String buttonText = res.getQuantityString(R.plurals.numberOfPush, numeroclicks, numeroclicks);
        btn.setText(buttonText);
    }
}
