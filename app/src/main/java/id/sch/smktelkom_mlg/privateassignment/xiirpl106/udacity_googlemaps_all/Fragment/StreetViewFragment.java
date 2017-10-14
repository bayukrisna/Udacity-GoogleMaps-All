package id.sch.smktelkom_mlg.privateassignment.xiirpl106.udacity_googlemaps_all.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.sch.smktelkom_mlg.privateassignment.xiirpl106.udacity_googlemaps_all.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StreetViewFragment extends Fragment {


    public StreetViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_street_view, container, false);
    }

}
