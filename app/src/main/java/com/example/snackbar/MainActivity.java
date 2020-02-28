package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
  private  Button btnSnackbar, btnfechar;
  private Snackbar snackbar;

  @Override
  protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btnSnackbar = findViewById(R.id.button);
    btnfechar = findViewById(R.id.buttonFechar);

    btnSnackbar.setOnClickListener(new View.OnClickListener( ) {
      @Override
      public void onClick (View view) {
        //Snackbar.make(view, "Botão pressionado", Snackbar.LENGTH_LONG).show();
        //Snackbar.make(view, "Botão pressionado", Snackbar.LENGTH_INDEFINITE).show();
        //Snackbar.make(view, "Botão pressionado", Snackbar.LENGTH_LONG).setAction("Confirmar", new View.OnClickListener( ) {
        snackbar = Snackbar.make(view, "Botão pressionado", Snackbar.LENGTH_INDEFINITE).setAction("Confirmar", new View.OnClickListener( ) {

          @Override
          public void onClick (View v) {
            btnSnackbar.setText("Botão abrir alterado!");
          }
        });
        snackbar.show( );
      }
    });

    btnfechar.setOnClickListener(new View.OnClickListener( ) {
      @Override
      public void onClick (View v) {
        
        snackbar.dismiss( );
      }
    });
  }
}
