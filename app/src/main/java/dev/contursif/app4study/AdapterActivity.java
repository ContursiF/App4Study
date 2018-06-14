package dev.contursif.app4study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        //Objects.requireNonNull(getActionBar()).setDisplayHomeAsUpEnabled(true);
        //getActionBar().setDisplayHomeAsUpEnabled(true);

        final String[] citta=new String[]{"Torino","Roma","Milano","Napoli","Firenze"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.row,citta);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> av, View v, int pos, long id)
            {
                Toast.makeText(getApplicationContext(),
                        "Selezionato "+citta[pos], Toast.LENGTH_LONG).show();
            }
        });
    }
}
