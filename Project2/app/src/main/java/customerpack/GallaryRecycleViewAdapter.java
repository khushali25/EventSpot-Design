package customerpack;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.nikki.project2.R;

import java.util.List;

/**
 * Created by NIKKI on 05/01/2017.
 */

public class GallaryRecycleViewAdapter extends RecyclerView.Adapter<GallaryRecycleViewAdapter.ViewHolder> {

    private List<GallaryItemObject> itemObjectList;
    private Context context;

    public GallaryRecycleViewAdapter(Context context,List<GallaryItemObject> itemObjectList)
    {
        this.context=context;
        this.itemObjectList=itemObjectList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_gallary_list,null);
        ViewHolder rcv=new ViewHolder(layoutView);
        return rcv;
    }

    @Override
    public int getItemCount() {
        return this.itemObjectList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

        public ImageView countryPhoto;

        public ViewHolder (View ItemView)
        {
            super(ItemView);
            ItemView.setOnClickListener(this);
            countryPhoto=(ImageView)itemView.findViewById(R.id.country_photo);
        }


        @Override
        public void onClick(View v) {

        }
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.countryPhoto.setImageResource(itemObjectList.get(position).getPhoto());
    }
}
