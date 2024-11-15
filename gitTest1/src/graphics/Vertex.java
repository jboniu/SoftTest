package graphics;

public class Vertex {
	 private float x, y;

	    // ���췽��
	    public Vertex(float x, float y) {
	        this.x = x;
	        this.y = y;
	    }

	    // ��ȡ x ����
	    public float getX() {
	        return x;
	    }

	    // ��ȡ y ����
	    public float getY() {
	        return y;
	    }

	    // ���㵱ǰ��������һ������֮��ľ���
	    public float calcDistance(Vertex other) {
	        return (float) Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	    }
}
