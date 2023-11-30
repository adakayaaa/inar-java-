package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file's pathname: ");
        String filePathName = input.nextLine();

        File file = new File(filePathName);
        System.out.println(file.exists());

        int numberOfIntegers=0;
        Scanner input2 = new Scanner(file);
        String str = "";

        while (input2.hasNext()) {
            str += input2.next() + " ";
            numberOfIntegers++;
        }
        PrintWriter output = new PrintWriter(file);
        output.println(str);
        output.close();

        double sum = getSum(numberOfIntegers,str);

        System.out.println("Number of integers: " + numberOfIntegers);
        System.out.println("Sum of integers: " + sum);
        double average = (sum / numberOfIntegers);
        System.out.println("Average of integers: " + average);

    }
    public static double getSum(int numberOfIntegers, String str){
        double sum=0;
        String[] list = str.split(" ");
        for (int i = 0; i < list.length; i++) {
            sum += Double.parseDouble(list[i]);
        }
        return sum;
    }
}

