package week_04.assignments;

import java.util.*;

public class Question_04_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 6_371.01;

        //distance between Atlanta to Charlotte
        double atlantaX = 33.7489954;
        double atlantaY = -84.3879824;
        double atlantaRadiansX = Math.toRadians(atlantaX);
        double atlantaRadiansY = Math.toRadians(atlantaY);

        double charlotteX = 35.2270869;
        double charlottey = -80.84312669999997;
        double charlotteRadiansX = Math.toRadians(charlotteX);
        double charlotteRadiansY = Math.toRadians(charlottey);

        double orlandoX = 28.5383355;
        double orlandoY = -81.3792364999;
        double orlandoRadiansX = Math.toRadians(orlandoX);
        double orlandoRadiansY = Math.toRadians(orlandoY);

        double savannahX = 32.0835407;
        double savannahY = -81.09983419999998;
        double savannahRadiansX = Math.toRadians(savannahX);
        double savannahRadiansY = Math.toRadians(savannahY);

        double distanceAtlantaToCharlotte = radius *
                Math.acos((Math.sin(atlantaRadiansX) * Math.sin(charlotteRadiansX)) +
                        Math.cos(atlantaRadiansX) * Math.cos(charlotteRadiansX) *
                                Math.cos(atlantaRadiansY - charlotteRadiansY));


        double distanceAtlantaToOrlando = radius *
                Math.acos((Math.sin(atlantaRadiansX) * Math.sin(orlandoRadiansX)) +
                        Math.cos(atlantaRadiansX) * Math.cos(orlandoRadiansX) *
                                Math.cos(atlantaRadiansY - orlandoRadiansY));


        double distanceOrlandoToSavannah = radius *
                Math.acos((Math.sin(savannahRadiansX) * Math.sin(orlandoRadiansX)) +
                        Math.cos(savannahRadiansX) * Math.cos(orlandoRadiansX) *
                                Math.cos(savannahRadiansY - orlandoRadiansY));

        double distanceCharlotteToSavannah = radius *
                Math.acos((Math.sin(savannahRadiansX) * Math.sin(charlotteRadiansX)) +
                        Math.cos(savannahRadiansX) * Math.cos(charlotteRadiansX) *
                                Math.cos(savannahRadiansY - charlotteRadiansY));


        double distanceAtlantaToSavannah = radius *
                Math.acos((Math.sin(savannahRadiansX) * Math.sin(atlantaRadiansX)) +
                        Math.cos(savannahRadiansX) * Math.cos(atlantaRadiansX) *
                                Math.cos(savannahRadiansY - atlantaRadiansY));

        double s1 = (distanceAtlantaToSavannah + distanceOrlandoToSavannah + distanceAtlantaToOrlando) / 2;
        double area1 = Math.sqrt(s1 * (s1 - distanceAtlantaToSavannah) * (s1 - distanceOrlandoToSavannah) * (s1 - distanceAtlantaToOrlando));


        double s2 = (distanceAtlantaToSavannah + distanceCharlotteToSavannah + distanceAtlantaToCharlotte) / 2;
        double area2 = Math.sqrt(s2 * (s2 - distanceAtlantaToSavannah) * (s2 - distanceCharlotteToSavannah) * (s2 - distanceAtlantaToCharlotte));

        double totalArea = area1 + area2;

        System.out.println("Estimated area enclosed by these four cities: " + totalArea);

    }
}
