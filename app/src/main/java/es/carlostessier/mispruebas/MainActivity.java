package es.carlostessier.mispruebas;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    final static String TAG = MainActivity.class.getName();

    String[] pruebas = {"CicloDeVida", "Pulsame1", "Intents_Act_01", "Intents_Act_02", "Intents_Act_03", "ImplicitIntents", "BroadcastReceiver"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_expandable_list_item_1,
                        pruebas);

        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String prueba = pruebas[position];
        Log.d(TAG, "Pulsado " + prueba);

        try {
            Class<?> clase = Class.forName("es.carlostessier.mispruebas." + prueba);
            Intent intent = new Intent(this, clase);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            Log.d(TAG, "Error no encuentro la clase", e);
        }
    }
}
