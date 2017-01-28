package customerpack;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
public class Frag_CustomerProfile extends Fragment {

    TextView t1,t2,t3;
    private RecyclerView recyclerView;
    private CardView cardView;
    private ArrayList<CustomerProfileDataModel> data;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public Frag_CustomerProfile() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag__customer_profile,container,false);
        recyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view_customerprofile);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.customer);
        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);
        t1=(TextView)view.findViewById(R.id.changepass2);
        t2=(TextView)view.findViewById(R.id.cust_logout);
        t3=(TextView)view.findViewById(R.id.updateprofile);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Frag_ChangePass f1=new Frag_ChangePass();
                android.support.v4.app.FragmentTransaction ft=getFragmentManager().beginTransaction();
                ft.add(R.id.frcontent,f1,"Frag_ChangePass");
                ft.addToBackStack("Frag_ChangePass");
                ft.commit();
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Login.class);
                startActivity(intent);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),EditCustomerProfile.class);
                startActivity(intent);
            }
        });


        data = new ArrayList<CustomerProfileDataModel>();
        for (int i = 0; i < CustomerProfileMyData.nameArray.length; i++)
        {
            data.add(new CustomerProfileDataModel(
                    CustomerProfileMyData.nameArray[i],
                    CustomerProfileMyData.emailidArray[i],
                    CustomerProfileMyData.passwordArray[i],
                    CustomerProfileMyData.mobilenoArray[i],
                    CustomerProfileMyData.genderArray[i],
                    CustomerProfileMyData.addressArray[i],
                    CustomerProfileMyData.dobArray[i]

            ));
        }

        mAdapter = new CustomerProfileAdapter(data);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}
