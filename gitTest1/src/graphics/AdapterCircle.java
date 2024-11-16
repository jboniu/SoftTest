package graphics;

/**
 * AdapterCircle 类是一个适配器类，它将 Circle 类的功能适配到 Polygon 类的接口上。
 * 通过这个适配器，可以使用 Polygon 接口的方法来操作 Circle 对象。
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 * @see Circle 圆形类
 * @see Polygon 多边形类
 */
public class AdapterCircle extends Polygon{
	private Circle circle;

	/**
     * 构造方法，创建一个指定半径的圆形，并通过适配器使其能够使用 Polygon 的接口。
     *
     * @param radius 要创建的圆形的半径。
     * @throws IllegalArgumentException 如果半径为负数。
     */
	public AdapterCircle(float radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("半径不能为负数");
        }
        this.circle = new Circle(radius);
    }
	
	 /**
     * 绘制圆形的方法。
     * @see Circle#drawCircle()
     */
    @Override
    public void draw() {
        circle.drawCircle();
    }

    /**
     * 判断给定的顶点数组是否可以形成一个圆形。
     * @param vertices 顶点数组。
     * @return 如果顶点数组的长度为1，则返回 true；否则返回 false。
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 1;
    }
    
    /**
     * 计算并返回圆形的面积。
     * @return 圆形的面积。
     * @see Circle#areaCircle()
     */
    @Override
    public float calcArea() {
        return circle.areaCircle();
    }
}
