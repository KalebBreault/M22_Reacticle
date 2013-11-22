package com.M22.reacticle;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

public class ManualInpputActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manual_inpput);
		// Show the Up button in the action bar.
		setupActionBar();
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.manual_inpput, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
		
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
