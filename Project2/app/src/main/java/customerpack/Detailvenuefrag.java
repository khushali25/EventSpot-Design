package customerpack;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nikki.project2.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Detailvenuefrag extends Fragment
{

    //private GridLayoutManager gmanagaer;


    private RecyclerView recyclerView1;
    private DetailvenueAdapter mAdapter;
    private ArrayList<DetailvenueDataModel> data;
    private RecyclerView.LayoutManager mLayoutManager;
    Button b1;

    public Detailvenuefrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_detailvenuefrag, container, false);

        recyclerView1 = (RecyclerView) view.findViewById(R.id.my_recycler_view1);

        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView1.setLayoutManager(mLayoutManager);

        b1=(Button)view.findViewById(R.id.eventbook);

        data = new ArrayList<DetailvenueDataModel>();
        for (int i = 0; i < DetailvenueMydata.venuenameArray.length; i++) {
            data.add(new DetailvenueDataModel(
                    DetailvenueMydata.venuenameArray[i],
                    DetailvenueMydata.addressArray[i],
                    DetailvenueMydata.areaArray[i],
                    DetailvenueMydata.cityArray[i],
                    DetailvenueMydata.stateArray[i],
                    DetailvenueMydata.websiteArray[i],
                    DetailvenueMydata.contactnoArray[i],
                    DetailvenueMydata.facilityArray[i],
                    DetailvenueMydata.timeslotArray[i],
                    DetailvenueMydata.capacityArray[i],
                    DetailvenueMydata.eventamountarray[i],
                    DetailvenueMydata.bookingamountarray[i]

            ));
        }

        mAdapter = new DetailvenueAdapter(data);

        recyclerView1.setAdapter(mAdapter);


       b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



           /*   Frag_BookEvent f1=new Frag_BookEvent();
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(android.R.id.content,f1);
                ft.commit(); */

                /*Frag_BookEvent f1=new Frag_BookEvent();
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(android.R.id.content,f1);
                ft.commit(); */

                Intent intent=new Intent(getContext(),BookEvent.class);
                startActivity(intent);




            }
        });

        return view;

    }

}
