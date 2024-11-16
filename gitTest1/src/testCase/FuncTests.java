package testCase;
import org.junit.Test;

import graphics.*;

import static org.junit.Assert.*;

/**
 * 单元测试类，用于测试各几何形状的功能方法。
 * 测试范围包括面积计算、形状验证以及类方法的适配。
 */
public class FuncTests {

    /**
     * 测试三角形的面积计算方法。
     */
    @Test
    public void testTriangleCalcArea() {
        Triangle triangle = new Triangle(new Vertex(0, 0), new Vertex(3, 0), new Vertex(0, 4));
        assertEquals("三角形面积计算错误", 6.0, triangle.calcArea(), 0.001);
    }

    /**
     * 测试三角形的构造验证方法。
     */
    @Test
    public void testTriangleCanForm() {
        Triangle validTriangle = new Triangle(new Vertex(0, 0), new Vertex(3, 0), new Vertex(0, 4));
        assertTrue("合法三角形未识别",
                validTriangle.canForm(new Vertex[]{new Vertex(0, 0), new Vertex(3, 0), new Vertex(0, 4)}));

//        共线点不能构成三角形
        Triangle invalidTriangle = new Triangle(new Vertex(0, 0), new Vertex(1, 0), new Vertex(2, 0));
        assertFalse("非法三角形未识别",
                invalidTriangle.canForm(new Vertex[]{new Vertex(0, 0), new Vertex(1, 0), new Vertex(2, 0)}));
    }

    /**
     * 测试矩形的面积计算方法。
     */
    @Test
    public void testRectangleCalcArea() {
        Rectangle rectangle = new Rectangle(
                new Vertex(0, 0), new Vertex(3, 0), new Vertex(3, 4),new Vertex(0, 4));
        assertEquals("矩形面积计算错误", 12.0, rectangle.calcArea(), 0.001);
    }

    /**
     * 测试矩形的构造验证方法。
     */
    @Test
    public void testRectangleCanForm() {
        Rectangle validRectangle = new Rectangle(
                new Vertex(0, 0), new Vertex(3, 0), new Vertex(3, 4),new Vertex(0, 4));
        assertTrue("合法矩形未识别",
                validRectangle.canForm(new Vertex[]{
                        new Vertex(0, 0), new Vertex(3, 0),  new Vertex(3, 4),new Vertex(0, 4)}));

//        非矩形顶点
        Rectangle invalidRectangle = new Rectangle(
                new Vertex(0, 0), new Vertex(1, 0), new Vertex(0, 1), new Vertex(1, 2));
        assertFalse("非法矩形未识别",
                invalidRectangle.canForm(new Vertex[]{
                        new Vertex(0, 0), new Vertex(1, 0), new Vertex(0, 1), new Vertex(1, 2)}));
    }

    /**
     * 测试圆的面积计算方法。
     */
    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals("圆的面积计算错误", 78.54, circle.areaCircle(), 0.01);
    }

    /**
     * 测试适配器圆的面积计算方法。
     */
    @Test
    public void testAdapterCircleCalcArea() {
        AdapterCircle adapterCircle = new AdapterCircle(5);
        assertEquals("适配器圆的面积计算错误", 78.54, adapterCircle.calcArea(), 0.01);
    }

    /**
     * 测试适配器圆的构造验证方法。
     */
    @Test
    public void testAdapterCircleCanForm() {
        AdapterCircle adapterCircle = new AdapterCircle(5);
        assertTrue("合法圆未识别", adapterCircle.canForm(new Vertex[]{new Vertex(0, 0)}));
    }
}
