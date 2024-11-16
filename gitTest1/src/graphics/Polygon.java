package graphics;

public abstract class Polygon {
	 // ����ͼ�η���
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
