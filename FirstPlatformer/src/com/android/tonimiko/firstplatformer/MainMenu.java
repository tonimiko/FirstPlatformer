package com.android.tonimiko.firstplatformer;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainMenu extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }
    
    public void startNewGame(View view){
       
    }
    
    public void startDebug(View view){
       Intent myIntent = new Intent(MainMenu.this,DebugLevelSelector.class);
       startActivity(myIntent);
    }
}
