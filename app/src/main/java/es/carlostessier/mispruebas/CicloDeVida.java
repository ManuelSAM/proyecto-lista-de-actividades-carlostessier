package es.carlostessier.mispruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CicloDeVida extends AppCompatActivity {

    final static String tag = CicloDeVida.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_de_vida);
        android.util.Log.i(tag, "onCreate");
    }

    protected void onStart() {
        super.onStart();
        android.util.Log.i(tag, "onStart");
    }

    protected void onRestart() {
        super.onRestart();
        android.util.Log.i(tag, "onRestart");
    }

    protected void onResume() {
        super.onResume();
        android.util.Log.i(tag, "onResume");
    }

    protected void onPause() {
        super.onPause();
        android.util.Log.i(tag, "onPause");
    }

    protected void onStop() {
        super.onStop();
        android.util.Log.i(tag, "onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        android.util.Log.i(tag, "onDestroy");
    }
}
