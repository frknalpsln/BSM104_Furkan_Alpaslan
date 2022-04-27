package week4;



public class point {

    private int x;
    private int y;
    
    public point(int initialX,int initialY) {
    	setlocation(initialX, initialY);
    }
    
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    
    public double distanceFromOrigin() {
    	return Math.sqrt(x*x+y*y);
    }
    public void translate(int dx,int dy) {
    	setlocation(x+dx,y+dy);
    }
    public void setlocation(int newX, int newY) {
    	x=newX;
    	y=newY;
    }
    public String toString() {
    	return "("+x+","+y+")";
    }
	}