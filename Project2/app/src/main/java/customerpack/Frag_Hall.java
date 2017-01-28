package customerpack;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
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
public class Frag_Hall extends Fragment {

    private RecyclerView recyclerView;
    private CardView cardView;
    private ArrayList<HallDataModel> data3;
    private HallAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    public Frag_Hall() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.frag_hall,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_viewhall);
        recyclerView.setHasFixedSize(true);


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        data3 = new ArrayList<HallDataModel>();
        for (int i = 0; i < MyDataHall.hallnameArray.length; i++) {
            data3.add(new HallDataModel(
                    MyDataHall.hallnameArray[i],
                    MyDataHall.hallAreaArray[i],
                    MyDataHall.hallid_[i],
                    MyDataHall.halldrawableArray[i],
                    MyDataHall.hallMobilearray[i]
            ));
        }
        mAdapter = new HallAdapter(data3);
        recyclerView.setAdapter(mAdapter);



        mAdapter.setOnItemClickListener(onItemClickListener);


        return view;
    }

    HallAdapter.OnItemClickListener onItemClickListener = new HallAdapter.OnItemClickListener()
    {
        @Override
        public void onItemClick(View v, int position) {

            try
            {
                /*Frag_VenueDetail1 df = new Frag_VenueDetail1();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.frcontent,df);
                ft.commit(); */

                Frag_VenueDetail1 f1=new Frag_VenueDetail1();
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(R.id.frcontent,f1,"Frag_VenueDetail1");
               // ft.addToBackStack("Frag_VenueDetail1");
                ft.commit();

            }
            catch (Exception ex)
            {
                //Log.d(v, "onItemClick: ");

            }
        }
    };

}
