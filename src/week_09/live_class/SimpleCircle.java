package week_09.live_class;

class SimpleCircle {
    double radius;


    /**
     * Construct a circle with radius 1
     */
    SimpleCircle() {
        radius = 1;
    }

    /**
     * Construct a circle with a specified radius
     */
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;


    }
}
