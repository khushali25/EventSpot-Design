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
public class Frag_Banquet extends Fragment {

    /*private static RecyclerView.Adapter adapter;

    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;*/

    private RecyclerView recyclerView;
    private CardView cardView;
    private ArrayList<DataModel> data;
    private CustomAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    public Frag_Banquet() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.frag_banquet,container,false);

        recyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            data.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.AreaArray[i],
                    MyData.id_[i],
                    MyData.drawableArray[i],
                    MyData.Mobilearray[i]
            ));
        }

        mAdapter = new CustomAdapter(data);
        recyclerView.setAdapter(mAdapter);



        mAdapter.setOnItemClickListener(onItemClickListener);

            return view;
    }

    CustomAdapter.OnItemClickListener onItemClickListener = new CustomAdapter.OnItemClickListener()
    {
        @Override
        public void onItemClick(View v, int position) {


            try
            {
               Frag_VenueDetail1 f1=new Frag_VenueDetail1();
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(R.id.frcontent,f1,"Frag_VenueDetail1");
              //  ft.addToBackStack("Frag_VenueDetail1");
                ft.commit();
            }
            catch (Exception ex)
            {
                //Log.d(v, "onItemClick: ");

            }
        }
    };



}


