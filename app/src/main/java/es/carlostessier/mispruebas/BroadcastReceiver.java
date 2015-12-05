package es.carlostessier.mispruebas;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BroadcastReceiver extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver);
        BroadcastReceiver receptor = new BroadcastReceiver();
        IntentFilter inF = new IntentFilter("es.carlostessier.mispruebas.CUSTOM_INTENT");
    }

    public void sendBroadcastIntent (View view){
        Intent intent = new Intent();
        intent.putExtra("key","Hello World");
        intent.setAction("es.carlostessier.mispruebas.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
