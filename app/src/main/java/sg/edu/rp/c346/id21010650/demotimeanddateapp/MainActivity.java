package sg.edu.rp.c346.id21010650.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;
    TimePicker timePicker;
    Button buttonDisplayDate;
    Button buttonDisplayTime;
    Button buttonReset;
    TextView textViewDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        buttonDisplayDate = findViewById(R.id.buttonDisplayDate);
        buttonDisplayTime = findViewById(R.id.buttonDisplayDateTime);
        buttonReset = findViewById(R.id.buttonReset);
        textViewDisplay = findViewById(R.id.textViewDisplay);

    buttonDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewDisplay.setText("The time is " + timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute() + ".");

    buttonDisplayDate.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 textViewDisplay.setText("The date is " + datePicker.getDayOfMonth() + "/" + (datePicker.getMonth() + 1)+ "/" + datePicker.getYear() + ".");

    buttonReset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (v==buttonReset) {
                     datePicker.updateDate(2020,(1 - 1),1);
                     timePicker.setCurrentHour(12);
                     timePicker.setCurrentMinute(00);
                 }


                 }
             });
                     };
});};});}}