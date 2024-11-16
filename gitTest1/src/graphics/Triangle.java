package graphics;

/**
 * Triangle 类表示一个三角形，它继承自 Polygon 抽象类。
 * Triangle 类通过提供具体的实现来重写 Polygon 类中的抽象方法。
 *
 * <p>这个类使用三个 Vertex 对象来表示三角形的三个顶点。</p>
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 * @see Polygon Polygon 抽象类，定义了多边形的基本属性和方法
 * @see Vertex 顶点类，用于表示图形的顶点，并具有计算距离的方法
 */
public class Triangle extends Polygon {
	private Vertex v1, v2, v3;

	/**
     * 构造方法，用于创建一个三角形。
     *
     * <p>这个方法接受三个 Vertex 对象作为参数，并将它们分别设置为三角形的三个顶点。</p>
     *
     * <p>顶点应该按照某种顺序（例如顺时针或逆时针）提供，以确保三角形能够正确形成。</p>
     *
     * @param v1 三角形的第一个顶点
     * @param v2 三角形的第二个顶点
     * @param v3 三角形的第三个顶点
     */
    public Triangle(Vertex v1, Vertex v2, Vertex v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /**
     * 绘制三角形的方法。
     *
     * <p>这个方法重写了 Polygon 类中的抽象方法 draw。它的作用是打印一条消息，表示正在绘制三角形。</p>
     *
    */
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    /**
     * 判断给定的顶点数组是否可以形成一个三角形。
     *
     * <p>这个方法重写了 Polygon 类中的抽象方法 canForm。它的作用是判断给定的顶点数组是否可以构成一个有效的三角形。</p>
     *
     * <p>当前的实现检查了顶点数组的长度是否为3，因为三角形正是由三个顶点构成的。</p>
     *
     * @param vertices 用于形成三角形的顶点数组
     * @return 如果顶点数组可以形成一个三角形，则返回 true；否则返回 false
     * @see Vertex 顶点类
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 3;
    }

    /**
     * 计算并返回三角形的面积。
     *
     * <p>这个方法重写了 Polygon 类中的抽象方法 calcArea。它的作用是计算并返回三角形的面积。</p>
     *
     * <p>面积是通过海伦公式（Heron's formula）来计算的，该公式使用三角形的三边长度来计算面积。</p>
     *
     * <p>海伦公式为：sqrt(s * (s - a) * (s - b) * (s - c))，其中 s 是半周长（即 (a + b + c) / 2），a、b、c 分别是三角形的三边长度。</p>
     *
     * @return 三角形的面积
     * @see Vertex 顶点类，用于计算距离
     */
    @Override
    public float calcArea() {
        float a = v1.calcDistance(v2);
        float b = v2.calcDistance(v3);
        float c = v3.calcDistance(v1);
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
