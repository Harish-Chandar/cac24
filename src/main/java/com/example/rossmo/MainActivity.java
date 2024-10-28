//package com.example.rossmo;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.constraintlayout.widget.ConstraintLayout;
//
//import android.os.Bundle;
//import android.view.Gravity;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.FrameLayout;
//import android.widget.TextView;
//import android.widget.LinearLayout;
//import android.widget.LinearLayout.LayoutParams;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity {
//
//    ArrayList<String> userInputs = new ArrayList<>();
//    private RossmoeGrid ross;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Call the RossmoeGrid method
////        RossmoeGrid.generateGrid();
//        TextView middle = findViewById(R.id.middleText);
//        middle.setText(RossmoeGrid.generateGrid());
//
//
////        float[][] heatmapData = {
////                { 0.1f, 0.3f, 0.5f, 0.7f, 0.9f },
////                { 0.2f, 0.4f, 0.6f, 0.8f, 1.0f },
////                { 0.9f, 0.7f, 0.5f, 0.3f, 0.1f },
////                { 0.6f, 0.4f, 0.2f, 0.8f, 0.9f },
////                { 1.0f, 0.5f, 0.6f, 0.7f, 0.2f }
////        };
//
////        float[][] heatmapData = new float[100][100];
////        String[] onlyProbs = RossmoeGrid.getOnlyProbs();
////        for (int i = 0; i < 100; i++) {
////            for (int j = 0; j < 100; j++) {
////                heatmapData[i][j] = Float.parseFloat(onlyProbs[j+100*i]);
////            }
////        }
//
//        //int count = 0;
//        //heatmapData[i][j] = onlyProbs[j+ 100*i];
//        //if (j == 99){
//        //  count++;
//        // }
//
//        LinearLayout mainLayout = new LinearLayout(this);
//        mainLayout.setOrientation(LinearLayout.VERTICAL); // Vertical layout
//        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT
//        ));
//////
////        // Initialize the HeatMapView with data
////        HeatMap heatMapView = new HeatMap(this, heatmapData);
////
////        EditText xCoord = new EditText(this);
////        xCoord.setHint("X Coordinate");
////        mainLayout.addView(xCoord);
////
////        EditText yCoord = new EditText(this);
////        yCoord.setHint("Y Coordinate");
////        mainLayout.addView(yCoord);
//////
////        Button addButton = new Button(this);
////        addButton.setLayoutParams(new ConstraintLayout.LayoutParams(
////                ConstraintLayout.LayoutParams.WRAP_CONTENT,
////                ConstraintLayout.LayoutParams.WRAP_CONTENT));
////
////        // Set button properties
////        addButton.setText(R.string.buttonText);
////        addButton.setId(View.generateViewId()); // Generate a unique ID for the button
////        mainLayout.addView(addButton);
//        EditText xCoord = findViewById(R.id.XCoord);
//        EditText yCoord = findViewById(R.id.YCoord);
//        Button addButton = findViewById(R.id.addButton);
//
//        if (middle.getParent() != null) {
//            ((ViewGroup) middle.getParent()).removeView(middle);
//        }
//        if (xCoord.getParent() != null) {
//            ((ViewGroup) xCoord.getParent()).removeView(xCoord);
//        }
//        if (yCoord.getParent() != null) {
//            ((ViewGroup) yCoord.getParent()).removeView(yCoord);
//        }
//        if (addButton.getParent() != null) {
//            ((ViewGroup) addButton.getParent()).removeView(addButton);
//        }
//        mainLayout.addView(middle);
//        mainLayout.addView(xCoord);
//        mainLayout.addView(yCoord);
//        mainLayout.addView(addButton);
//
//        // After setting content view, add heatmap dynamically
////        FrameLayout heatmapContainer = findViewById(R.id.heatmapContainer);
////        heatmapContainer.addView(heatMapView);
//
//
//////        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(600, 600);  // 600x600 pixels
//////        layoutParams.gravity = android.view.Gravity.CENTER;
//////        heatMapView.setLayoutParams(layoutParams);
////        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(600, 600);  // 600x600 pixels
////        layoutParams.gravity = android.view.Gravity.CENTER;  // Center the heatmap view
////        heatMapView.setLayoutParams(layoutParams);
//
////        mainLayout.addView(heatMapView);
////        setContentView(heatMapView);  // Set the heatmap view as the content view
//        mainLayout.setBackgroundColor(getResources().getColor(R.color.darkGray));
//        xCoord.setGravity(Gravity.CENTER_HORIZONTAL);
//        yCoord.setGravity(Gravity.CENTER_HORIZONTAL);
//        middle.setGravity(Gravity.CENTER_HORIZONTAL);
//        addButton.setGravity(Gravity.CENTER_HORIZONTAL);
//        mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);
//        setContentView(mainLayout);
//
//
//
//    }
//
//
//    public void updateMap(){
////        float[][] heatmapData = {
////                { 0.1f, 0.3f, 0.5f, 0.7f, 0.9f },
////                { 0.2f, 0.4f, 0.6f, 0.8f, 1.0f },
////                { 0.9f, 0.7f, 0.5f, 0.3f, 0.1f },
////                { 0.6f, 0.4f, 0.2f, 0.8f, 0.9f },
////                { 1.0f, 0.5f, 0.6f, 0.7f, 0.2f }
////        };
//
//        float[][] heatmapData = new float[100][100];
//        String[] onlyProbs = RossmoeGrid.getOnlyProbs();
//        for (int i = 0; i < 100; i++) {
//            for (int j = 0; j < 100; j++) {
//                heatmapData[i][j] = Float.parseFloat(onlyProbs[j+100*i]);
//            }
//        }
//        HeatMap heatMapView = new HeatMap(this, heatmapData);
//
//        TextView middle = findViewById(R.id.middleText);
//        middle.setText(RossmoeGrid.generateGrid());
//        EditText xCoord = findViewById(R.id.XCoord);
//        EditText yCoord = findViewById(R.id.YCoord);
//        Button addButton = findViewById(R.id.addButton);
////        TextView userInputText = findViewById(R.id.UserInputText);
//
//        String xString = xCoord.getText().toString();
//        String yString = yCoord.getText().toString();
//        userInputs.add("(" + xString + "," + yString + ")");
////        userInputText.setText("" + userInputs);
//
//        LinearLayout mainLayout = new LinearLayout(this);
//        mainLayout.setOrientation(LinearLayout.VERTICAL); // Vertical layout
//        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT
//        ));
//
////        if (userInputText.getParent() != null) {
////            ((ViewGroup) userInputText.getParent()).removeView(userInputText);
////        }
//
//        if (middle.getParent() != null) {
//            ((ViewGroup) middle.getParent()).removeView(middle);
//        }
//        if (xCoord.getParent() != null) {
//            ((ViewGroup) xCoord.getParent()).removeView(xCoord);
//        }
//        if (yCoord.getParent() != null) {
//            ((ViewGroup) yCoord.getParent()).removeView(yCoord);
//        }
//        if (addButton.getParent() != null) {
//            ((ViewGroup) addButton.getParent()).removeView(addButton);
//        }
//
////        mainLayout.addView(userInputText);
//        mainLayout.addView(middle);
//        mainLayout.addView(xCoord);
//        mainLayout.addView(yCoord);
//        mainLayout.addView(addButton);
//        heatMapView.setDesiredDimensions(800, 800);
//        mainLayout.addView(heatMapView);
//        mainLayout.setBackgroundColor(getResources().getColor(R.color.darkGray));
//        mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);
//        setContentView(mainLayout);
////        return heatMapView;
//    }
//
//
//    public void addCrimeLocation(View view){
//        EditText xCoord = (EditText) findViewById(R.id.XCoord);
//        EditText yCoord = (EditText) findViewById(R.id.YCoord);
//        String XString = xCoord.getText().toString();
//        String YString = yCoord.getText().toString();
//        TextView middle = findViewById(R.id.middleText);
//
//        try{
//            int xInt = Integer.parseInt(XString);
//            int yInt = Integer.parseInt(YString);
//            RossmoeGrid.addLocation(xInt, yInt);
//            middle.setText(RossmoeGrid.generateGrid());
//            updateMap();
//
//
//        } catch(NumberFormatException nfe){
//
//        }
//    }
//
//}















package com.example.rossmo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> userInputs = new ArrayList<>();
    private RossmoeGrid ross;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









        TextView title = findViewById(R.id.title);
        TextView subtitle = findViewById(R.id.subtitle);
        // Call the RossmoeGrid method
        TextView middle = findViewById(R.id.middleText);
        middle.setText(RossmoeGrid.generateGrid());

        LinearLayout navbar = findViewById(R.id.navbar);
        EditText xCoord = findViewById(R.id.XCoord);
        EditText yCoord = findViewById(R.id.YCoord);
        Button addButton = findViewById(R.id.addButton);


        float[][] heatmapData = new float[100][100];
        String[] onlyProbs = RossmoeGrid.getOnlyProbs();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                heatmapData[i][j] = 0;
            }
        }

        // Create HeatMapView instance with the updated data
        HeatMap heatMapView = new HeatMap(this, heatmapData);

        // Set layout parameters for heatMapView with margins
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,  // Width
                LinearLayout.LayoutParams.WRAP_CONTENT   // Height
        );
        params.setMargins(0, 40, 0, 0);  // Set margins for the HeatMapView
        heatMapView.setLayoutParams(params);


        // Create a new linear layout for your content
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        // Remove views from their old parent before re-adding them
        if (title.getParent() != null) {
            ((ViewGroup) title.getParent()).removeView(title);
        }

        if (subtitle.getParent() != null) {
            ((ViewGroup) subtitle.getParent()).removeView(subtitle);
        }

        if (middle.getParent() != null) {
            ((ViewGroup) middle.getParent()).removeView(middle);
        }
        if (xCoord.getParent() != null) {
            ((ViewGroup) xCoord.getParent()).removeView(xCoord);
        }
        if (yCoord.getParent() != null) {
            ((ViewGroup) yCoord.getParent()).removeView(yCoord);
        }
        if (addButton.getParent() != null) {
            ((ViewGroup) addButton.getParent()).removeView(addButton);
        }
        if (navbar.getParent() != null) {
            ((ViewGroup) navbar.getParent()).removeView(navbar);
        }

        // Add views to the main layout
        mainLayout.addView(title);
        mainLayout.addView(subtitle);
        heatMapView.setDesiredDimensions(800, 800);
        mainLayout.addView(heatMapView);
        mainLayout.addView(middle);
        mainLayout.addView(xCoord);
        mainLayout.addView(yCoord);
        mainLayout.addView(addButton);
        mainLayout.addView(navbar);

        // Set background color and gravity of main layout
        mainLayout.setBackgroundColor(getResources().getColor(R.color.darkGray));
        mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);

        // Set the updated layout as the content view
        setContentView(mainLayout);
    }

    public void updateMap() {
        // Create or update the heatmap data
        float[][] heatmapData = new float[100][100];
        String[] onlyProbs = RossmoeGrid.getOnlyProbs();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                heatmapData[i][j] = Float.parseFloat(onlyProbs[j + 100 * i]);
            }
        }

        // Create HeatMapView instance with the updated data
        HeatMap heatMapView = new HeatMap(this, heatmapData);

        // Set layout parameters for heatMapView with margins
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,  // Width
                LinearLayout.LayoutParams.WRAP_CONTENT   // Height
        );
        params.setMargins(0, 40, 0, 0);  // Set margins for the HeatMapView
        heatMapView.setLayoutParams(params);

        // Dynamically add other views (TextView, EditTexts, Button)
        TextView title = findViewById(R.id.title);
        TextView subtitle = findViewById(R.id.subtitle);
        TextView middle = findViewById(R.id.middleText);
        middle.setText(RossmoeGrid.generateGrid());
        EditText xCoord = findViewById(R.id.XCoord);
        EditText yCoord = findViewById(R.id.YCoord);
        Button addButton = findViewById(R.id.addButton);
        LinearLayout navbar = findViewById(R.id.navbar);

        // Create a new linear layout for your content
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        // Remove views from their old parent before re-adding them
        if (title.getParent() != null) {
            ((ViewGroup) title.getParent()).removeView(title);
        }
        if (subtitle.getParent() != null) {
            ((ViewGroup) subtitle.getParent()).removeView(subtitle);
        }
        if (middle.getParent() != null) {
            ((ViewGroup) middle.getParent()).removeView(middle);
        }
        if (xCoord.getParent() != null) {
            ((ViewGroup) xCoord.getParent()).removeView(xCoord);
        }
        if (yCoord.getParent() != null) {
            ((ViewGroup) yCoord.getParent()).removeView(yCoord);
        }
        if (addButton.getParent() != null) {
            ((ViewGroup) addButton.getParent()).removeView(addButton);
        }
        if (navbar.getParent() != null) {
            ((ViewGroup) navbar.getParent()).removeView(navbar);
        }

        // Add views to the main layout
        mainLayout.addView(title);
        mainLayout.addView(subtitle);
        heatMapView.setDesiredDimensions(800, 800);
        mainLayout.addView(heatMapView);
        mainLayout.addView(middle);
        mainLayout.addView(xCoord);
        mainLayout.addView(yCoord);
        mainLayout.addView(addButton);
        mainLayout.addView(navbar);

        // Set desired dimensions for the HeatMapView and add it to the layout


        // Set background color and gravity of main layout
        mainLayout.setBackgroundColor(getResources().getColor(R.color.darkGray));
        mainLayout.setGravity(Gravity.CENTER_HORIZONTAL);

        // Set the updated layout as the content view
        setContentView(mainLayout);
    }

    public void addCrimeLocation(View view) {
        // Get the input coordinates from the EditTexts
        EditText xCoord = findViewById(R.id.XCoord);
        EditText yCoord = findViewById(R.id.YCoord);
        String XString = xCoord.getText().toString();
        String YString = yCoord.getText().toString();
        TextView middle = findViewById(R.id.middleText);

        try {
            int xInt = Integer.parseInt(XString);
            int yInt = Integer.parseInt(YString);
            RossmoeGrid.addLocation(xInt, yInt);
            middle.setText(RossmoeGrid.generateGrid());

            // Update the map after adding the new crime location
            updateMap();
        } catch (NumberFormatException nfe) {
            // Handle the case where the input is not a valid number
        }
    }

    public void goAbout(View view){
        Intent intent = new Intent(MainActivity.this, about.class);
        startActivity(intent);
    }
}
