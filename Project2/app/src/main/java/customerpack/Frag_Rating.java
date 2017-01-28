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
public class Frag_Rating extends Fragment {


    private RecyclerView recyclerView1;
    private RatingAdapter mAdapter;
    private ArrayList<RatingDataModel> data;
    private RecyclerView.LayoutManager mLayoutManager;

    public Frag_Rating() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag__rating,container,false);

        recyclerView1 = (RecyclerView) view.findViewById(R.id.my_recycler_view_rating);
        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView1.setLayoutManager(mLayoutManager);


        data = new ArrayList<RatingDataModel>();
        for (int i = 0; i < RatingMyData.cust_nameArray.length; i++) {
            data.add(new RatingDataModel(

                RatingMyData.cust_nameArray[i]


            ));
        }



        mAdapter = new RatingAdapter(data);

        recyclerView1.setAdapter(mAdapter);

        return view;
    }

}
