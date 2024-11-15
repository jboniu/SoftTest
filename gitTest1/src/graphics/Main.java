package graphics;

public class Main {
	public static void main(String[] args) {
        // ��������
        Vertex v1 = new Vertex(0, 0);
        Vertex v2 = new Vertex(3, 0);
        Vertex v3 = new Vertex(0, 4);
        Vertex v4 = new Vertex(3, 4);

        // ���������β������䷽��
        System.out.println("=== ������ ===");
        Triangle triangle = new Triangle(v1, v2, v3);
        triangle.draw();
        System.out.println("�Ƿ���Թ���������: " + triangle.canForm(new Vertex[]{v1, v2, v3}));
        System.out.println("�����ε����: " + triangle.calcArea());

        // �������β������䷽��
        System.out.println("\n=== ���� ===");
        Rectangle rectangle = new Rectangle(v1, v2, v3, v4);
        rectangle.draw();
        System.out.println("�Ƿ���Թ��ɾ���: " + rectangle.canForm(new Vertex[]{v1, v2, v3, v4}));
        System.out.println("���ε����: " + rectangle.calcArea());

        // ����Բ�β������䷽��
        System.out.println("\n=== Բ�� ===");
        Circle circle = new Circle(5);
        circle.drawCircle();
        System.out.println("Բ�ε����: " + circle.areaCircle());

        // ����������Բ�������䷽��
        System.out.println("\n=== ������Բ ===");
        AdapterCircle adapterCircle = new AdapterCircle(5);
        adapterCircle.draw();
        System.out.println("�Ƿ���Թ���Բ��: " + adapterCircle.canForm(new Vertex[]{v1}));
        System.out.println("������Բ�����: " + adapterCircle.calcArea());
    }
}
