package com.android.tonimiko.firstplatformer;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;

public class DebugLevelSelector extends Activity {

	@SuppressLint({ "NewApi", "NewApi" })
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_debug_level_selector);
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}















	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_debug_level_selector, menu);
		return true;
	}















	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}















	public void runDebugOne(View view) {
		Intent myIntent = new Intent(DebugLevelSelector.this, Game.class);
		myIntent.putExtra("level_debug_1", 100);
		startActivity(myIntent);
	}

}
