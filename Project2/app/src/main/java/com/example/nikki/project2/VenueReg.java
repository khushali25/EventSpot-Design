package com.example.nikki.project2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.io.File;
import java.io.FileNotFoundException;

public class VenueReg extends AppCompatActivity {


    String[] venuetype={"Banquet","PartyPlot","Hall"};
    String[] venuearea={"Maninagar","Shivranjani","C.G.Road","S.G.Road","Bopal"};
    String[] venuecity={"Ahmedabad"};
    String[] venuestate={"Gujarat"};

    EditText venue_images;
    Button btn_venue_images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_reg);

        venue_images=(EditText)findViewById(R.id.venuegallery1);
        btn_venue_images=(Button)findViewById(R.id.btnvenuegallery);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_dropdown_item_1line,venuetype);
            MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
                    findViewById(R.id.android_material_design_spinner);
            materialDesignSpinner.setAdapter(arrayAdapter);


            ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,venuearea);
        MaterialBetterSpinner materialBetterSpinner1=(MaterialBetterSpinner)findViewById(R.id.area);
        materialBetterSpinner1.setAdapter(arrayAdapter1);

        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,venuecity);
        MaterialBetterSpinner materialBetterSpinner2=(MaterialBetterSpinner)findViewById(R.id.city);
        materialBetterSpinner2.setAdapter(arrayAdapter2);


        ArrayAdapter<String> arrayAdapter3=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,venuestate);
        MaterialBetterSpinner materialBetterSpinner3=(MaterialBetterSpinner)findViewById(R.id.state);
        materialBetterSpinner3.setAdapter(arrayAdapter3);



        btn_venue_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent, 0);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode== Activity.RESULT_OK && data != null){
            String realPath;
            // SDK < API11
            if (Build.VERSION.SDK_INT < 11)
                realPath = RealPathUtil.getRealPathFromURI_BelowAPI11(this, data.getData());

                // SDK >= 11 && SDK < 19
            else
                realPath = RealPathUtil.getRealPathFromURI_API11to18(this, data.getData());

            // SDK > 19 (Android 4.4)

            setTextViews(Build.VERSION.SDK_INT, data.getData().getPath(),realPath);



        }
    }

    private void setTextViews(int sdkInt, String path, String realPath) {

        this.venue_images.setText(realPath);
        Uri uriFromPath = Uri.fromFile(new File(realPath));

        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(uriFromPath));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Log.d("HMKCODE", "Real Path: "+realPath);


    }
}
