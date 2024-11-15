package graphics;

public class Circle {
	private float radius;

    // 构造方法
    public Circle(float radius) {
        this.radius = radius;
    }

    // 绘制圆形的方法
    public void drawCircle() {
        System.out.println("绘制圆形");
    }

    // 计算圆形的面积
    public float areaCircle() {
        return (float) (Math.PI * radius * radius);
    }
}
