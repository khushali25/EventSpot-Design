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

public class decorationAdapter extends RecyclerView.Adapter<decorationAdapter.MyViewHolder1> {

    private ArrayList<decorationDataModel> dataSet;
    private Context context;


    public decorationAdapter(ArrayList<decorationDataModel> data)
    {
        this.dataSet=data;
    }

    @Override
    public decorationAdapter.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.decoration_cardview, parent, false);
        decorationAdapter.MyViewHolder1 myViewHolder = new decorationAdapter.MyViewHolder1(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder1 holder, int position) {

        TextView decorationname=holder.decorationname;
        TextView decorationwebsite=holder.decorationwebsite;
        TextView decorationcontactno=holder.decorationcontactno;
        ImageView decorationimage=holder.decorationimage;


        decorationname.setText(dataSet.get(position).getName());
        decorationwebsite.setText(dataSet.get(position).getWebsite());
        decorationcontactno.setText(dataSet.get(position).getContactno());
        decorationimage.setImageResource(dataSet.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {

        TextView decorationname;
        TextView decorationwebsite;
        TextView decorationcontactno;
        ImageView decorationimage;

        public MyViewHolder1(View itemView) {
            super(itemView);

            this.decorationname= (TextView) itemView.findViewById(R.id.decoratorrname);
            this.decorationimage=(ImageView) itemView.findViewById(R.id.decoratorimage);
            this.decorationwebsite=(TextView)itemView.findViewById(R.id.decoratorwebsite);
            this.decorationcontactno=(TextView)itemView.findViewById(R.id.decoratorcontactno);
        }


    }
}
