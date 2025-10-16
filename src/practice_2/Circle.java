package practice_2;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return this.radius;
    }
    void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }
}
