package week6;

import java.util.Arrays;
import java.util.LinkedList;

public class Arraylist {
	

	public static void main(String[] args) {
		LinkedList<Integer> t = new LinkedList<Integer>();
		
		for(int i=1;i<10;i++) {
			t.add(10*i);
		}
		System.out.println("before "+t);
	
		for(int i = 0; i<t.size();i++) {
			t.remove();
			i--;
		}
		System.out.println("after "+t);
		
	}

}