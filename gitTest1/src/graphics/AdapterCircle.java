package graphics;

/**
 * AdapterCircle ����һ���������࣬���� Circle ��Ĺ������䵽 Polygon ��Ľӿ��ϡ�
 * ͨ�����������������ʹ�� Polygon �ӿڵķ��������� Circle ����
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 * @see Circle Բ����
 * @see Polygon �������
 */
public class AdapterCircle extends Polygon{
	private Circle circle;

	/**
     * ���췽��������һ��ָ���뾶��Բ�Σ���ͨ��������ʹ���ܹ�ʹ�� Polygon �Ľӿڡ�
     *
     * @param radius Ҫ������Բ�εİ뾶��
     * @throws IllegalArgumentException ����뾶Ϊ������
     */
	public AdapterCircle(float radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("�뾶����Ϊ����");
        }
        this.circle = new Circle(radius);
    }
	
	 /**
     * ����Բ�εķ�����
     * @see Circle#drawCircle()
     */
    @Override
    public void draw() {
        circle.drawCircle();
    }

    /**
     * �жϸ����Ķ��������Ƿ�����γ�һ��Բ�Ρ�
     * @param vertices �������顣
     * @return �����������ĳ���Ϊ1���򷵻� true�����򷵻� false��
     */
    @Override
    public boolean canForm(Vertex[] vertices) {
        return vertices.length == 1;
    }
    
    /**
     * ���㲢����Բ�ε������
     * @return Բ�ε������
     * @see Circle#areaCircle()
     */
    @Override
    public float calcArea() {
        return circle.areaCircle();
    }
}
