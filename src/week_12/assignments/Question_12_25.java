package week_12.assignments;

import java.io.File;

public class Question_12_25 {
    public static void main(String[] args) {

        String pathName = "C:\\Users\\ASUS\\workspace\\inar-java\\src\\week_12\\assignments\\";


        File directory=new File(pathName+args[0]);

        if(!directory.mkdirs()){
            System.out.println("Director already exists");
        }else{
            System.out.println("Directory created successfully");
        }

    }
}
