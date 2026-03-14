import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(5);

        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return new Circle(color, random.nextInt(5) + 1);

            case 1:
                return new Square(color, random.nextInt(5) + 1);

            case 2:
                return new Rectangle(color, random.nextInt(5) + 1, random.nextInt(5) + 1);

            case 3:
                return new RightTriangle(color, random.nextInt(5) + 1, random.nextInt(5) + 1);

            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt(5) + 1, random.nextInt(5) + 1, random.nextInt(5) + 1);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
