package dev.contursif.app4study.fragment;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import dev.contursif.app4study.CountryList;

public class CityFragment extends ListFragment
{
    private ArrayAdapter<String> adapter=null;
    private CountryList l=new CountryList();

    public CityFragment() {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        Bundle b=getArguments();
        if (b!=null)
        {
            String c=b.getString("country");
            onSelectedCountry(c);
        }
    }

    public void onSelectedCountry(String country)
    {
        adapter.clear();
        adapter.addAll(l.getCitiesByCountry(country));
    }
}