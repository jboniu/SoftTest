package graphics;

/**
 * Main 类是图形应用程序的入口点。
 *
 * <p>这个类演示了如何使用 Vertex、Triangle、Rectangle、Circle 和 AdapterCircle 类来创建和操作几何形状。</p>
 *
 * <p>它创建了几个顶点，并使用这些顶点来构造三角形、矩形和圆形。然后，它调用这些形状的方法来绘制它们、检查它们是否可以由给定的顶点构成，并计算它们的面积。</p>
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 */
public class Main {
	public static void main(String[] args) {
        // 创建顶点
        Vertex v1 = new Vertex(0, 0);
        Vertex v2 = new Vertex(3, 0);
        Vertex v3 = new Vertex(0, 4);
        Vertex v4 = new Vertex(3, 4);

        // 创建三角形并测试其方法
        System.out.println("=== 三角形 ===");
        Triangle triangle = new Triangle(v1, v2, v3);
        triangle.draw();
        System.out.println("是否可以构成三角形: " + triangle.canForm(new Vertex[]{v1, v2, v3}));
        System.out.println("三角形的面积: " + triangle.calcArea());

        // 创建矩形并测试其方法
        System.out.println("\n=== 矩形 ===");
        Rectangle rectangle = new Rectangle(v1, v2, v3, v4);
        rectangle.draw();
        System.out.println("是否可以构成矩形: " + rectangle.canForm(new Vertex[]{v1, v2, v3, v4}));
        System.out.println("矩形的面积: " + rectangle.calcArea());

        // 创建圆形并测试其方法
        System.out.println("\n=== 圆形 ===");
        Circle circle = new Circle(5);
        circle.drawCircle();
        System.out.println("圆形的面积: " + circle.areaCircle());

        // 创建适配器圆并测试其方法
        System.out.println("\n=== 适配器圆 ===");
        AdapterCircle adapterCircle = new AdapterCircle(5);
        adapterCircle.draw();
        System.out.println("是否可以构成圆形: " + adapterCircle.canForm(new Vertex[]{v1}));
        System.out.println("适配器圆的面积: " + adapterCircle.calcArea());
    }
}
