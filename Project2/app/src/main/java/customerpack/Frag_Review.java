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
public class Frag_Review extends Fragment {

    private RecyclerView recyclerView1;
    private ReviewAdapter mAdapter;
    private ArrayList<ReviewDataModel> data;
    private RecyclerView.LayoutManager mLayoutManager;


    public Frag_Review() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag__review,container,false);

        recyclerView1 = (RecyclerView) view.findViewById(R.id.my_recycler_view_review);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView1.setLayoutManager(mLayoutManager);


        data = new ArrayList<ReviewDataModel>();
        for (int i = 0; i < ReviewMyData.cust_nameArray.length; i++) {
            data.add(new ReviewDataModel(

                    ReviewMyData.cust_nameArray[i],
                    ReviewMyData.cust_reviewArray[i]


            ));
        }

        mAdapter = new ReviewAdapter(data);

        recyclerView1.setAdapter(mAdapter);


        return view;
    }

}
