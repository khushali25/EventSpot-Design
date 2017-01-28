package customerpack;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nikki.project2.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {


    private RecyclerView recyclerView1;
    private choreographyAdapter mAdapter;
    private ArrayList<choreographyDataModel> data;
    private RecyclerView.LayoutManager mLayoutManager;


    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag2, container, false);

        recyclerView1 = (RecyclerView) view.findViewById(R.id.my_recycler_view_choreography);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView1.setLayoutManager(mLayoutManager);


        data = new ArrayList<choreographyDataModel>();
        for (int i = 0; i < choreographyMyData.nameArray.length; i++) {
            data.add(new choreographyDataModel(
                    choreographyMyData.nameArray[i],
                    choreographyMyData.websiteArray[i],
                    choreographyMyData.contactnoarray[i],
                    choreographyMyData.imageArray[i]


            ));
        }

        mAdapter = new choreographyAdapter(data);

        recyclerView1.setAdapter(mAdapter);




        return view;
    }

}
