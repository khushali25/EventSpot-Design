package customerpack;

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

public class CustomerProfileAdapter extends RecyclerView.Adapter<CustomerProfileAdapter.MyViewHolder>  {

    private ArrayList<CustomerProfileDataModel> dataSet;

    public CustomerProfileAdapter(ArrayList<CustomerProfileDataModel> data) {
        this.dataSet = data;
    }

    @Override
    public CustomerProfileAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        android.view.View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_customerprofile, parent, false);
        CustomerProfileAdapter.MyViewHolder myViewHolder = new CustomerProfileAdapter.MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        TextView CustomerName=holder.CustomerName;
        TextView CustomerEmailid=holder.CustomerEmailid;
        TextView CustomerPassword=holder.CustomerPassword;
        TextView CustomerMobileno=holder.CustomerMobileno;
        TextView CustomerGender=holder.CustomerGender;
        TextView CustomerAddress=holder.CustomerAddress;
        TextView CustomerDateOfBirth=holder.CustomerDateOfBirth;

        CustomerName.setText(dataSet.get(position).getName());
        CustomerEmailid.setText(dataSet.get(position).getEmailid());
        CustomerPassword.setText(dataSet.get(position).getPassword());
        CustomerMobileno.setText(dataSet.get(position).getMobileno());
        CustomerGender.setText(dataSet.get(position).getGender());
        CustomerAddress.setText(dataSet.get(position).getAddress());
        CustomerDateOfBirth.setText(dataSet.get(position).getDateofbirth());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView CustomerName;
        TextView CustomerEmailid;
        TextView CustomerPassword;
        TextView CustomerMobileno;
        TextView CustomerGender;
        TextView CustomerAddress;
        TextView CustomerDateOfBirth;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.CustomerName = (TextView)itemView.findViewById(R.id.CustomerProfileName);
            this.CustomerEmailid = (TextView)itemView.findViewById(R.id.CustomerProfileEmailId);
            this.CustomerPassword = (TextView)itemView.findViewById(R.id.CustomerProfilePassword);
            this.CustomerMobileno= (TextView)itemView.findViewById(R.id.CustomerProfileMobileNo);
            this.CustomerGender = (TextView)itemView.findViewById(R.id.CustomerProfileGender);
            this.CustomerAddress = (TextView)itemView.findViewById(R.id.CustomerProfileAddress);
            this.CustomerDateOfBirth= (TextView)itemView.findViewById(R.id.CustomerProfileDOB);
        }
    }
}
