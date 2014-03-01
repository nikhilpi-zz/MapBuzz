package com.example.mapbuzz;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ListAdapter;

public class MainActivity extends Activity {
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


    //Called when user clicks "Map It" Button and displays new List View
    public void ShowDirections(View view){
        Intent intent = new Intent(this, DisplayDirectionsActivity.class);
        startActivity(intent);


    }



}
