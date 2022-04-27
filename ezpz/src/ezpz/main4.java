package ezpz;

import java.awt.Point;

public class main4 {

	public static void main(String[] args) {

		main4 pnt = new main4();
		pnt.x = 3;
		pnt.y = 4;

		// pnt.translate(2, -1);
		// System.out.println("point1 = ("+pnt.x + ","+pnt.y+")");
		// pnt.translate(-5, -7);

		System.out.println("point1 = (" + pnt.x + "," + pnt.y + ")");
		System.out.println("distance from orijin =" + pnt.distanceFromOrigin());
	}

}