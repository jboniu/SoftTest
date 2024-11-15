package graphics;

public abstract class Polygon {
	 // 绘制图形方法
    public abstract void draw();

    // 判断是否可以形成该图形
    public abstract boolean canForm(Vertex[] vertices);

    // 计算图形面积方法
    public abstract float calcArea();
}
