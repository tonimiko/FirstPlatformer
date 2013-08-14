package com.android.tonimiko.firstplatformer;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

public class Game extends Activity {

	public final int UP = 0, LEFT = 1, RIGHT = 2, DOWN = 3, A = 4, B = 5,
			C = 6;
	LevelRender level;















	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent intent = this.getIntent();
		Bundle extras = intent.getExtras();
		int levelNumber = (Integer) extras.get("level_number");

		switch (levelNumber) {
		case 100:
			level = new LevelRender(Game.this, levelNumber);
			setContentView(level);
			break;
		default:
			break;

		}

		getActionBar().setDisplayHomeAsUpEnabled(true);
	}















	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_game, menu);
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

}
