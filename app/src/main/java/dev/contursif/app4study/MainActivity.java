package dev.contursif.app4study;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        switch(id)
        {
            case R.id.MENU_AGENDA:
            /*
                Codice di gestione della voce MENU_1
             */
                break;
            case R.id.MENU_ARCHIVE:
            /*
                Codice di gestione della voce MENU_2
             */
        }
        return false;
    }

    public void Activity2(View v) {
            goAhead(Main2Activity.class);

    }

    private void goAhead(Class NewActivity) {
        final Intent intent = new Intent(this, NewActivity);
        startActivity(intent);
        finish();
    }
}

