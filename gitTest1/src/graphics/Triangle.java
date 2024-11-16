package graphics;

/**
 * Triangle ���ʾһ�������Σ����̳��� Polygon �����ࡣ
 * Triangle ��ͨ���ṩ�����ʵ������д Polygon ���еĳ��󷽷���
 *
 * <p>�����ʹ������ Vertex ��������ʾ�����ε��������㡣</p>
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 * @see Polygon Polygon �����࣬�����˶���εĻ������Ժͷ���
 * @see Vertex �����࣬���ڱ�ʾͼ�εĶ��㣬�����м������ķ���
 */
public class Triangle extends Polygon {
	private Vertex v1, v2, v3;

	/**
     * ���췽�������ڴ���һ�������Ρ�
     *
     * <p>��������������� Vertex ������Ϊ�������������Ƿֱ�����Ϊ�����ε��������㡣</p>
     *
     * <p>����Ӧ�ð���ĳ��˳������˳ʱ�����ʱ�룩�ṩ����ȷ���������ܹ���ȷ�γɡ�</p>
     *
     * @param v1 �����εĵ�һ������
     * @param v2 �����εĵڶ�������
     * @param v3 �����εĵ���������
     */
    public Triangle(Vertex v1, Vertex v2, Vertex v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /**
     * ���������εķ�����
     *
     * <p>���������д�� Polygon ���еĳ��󷽷� draw�����������Ǵ�ӡһ����Ϣ����ʾ���ڻ��������Ρ�</p>
     *
    */
    @Override
    public void draw() {
        System.out.println("����������");
    }

    /**
     * �жϸ����Ķ��������Ƿ�����γ�һ�������Ρ�
     *
     * <p>���������д�� Polygon ���еĳ��󷽷� canForm�������������жϸ����Ķ��������Ƿ���Թ���һ����Ч�������Ρ�</p>
     *
     * <p>��ǰ��ʵ�ּ���˶�������ĳ����Ƿ�Ϊ3����Ϊ�������������������㹹�ɵġ�</p>
     *
     * @param vertices �����γ������εĶ�������
     * @return ���������������γ�һ�������Σ��򷵻� true�����򷵻� false
     * @see Vertex ������
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 3;
    }

    /**
     * ���㲢���������ε������
     *
     * <p>���������д�� Polygon ���еĳ��󷽷� calcArea�����������Ǽ��㲢���������ε������</p>
     *
     * <p>�����ͨ�����׹�ʽ��Heron's formula��������ģ��ù�ʽʹ�������ε����߳��������������</p>
     *
     * <p>���׹�ʽΪ��sqrt(s * (s - a) * (s - b) * (s - c))������ s �ǰ��ܳ����� (a + b + c) / 2����a��b��c �ֱ��������ε����߳��ȡ�</p>
     *
     * @return �����ε����
     * @see Vertex �����࣬���ڼ������
     */
    @Override
    public float calcArea() {
        float a = v1.calcDistance(v2);
        float b = v2.calcDistance(v3);
        float c = v3.calcDistance(v1);
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
