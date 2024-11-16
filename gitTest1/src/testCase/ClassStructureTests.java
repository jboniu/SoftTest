package testCase;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

/**
 * ��ṹһ���Բ��ԣ������֮��ļ̳й�ϵ���ӿ�ʵ���Լ���������ȷ��д��
 */
public class ClassStructureTests {

    /**
     * ���� Polygon �Ƿ�Ϊ�����ࡣ
     */
    @Test
    public void testPolygonIsAbstract() {
        try {
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            assertTrue("Polygon ӦΪ������", Modifier.isAbstract(polygonClass.getModifiers()));
        } catch (ClassNotFoundException e) {
            fail("Polygon ��δ�ҵ�");
        }
    }

    /**
     * ���� Triangle �Ƿ�̳��� Polygon��
     */
    @Test
    public void testTriangleInheritsPolygon() {
        try {
            Class<?> triangleClass = Class.forName("graphics.Triangle");
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            assertTrue("Triangle Ӧ�̳��� Polygon", polygonClass.isAssignableFrom(triangleClass));
        } catch (ClassNotFoundException e) {
            fail("Triangle �� Polygon ��δ�ҵ�");
        }
    }

    /**
     * ���� Rectangle �Ƿ�̳��� Polygon��
     */
    @Test
    public void testRectangleInheritsPolygon() {
        try {
            Class<?> rectangleClass = Class.forName("graphics.Rectangle");
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            assertTrue("Rectangle Ӧ�̳��� Polygon", polygonClass.isAssignableFrom(rectangleClass));
        } catch (ClassNotFoundException e) {
            fail("Rectangle �� Polygon ��δ�ҵ�");
        }
    }

    /**
     * ���� AdapterCircle �Ƿ�̳��� Polygon��
     */
    @Test
    public void testAdapterCircleInheritsPolygon() {
        try {
            Class<?> adapterCircleClass = Class.forName("graphics.AdapterCircle");
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            assertTrue("AdapterCircle Ӧ�̳��� Polygon", polygonClass.isAssignableFrom(adapterCircleClass));
        } catch (ClassNotFoundException e) {
            fail("AdapterCircle �� Polygon ��δ�ҵ�");
        }
    }

    /**
     * ��� Polygon �������Ƿ����˳��󷽷���
     */
    @Test
    public void testPolygonAbstractMethods() {
        try {
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            Method[] methods = polygonClass.getDeclaredMethods();

            boolean hasAbstractMethod = false;
            for (Method method : methods) {
                if (Modifier.isAbstract(method.getModifiers())) {
                    hasAbstractMethod = true;
                    break;
                }
            }

            assertTrue("Polygon Ӧ��������һ�����󷽷�", hasAbstractMethod);
        } catch (ClassNotFoundException e) {
            fail("Polygon ��δ�ҵ�");
        }
    }

    /**
     * ���� Circle ���Ƿ���ж���ʵ�ֵķ������Ǽ̳У���
     */
    @Test
    public void testCircleIndependentMethods() {
        try {
            Class<?> circleClass = Class.forName("graphics.Circle");
            Method areaCircleMethod = circleClass.getMethod("areaCircle");

            assertNotNull("Circle Ӧ���� areaCircle ����", areaCircleMethod);
            assertFalse("Circle �� areaCircle ������ӦΪ���󷽷�",
                    Modifier.isAbstract(areaCircleMethod.getModifiers()));
        } catch (ClassNotFoundException e) {
            fail("Circle ��δ�ҵ�");
        } catch (NoSuchMethodException e) {
            fail("Circle �� areaCircle ����δ�ҵ�");
        }
    }

    /**
     * ���� AdapterCircle �Ƿ���ȷ��д Polygon �ķ�����
     */
    @Test
    public void testAdapterCircleOverridesMethods() {
        try {
            Class<?> adapterCircleClass = Class.forName("graphics.AdapterCircle");
            Method calcAreaMethod = adapterCircleClass.getMethod("calcArea");

            assertNotNull("AdapterCircle Ӧʵ�� calcArea ����", calcAreaMethod);
            assertTrue("AdapterCircle �� calcArea ����Ӧ�� AdapterCircle ����д",
                    calcAreaMethod.getDeclaringClass().equals(adapterCircleClass));
        } catch (ClassNotFoundException e) {
            fail("AdapterCircle ��δ�ҵ�");
        } catch (NoSuchMethodException e) {
            fail("AdapterCircle �� calcArea ����δ�ҵ�");
        }
    }
}
