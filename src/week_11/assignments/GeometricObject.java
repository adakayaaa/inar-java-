package week_11.assignments;

public class GeometricObject {
    boolean isEmpty;
    String color;

    public GeometricObject(){
        this.color= "white";
    }
    public GeometricObject(String color,boolean isEmpty){
        this.color=color;
        this.isEmpty=isEmpty;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "color: " + color +
                " and filled: " + isEmpty;
    }
}

