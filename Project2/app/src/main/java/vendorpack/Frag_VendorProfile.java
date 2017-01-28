package vendorpack;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nikki.project2.Frag_ChangePass;
import com.example.nikki.project2.Login;
import com.example.nikki.project2.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_VendorProfile extends Fragment {

    private RecyclerView recyclerView;
    private CardView cardView;
    private ArrayList<VendorProfileDataModel> data;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    TextView vendorlogout;
    TextView vendorupdateprofile;
    TextView vendorchangepass;

    public Frag_VendorProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_frag__vendor_profile,container,false);
        recyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view_vendorprofile);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        vendorlogout=(TextView)view.findViewById(R.id.vendor_logout);
        vendorupdateprofile=(TextView)view.findViewById(R.id.vendor_updateprofile);
        vendorchangepass=(TextView)view.findViewById(R.id.vendor_changepass);



        data = new ArrayList<VendorProfileDataModel>();
        for (int i = 0; i < VendorProfileMyData.nameArray.length; i++)
        {
            data.add(new VendorProfileDataModel(
                    VendorProfileMyData.nameArray[i],
                    VendorProfileMyData.emailidArray[i],
                    VendorProfileMyData.passwordArray[i],
                    VendorProfileMyData.mobilenoArray[i],
                    VendorProfileMyData.genderArray[i],
                    VendorProfileMyData.addressArray[i],
                    VendorProfileMyData.dobArray[i]

            ));
        }

        mAdapter = new VendorProfileAdapter(data);
        recyclerView.setAdapter(mAdapter);

        vendorlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Login.class);
                startActivity(intent);
            }
        });




        vendorupdateprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent intent=new Intent(getContext(),EditVendorProfile.class);
                startActivity(intent);
            }
        });
        
        vendorchangepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Frag_ChangePass f1=new Frag_ChangePass();
                android.support.v4.app.FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(R.id.frcontent3,f1,"Frag_ChangePass");
                ft.addToBackStack("Frag_ChangePass");
                ft.commit();

            }
        });


        return  view;
    }

}
