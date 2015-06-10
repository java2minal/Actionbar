package com.luct.minal.myapplication;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NewApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.home:
                homeActivity();
                return true;

            case R.id.java:
                javaActivity();
                return true;

            case R.id.android:
                androidActivity();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void homeActivity() {
        Toast.makeText(this, "Home Option Selected", Toast.LENGTH_SHORT).show();
    }

    public void javaActivity() {
        Toast.makeText(this, "Java Option Selected", Toast.LENGTH_SHORT).show();
    }

    public void androidActivity() {
        Toast.makeText(this, "Android Option Selected", Toast.LENGTH_SHORT).show();
    }

}