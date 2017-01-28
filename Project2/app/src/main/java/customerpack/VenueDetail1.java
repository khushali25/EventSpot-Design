package customerpack;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nikki.project2.R;

import java.util.ArrayList;
import java.util.List;

public class VenueDetail1 extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_detail1);

        viewPager = (ViewPager)findViewById(R.id.viewpager1);
        setupViewPager(viewPager);

        tabLayout = (TabLayout)findViewById(R.id.tabs1);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {

        VenueDetail1.ViewPagerAdapter adapter = new VenueDetail1.ViewPagerAdapter(getSupportFragmentManager());
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
