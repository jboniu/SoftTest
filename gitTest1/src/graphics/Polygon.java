package graphics;

/**
 * Polygon 抽象类代表了一个具有基本图形操作功能的多边形或类似多边形的图形。
 * 它定义了绘制图形、判断是否可以形成该图形以及计算图形面积这三个抽象方法，
 * 这些方法需要在具体的子类中被实现。
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 * @see Vertex 顶点类，用于表示图形的顶点
 */
public abstract class Polygon {
	/**
     * 绘制图形的方法。
     *
     * <p>此方法是一个抽象方法，需要在具体的子类中实现。它的作用是绘制出该多边形或类似多边形的图形。</p>
     *
     * <p>具体的绘制逻辑取决于子类的实现。</p>
     */
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
