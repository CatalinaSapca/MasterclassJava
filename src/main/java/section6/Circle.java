package section6;

public class Circle {

    private double radius;

    public Circle(double radius){
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius,2) * Math.PI;
    }
}
