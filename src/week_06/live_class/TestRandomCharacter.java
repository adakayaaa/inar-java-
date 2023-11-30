package week_06.live_class;

public class TestRandomCharacter {
    public static void main (String [] args){
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LİNE = 25;

        for (int i=0;i<NUMBER_OF_CHARS ;i++){
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if((i+1)% CHARS_PER_LİNE ==0){
                System.out.println(ch);
            }else{
                System.out.print(ch);
            }
        }
    }
}

