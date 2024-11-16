package graphics;

/**
 * Rectangle ���ʾһ�����Σ����̳��� Polygon �����ࡣ
 * Rectangle ��ͨ���ṩ�����ʵ������д Polygon ���еĳ��󷽷���
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 * @see Polygon Polygon ������
 * @see Vertex �����࣬���ڱ�ʾͼ�εĶ���
 */
public class Rectangle extends Polygon {
	private Vertex v1, v2, v3, v4;

	/**
     * ���췽�������ڴ���һ�����Ρ�
     *
     * <p>������������ĸ� Vertex ������Ϊ�������������Ƿֱ�����Ϊ���ε��ĸ����㡣</p>
     *
     * <p>����Ӧ�ð���˳ʱ�����ʱ���˳���ṩ����ȷ�������ܹ���ȷ�γɡ�</p>
     *
     * @param v1 ���εĵ�һ������
     * @param v2 ���εĵڶ�������
     * @param v3 ���εĵ���������
     * @param v4 ���εĵ��ĸ�����
     */
    public Rectangle(Vertex v1, Vertex v2, Vertex v3, Vertex v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }
    
    /**
     * ���ƾ��εķ�����
     *
     * <p>���������д�� Polygon ���еĳ��󷽷� draw�����������Ǵ�ӡһ����Ϣ����ʾ���ڻ��ƾ��Ρ�</p>
     */
    @Override
    public void draw() {
        System.out.println("���ƾ���");
    }

    /**
     * �жϸ����Ķ��������Ƿ�����γ�һ�����Ρ�
     *
     * <p>���������д�� Polygon ���еĳ��󷽷� canForm�������������жϸ����Ķ��������Ƿ���Թ���һ����Ч�ľ��Ρ�</p>
     *
     * @param vertices �����γɾ��εĶ�������
     * @return ���������������γ�һ�����Σ��򷵻� true�����򷵻� false
     * @see Vertex ������
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 4;
    }

    /**
     * ���㲢���ؾ��ε������
     *
     * <p>���������д�� Polygon ���еĳ��󷽷� calcArea�����������Ǽ��㲢���ؾ��ε������</p>
     *
     * <p>�����ͨ�������������ڶ���֮��ľ��루�����εĿ�Ⱥ͸߶ȣ��ĳ˻����õ��ġ�</p>
     *
     * <p>��Ҫע����ǣ����ʵ�ּ����˶��� v1, v2, v3, v4 �ǰ���ĳ��˳��˳ʱ�����ʱ�룩�ṩ�ģ����� v1 �� v2 ֮��ľ�������ȣ�v2 �� v3 ֮��ľ������߶ȡ�</p>
     *
     * @return ���ε����
     * @see Vertex �����࣬���ڼ������
     */
    @Override
    public float calcArea() {
        float width = v1.calcDistance(v2);
        float height = v2.calcDistance(v3);
        return width * height;
    }
}
