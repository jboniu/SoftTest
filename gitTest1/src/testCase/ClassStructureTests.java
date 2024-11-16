package testCase;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

/**
 * 类结构一致性测试，检查类之间的继承关系、接口实现以及方法的正确重写。
 */
public class ClassStructureTests {

    /**
     * 测试 Polygon 是否为抽象类。
     */
    @Test
    public void testPolygonIsAbstract() {
        try {
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            assertTrue("Polygon 应为抽象类", Modifier.isAbstract(polygonClass.getModifiers()));
        } catch (ClassNotFoundException e) {
            fail("Polygon 类未找到");
        }
    }

    /**
     * 测试 Triangle 是否继承自 Polygon。
     */
    @Test
    public void testTriangleInheritsPolygon() {
        try {
            Class<?> triangleClass = Class.forName("graphics.Triangle");
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            assertTrue("Triangle 应继承自 Polygon", polygonClass.isAssignableFrom(triangleClass));
        } catch (ClassNotFoundException e) {
            fail("Triangle 或 Polygon 类未找到");
        }
    }

    /**
     * 测试 Rectangle 是否继承自 Polygon。
     */
    @Test
    public void testRectangleInheritsPolygon() {
        try {
            Class<?> rectangleClass = Class.forName("graphics.Rectangle");
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            assertTrue("Rectangle 应继承自 Polygon", polygonClass.isAssignableFrom(rectangleClass));
        } catch (ClassNotFoundException e) {
            fail("Rectangle 或 Polygon 类未找到");
        }
    }

    /**
     * 测试 AdapterCircle 是否继承自 Polygon。
     */
    @Test
    public void testAdapterCircleInheritsPolygon() {
        try {
            Class<?> adapterCircleClass = Class.forName("graphics.AdapterCircle");
            Class<?> polygonClass = Class.forName("graphics.Polygon");
            assertTrue("AdapterCircle 应继承自 Polygon", polygonClass.isAssignableFrom(adapterCircleClass));
        } catch (ClassNotFoundException e) {
            fail("AdapterCircle 或 Polygon 类未找到");
        }
    }

    /**
     * 检查 Polygon 抽象类是否定义了抽象方法。
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

            assertTrue("Polygon 应包含至少一个抽象方法", hasAbstractMethod);
        } catch (ClassNotFoundException e) {
            fail("Polygon 类未找到");
        }
    }

    /**
     * 测试 Circle 类是否具有独立实现的方法（非继承）。
     */
    @Test
    public void testCircleIndependentMethods() {
        try {
            Class<?> circleClass = Class.forName("graphics.Circle");
            Method areaCircleMethod = circleClass.getMethod("areaCircle");

            assertNotNull("Circle 应定义 areaCircle 方法", areaCircleMethod);
            assertFalse("Circle 的 areaCircle 方法不应为抽象方法",
                    Modifier.isAbstract(areaCircleMethod.getModifiers()));
        } catch (ClassNotFoundException e) {
            fail("Circle 类未找到");
        } catch (NoSuchMethodException e) {
            fail("Circle 的 areaCircle 方法未找到");
        }
    }

    /**
     * 测试 AdapterCircle 是否正确重写 Polygon 的方法。
     */
    @Test
    public void testAdapterCircleOverridesMethods() {
        try {
            Class<?> adapterCircleClass = Class.forName("graphics.AdapterCircle");
            Method calcAreaMethod = adapterCircleClass.getMethod("calcArea");

            assertNotNull("AdapterCircle 应实现 calcArea 方法", calcAreaMethod);
            assertTrue("AdapterCircle 的 calcArea 方法应在 AdapterCircle 中重写",
                    calcAreaMethod.getDeclaringClass().equals(adapterCircleClass));
        } catch (ClassNotFoundException e) {
            fail("AdapterCircle 类未找到");
        } catch (NoSuchMethodException e) {
            fail("AdapterCircle 的 calcArea 方法未找到");
        }
    }
}
