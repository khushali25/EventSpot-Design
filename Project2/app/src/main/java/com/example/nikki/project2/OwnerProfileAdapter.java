package com.example.nikki.project2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by NIKKI on 19/01/2017.
 */

public class OwnerProfileAdapter extends RecyclerView.Adapter<OwnerProfileAdapter.MyViewHolder> {

    private ArrayList<OwnerProfileDataModel> dataSet;

    public OwnerProfileAdapter(ArrayList<OwnerProfileDataModel> data) {
        this.dataSet = data;
    }

    public OwnerProfileAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        android.view.View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_ownerprofile, parent, false);
        OwnerProfileAdapter.MyViewHolder myViewHolder = new OwnerProfileAdapter.MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        TextView OwnerName=holder.OwnerName;
        TextView OwnerEmailid=holder.OwnerEmailid;
        TextView OwnerPassword=holder.OwnerPassword;
        TextView OwnerMobileno=holder.OwnerMobileno;
        TextView OwnerGender=holder.OwnerGender;
        TextView OwnerAddress=holder.OwnerAddress;
        TextView OwnerDateOfBirth=holder.OwnerDateOfBirth;

        OwnerName.setText(dataSet.get(position).getName());
        OwnerEmailid.setText(dataSet.get(position).getEmailid());
        OwnerPassword.setText(dataSet.get(position).getPassword());
        OwnerMobileno.setText(dataSet.get(position).getMobileno());
        OwnerGender.setText(dataSet.get(position).getGender());
        OwnerAddress.setText(dataSet.get(position).getAddress());
        OwnerDateOfBirth.setText(dataSet.get(position).getDateofbirth());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView OwnerName;
        TextView OwnerEmailid;
        TextView OwnerPassword;
        TextView OwnerMobileno;
        TextView OwnerGender;
        TextView OwnerAddress;
        TextView OwnerDateOfBirth;

        public MyViewHolder(View itemView) {
            super(itemView);

            this.OwnerName = (TextView)itemView.findViewById(R.id.OwnerProfileName);
            this.OwnerEmailid = (TextView)itemView.findViewById(R.id.OwnerProfileEmailId);
            this.OwnerPassword = (TextView)itemView.findViewById(R.id.OwnerProfilePassword);
            this.OwnerMobileno= (TextView)itemView.findViewById(R.id.OwnerProfileMobileNo);
            this.OwnerGender = (TextView)itemView.findViewById(R.id.OwnerProfileGender);
            this.OwnerAddress = (TextView)itemView.findViewById(R.id.OwnerProfileAddress);
            this.OwnerDateOfBirth= (TextView)itemView.findViewById(R.id.OwnerProfileDOB);

        }
    }
}
