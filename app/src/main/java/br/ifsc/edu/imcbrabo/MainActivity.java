package br.ifsc.edu.imcbrabo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void  abrirApp(View view){

        if(view==findViewById(R.id.btnIMC)){
            Intent intent = new Intent(this,CalcularIMC.class);
            startActivity(intent);
            
        }

    }
}
