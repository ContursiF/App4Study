package dev.contursif.app4study;

import android.os.Bundle;
//import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentTransaction;
import dev.contursif.app4study.fragment.CityFragment;
import dev.contursif.app4study.fragment.CountryFragment;



public class FragmentCity extends AppCompatActivity implements OnFragmentEventListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_city);

        if (findViewById(R.id.container) != null)
        {
            // Se è presente il FrameLayout con id container,
            // vuol dire che siamo in SINGLE-PANE perciò
            // è necessario aggiungere il Fragment con la transazione.

            // Se savedInstanceState non è nullo, non siamo alla
            // prima visualizzazione perciò non serve aggiungere il Fragment.

            if (savedInstanceState != null)
                return;
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new CountryFragment()).commit();
        }
    }
    @Override
    public void selectCountry(String c)
    {
        CityFragment cityFrag = (CityFragment)
                getSupportFragmentManager().findFragmentById(R.id.cityfrag);

        if (cityFrag != null && cityFrag.isInLayout())
        {
            // Il Fragment delle città è già nel layout quindi
            // ne chiediamo solo l'aggiornamento.

            cityFrag.onSelectedCountry(c);
        }
        else
        {
            // Siamo in SINGLE-PANE, quindi le FragmentTransaction
            // operano lo switch tra Fragment.

            CityFragment frag= new CityFragment();
            Bundle b=new Bundle();
            b.putString("country", c);
            frag.setArguments(b);
            FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.container, frag);
            ft.addToBackStack(null);
            ft.commit();
        }
    }
}
