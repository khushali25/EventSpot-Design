package com.example.nikki.project2;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_OwnerDetail1 extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    public Frag_OwnerDetail1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag__owner_detail1,container,false);


        viewPager = (ViewPager)view.findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)view.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);




        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        Frag_OwnerDetail1.ViewPagerAdapter adapter = new Frag_OwnerDetail1.ViewPagerAdapter(getFragmentManager());
        adapter.addFragment(new Frag_OwnerProfile(), "My Profile");
        adapter.addFragment(new Frag_OwnerDetail(), "Venue Detail");
        adapter.addFragment(new Frag_BookingDetail(), "Booking Detail");
        adapter.addFragment(new Frag_PaymentDetail(), "Payment Detail");
        viewPager.setAdapter(adapter);
    }


    public class ViewPagerAdapter extends FragmentPagerAdapter {

        public final List<android.support.v4.app.Fragment> mFragmentList = new ArrayList<>();
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
