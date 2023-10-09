package week_07.assignments;

public class Question_07_23 {
    public static void main (String[] args){
        boolean [] doors = new boolean[101];

        for(int students =1; students< doors.length;students++){
            for(int locker = 1; locker< doors.length; locker+=students){
                if(!doors[locker]){
                    doors[locker]= true;
                }else{
                    doors[locker] = false;
                }
            }
        }
        for(int i= 1;i< doors.length;i++){
            if(doors[i]){
                System.out.print ("L"+i+" ");
            }
        }
    }

}
