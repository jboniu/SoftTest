package graphics;

/**
 * Polygon �����������һ�����л���ͼ�β������ܵĶ���λ����ƶ���ε�ͼ�Ρ�
 * �������˻���ͼ�Ρ��ж��Ƿ�����γɸ�ͼ���Լ�����ͼ��������������󷽷���
 * ��Щ������Ҫ�ھ���������б�ʵ�֡�
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 * @see Vertex �����࣬���ڱ�ʾͼ�εĶ���
 */
public abstract class Polygon {
	/**
     * ����ͼ�εķ�����
     *
     * <p>�˷�����һ�����󷽷�����Ҫ�ھ����������ʵ�֡����������ǻ��Ƴ��ö���λ����ƶ���ε�ͼ�Ρ�</p>
     *
     * <p>����Ļ����߼�ȡ���������ʵ�֡�</p>
     */
    public abstract void draw();

    /**
     * �жϸ����Ķ��������Ƿ�����γɸ�ͼ�Ρ�
     * @param vertices �����γ�ͼ�εĶ�������
     * @return ���������������γɸ�ͼ�Σ��򷵻� `true`�����򷵻� `false`
     * @see Vertex ������
     */
    public abstract boolean canForm(Vertex[] vertices);

    /**
     * ���㲢����ͼ�ε������
     * @return ͼ�ε����
     */
    public abstract float calcArea();
}
