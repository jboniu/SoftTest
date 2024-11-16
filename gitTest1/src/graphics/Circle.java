package graphics;

/**
 * Circle ���ʾһ��Բ�Σ����ṩ��������ͻ���Բ�εķ�����
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 */
public class Circle {
	private float radius;

 
 	/**
 	* ���췽�������ڴ���һ��ָ���뾶��Բ�Ρ�
 	*
 	* @param radius Բ�İ뾶������Ϊ�Ǹ�ֵ��
 	* @throws IllegalArgumentException ����뾶Ϊ������
 	*/	
	public Circle(float radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("�뾶����Ϊ����");
        }
        this.radius = radius;
    }

    
	/**
     * ����Բ�εķ�����
     *
     * <p>�˷�������ӡһ����Ϣ��ʾԲ���ѱ����ƣ�ʵ�ʻ��Ʋ��������ھ����ͼ�λ�����</p>
     */
    public void drawCircle() {
        System.out.println("����Բ��");
    }

	/**
     * ���㲢����Բ�ε������
     *
     * @return Բ�ε������
    */
    public float areaCircle() {
        return (float) (Math.PI * radius * radius);
    }
}
