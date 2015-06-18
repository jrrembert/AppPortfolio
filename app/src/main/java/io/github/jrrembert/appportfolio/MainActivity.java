/**
 * Author: J. Ryan Rembert
 * Project: AppPortfolio
 * Source: https://github.com/jrrembert/AppPortfolio
 *
 * Copyright (C) 2015 J. Ryan Rembert. All rights reserved.
 *
 * Redistribution of source code perfectly cool as long as the
 * above copyright notice is provided and you don't sue me if
 * something (somehow) explodes. Unless it explodes into a
 * rainbow of mutant dinosaurs made out of cookie batter.
 * Then I assume complete credit.
 */

package io.github.jrrembert.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {

    // Should return name of Class (MyActivity here)
    private final String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     *  Checks to see if a button is clicked and if so, logs the button's name and
     *  prints a toast modal to the phone.
     */
    public void sendMessage(View view) {
        
        String click_text = (String) this.getText(R.string.click_text);
        CharSequence text = "";
        String app_name = "";

        switch(view.getId()) {
            case R.id.spotify_streamer:
                app_name = this.getString(R.string.spotify_streamer);
                break;
            case R.id.scores:
                app_name = this.getString(R.string.scores);
                break;
            case R.id.library:
                app_name = this.getString(R.string.library);
                break;
            case R.id.build_it_bigger:
                app_name = this.getString(R.string.build_it_bigger);
                break;
            case R.id.xyz_reader:
                app_name = this.getString(R.string.xyz_reader);
                break;
            case R.id.capstone:
                app_name = this.getString(R.string.capstone);
                break;
        }

        Log.i(TAG, click_text + app_name);

        Context context = getApplicationContext();
        text = this.getString(R.string.toast) + app_name;
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();
    }
}
