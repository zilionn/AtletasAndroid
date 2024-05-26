package com.zilion.atletasandroid;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment fragment = null;
        int itemId = item.getItemId();
        if (itemId == R.id.menu_juvenil) {
            fragment = new FragmentJuvenil();
        } else if (itemId == R.id.menu_senior) {
            fragment = new FragmentSenior();
        } else if (itemId == R.id.menu_outro) {
            fragment = new FragmentOutro();
        } else {
            return super.onOptionsItemSelected(item);
        }

        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.commit();
        }
        return true;
    }
}