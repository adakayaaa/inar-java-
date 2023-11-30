package week_12.assignments;

import week_11.assignments.Faculty;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_23 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\";
        File file = new File(path + "Salary.txt");


        ArrayList<Number> list = new ArrayList<>();

        String[][] faculty = new String[1000][4];
        String[] rank = {"assistant", "associate", "full"};
        for (int i = 0; i < faculty.length; i++) {
            String firstName = "FirstName" + (i+1);
            String lastName = "LastName" + (i+1);
            String rankName= getRank(rank);
            Double salary=((int)(getSalary(getRank(rank))*100)/100.0);
                faculty[i][0]=firstName;
                faculty[i][1]= lastName;
                faculty[i][2]= rankName;
                faculty[i][3]= salary+" ";
            }


        String str= "";
        for (int i = 0; i < faculty.length; i++) {
            for (int j = 0; j < faculty[0].length ; j++) {
                str+= faculty[i][j]+"   " ;
                if(j==3){
                    str +="\n";
                }
            }
        }
        PrintWriter output= new PrintWriter(file);
        output.println(str);
        output.close();
    }

    public static String getRank(String[] rank) {
        int i = (int) (Math.random() * 3);
        return rank[i];
    }

    public static double getSalary(String rank) {
        double salary = 0;
        if (rank.equals("assistant")) {
            salary = (Math.random() * 30000 + 50000);
        } else if (rank.equals("associate")) {
            salary = (Math.random() * 50000 + 60000);
        } else {
            salary = (Math.random() * 55000 + 75000);
        }
        return salary;
    }


}

