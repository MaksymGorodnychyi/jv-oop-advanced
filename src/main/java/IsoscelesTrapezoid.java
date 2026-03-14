public class IsoscelesTrapezoid implements Figure {
    private double base1;
    private double base2;
    private double height;
    private String color;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, color: " + color + ", base1: " + base1 + ", base2: " + base2 + ", height: " + height + ", area: " + getArea());
    }
}
