package vendorpack;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.nikki.project2.R;

import java.util.Calendar;

public class EditVendorProfile extends AppCompatActivity {

    EditText edit_vendorgender,edit_vendordob;
    Button btndob;

    DatePickerDialog datePickerDialog;

    AlertDialog.Builder builder;
    CharSequence[] values = {"Male", "Female"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_vendor_profile);

        edit_vendorgender=(EditText)findViewById(R.id.edit_vendorgender);
        edit_vendordob=(EditText)findViewById(R.id.edit_vendordateofbirth);
        btndob=(Button)findViewById(R.id.edit_btnvendordob);

        builder = new AlertDialog.Builder(this);

        edit_vendorgender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder.setSingleChoiceItems(values, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        edit_vendorgender.setText(values[which]);
                        dialog.dismiss();
                    }
                });
                AlertDialog alertdg = builder.create();
                alertdg.show();
            }
        });

        btndob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
                // date picker dialog
                datePickerDialog = new DatePickerDialog(EditVendorProfile.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                edit_vendordob.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();

            }
        });



    }
}
