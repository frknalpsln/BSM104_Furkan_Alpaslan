package week6;

import java.util.HashSet;
import java.util.Set;

public class Pointmain {
	public static void main(String[] args) {
	Set<Point> points = new HashSet<Point>();
	Set<Integer> ints = new HashSet<Integer>();

	Point p2= new Point(6,8);
	
	points.add(new Point(3,4));
	points.add(p2);
	
	for(Point p: points) {
		System.out.println(p.getX()+p.getY());
	}
	}
}