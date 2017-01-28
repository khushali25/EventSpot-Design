package customerpack;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nikki.project2.R;

import java.util.ArrayList;


/**
 * Created by Khushali Thakkar on 12/29/2016.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataSet;
    private Context context;
    private OnItemClickListener mItemClickListener1;

        public CustomAdapter(ArrayList<DataModel> data)
        {
            this.dataSet = data;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.cards_layout, parent, false);

            //view.setOnClickListener(MainActivity.myOnClickListener);

            MyViewHolder myViewHolder = new MyViewHolder(view);
            return myViewHolder;

        }


        @Override
        public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

            TextView textViewName = holder.textViewName;
            TextView textViewVersion = holder.textViewVersion;
            ImageView imageView = holder.imageViewIcon;
            TextView textviewcontact = holder.textviewcontact;


            textViewName.setText(dataSet.get(listPosition).getName());

            textViewVersion.setText(dataSet.get(listPosition).getVersion());
            imageView.setImageResource(dataSet.get(listPosition).getImage());
            textviewcontact.setText(dataSet.get(listPosition).getMobile());

        }

        @Override
        public int getItemCount()
        {
            return dataSet.size();
        }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener)
    {
        this.mItemClickListener1= onItemClickListener;
    }
    public interface OnItemClickListener
    {
        void onItemClick(View v, int position);
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        TextView textviewcontact;
        LinearLayout placeholder;
        LinearLayout placeholder1;
        LinearLayout placeholder2;
        //CardView card;

        @Override
        public void onClick(View view) {
            if (mItemClickListener1 != null) {
               mItemClickListener1.onItemClick(itemView,getOldPosition());

            }
        }

        public MyViewHolder(View itemView) {
            super(itemView);

            placeholder = (LinearLayout) itemView.findViewById(R.id.linearmain);
            placeholder1 = (LinearLayout) itemView.findViewById(R.id.linear1);
            placeholder2 = (LinearLayout) itemView.findViewById(R.id.linear2);

            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
            this.textviewcontact = (TextView) itemView.findViewById(R.id.textViewcontact);

            placeholder1.setOnClickListener(this);
        }

    }


}
