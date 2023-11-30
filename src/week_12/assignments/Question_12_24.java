package week_12.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\Salary.txt");
        Scanner input = new Scanner(file);
        double totalSalaryForAssistants = 0;
        double totalSalaryForAssociate = 0;
        double totalSalaryForFull = 0;

        int assistantCount = 0;
        int associateCount = 0;
        int fullCount = 0;

        String str="";
                while (input.hasNext()) {
                  str += input.nextLine()+"\n" ;
                }

        String[] array= str.split("   ");

        for (int i = 0; i < array.length-1; i++) {
            if (array[i].equals("assistant")) {
                assistantCount++;
               totalSalaryForAssistants += Double.parseDouble(array[i+1]);
            } else if (array[i].equals("associate")) {
                associateCount++;
                totalSalaryForAssociate += Double.parseDouble(array[i+1]);
            }else if(array[i].equals("full")){
                fullCount++;
                totalSalaryForFull+= Double.parseDouble(array[i+1]);
            }
        }

        double totalSalaryAllFaculty= totalSalaryForAssistants+totalSalaryForAssociate+totalSalaryForFull;
        System.out.println("Total salary for assistant professors: " + totalSalaryForAssistants);
        System.out.println("Total salary for associate professors: " + totalSalaryForAssociate);
        System.out.println("Total salary for full                : " + totalSalaryForFull);
        System.out.println("Total salary for all faculty         : " + totalSalaryAllFaculty);

        System.out.println("----------------------------------------------");

        System.out.println("Average salary for assistant professors: " +totalSalaryForAssistants/assistantCount);
        System.out.println("Average salary for associate professors: " +totalSalaryForAssociate/associateCount);
        System.out.println("Average salary for full                : " +totalSalaryForFull/fullCount);
        System.out.println("Total average for all faculty          : " + totalSalaryAllFaculty/1000);

    }
}

