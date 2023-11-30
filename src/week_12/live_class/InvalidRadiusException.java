package week_12.live_class;

public class InvalidRadiusException extends Exception{
    private double radius;
    public InvalidRadiusException(double radius){
        super("Invalid radius " + radius);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }
}

