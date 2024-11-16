package graphics;

/**
 * Vertex 类表示一个二维平面上的点（顶点）。
 *
 * <p>这个类提供了获取顶点的 x 和 y 坐标的方法，以及计算当前顶点与另一个顶点之间距离的方法。</p>
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 */
public class Vertex {
	 private float x, y;

	 	/**
	     * 构造方法，用于创建一个具有指定 x 和 y 坐标的顶点。
	     *
	     * @param x 顶点的 x 坐标
	     * @param y 顶点的 y 坐标
	     */
	    public Vertex(float x, float y) {
	        this.x = x;
	        this.y = y;
	    }

	    /**
	     * 获取顶点的 x 坐标。
	     *
	     * @return 顶点的 x 坐标
	     */
	    public float getX() {
	        return x;
	    }

	    /**
	     * 获取顶点的 y 坐标。
	     *
	     * @return 顶点的 y 坐标
	     */
	    public float getY() {
	        return y;
	    }

	    /**
	     * 计算并返回当前顶点与另一个顶点之间的距离。
	     *
	     * <p>距离是通过欧几里得距离公式计算的，即 sqrt((x2 - x1)^2 + (y2 - y1)^2)。</p>
	     *
	     * @param other 要计算距离的另一个顶点
	     * @return 当前顶点与指定顶点之间的距离
	     */
	    public float calcDistance(Vertex other) {
	        return (float) Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	    }
}
