package vendorpack;


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
public class Frag_ServiceDetail extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    public Frag_ServiceDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_frag__service_detail,container,false);

        viewPager = (ViewPager)view.findViewById(R.id.viewpager2);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)view.findViewById(R.id.tabs2);
        tabLayout.setupWithViewPager(viewPager);


        return view;
    }

    private void setupViewPager(ViewPager viewPager) {

        Frag_ServiceDetail.ViewPagerAdapter adapter = new  Frag_ServiceDetail.ViewPagerAdapter(getFragmentManager());
        adapter.addFragment(new Frag_VendorProfile(), "Vendor Profile");
        adapter.addFragment(new ServiceDetail1(), "Service Detail");
        adapter.addFragment(new Frag_VendorPaymentDetail(), "Payment Detail");

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
