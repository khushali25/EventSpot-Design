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
public class Frag4 extends Fragment {

    private RecyclerView recyclerView1;
    private photographyAdapter mAdapter;
    private ArrayList<photographerDataModel> data;
    private RecyclerView.LayoutManager mLayoutManager;


    public Frag4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag4,null);

        recyclerView1 = (RecyclerView) view.findViewById(R.id.my_recycler_view_photography);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView1.setLayoutManager(mLayoutManager);

        data = new ArrayList<photographerDataModel>();
        for (int i = 0; i < photographerMyData.nameArray.length; i++) {
            data.add(new photographerDataModel(
                    photographerMyData.nameArray[i],
                    photographerMyData.websiteArray[i],
                    photographerMyData.contactnoarray[i],
                    photographerMyData.imageArray[i]


            ));
        }

        mAdapter = new photographyAdapter(data);

        recyclerView1.setAdapter(mAdapter);

        return view;
    }

}
