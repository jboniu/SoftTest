package graphics;

public abstract class Polygon {
	 // ����ͼ�η���
    public abstract void draw();

    // �ж��Ƿ�����γɸ�ͼ��
    public abstract boolean canForm(Vertex[] vertices);

    // ����ͼ���������
    public abstract float calcArea();
}
