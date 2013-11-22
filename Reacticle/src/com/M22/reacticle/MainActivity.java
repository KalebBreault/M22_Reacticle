package com.M22.reacticle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

public class MainActivity extends Activity {
    public final static String MANUALTEMP = "com.M22.reacticle.MANUALTEMP";
    public final static String MANUALPRESSURE = "com.M22.reacticle.MANUALPRESSURE";
    public final static String MANUALWINDSPEED = "com.M22.reacticle.MANUALWINDSPEED";
    public final static String MANUALWINDDIRECTION = "com.M22.reacticle.MANUALWINDDIRECTION";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
		
	}
	//opens the manual_inpput activity
	public void goToManual(View view)
	{
		Intent intent = new Intent(this, ManualInpputActivity.class);
		startActivity(intent);

	}
	//called when the user clicks calculate in the manual_inpput activity
	public void manualCalculate(View view){
		//do calculations
//		Intent intent = new Intent(this, DisplayCalculationResults.class);
		
		EditText temperatureIn = (EditText) findViewById(R.id.tempReadIn);
		int temperature = Integer.parseInt(temperatureIn.getText().toString());
		
		EditText pressureIn = (EditText) findViewById(R.id.pressureReadIn);
		int pressure = Integer.parseInt(pressureIn.getText().toString());
		
		EditText windspeedIn = (EditText) findViewById(R.id.windspeedReadIn);
		int windspeed = Integer.parseInt(windspeedIn.getText().toString());
		
		EditText windDirectionIn = (EditText) findViewById(R.id.windDirectionIn);
		int windDirection = Integer.parseInt(windDirectionIn.getText().toString());
		
		int total = windDirection+windspeed+temperature+pressure;
		NumberPicker windage = (NumberPicker)findViewById(R.id.NumberPicker01);
		String[] output = new String[1];
		output[0]=Integer.toString(total);
		windage.setDisplayedValues(output);
//		intent.putExtra(MANUALTEMP, temperature);
//		intent.putExtra(MANUALPRESSURE, pressure);
//		intent.putExtra(MANUALWINDSPEED, windspeed);
//		intent.putExtra(MANUALWINDDIRECTION, windDirection);
	}
}
