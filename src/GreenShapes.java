public class GreenShapes implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

    @Override
    public void drawRectangle(int w, int h) {
        System.out.println("Drawing Rectangle{ color green, width: " + w + ", height: " + h + "]");
    }
}