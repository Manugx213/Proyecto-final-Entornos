package ejemplo3;

public class Rectangle {

    private static final int TWO = 2;

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int surface() {
        validateDimensions();
        return width * height;
    }

    public int perimeter() {
        validateDimensions();
        return TWO * width + TWO * height;
    }

    private void validateDimensions() {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                "Width and height must be greater than zero");
        }
    }
}