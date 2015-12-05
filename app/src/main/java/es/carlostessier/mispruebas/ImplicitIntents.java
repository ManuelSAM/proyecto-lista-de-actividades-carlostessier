package es.carlostessier.mispruebas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImplicitIntents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);
    }

    public void onClickWebBrowser(View view) {
        Intent i;
        i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.uem.es"));
        startActivity(i);
    }

    public void onClickDial(View view) {
        Intent i;
        i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:902232350."));
        startActivity(i);
    }

    public void onClickShowMaps(View view) {
        Intent i;
        i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo: 40.3736 ,-3.919848"));
        startActivity(i);
    }
}
