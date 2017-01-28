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
 * Created by NIKKI on 07/01/2017.
 */

public class choreographyAdapter extends RecyclerView.Adapter<choreographyAdapter.MyViewHolder1> {

    private ArrayList<choreographyDataModel> dataSet;
    private Context context;

    public choreographyAdapter(ArrayList<choreographyDataModel> data)
    {
        this.dataSet=data;
    }


    @Override
    public choreographyAdapter.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.choreography_cardview, parent, false);
        choreographyAdapter.MyViewHolder1 myViewHolder = new choreographyAdapter.MyViewHolder1(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder1 holder, int position) {

        TextView choreographyname=holder.choreographyname;
        TextView choreographywebsite=holder.choreographywebsite;
        TextView choreographycontactno=holder.choreographycontactno;
        ImageView choreographyimage=holder.choreographyimage;


        choreographyname.setText(dataSet.get(position).getName());
        choreographywebsite.setText(dataSet.get(position).getWebsite());
        choreographycontactno.setText(dataSet.get(position).getContactno());
        choreographyimage.setImageResource(dataSet.get(position).getImage());


    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {

        TextView choreographyname;
        TextView choreographywebsite;
        TextView choreographycontactno;
        ImageView choreographyimage;


        public MyViewHolder1(View itemView) {
            super(itemView);

            this.choreographyname= (TextView)itemView.findViewById(R.id.choreographyname);
            this.choreographyimage=(ImageView) itemView.findViewById(R.id.choreographyimage);
            this.choreographywebsite=(TextView)itemView.findViewById(R.id.choreographywebsite);
            this.choreographycontactno=(TextView)itemView.findViewById(R.id.choreographycontactno);
        }



    }
}
