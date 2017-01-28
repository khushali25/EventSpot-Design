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

public class CateringAdapter extends RecyclerView.Adapter<CateringAdapter.MyViewHolder1> {

    private ArrayList<CateringDataModel> dataSet;
    private Context context;

    public CateringAdapter(ArrayList<CateringDataModel> data)
    {
        this.dataSet=data;
    }

    @Override
    public CateringAdapter.MyViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.catering_cardview, parent, false);
        CateringAdapter.MyViewHolder1 myViewHolder = new CateringAdapter.MyViewHolder1(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder1 holder, int position) {

        TextView caterername=holder.caterername;
        TextView catererwebsite=holder.catererwebsite;
        TextView caterercontactno=holder.caterercontactno;
        ImageView catererimage=holder.catererimage;

        caterername.setText(dataSet.get(position).getName());
        catererwebsite.setText(dataSet.get(position).getWebsite());
        caterercontactno.setText(dataSet.get(position).getContactno());
        catererimage.setImageResource(dataSet.get(position).getImage());


    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {

        TextView caterername;
        TextView catererwebsite;
        TextView caterercontactno;
        ImageView catererimage;


        public MyViewHolder1(View itemView) {
            super(itemView);

            this.caterername = (TextView) itemView.findViewById(R.id.Caterername);
            this.catererimage=(ImageView) itemView.findViewById(R.id.catererimage);
            this.catererwebsite=(TextView)itemView.findViewById(R.id.Catererwebsite);
            this.caterercontactno=(TextView)itemView.findViewById(R.id.Caterercontactno);
        }
    }
}
