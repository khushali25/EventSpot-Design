package vendorpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nikki.project2.Frag_OwnerDetail1;
import com.example.nikki.project2.R;

import vendorpack.Frag_ServiceDetail;

public class ServiceMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_main);

        Frag_ServiceDetail fo=new Frag_ServiceDetail();
        android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frcontent3,fo);
        ft.commit();
    }
}
