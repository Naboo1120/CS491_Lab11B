public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedShapes());
        Shape greenCircle = new Circle(100,100, 10, new GreenShapes());

        Shape redRectangle = new Rectangle(100, 100, new RedShapes());
        Shape greenRectangle = new Rectangle(100,100, new GreenShapes());

        redCircle.draw();
        greenCircle.draw();

        redRectangle.draw();
        greenRectangle.draw();

    }
}