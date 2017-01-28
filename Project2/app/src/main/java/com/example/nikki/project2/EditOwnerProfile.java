package com.example.nikki.project2;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class EditOwnerProfile extends AppCompatActivity {

    EditText edit_mobileno,edit_emailid, edit_name, edit_gender,edit_add,edit_dob;

    Button btncalender;

    DatePickerDialog datePickerDialog;


    // android.support.v4.app.FragmentManager fm;
    AlertDialog.Builder builder;

    CharSequence[] values = {"Male", "Female"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_owner_profile);

        edit_mobileno=(EditText) findViewById(R.id.edit_ownerprofilemobileno);
        edit_emailid=(EditText) findViewById(R.id.edit_ownerprofileemailid);
        edit_name=(EditText) findViewById(R.id.edit_ownerprofilename);
        edit_gender=(EditText) findViewById(R.id.edit_ownerprofilegender);
        edit_add=(EditText) findViewById(R.id.edit_ownerprofileaddress);
        edit_dob=(EditText) findViewById(R.id.edit_ownerprofiledob);

        btncalender=(Button)findViewById(R.id.btn_editownercalender);


        builder = new AlertDialog.Builder(this);


        edit_gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edit_gender.setText(values[which]);
                        dialog.dismiss();

                    }
                });
                AlertDialog alertdg = builder.create();
                alertdg.show();
            }
        });

        btncalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(EditOwnerProfile.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                    edit_dob.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });


    }




}
