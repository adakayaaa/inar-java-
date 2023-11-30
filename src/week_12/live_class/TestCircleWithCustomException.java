package week_12.live_class;

public class TestCircleWithCustomException {
    public static void main(String[] args) {
        try{
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException ex){
            System.out.println(ex);
        }
        System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
    }
}

