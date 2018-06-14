package dev.contursif.app4study;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class AdapterGridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_grid);
        String[] nomi=new String[]{"Torino","Roma","Milano","Napoli","Firenze"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, R.layout.row,nomi);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(adapter);
    }
}
