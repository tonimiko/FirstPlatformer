package com.android.tonimiko.firstplatformer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;

public class LevelRender extends View {

	@SuppressLint("NewApi")
	public LevelRender(Context context, int levelNumber) {
		super(context);
		switch (levelNumber) {
		case 100:
			this.setBackground(this.getResources().getDrawable(
					R.drawable.bg_megaman));
		}
	}
}
