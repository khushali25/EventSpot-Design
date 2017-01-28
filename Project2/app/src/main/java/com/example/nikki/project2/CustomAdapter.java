package com.example.nikki.project2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by NIKKI on 30/12/2016.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataSet;


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView VenueName;
        TextView VenueAddress;
        TextView VenueArea;
        TextView VenueCity;
        TextView VenueState;
        TextView VenueWebsite;
        TextView VenueContactno;
        TextView VenueFacility;
        TextView VenueTimeSlot;
        TextView VenueCapacity;
        TextView EventAmount;
        TextView BookingAmount;

        public MyViewHolder(android.view.View itemView) {
            super(itemView);
            this.VenueName = (TextView) itemView.findViewById(R.id.venuename1);
            this.VenueAddress=(TextView) itemView.findViewById(R.id.venuename1);
            this.VenueArea=(TextView)itemView.findViewById(R.id.venuearea1);
            this.VenueCity=(TextView)itemView.findViewById(R.id.venuecity1);
            this.VenueState=(TextView)itemView.findViewById(R.id.venuestate1);
            this.VenueWebsite=(TextView)itemView.findViewById(R.id.venuewebsite1);
            this.VenueContactno=(TextView) itemView.findViewById(R.id.venuecontactno1);
            this.VenueFacility=(TextView)itemView.findViewById(R.id.venuefacility1);
            this.VenueTimeSlot=(TextView)itemView.findViewById(R.id.venuetimeslot1);
            this.VenueCapacity=(TextView) itemView.findViewById(R.id.venuecapacity1);
            this.EventAmount=(TextView) itemView.findViewById(R.id.venueeventamount1);
            this.BookingAmount=(TextView)itemView.findViewById(R.id.venuebookingamount1);

        }
    }

    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        android.view.View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView VenueName= holder.VenueName;
        TextView VenueAddress=holder.VenueAddress;
        TextView VenueArea=holder.VenueArea;
        TextView VenueCity=holder.VenueCity;
        TextView VenueState=holder.VenueState;
        TextView VenueWebsite=holder.VenueWebsite;
        TextView VenueContactno=holder.VenueContactno;
        TextView VenueFaciliry=holder.VenueFacility;
        TextView VenueTimeSlot=holder.VenueTimeSlot;
        TextView VenueCapacity=holder.VenueCapacity;
        TextView EventAmount=holder.EventAmount;
        TextView BookingAmount=holder.BookingAmount;

        VenueName.setText(dataSet.get(listPosition).getName());
        VenueAddress.setText(dataSet.get(listPosition).getAddress());
        VenueArea.setText(dataSet.get(listPosition).getArea());
        VenueCity.setText(dataSet.get(listPosition).getCity());
        VenueState.setText(dataSet.get(listPosition).getState());
        VenueWebsite.setText(dataSet.get(listPosition).getWebsite());
        VenueContactno.setText(dataSet.get(listPosition).getContactno());
        VenueFaciliry.setText(dataSet.get(listPosition).getFacility());
        VenueTimeSlot.setText(dataSet.get(listPosition).getTimeslot());
        VenueCapacity.setText(dataSet.get(listPosition).getCapacity());
        EventAmount.setText(dataSet.get(listPosition).getEventamount());
        BookingAmount.setText(dataSet.get(listPosition).getBookingamout());


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

}


