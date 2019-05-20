package andres.curso.clase1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
//import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

import java.util.Date;

import andres.curso.clase1.Modelo.Alumnos;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
/*
        //Esconde Action Bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //Clear Cache

        WebView obj = null;
        obj.clearCache(true);

        this.getViewModelStore().clear();
*/

/*LLamar al modelo Alumnos */
        final Alumnos Alumno = new Alumnos();
        Alumno.setFechaNacimientoAlumno(new Date());
        Alumno.setNombreAlumno("Necrodamus Vampire");
        Alumno.setNroDeMatricula(123123123);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mWebView = findViewById(R.id.activity_main_webview);
        Button button = findViewById(R.id.button);

        // Create the onClickListener for button
        WebSettings webSettings = mWebView.getSettings();

        // Enable Javascript
        webSettings.setJavaScriptEnabled(true);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mWebView.loadUrl("http://beta.html5test.com/");
            }
        });

        FloatingActionButton fab1 = findViewById(R.id.fabAlumno);

        fab1.setOnClickListener( new View.OnClickListener(){
            public void onClick(View view) {
                Snackbar.make(view, "Nombre de Alumno=" + Alumno.getNombreAlumno(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mWebView.clearCache(true);
                mWebView.destroy();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
