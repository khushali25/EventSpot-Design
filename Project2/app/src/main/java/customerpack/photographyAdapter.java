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

public class photographyAdapter extends RecyclerView.Adapter<photographyAdapter.MyViewHolder1> {

    private ArrayList<photographerDataModel> dataSet;
    private Context context;

    public photographyAdapter(ArrayList<photographerDataModel> data)
    {
        this.dataSet=data;
    }

    @Override
    public photographyAdapter.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.photography_cardview, parent, false);
        photographyAdapter.MyViewHolder1 myViewHolder = new photographyAdapter.MyViewHolder1(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder1 holder, int position) {

        TextView photographyname=holder.photographyname;
        TextView photographywebsite=holder.photographywebsite;
        TextView photographycontactno=holder.photographycontactno;
        ImageView photographyimage=holder.photographyimage;

        photographyname.setText(dataSet.get(position).getName());
        photographywebsite.setText(dataSet.get(position).getWebsite());
        photographycontactno.setText(dataSet.get(position).getContactno());
        photographyimage.setImageResource(dataSet.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {

        TextView photographyname;
        TextView photographywebsite;
        TextView photographycontactno;
        ImageView photographyimage;

        public MyViewHolder1(View itemView) {
            super(itemView);

            this. photographyname = (TextView) itemView.findViewById(R.id.photographername);
            this.photographyimage=(ImageView) itemView.findViewById(R.id.photographyimage);
            this.photographycontactno=(TextView)itemView.findViewById(R.id.photographercontactno);
            this.photographywebsite=(TextView)itemView.findViewById(R.id.photographerwebsite);
        }


    }
}
