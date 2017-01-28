package vendorpack;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nikki.project2.R;

import java.util.ArrayList;

/**
 * Created by NIKKI on 06/01/2017.
 */

public class ServiceAdapter1 extends RecyclerView.Adapter<ServiceAdapter1.MyViewHolder> {


    private ArrayList<ServiceDataModel> dataset;



    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView servicename;
        TextView servicedes;
        TextView servicewebsite;
        TextView servicecontactno;

        public MyViewHolder(View itemView) {

            super(itemView);

            this.servicename = (TextView) itemView.findViewById(R.id.servicename);
            this.servicewebsite = (TextView) itemView.findViewById(R.id.servicewebsite);
            this.servicecontactno = (TextView) itemView.findViewById(R.id.servicecontactno);
        }
    }

        public ServiceAdapter1(ArrayList<ServiceDataModel> data){
            this.dataset=data;
        }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detailservice_cardview, parent, false);
        ServiceAdapter1.MyViewHolder myViewHolder = new ServiceAdapter1.MyViewHolder(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listposition) {

        TextView servicename=holder.servicename;
        TextView servicewebsite=holder.servicewebsite;
        TextView servicecontactno=holder.servicecontactno;

        servicename.setText(dataset.get(listposition).getName());
        servicewebsite.setText(dataset.get(listposition).getWebsite());
        servicecontactno.setText(dataset.get(listposition).getContactno());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
