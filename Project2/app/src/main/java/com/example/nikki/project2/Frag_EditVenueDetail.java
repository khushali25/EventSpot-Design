package com.example.nikki.project2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_EditVenueDetail extends Fragment {

    String[] venuetype={"Banquet","PartyPlot","Hall"};
    String[] venuearea={"Maninagar","Shivranjani","C.G.Road","S.G.Road","Bopal"};
    String[] venuecity={"Ahmedabad"};
    String[] venuestate={"Gujarat"};


    public Frag_EditVenueDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_frag__edit_venue_detail,container,false);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_dropdown_item_1line,venuetype);
        MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
                view.findViewById(R.id.android_material_design_spinner_edit);
        materialDesignSpinner.setAdapter(arrayAdapter);


        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(getContext(),android.R.layout.simple_dropdown_item_1line,venuearea);
        MaterialBetterSpinner materialBetterSpinner1=(MaterialBetterSpinner)view.findViewById(R.id.edit_area);
        materialBetterSpinner1.setAdapter(arrayAdapter1);

        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<String>(getContext(),android.R.layout.simple_dropdown_item_1line,venuecity);
        MaterialBetterSpinner materialBetterSpinner2=(MaterialBetterSpinner)view.findViewById(R.id.edit_city);
        materialBetterSpinner2.setAdapter(arrayAdapter2);


        ArrayAdapter<String> arrayAdapter3=new ArrayAdapter<String>(getContext(),android.R.layout.simple_dropdown_item_1line,venuestate);
        MaterialBetterSpinner materialBetterSpinner3=(MaterialBetterSpinner)view.findViewById(R.id.edit_state);
        materialBetterSpinner3.setAdapter(arrayAdapter3);
        // Inflate the layout for this fragment
        return view;
    }

}
