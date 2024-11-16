package graphics;

/**
 * Circle 类表示一个圆形，并提供计算面积和绘制圆形的方法。
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 */
public class Circle {
	private float radius;

 
 	/**
 	* 构造方法，用于创建一个指定半径的圆形。
 	*
 	* @param radius 圆的半径，必须为非负值。
 	* @throws IllegalArgumentException 如果半径为负数。
 	*/	
	public Circle(float radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("半径不能为负数");
        }
        this.radius = radius;
    }

    
	/**
     * 绘制圆形的方法。
     *
     * <p>此方法仅打印一条消息表示圆形已被绘制，实际绘制操作依赖于具体的图形环境。</p>
     */
    public void drawCircle() {
        System.out.println("绘制圆形");
    }

	/**
     * 计算并返回圆形的面积。
     *
     * @return 圆形的面积。
    */
    public float areaCircle() {
        return (float) (Math.PI * radius * radius);
    }
}
