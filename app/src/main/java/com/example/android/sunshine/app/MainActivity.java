package com.example.android.sunshine.app;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new ForecastFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    /**
     * A placeholder fragment containing a simple view.

    public static class ForecastFragment extends Fragment {

        public ForecastFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            String[] weathers ={
                    "Today-Sunny-99/66",
                    "Minggu-Clouds-108/43",
                    "Senin-Poek-78/12",
                    "Selasa-Kabut-65/52",
                    "Rabu-Banjir-89/32",
                    "Kamis-Guludug-76/32",
                    "Jum'at-Hujan-34/57",
                    "Today-Sunny-99/66",
                    "Minggu-Clouds-108/43",
                    "Senin-Poek-78/12",
                    "Selasa-Kabut-65/52",
                    "Rabu-Banjir-89/32",
                    "Kamis-Guludug-76/32",
                    "Jum'at-Hujan-34/57",
                    "Today-Sunny-99/66",
                    "Minggu-Clouds-108/43",
                    "Senin-Poek-78/12",
                    "Selasa-Kabut-65/52",
                    "Rabu-Banjir-89/32",
                    "Kamis-Guludug-76/32",
                    "Jum'at-Hujan-34/57",
                    "Today-Sunny-99/66",
                    "Minggu-Clouds-108/43",
                    "Senin-Poek-78/12",
                    "Selasa-Kabut-65/52",
                    "Rabu-Banjir-89/32",
                    "Kamis-Guludug-76/32",
                    "Jum'at-Hujan-34/57"
            };
            ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(
                    getActivity(),R.layout.list_item_forecast,
                    R.id.list_item_forecast_textview, weathers);

            ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(forecastAdapter);

            return rootView;
        }






    }
        */
}
