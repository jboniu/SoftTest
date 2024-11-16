package testCase;
import org.junit.Test;

import graphics.*;

import static org.junit.Assert.*;

/**
 * ��Ԫ�����࣬���ڲ��Ը�������״�Ĺ��ܷ�����
 * ���Է�Χ����������㡢��״��֤�Լ��෽�������䡣
 */
public class FuncTests {

    /**
     * ���������ε�������㷽����
     */
    @Test
    public void testTriangleCalcArea() {
        Triangle triangle = new Triangle(new Vertex(0, 0), new Vertex(3, 0), new Vertex(0, 4));
        assertEquals("����������������", 6.0, triangle.calcArea(), 0.001);
    }

    /**
     * ���������εĹ�����֤������
     */
    @Test
    public void testTriangleCanForm() {
        Triangle validTriangle = new Triangle(new Vertex(0, 0), new Vertex(3, 0), new Vertex(0, 4));
        assertTrue("�Ϸ�������δʶ��",
                validTriangle.canForm(new Vertex[]{new Vertex(0, 0), new Vertex(3, 0), new Vertex(0, 4)}));

//        ���ߵ㲻�ܹ���������
        Triangle invalidTriangle = new Triangle(new Vertex(0, 0), new Vertex(1, 0), new Vertex(2, 0));
        assertFalse("�Ƿ�������δʶ��",
                invalidTriangle.canForm(new Vertex[]{new Vertex(0, 0), new Vertex(1, 0), new Vertex(2, 0)}));
    }

    /**
     * ���Ծ��ε�������㷽����
     */
    @Test
    public void testRectangleCalcArea() {
        Rectangle rectangle = new Rectangle(
                new Vertex(0, 0), new Vertex(3, 0), new Vertex(3, 4),new Vertex(0, 4));
        assertEquals("��������������", 12.0, rectangle.calcArea(), 0.001);
    }

    /**
     * ���Ծ��εĹ�����֤������
     */
    @Test
    public void testRectangleCanForm() {
        Rectangle validRectangle = new Rectangle(
                new Vertex(0, 0), new Vertex(3, 0), new Vertex(3, 4),new Vertex(0, 4));
        assertTrue("�Ϸ�����δʶ��",
                validRectangle.canForm(new Vertex[]{
                        new Vertex(0, 0), new Vertex(3, 0),  new Vertex(3, 4),new Vertex(0, 4)}));

//        �Ǿ��ζ���
        Rectangle invalidRectangle = new Rectangle(
                new Vertex(0, 0), new Vertex(1, 0), new Vertex(0, 1), new Vertex(1, 2));
        assertFalse("�Ƿ�����δʶ��",
                invalidRectangle.canForm(new Vertex[]{
                        new Vertex(0, 0), new Vertex(1, 0), new Vertex(0, 1), new Vertex(1, 2)}));
    }

    /**
     * ����Բ��������㷽����
     */
    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals("Բ������������", 78.54, circle.areaCircle(), 0.01);
    }

    /**
     * ����������Բ��������㷽����
     */
    @Test
    public void testAdapterCircleCalcArea() {
        AdapterCircle adapterCircle = new AdapterCircle(5);
        assertEquals("������Բ������������", 78.54, adapterCircle.calcArea(), 0.01);
    }

    /**
     * ����������Բ�Ĺ�����֤������
     */
    @Test
    public void testAdapterCircleCanForm() {
        AdapterCircle adapterCircle = new AdapterCircle(5);
        assertTrue("�Ϸ�Բδʶ��", adapterCircle.canForm(new Vertex[]{new Vertex(0, 0)}));
    }
}
