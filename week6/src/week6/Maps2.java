package week6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Maps2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Map<String, Integer> wordCountmap = new HashMap<String, Integer>();
		
		Scanner input = new Scanner(new File("test.txt"));
		
		while(input.hasNext()) {
			String word = input.next().toLowerCase();
		if(!wordCountmap.containsKey(word)) {
			wordCountmap.put(word, 1);
		}
		else {
			int count = wordCountmap.get(word);
			wordCountmap.put(word, count+1);
		}
		}
		System.out.println(wordCountmap);
	}

}