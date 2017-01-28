package com.example.nikki.project2;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_OwnerDetail extends Fragment {



    private RecyclerView recyclerView;
    private CardView cardView;
    private ArrayList<DataModel> data;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    Button update,delete;


    public Frag_OwnerDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag__owner_detail,null);

        recyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        update=(Button)view.findViewById(R.id.Update);
        delete=(Button)view.findViewById(R.id.Delete);

        data = new ArrayList<DataModel>();
        for (int i = 0; i < MyData.nameArray.length; i++)
        {
            data.add(new DataModel(
                    MyData.nameArray[i],
                    MyData.addressArray[i],
                    MyData.areaArray[i],
                    MyData.cityArray[i],
                    MyData.stateArray[i],
                    MyData.websiteArray[i],
                    MyData.contactnoArray[i],
                    MyData.facilityArray[i],
                    MyData.timeslotArray[i],
                    MyData.capacityArray[i],
                    MyData.eventamountarray[i],
                    MyData.bookingamountarray[i]
            ));
        }

        mAdapter = new CustomAdapter(data);
        recyclerView.setAdapter(mAdapter);



        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Frag_EditVenueDetail f1=new Frag_EditVenueDetail();
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(R.id.frcontent4,f1,"Frag_EditVenueDetail");
                ft.addToBackStack("Frag_EditVenueDetail");
                ft.commit();
            }
        });


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure to delete Venue Detail");
                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent=new Intent(getContext(),Login.class);
                        startActivity(intent);

                    }
                });


                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                       dialog.dismiss();
                    }
                });

                AlertDialog alert11 = alertDialogBuilder.create();
                alert11.show();

            }
        });

        return view;
    }

}
