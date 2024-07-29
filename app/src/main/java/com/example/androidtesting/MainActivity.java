package com.example.androidtesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        double[][] grid = new double[100][100];

        /**
         * Use a 2D array for the map. Each double value in the grid is the probability of the criminal
         * living there, which we will calculate and then set.
         * The probability -1 will be at the locations the crimes were committed.
         * The first index provided will be the column number, and the second the row number (xy system)
         * (0,0) will be located in the top right.
         * Use Pythagorean distance, not Manhattan distance.
         */

        grid[85][2] = -1; // this indicates a crime was committed at the location (85,2)
        grid[16][34] = -1; // this indicates a crime was committed at the location (16,34)














    }
}
