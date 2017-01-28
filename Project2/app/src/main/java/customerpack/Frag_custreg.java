package customerpack;


import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.nikki.project2.R;

import static android.app.DatePickerDialog.OnDateSetListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_custreg extends Fragment  {



    Button btnSignUp12, btnClear1, btncal;
    private DatePickerDialog datePickerDialog;
    Button btndate;
    FragmentManager fm;
    AlertDialog.Builder builder;

    CharSequence[] values1 = {"Male", "Female"};
    EditText mobileno1, emailid1, name1, gender1, password1, add1, dob1,repassword1;


    public  Frag_custreg() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_custreg, null);
        builder = new AlertDialog.Builder(getActivity());
        FragmentActivity activity = (FragmentActivity) view.getContext();


        name1 = (EditText) view.findViewById(R.id.tname);
        emailid1 = (EditText) view.findViewById(R.id.temailid);
        password1 = (EditText) view.findViewById(R.id.tpass);
        repassword1=(EditText)view.findViewById(R.id.trepass);
        mobileno1 = (EditText) view.findViewById(R.id.tmobile);
        add1 = (EditText) view.findViewById(R.id.taddress);
        dob1 = (EditText) view.findViewById(R.id.tdob);
        btnSignUp12 = (Button) view.findViewById(R.id.bSignUp);


        fm = activity.getSupportFragmentManager();

        btndate = (Button) view.findViewById(R.id.btndate);
btndate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        showDatePicker();
    }
});
        gender1 = (EditText) view.findViewById(R.id.tgender);
gender1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        builder.setSingleChoiceItems(values1, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                gender1.setText(values1[which]);
                dialog.dismiss();
            }
        });
        AlertDialog alertdg = builder.create();
        alertdg.show();
    }
});


        btnSignUp12.setOnClickListener(new View.OnClickListener()

                                       {
                                           @Override
                                           public void onClick(View v) {
                                               String email = emailid1.getText().toString();
                                               String mobilenum = mobileno1.getText().toString();
                                               String name2 = emailid1.getText().toString();
                                               if (name2.trim().equals(""))
                                                   name1.setError("Please enter your name");
                                               else if (email.trim().equals(""))
                                                   emailid1.setError("Please enter email Address");
                                               else if (!email.contains("@") || !email.contains("."))
                                                   emailid1.setError("Please enter a valid email Address");
                                               else if (mobilenum.trim().length() < 10)
                                                   mobileno1.setError("Not a valid mobile no");
                                           }
                                       }

        );



        return view;
    }


    public void showDatePicker() {
        DatePickerFragment date = new DatePickerFragment();

        Calendar calender = Calendar.getInstance();
        Bundle args = new Bundle();
        args.putInt("year", calender.get(Calendar.YEAR));
        args.putInt("month", calender.get(Calendar.MONTH)+1);
        args.putInt("day", calender.get(Calendar.DAY_OF_MONTH));
        date.setArguments(args);

        date.setCallBack(ondate);
        date.show(fm, "Date Picker");
    }

    OnDateSetListener ondate = new OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
            dob1.setText(String.valueOf(i) + "-" + String.valueOf(i1+1) + "-" + String.valueOf(i2));

        }
    };


/*    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btndate:
                showDatePicker();

            case R.id.tgender:
                builder.setSingleChoiceItems(values1, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        gender1.setText(values1[which]);
                        dialog.dismiss();
                    }
                });
                AlertDialog alertdg = builder.create();
                alertdg.show();
                //alertdg.cancel();



        }






    } */



}
