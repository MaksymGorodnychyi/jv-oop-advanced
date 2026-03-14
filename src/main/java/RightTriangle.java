public class RightTriangle implements Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, color: " + color + ", firstLeg: " + firstLeg + ", secondLeg: " + secondLeg + ", area: " + getArea());
    }
}
