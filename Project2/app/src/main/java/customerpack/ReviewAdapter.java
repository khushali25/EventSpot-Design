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

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.MyViewHolder1> {

    private ArrayList<ReviewDataModel> dataSet;
    private Context context;

    public ReviewAdapter(ArrayList<ReviewDataModel> data)
    {
        this.dataSet=data;
    }

    @Override
    public void onBindViewHolder(MyViewHolder1 holder, int position) {

        TextView cust_name=holder.cust_name;
        TextView cust_review=holder.cust_review;

        cust_name.setText(dataSet.get(position).getName());
        cust_review.setText(dataSet.get(position).getReview());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    @Override
    public ReviewAdapter.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.review_cardview, parent, false);
        ReviewAdapter.MyViewHolder1 myViewHolder = new ReviewAdapter.MyViewHolder1(view);
        return myViewHolder;

    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {

        TextView cust_name;
        TextView cust_review;


        public MyViewHolder1(View itemView) {
            super(itemView);

            this.cust_name = (TextView) itemView.findViewById(R.id.cust_name);
            this.cust_review=(TextView) itemView.findViewById(R.id.cust_review);

        }
    }
}
