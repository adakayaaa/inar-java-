package week_13.assignments;

import java.util.Date;


public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();


    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                "\nand filled: " + filled;
    }

    public int compareTo(week_13.assignments.GeometricObject geometricObject) {
        if (this.getArea() > geometricObject.getArea()) {
            return 1;
        } else if (this.getArea() == geometricObject.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }

    public String max(GeometricObject geometricObject1){
        if (geometricObject1.getArea() > this.getArea()) {
            return geometricObject1.toString();
        } else if (geometricObject1.getArea() <this.getArea()) {
            return this.toString();
        } else {
            return this.toString();
        }
    }
}


