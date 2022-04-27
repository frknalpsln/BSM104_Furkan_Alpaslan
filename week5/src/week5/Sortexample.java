package week5;

import java.util.ArrayList;
import java.util.Collections;

public class Sortexample {

	public static void main(String[] args) {

		ArrayList<String> words = new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("kitap");
		words.add("bartin");

		System.out.println("dongu oncesi: "+words);
		System.out.println("liste uzunlugu: "+words.size());
		System.out.println("********************************");
		for(int index=0;index<words.size();index+=2) {
			words.add(index,"*");
		}
		System.out.println("dongu sonrasi: "+ words);
		System.out.println("liste uzunlugu: "+words.size());
		
		for(int index=0;index<words.size();index++) {
			words.remove(index);
		}
		
		System.out.println("silme sonrasi: "+words);
		System.out.println("liste uzunlugu: "+words.size());

			
	 
	}

}