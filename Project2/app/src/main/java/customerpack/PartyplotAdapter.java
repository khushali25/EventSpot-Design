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

public class PartyplotAdapter extends RecyclerView.Adapter<PartyplotAdapter.MyViewHolderparty>
{
    private ArrayList<PartplotDataModel> dataSet1;
    private Context context;
    private OnItemClickListener mItemClickListener1;

    public PartyplotAdapter(ArrayList<PartplotDataModel> data3)

    {
        this.dataSet1 = data3;
    }

    @Override
    public MyViewHolderparty onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_partyplot, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolderparty myViewHolder = new MyViewHolderparty(view);
        return myViewHolder;


    }

    @Override
    public void onBindViewHolder(MyViewHolderparty holder, int listPosition) {
        TextView textViewNameparty = holder.textViewNameparty;
        TextView textViewVersionparty = holder.textViewVersionparty;
        ImageView imageViewparty = holder.imageViewIconparty;
        TextView textviewcontactparty = holder.textviewcontactparty;


        textViewNameparty.setText(dataSet1.get(listPosition).getpartyName());
        textViewVersionparty.setText(dataSet1.get(listPosition).getpartyVersion());
        imageViewparty.setImageResource(dataSet1.get(listPosition).getpartyImage());
        textviewcontactparty.setText(dataSet1.get(listPosition).getpartyMobile());

    }

    @Override
    public int getItemCount() {
        return dataSet1.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mItemClickListener1 = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(View v, int position);
    }

    public class MyViewHolderparty extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textViewNameparty;
        TextView textViewVersionparty;
        ImageView imageViewIconparty;
        TextView textviewcontactparty;
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

        public MyViewHolderparty(View itemView) {
            super(itemView);

            placeholder = (LinearLayout) itemView.findViewById(R.id.linearmain);
            placeholder1 = (LinearLayout) itemView.findViewById(R.id.linear1);
            placeholder2 = (LinearLayout) itemView.findViewById(R.id.linear2);

            this.textViewNameparty = (TextView) itemView.findViewById(R.id.textViewNameparty);
            this.textViewVersionparty = (TextView) itemView.findViewById(R.id.textViewVersionparty);
            this.imageViewIconparty = (ImageView) itemView.findViewById(R.id.imageViewparty);
            this.textviewcontactparty = (TextView) itemView.findViewById(R.id.textViewcontactparty);

            placeholder1.setOnClickListener(this);
        }

    }
}
