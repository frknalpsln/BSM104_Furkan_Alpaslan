package week5;

import java.util.ArrayList;
import java.util.List;

public class Fruit {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("muz");
		list.add("elma");
		list.add("portakal");
		
		System.out.println(list);
		
		for(String fruit:list) {
			System.out.println(fruit);
		}

	}

}