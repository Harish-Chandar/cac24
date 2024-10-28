package com.example.rossmo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class HeatMap extends View {

    private float[][] data;  // 2D array for storing heatmap data
    private int rows, cols;  // Number of rows and columns
    private Paint paint = new Paint();  // Paint object to draw heatmap
    private int desiredHeight = 600; // Default desired height
    private int desiredWidth = 600; // Default desired width
    // Constructor to use when creating the View in code
    public HeatMap(Context context, float[][] data) {
        super(context);
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    // Constructor to use when inflating the View from XML
    public HeatMap(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // Set the measured dimensions to the custom desired size
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Calculate cell size based on the view's width and height
        float cellWidth = getWidth() / cols;
        float cellHeight = getHeight() / rows;

        // Loop through the data array to draw the heatmap cells
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Set the paint color based on the data value
                paint.setColor(getColorForValue(data[row][col]));
                // Draw the cell as a rectangle
                canvas.drawRect(
                        col * cellWidth,
                        row * cellHeight,
                        (col + 1) * cellWidth,
                        (row + 1) * cellHeight,
                        paint);
            }
        }
    }

    // Helper method to map a data value to a color
    private int getColorForValue(float value) {
        // Map value to a color; here we assume values range from 0 to 1
        int red = (int) (255 * value);  // Red component
//        int green = (int) (255 * (1 - value));  // Green component
        return Color.rgb(red, 0, 0);  // Return color
    }

    public void setDesiredDimensions(int width, int height) {
        this.desiredWidth = width;
        this.desiredHeight = height;
        requestLayout();  // Request a re-layout after changing the dimensions
    }
}
