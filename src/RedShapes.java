public class RedShapes implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }

    @Override
    public void drawRectangle(int w, int h) {
        System.out.println("Drawing Rectangle{ color red, width: " + w + ", height: " + h + "]");
    }
}