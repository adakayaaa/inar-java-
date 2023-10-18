package week_08.assignments;

public class Question_08_10 {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(4, 4);
        display(matrix);
        int[][] rowIndex = findLargestRowIndex(matrix);
        int[][] columnIndex = findLargestColumnIndex(matrix);
        sort(rowIndex);
        sort(columnIndex);
        System.out.println("The largest row index: " + rowIndex[0][0]);
        System.out.println("The largest column index: " + columnIndex[0][0]);
    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);

            }

        }
        return matrix;
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();


        }
    }

    public static int[][] findLargestRowIndex(int[][] matrix) {
        int[][] row = new int[matrix[0].length][2];
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            row[i][0] = i;
            row[i][1] = count;


        }
        return row;

    }

    public static int[][] findLargestColumnIndex(int[][] matrix) {
        int[][] column = new int[matrix[0].length][2];
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            column[i][0] = i;
            column[i][1] = count;


        }
        return column;

    }

    public static void sort(int[][] matrix) {

        for (int i = 0; i < matrix.length - 1; i++) {
            int max = matrix[i][1];
            int maxIndex = i;
            for (int j = i + 1; j < matrix.length; j++) {
                if (max < matrix[j][1]) {
                    max = matrix[j][1];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {

                int temp = matrix[i][1];
                matrix[i][1] = matrix[maxIndex][1];
                matrix[maxIndex][1] = temp;

                temp = matrix[i][0];
                matrix[i][0] = matrix[maxIndex][0];
                matrix[maxIndex][0] = temp;

            }
        }
    }

}

