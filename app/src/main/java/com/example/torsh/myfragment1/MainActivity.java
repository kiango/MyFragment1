package com.example.torsh.myfragment1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.app.FragmentManager;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.fragmentContainer);

        if (fragment==null) {
            fragment = new CrimeFragment();
            fragmentManager.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
        /*if (fragment != null) {
            fragment = new CrimeLocationFragment();
            fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit();
            //fragmentManager.beginTransaction().replace(R.id.fragmentContainer, R.id.fragmentContainer) .commit();
        }*/
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
}
