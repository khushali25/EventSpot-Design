package customerpack;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nikki.project2.R;

import java.util.ArrayList;

/**
 * Created by NIKKI on 13/01/2017.
 */

public class RatingAdapter extends RecyclerView.Adapter<RatingAdapter.MyViewHolder1> {

    private ArrayList<RatingDataModel> dataSet;
    private Context context;

    public RatingAdapter(ArrayList<RatingDataModel> data)
    {
        this.dataSet=data;
    }

    @Override
    public MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rating_cardview, parent, false);
        RatingAdapter.MyViewHolder1 myViewHolder = new RatingAdapter.MyViewHolder1(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder1 holder, int position) {

        TextView cust_name=holder.cust_name;

        cust_name.setText(dataSet.get(position).getName());


    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {

        TextView cust_name;


        public MyViewHolder1(View itemView) {
            super(itemView);
            this.cust_name = (TextView) itemView.findViewById(R.id.cust_name1);


        }
    }

}
