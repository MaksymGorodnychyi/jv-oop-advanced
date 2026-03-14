import java.util.Random;

public class ColorSupplier {
    private String[] colors = {"White", "Red", "Blue", "Green"};

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
