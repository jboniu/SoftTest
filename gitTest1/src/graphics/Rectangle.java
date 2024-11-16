package graphics;

/**
 * Rectangle 类表示一个矩形，它继承自 Polygon 抽象类。
 * Rectangle 类通过提供具体的实现来重写 Polygon 类中的抽象方法。
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 * @see Polygon Polygon 抽象类
 * @see Vertex 顶点类，用于表示图形的顶点
 */
public class Rectangle extends Polygon {
	private Vertex v1, v2, v3, v4;

	/**
     * 构造方法，用于创建一个矩形。
     *
     * <p>这个方法接受四个 Vertex 对象作为参数，并将它们分别设置为矩形的四个顶点。</p>
     *
     * <p>顶点应该按照顺时针或逆时针的顺序提供，以确保矩形能够正确形成。</p>
     *
     * @param v1 矩形的第一个顶点
     * @param v2 矩形的第二个顶点
     * @param v3 矩形的第三个顶点
     * @param v4 矩形的第四个顶点
     */
    public Rectangle(Vertex v1, Vertex v2, Vertex v3, Vertex v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }
    
    /**
     * 绘制矩形的方法。
     *
     * <p>这个方法重写了 Polygon 类中的抽象方法 draw。它的作用是打印一条消息，表示正在绘制矩形。</p>
     */
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

    /**
     * 判断给定的顶点数组是否可以形成一个矩形。
     *
     * <p>这个方法重写了 Polygon 类中的抽象方法 canForm。它的作用是判断给定的顶点数组是否可以构成一个有效的矩形。</p>
     *
     * @param vertices 用于形成矩形的顶点数组
     * @return 如果顶点数组可以形成一个矩形，则返回 true；否则返回 false
     * @see Vertex 顶点类
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 4;
    }

    /**
     * 计算并返回矩形的面积。
     *
     * <p>这个方法重写了 Polygon 类中的抽象方法 calcArea。它的作用是计算并返回矩形的面积。</p>
     *
     * <p>面积是通过计算两个相邻顶点之间的距离（即矩形的宽度和高度）的乘积来得到的。</p>
     *
     * <p>需要注意的是，这个实现假设了顶点 v1, v2, v3, v4 是按照某种顺序（顺时针或逆时针）提供的，并且 v1 和 v2 之间的距离代表宽度，v2 和 v3 之间的距离代表高度。</p>
     *
     * @return 矩形的面积
     * @see Vertex 顶点类，用于计算距离
     */
    @Override
    public float calcArea() {
        float width = v1.calcDistance(v2);
        float height = v2.calcDistance(v3);
        return width * height;
    }
}
