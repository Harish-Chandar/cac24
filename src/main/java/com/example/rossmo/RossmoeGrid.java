package com.example.rossmo;

import android.graphics.Point;
import android.graphics.PointF;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.*;

public class RossmoeGrid {
    private static String[] classVar;
    private static List<PointF> crimeLocations = new ArrayList<>();
    private static double calculateDistance(PointF p1, PointF p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    private static double rossmoeProbability(PointF point, List<PointF> crimeCoords, double f, double g) {
        double probability = 0;
        for (PointF crime : crimeCoords) {
            double distance = calculateDistance(point, crime);
            int buffer = 8;
            if (distance > buffer) {
                probability += 1.0 / Math.pow(distance, f);
//                probability += 1.0 / Math.pow(distance, b);
            } else if (distance <= buffer) {
                probability += (Math.pow(buffer, (g-f)))/(Math.pow(2*buffer-distance,g));
            }
        }
        return probability;
    }

    //    public static void addLocation(List<PointF> array, int xCord, int yCord){
//
//        array.add(new PointF(xCord, yCord));
//    }
    public static void addLocation(int xCord, int yCord){

        crimeLocations.add(new PointF(xCord, yCord));
    }


    public static String generateGrid() {
        int gridSize = 100;
        String returnText = "";

//        List<PointF> crimeLocations = new ArrayList<>();
//        crimeLocations.add(new PointF(20, 30));
//        addLocation(crimeLocations, 20, 30);
//        addLocation(crimeLocations, 50, 50);
//        addLocation(crimeLocations, 80, 70);
//        crimeLocations.add(addLocation(20, 30));
//        crimeLocations.add(addLocation(50, 50));
//        crimeLocations.add(addLocation(80, 70));

//        crimeLocations.add(new PointF(50, 50));
//        crimeLocations.add(new PointF(80, 70));
        double f = 1.1;
        double g = 1.9;

        double k = 5;

        ArrayList<ArrayList<Double>> probabilityGrid = new ArrayList<>();
        for (int i = 0; i < gridSize; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < gridSize; j++) {
                PointF point = new PointF(i, j);
                double probability = rossmoeProbability(point, crimeLocations, f, g);
                row.add(probability*k);

                Log.d("RossmoeGrid", "Point (" + i + ", " + j + "): Probability = " + probability);
            }
            probabilityGrid.add(row);
        }
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                Log.d("RossmoeGrid", String.format("Grid[%d][%d] = %.5f", i, j, probabilityGrid.get(i).get(j)));
                System.out.println(String.format("Grid[%d][%d] = %.5f", i, j, probabilityGrid.get(i).get(j)));
                returnText += String.format("Grid[%d][%d] = %.5f", i, j, probabilityGrid.get(i).get(j)) + "; ";
            }
        }
//Grid[0][0]=0.0931; Grid[0][1]=0.0324
        String[] onlyProbs = returnText.split("[=;]");
        returnText = "";
        String otherText ="";
        for (int i = 1; i < onlyProbs.length; i+=2){
            returnText += onlyProbs[i] + "; ";
            //returnText=0.0931; 0.0324;
        }

        for (int i = 0; i < onlyProbs.length; i+=2){
            otherText += onlyProbs[i] + "; ";
            //otherText=Grid[0][0]; Grid[0][1];
        }

        onlyProbs = returnText.split("; ");
        //onlyProbs = [0.0931, 0.0324]
        String[] onlyLocs = otherText.split("; ");
        //onlyLocs = [Grid[0][0], Grid[0][1]]
        ArrayList<Double> probsOnly = new ArrayList<>();
        for (int i = 0; i < onlyProbs.length; i++){
            probsOnly.add(Double.parseDouble(onlyProbs[i]));
            //probsOnly = {0.0931, 0.0324}
        }

        double highestProb = probsOnly.get(0);
        for (int i =0; i < probsOnly.size(); i++){
            if (probsOnly.get(i) > highestProb){
                highestProb = probsOnly.get(i);
            }
        }
        //highestProp = 0.0931
        int index = probsOnly.indexOf(highestProb);
        //index = 0
        returnText = onlyLocs[index];
        //returnText = Grid[0][0]
        classVar = onlyProbs;
        return returnText;
    }


    public static String[] getOnlyProbs(){

        return classVar;
//        String[] something = new String[4];
//        something[0] = "0.0321";
//        something[1] = "0.0912";
//        something[2] = "0.0135";
//        something[3] = "0.0511";
//        return something;
        //Hello
    }
}