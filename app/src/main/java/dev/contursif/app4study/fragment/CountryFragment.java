package dev.contursif.app4study.fragment;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import dev.contursif.app4study.CountryList;

public class CountryFragment extends ListFragment
{
    interface OnFragmentEventListener
    {
        void selectCountry(String c);
    }
    private OnFragmentEventListener listener=null;
    private CountryList l=new CountryList();
    private String[] countries=null;

    public CountryFragment()
    {
        countries=new String[l.getCountries().size()];
        l.getCountries().toArray(countries);
    }
    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        listener=(OnFragmentEventListener) activity;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ArrayAdapter<String> adapter=new ArrayAdapter<String>((Context) listener,android.R.layout.simple_list_item_1,countries);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onListItemClick(ListView lv, View v, int position, long id)
    {
        listener.selectCountry(countries[position]);
    }
}