package com.example.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button btnSnackbar = findViewById(R.id.button);
    btnSnackbar.setOnClickListener(new View.OnClickListener( ) {
      @Override
      public void onClick (View view) {
        Snackbar.make(view, "Botão pressionado", Snackbar.LENGTH_LONG).show();
      }
    });
  }
}
