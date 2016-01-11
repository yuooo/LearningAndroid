package grostigrepetitdragon.memegenerator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements EnterTextFragment.TopFragmentListener {
    final String TAG = "MAIN";

    // This get called by EnterTextFragment when button is clicked
    @Override
    public void buttonClicked(String top, String bottom) {
        ImageFragment imageFragment = (ImageFragment) getSupportFragmentManager().findFragmentById(R.id.image_fragment);
//        Log.i(TAG, top + " MAIN");
//        Log.i(TAG, bottom + " MAIN");
//        Log.i(TAG, imageFragment.toString() + " MAIN");
        imageFragment.setMemeText(top, bottom);
    }

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
}
