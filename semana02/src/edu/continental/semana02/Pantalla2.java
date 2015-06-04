package edu.continental.semana02;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pantalla2 extends Activity implements android.view.View.OnClickListener{
	// Estamos declarando los objetos que vamos a utilizar 
	
	EditText txtTalla;
	EditText txtPeso;
	Button btnProcesar;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla2);
		
		//Estamos asignando valor a los objetos
		txtTalla = (EditText) findViewById(R.id.inputTalla) ;
		txtPeso = (EditText) findViewById(R.id.inputPeso);
		btnProcesar = (Button) findViewById(R.id.btnProcesar);
		
		btnProcesar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla2, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		if (v == btnProcesar){
			
			Double talla = Double.parseDouble(txtTalla.getText().toString());
			Double peso = Double.parseDouble(txtPeso.getText().toString());
			
			// calculamos el indice de masa corporal
			// Double imc = peso / (talla*talla);
			//Math.pow es  para elevar alcuadrado
			
			Double imc = peso / (Math.pow(talla, 2));
			
			
			if (imc < 18.5)
			{
				Toast.makeText(this, "Calificacion infrapeso: " + imc,
						Toast.LENGTH_SHORT).show();
			}
			if (imc > 18.5 && imc <= 24.99)
			{
				Toast.makeText(this, "Su Calificacion es normal: " + imc,
						Toast.LENGTH_SHORT).show();
			}
			if (imc  >= 30)
			{
				Toast.makeText(this, "Su Calificacion es Sobrepeso: " + imc,
						Toast.LENGTH_SHORT).show();
			}
			
		}
		
	}
	
	
	
	
	

}
