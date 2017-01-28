package customerpack;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nikki.project2.R;

import java.util.ArrayList;


/**
 * Created by Khushali Thakkar on 12/30/2016.
 */

public class DetailvenueAdapter extends RecyclerView.Adapter<DetailvenueAdapter.MyViewHolder1>
{

    private ArrayList<DetailvenueDataModel> dataSet;

    private Context context;



    public DetailvenueAdapter(ArrayList<DetailvenueDataModel> data)

    {
        this.dataSet = data;

    }

    @Override
    public DetailvenueAdapter.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {




        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_cardview, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        DetailvenueAdapter.MyViewHolder1 myViewHolder = new DetailvenueAdapter.MyViewHolder1(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(final DetailvenueAdapter.MyViewHolder1 holder, final int listPosition) {

        TextView textViewVenueName = holder.textViewVenueName;
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


        textViewVenueName.setText(dataSet.get(listPosition).getName());
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
    public int getItemCount()
    {
        return dataSet.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder
    {
        TextView textViewVenueName;
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
        ImageView imagegallery;

        public MyViewHolder1(View itemView)
        {
            super(itemView);
            this.textViewVenueName = (TextView) itemView.findViewById(R.id.tvenuename);
            this.VenueAddress=(TextView) itemView.findViewById(R.id.taddress);
            this.VenueArea=(TextView)itemView.findViewById(R.id.tarea);
            this.VenueCity=(TextView)itemView.findViewById(R.id.tcity);
            this.VenueState=(TextView)itemView.findViewById(R.id.tstate);
            this.VenueWebsite=(TextView)itemView.findViewById(R.id.twebsite);
            this.VenueContactno=(TextView) itemView.findViewById(R.id.tcontactno);
            this.VenueFacility=(TextView)itemView.findViewById(R.id.tfacility);
            this.VenueTimeSlot=(TextView)itemView.findViewById(R.id.ttimeslot);
            this.VenueCapacity=(TextView) itemView.findViewById(R.id.tcapacity);
            this.EventAmount=(TextView) itemView.findViewById(R.id.teventamount);
            this.BookingAmount=(TextView)itemView.findViewById(R.id.tbookamount);

        }

    }




}
