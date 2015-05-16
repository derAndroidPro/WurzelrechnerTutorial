package de.derandroidpro.wurzelrechnertutorial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText et;
    TextView tv;
    Button btn;

    double wurzelzahl;
    double gezogeneWurzel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et = (EditText) findViewById(R.id.editText);
        tv = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et.getText().length() >0){

                    wurzelzahl = Double.parseDouble(et.getText().toString());
                    gezogeneWurzel = Math.sqrt(wurzelzahl);
                    tv.setText("gezogene Wurzel: " + Double.toString(gezogeneWurzel));


                }   else {
                    tv.setText("Bitte eine Quadratwurzel eingeben");
                }
            }
        });

    }



}
