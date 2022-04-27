package week5;

import java.util.ArrayList;

public class Kisimain {

	public static void main(String[] args) {

		ArrayList<Kisi> bireyler = new ArrayList<Kisi>();
		
		bireyler.add(new Kisi("Furkan",19));
		bireyler.add(new Kisi("Kerem",21));
		bireyler.add(new Kisi("Yasin",21));
		
		for(Kisi birey:bireyler){
			System.out.println("isim: "+birey.getIsim()+"yas: "+birey.getYas());
		}
	}

}