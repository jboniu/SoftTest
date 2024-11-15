package graphics;

public class Rectangle extends Polygon {
	private Vertex v1, v2, v3, v4;

    // 构造方法
    public Rectangle(Vertex v1, Vertex v2, Vertex v3, Vertex v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 4;
    }

    @Override
    public float calcArea() {
        float width = v1.calcDistance(v2);
        float height = v2.calcDistance(v3);
        return width * height;
    }
}
