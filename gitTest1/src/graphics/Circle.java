package graphics;

public class Circle {
	private float radius;

    // ���췽��
    public Circle(float radius) {
        this.radius = radius;
    }

    // ����Բ�εķ���
    public void drawCircle() {
        System.out.println("����Բ��");
    }

    // ����Բ�ε����
    public float areaCircle() {
        return (float) (Math.PI * radius * radius);
    }
}
