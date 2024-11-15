package graphics;

public class AdapterCircle extends Polygon{
	private Circle circle;

    // 构造方法
    public AdapterCircle(float radius) {
        this.circle = new Circle(radius);
    }

    @Override
    public void draw() {
        circle.drawCircle();
    }

    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 1;
    }

    @Override
    public float calcArea() {
        return circle.areaCircle();
    }
}
