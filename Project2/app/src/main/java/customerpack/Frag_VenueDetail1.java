package customerpack;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nikki.project2.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_VenueDetail1 extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public Frag_VenueDetail1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag__venue_detail1,container,false);

        viewPager = (ViewPager)view.findViewById(R.id.viewpager1);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)view.findViewById(R.id.tabs1);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    private void setupViewPager(ViewPager viewPager) {

       Frag_VenueDetail1.ViewPagerAdapter adapter = new Frag_VenueDetail1.ViewPagerAdapter(getFragmentManager());
        adapter.addFragment(new Detailvenuefrag(), "Venue Detail");
        adapter.addFragment(new Frag_Gallary(), "Gallary");
        adapter.addFragment(new Frag_Video(), "Venue Video");
        adapter.addFragment(new Frag_VenueMap(),"Venue Map");
        adapter.addFragment(new Frag_Review(),"Review");
        adapter.addFragment(new Frag_Rating(),"Rating");

        viewPager.setAdapter(adapter);
    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {

        public final List<Fragment> mFragmentList = new ArrayList<>();
        public final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(android.support.v4.app.Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}
