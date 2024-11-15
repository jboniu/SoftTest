package graphics;

public class Triangle extends Polygon {
	private Vertex v1, v2, v3;

    // 构造方法
    public Triangle(Vertex v1, Vertex v2, Vertex v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 3;
    }

    @Override
    public float calcArea() {
        float a = v1.calcDistance(v2);
        float b = v2.calcDistance(v3);
        float c = v3.calcDistance(v1);
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
