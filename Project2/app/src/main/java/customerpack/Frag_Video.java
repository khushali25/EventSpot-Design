package customerpack;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.nikki.project2.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_Video extends Fragment {

    VideoView video_player_view;
    DisplayMetrics dm;
    SurfaceView sur_View;
    MediaController media_Controller;



    public Frag_Video() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragme

        View view=inflater.inflate(R.layout.fragment_frag__video,container,false);


        VideoView video_player_view=(VideoView)view.findViewById(R.id.video);
        media_Controller = new MediaController(getContext());
        dm = new DisplayMetrics();
      //  this.getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;
        video_player_view.setMinimumWidth(width);
        video_player_view.setMinimumHeight(height);
        video_player_view.setMediaController(media_Controller);
        video_player_view.setVideoPath("android.resource://" + getActivity().getPackageName()+ "/" + R.raw.demo);
        video_player_view.start();


        

       /* Uri video1 = Uri.parse("android.resource://" + getActivity().getPackageName()+ "/" + R.raw.demo);
        video.setVideoURI(video1);
        video.start(); */

        return view;

    }



}
