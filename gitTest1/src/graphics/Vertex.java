package graphics;

public class Vertex {
	 private float x, y;

	    // 构造方法
	    public Vertex(float x, float y) {
	        this.x = x;
	        this.y = y;
	    }

	    // 获取 x 坐标
	    public float getX() {
	        return x;
	    }

	    // 获取 y 坐标
	    public float getY() {
	        return y;
	    }

	    // 计算当前顶点与另一个顶点之间的距离
	    public float calcDistance(Vertex other) {
	        return (float) Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	    }
}
