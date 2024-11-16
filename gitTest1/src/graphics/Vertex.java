package graphics;

/**
 * Vertex ���ʾһ����άƽ���ϵĵ㣨���㣩��
 *
 * <p>������ṩ�˻�ȡ����� x �� y ����ķ������Լ����㵱ǰ��������һ������֮�����ķ�����</p>
 *
 * @author Jing
 * @version 1.0.0
 * @since 2024-11-16
 */
public class Vertex {
	 private float x, y;

	 	/**
	     * ���췽�������ڴ���һ������ָ�� x �� y ����Ķ��㡣
	     *
	     * @param x ����� x ����
	     * @param y ����� y ����
	     */
	    public Vertex(float x, float y) {
	        this.x = x;
	        this.y = y;
	    }

	    /**
	     * ��ȡ����� x ���ꡣ
	     *
	     * @return ����� x ����
	     */
	    public float getX() {
	        return x;
	    }

	    /**
	     * ��ȡ����� y ���ꡣ
	     *
	     * @return ����� y ����
	     */
	    public float getY() {
	        return y;
	    }

	    /**
	     * ���㲢���ص�ǰ��������һ������֮��ľ��롣
	     *
	     * <p>������ͨ��ŷ����þ��빫ʽ����ģ��� sqrt((x2 - x1)^2 + (y2 - y1)^2)��</p>
	     *
	     * @param other Ҫ����������һ������
	     * @return ��ǰ������ָ������֮��ľ���
	     */
	    public float calcDistance(Vertex other) {
	        return (float) Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	    }
}
