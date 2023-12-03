package week_12.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_32 {
    public static void main(String[] args) throws Exception {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a URL: ");
        String url = input.nextLine();
        System.out.println("Enter the word you want to find: ");
        String word= input.nextLine();
        crawler(url,word);
    }

    public static void crawler(String startingURL,String word) throws java.net.MalformedURLException, java.io.IOException{
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty()) {
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);

                java.net.URL url = new java.net.URL(urlString);
                Scanner input = new Scanner(url.openStream());

                System.out.println("Craw " + urlString);

                String line="";
                while(input.hasNext()){
                    line +=input.nextLine();
                }
                if(line.contains(word)){
                    System.out.println("The word has found! ");
                    System.exit(1);
                }else{
                    System.out.println("There isn't any url that contains the word!");
                }


                for (String s : getSubURL(urlString)) {
                    if (!listOfTraversedURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURL(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http:", current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0) { // Ensure that a correct URL is found
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http:", endIndex);
                    } else{
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }
}