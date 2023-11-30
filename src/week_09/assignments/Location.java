package week_09.assignments;

import week_10.live_class.Loan;

public class Location {
    public int row;
    public int column;

    public double maxValue;
    Location(){

    }

    Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;

    }

    public static Location locateLargest(double[][] array) {
        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        return new Location(maxRow,maxColumn,maxValue);
    }


}

