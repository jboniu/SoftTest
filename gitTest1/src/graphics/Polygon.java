package graphics;

public abstract class Polygon {
	 // 绘制图形方法
    public abstract void draw();

    /**
     * 判断给定的顶点数组是否可以形成该图形。
     * @param vertices 用于形成图形的顶点数组
     * @return 如果顶点数组可以形成该图形，则返回 `true`；否则返回 `false`
     * @see Vertex 顶点类
     */
    public abstract boolean canForm(Vertex[] vertices);

    /**
     * 计算并返回图形的面积。
     * @return 图形的面积
     */
    public abstract float calcArea();
}
