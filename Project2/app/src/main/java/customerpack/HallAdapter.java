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
 * Created by Khushali Thakkar on 1/7/2017.
 */

public class HallAdapter extends RecyclerView.Adapter<HallAdapter.MyViewHolderhall> {
    private ArrayList<HallDataModel> dataSet2;
    private Context context;
    private OnItemClickListener mItemClickListener1;

    public HallAdapter(ArrayList<HallDataModel> data3)

    {
        this.dataSet2 = data3;
    }
    @Override
    public MyViewHolderhall onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_hall, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolderhall myViewHolder = new MyViewHolderhall(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolderhall holder, int listPosition) {
        TextView textViewNamehall = holder.textViewNamehall;
        TextView textViewVersionhall = holder.textViewVersionhall;
        ImageView imageViewhall = holder.imageViewIconhall;
        TextView textviewcontacthall = holder.textviewcontacthall;

        textViewNamehall.setText(dataSet2.get(listPosition).gethallName());
        textViewVersionhall.setText(dataSet2.get(listPosition).gethallVersion());
        imageViewhall.setImageResource(dataSet2.get(listPosition).gethallImage());
        textviewcontacthall.setText(dataSet2.get(listPosition).gethallMobile());

    }

    @Override
    public int getItemCount() {
        return dataSet2.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mItemClickListener1 = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(View v, int position);
    }

    public class MyViewHolderhall extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textViewNamehall;
        TextView textViewVersionhall;
        ImageView imageViewIconhall;
        TextView textviewcontacthall;
        LinearLayout placeholder;
        LinearLayout placeholder1;
        LinearLayout placeholder2;
        //CardView card;

        @Override
        public void onClick(View view) {
            if (mItemClickListener1 != null) {
                mItemClickListener1.onItemClick(itemView, getOldPosition());

            }
        }

        public MyViewHolderhall(View itemView) {
            super(itemView);

            placeholder = (LinearLayout) itemView.findViewById(R.id.linearmain);
            placeholder1 = (LinearLayout) itemView.findViewById(R.id.linear1);
            placeholder2 = (LinearLayout) itemView.findViewById(R.id.linear2);

            this.textViewNamehall = (TextView) itemView.findViewById(R.id.textViewNamehall);
            this.textViewVersionhall = (TextView) itemView.findViewById(R.id.textViewVersionhall);
            this.imageViewIconhall = (ImageView) itemView.findViewById(R.id.imageViewhall);
            this.textviewcontacthall = (TextView) itemView.findViewById(R.id.textViewcontacthall);

            placeholder1.setOnClickListener(this);
        }
    }


    }


