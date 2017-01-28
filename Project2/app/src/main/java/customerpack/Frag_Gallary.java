package customerpack;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nikki.project2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_Gallary extends Fragment {

    private GridLayoutManager lLayout;

    public Frag_Gallary() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag__gallary,null);

        List<GallaryItemObject> rowListItem = getAllItemList();
        lLayout = new GridLayoutManager(getActivity(),2);

        RecyclerView rView=(RecyclerView)view.findViewById(R.id.recycler_view2);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

       GallaryRecycleViewAdapter rcAdapter = new GallaryRecycleViewAdapter(getActivity(), rowListItem);
        rView.setAdapter(rcAdapter);

        return view;
    }

    private List<GallaryItemObject> getAllItemList() {

        List<GallaryItemObject> allItems = new ArrayList<GallaryItemObject>();
        allItems.add(new GallaryItemObject( R.drawable.royal1));
        allItems.add(new GallaryItemObject( R.drawable.royal2));
        allItems.add(new GallaryItemObject( R.drawable.royal3));
        allItems.add(new GallaryItemObject( R.drawable.royal4));
        allItems.add(new GallaryItemObject( R.drawable.royal5));
        allItems.add(new GallaryItemObject( R.drawable.royal6));


        return allItems;
    }

}
