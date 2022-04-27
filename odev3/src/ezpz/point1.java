package ezpz;

public class point1 {
	int x;
	int y;

	public point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distancefromorigin() {
		return Math.sqrt(xx + yy);

	}

	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
}