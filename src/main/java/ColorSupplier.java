import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private static final String[] COLORS = {"White", "Red", "Blue", "Green"};

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
