package week9;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

		System.out.println(PascalTriangle(9));
	}
	public static ArrayList<ArrayList<Integer>> PascalTriangle(int numRows) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0 ; i < numRows; i++) {
			list.add(new ArrayList<Integer>());
		
		}
		
		for(int i = 0; i< numRows;i++) {
			for(int j = 0;j<= i ;j++) {
				if(j==0 || i==j) {
					list.get(i).add(1);
				}
				else {
					int med = list.get(i-1).get(j-1) + list.get(i-1).get(j);
					list.get(i).add(med);
				}
			}
		}
		return list;
	}

}