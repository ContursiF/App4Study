package dev.contursif.app4study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterSpinnerActivity extends AppCompatActivity {
    private CountryList countries=new CountryList();
    private ArrayAdapter<String> listviewAdapter;
    private ArrayAdapter<String> spinnerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // assegnazione del layout all'Activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_spinner);
/*
        // preparazione della ListView per l'elenco delle città
        ListView lv=(ListView) findViewById(R.id.cities);
        listviewAdapter=new ArrayAdapter<String>(this, R.layout.row_spinner);
        lv.setAdapter(listviewAdapter);

        // preparazione dello Spinner per mostrare l'elenco dei Paesi
        spinnerAdapter=new ArrayAdapter<String>(this, R.layout.row_spinner);
        spinnerAdapter.addAll(countries.getCountries());
        Spinner sp=(Spinner) findViewById(R.id.countries);
        sp.setAdapter(spinnerAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                TextView txt=(TextView) arg1.findViewById(R.id.rowtext);
                String s=txt.getText().toString();
                updateCities(s);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0)
            { }
        });*/
    }

    private void updateCities(String city)
    {
        ArrayList<String> l=(ArrayList<String>)
                countries.getCitiesByCountry(city);
        listviewAdapter.clear();
        listviewAdapter.addAll(l);
    }

}
