package week_08.live_class;

public class Example {
    public static void main(String[] args) {
        int[][] matrix = createMatrix(5, 5);
        display(matrix);
        int[][] sum = sumMatrix(matrix);
        sort(sum);
        displaySum(sum);


    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 9 + 1);
            }

        }
        return matrix;
    }

    public static void display(int[][] matrix) {
        //matrix = {{1,2},}
        System.out.print("{");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{");
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1) {
                    System.out.print(matrix[i][j]);
                } else {
                    System.out.print(matrix[i][j] + ",");

                }

            }
            if (matrix.length - 1 != i) {
                System.out.println("},");
            } else {
                System.out.print("}");
            }
        }
        System.out.println("}");
    }

    public static int[][] sumMatrix(int[][] matrix) {
        int[][] sum = new int[matrix[0].length][2];

        for (int i = 0; i < matrix[0].length; i++) {
            int total = 0;
            for (int j = 0; j < matrix.length; j++) {
                total += matrix[j][i];

            }
            sum[i][0] = i;
            sum[i][1] = total;

        }
        return sum;

    }

    public static void sort(int[][] sum) {

        for (int i = 0; i < sum.length - 1; i++) {
            int max = sum[i][1];
            int maxIndex = i;
            for (int j = i + 1; j < sum.length; j++) {
                if (max < sum[j][1]) {
                    max = sum[j][1];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {

                int temp = sum[i][1];
                sum[i][1] = sum[maxIndex][1];
                sum[maxIndex][1] = temp;

                temp = sum[i][0];
                sum[i][0] = sum[maxIndex][0];
                sum[maxIndex][0] = temp;

            }
        }
    }

    public static void displaySum(int[][] sum) {
        for (int i = 0; i < sum.length; i++) {
            System.out.println("Column " + sum[i][0] + " total = " + sum[i][1]);

        }

    }
}

