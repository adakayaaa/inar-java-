package week_08.assignments;

public class Question_08_03 {
    public static void main(String[] args) {
        char[][] studentsAnswerToTheQuestion = createMatrix();
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[][] matrix= correctCount(studentsAnswerToTheQuestion, keys);
        int[][] sortedMatrix = sorted(matrix);
        display(sortedMatrix);
    }

    public static char[][] createMatrix() {
        char[][] studentsAnswerToTheQuestion = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        return studentsAnswerToTheQuestion;
    }

    public static int[][]  correctCount(char[][] studentsAnswerToTheQuestion, char[] keys) {
        int[][] matrix = new int[8][2];

        for (int i = 0; i < studentsAnswerToTheQuestion.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < studentsAnswerToTheQuestion[0].length; j++) {
                if (studentsAnswerToTheQuestion[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            matrix[i][0] = i;
            matrix[i][1] = correctCount;

        }
        return matrix;

    }

    public static int[][] sorted(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            int minRow = i;
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[j][1] < matrix[minRow][1]) {
                    minRow = j;
                }
            }

            int temp = matrix[i][1];
            matrix[i][1] = matrix[minRow][1];
            matrix[minRow][1] = temp;

            int tempIndex = matrix[i][0];
            matrix[i][0] = matrix[minRow][0];
            matrix[minRow][0] = tempIndex;


        }
        return matrix;
    }


    public static void display(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Students " + matrix[i][0] + "'s correct count is  " + matrix[i][1]);
        }

    }

}

