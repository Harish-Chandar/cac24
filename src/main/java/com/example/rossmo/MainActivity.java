package com.example.rossmo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RossmoeGrid ross;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call the RossmoeGrid method
//        RossmoeGrid.generateGrid();
        TextView middle = findViewById(R.id.middleText);
        middle.setText(RossmoeGrid.generateGrid());
    }



    public void addCrimeLocation(View view){
        EditText xCoord = (EditText) findViewById(R.id.XCoord);
        EditText yCoord = (EditText) findViewById(R.id.YCoord);
        String XString = xCoord.getText().toString();
        String YString = yCoord.getText().toString();
        TextView middle = findViewById(R.id.middleText);


        try{
            int xInt = Integer.parseInt(XString);
            int yInt = Integer.parseInt(YString);
            RossmoeGrid.addLocation(xInt, yInt);
            middle.setText(RossmoeGrid.generateGrid());


        } catch(NumberFormatException nfe){

        }
    }

}