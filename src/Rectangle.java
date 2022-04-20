public class Rectangle extends Shape {
    private int w, h;

    protected Rectangle(int w, int h, DrawAPI drawAPI) {
        super(drawAPI);
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        drawAPI.drawRectangle(w, h);
    }
}
