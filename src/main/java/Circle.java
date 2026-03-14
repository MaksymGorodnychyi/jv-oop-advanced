public class Circle extends Figure {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, color: " + getColor() + ", radius: " + radius + ", area: " + getArea());
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
}
