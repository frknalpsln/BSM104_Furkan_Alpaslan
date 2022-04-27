package week4;

public class Pointmain {

	public static void main(String[] args) {
     point p1 = new point(7, 2);
     point p2 = new point(4,3);
     System.out.println("p1("+p1.getX()+","+p1.getY()+")");
     System.out.println("orijine uzakligi: "+p1.distanceFromOrigin());
     
     System.out.println("p2("+p2.getX()+","+p2.getY()+")");
     System.out.println("orijine uzakligi: "+p2.distanceFromOrigin());

     p1.translate(11, 6);
     System.out.println("p1("+p1.getX()+","+p1.getY()+")");
     System.out.println("orijine uzakligi: "+p1.distanceFromOrigin());

     System.out.println("p1 = "+ p1);
     	

     
	}

}