package vendorpack;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nikki.project2.Login;
import com.example.nikki.project2.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ServiceDetail1 extends Fragment {

    private RecyclerView recyclerView1;
    private ServiceAdapter1 mAdapter;
    private ArrayList<ServiceDataModel> data;
    private RecyclerView.LayoutManager mLayoutManager;
    Button update,delete;


    public ServiceDetail1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_service_detail1,container,false);

        recyclerView1 = (RecyclerView)view.findViewById(R.id.my_recycler_view_serives);
        recyclerView1.setHasFixedSize(true);

        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext()));

        update=(Button)view.findViewById(R.id.Update1);
        delete=(Button)view.findViewById(R.id.Delete1);

        data = new ArrayList<ServiceDataModel>();
        for (int i = 0; i < ServiceMydata.nameArray.length; i++)
        {
            data.add(new ServiceDataModel(
                    ServiceMydata.nameArray[i],
                    ServiceMydata.websiteArray[i],
                    ServiceMydata.contactnoArray[i]

            ));
        }

        mAdapter = new ServiceAdapter1(data);
        recyclerView1.setAdapter(mAdapter);


        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Frag_EditServiceDetail f1=new Frag_EditServiceDetail();
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(R.id.frcontent3,f1,"Frag_EditServiceDetail");
                ft.addToBackStack("Frag_EditServiceDetail");
                ft.commit();
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setMessage("Are you sure to delete Service Detail");
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
