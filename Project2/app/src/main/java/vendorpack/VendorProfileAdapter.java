package vendorpack;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nikki.project2.R;

import java.util.ArrayList;

/**
 * Created by NIKKI on 20/01/2017.
 */

public class VendorProfileAdapter extends RecyclerView.Adapter<VendorProfileAdapter.MyViewHolder> {

    private ArrayList<VendorProfileDataModel> dataSet;

    public VendorProfileAdapter(ArrayList<VendorProfileDataModel> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        android.view.View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_vendorprofile, parent, false);
        VendorProfileAdapter.MyViewHolder myViewHolder = new VendorProfileAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        TextView VendorName=holder.VendorName;
        TextView VendorEmailid=holder.VendorEmailid;
        TextView VendorPassword=holder.VendorPassword;
        TextView VendorMobileno=holder.VendorMobileno;
        TextView VendorGender=holder.VendorGender;
        TextView VendorAddress=holder.VendorAddress;
        TextView VendorDateOfBirth=holder.VendorDateOfBirth;

        VendorName.setText(dataSet.get(position).getName());
        VendorEmailid.setText(dataSet.get(position).getEmailid());
        VendorPassword.setText(dataSet.get(position).getPassword());
        VendorMobileno.setText(dataSet.get(position).getMobileno());
        VendorGender.setText(dataSet.get(position).getGender());
        VendorAddress.setText(dataSet.get(position).getAddress());
        VendorDateOfBirth.setText(dataSet.get(position).getDateofbirth());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView VendorName;
        TextView VendorEmailid;
        TextView VendorPassword;
        TextView VendorMobileno;
        TextView VendorGender;
        TextView VendorAddress;
        TextView VendorDateOfBirth;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.VendorName = (TextView)itemView.findViewById(R.id.VendorProfileName);
            this.VendorEmailid = (TextView)itemView.findViewById(R.id.VendorProfileEmailId);
            this.VendorPassword = (TextView)itemView.findViewById(R.id.VendorProfilePassword);
            this.VendorMobileno= (TextView)itemView.findViewById(R.id.VendorProfileMobileNo);
            this.VendorGender = (TextView)itemView.findViewById(R.id.VendorProfileGender);
            this.VendorAddress = (TextView)itemView.findViewById(R.id.VendorProfileAddress);
            this.VendorDateOfBirth= (TextView)itemView.findViewById(R.id.VendorProfileDOB);

        }
    }
}
