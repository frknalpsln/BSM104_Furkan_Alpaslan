package week6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Maps {
	public static void main(String[] args) {

	Map<Integer, String> citys = new HashMap<Integer, String>();
	
	citys.put(34,"Istanbul");
	citys.put(06,"Ankara");
	citys.put(35,"Izmir");
	citys.put(55,"Samsun");
	citys.put(38,"Kayseri");

	System.out.println(citys);
	System.out.println("indeksler - keys"+ citys.keySet());
	System.out.println(citys.values());
	
	Map<Integer, Set<String>> citys2 = new HashMap<Integer, Set<String>>();
	citys2.put(34, new TreeSet<String>());
	citys2.get(34).add("Istanbul");
	citys2.get(34).add("Besiktas");
	citys2.get(34).add("eminonu");
	citys2.put(06, new TreeSet<String>());
	citys2.get(06).add("Ankara");
	citys2.get(06).add("cankaya");
	
	System.out.println(citys2);
	}
}