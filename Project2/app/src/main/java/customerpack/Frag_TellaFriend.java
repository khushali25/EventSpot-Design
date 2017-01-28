package customerpack;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.nikki.project2.R;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_TellaFriend extends Fragment {

    String[] eventimeslot={"Royal Landmark","Topaz","Pakvan","Saffron"};


    public Frag_TellaFriend() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag__tella_friend, container, false);

        ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(getContext(),android.R.layout.simple_dropdown_item_1line,eventimeslot);
        MaterialBetterSpinner materialBetterSpinner1=(MaterialBetterSpinner)view.findViewById(R.id.spinner_lsitofvenue);
        materialBetterSpinner1.setAdapter(arrayAdapter1);



        return view;
    }

}
