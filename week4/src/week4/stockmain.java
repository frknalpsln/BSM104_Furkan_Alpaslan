package week4;

import java.util.Scanner;

public class stockmain {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	
	System.out.println("ilk magaza ismi: ");
	String store1 = console.next();
	Stock stock1= new Stock(store1);
	int profit1=makepurchases(stock1,console);
	
	System.out.println("ikinci magaza ismi: ");
	String store2 = console.next();
	Stock stock2= new Stock(store1);
	int profit2=makepurchases(stock1,console);
	
	if (profit1>profit2) {
		System.out.println(store1+" daha yararli");
	}
	else if(profit2>profit1){
		System.out.println(store2 + " daha yararli");
	}
	else {
		System.out.println(store1+store2+" kazanc esittir");
	}
	
}
public static int makepurchases(Stock currentStock, Scanner console) {
	System.out.println("kac kez alisveris yaptin");
	int numpurchases =console.nextInt();
	
	for(int i=1;i<=numpurchases;i++) {
		System.out.println(i+" kac tane aldiniz - birim fiyat");
		int numshares = console.nextInt();
		int priceshare = console.nextInt();
		currentStock.purchase(numshares, priceshare);
	}
	System.out.println("guncel birim fiyat");
	int currentPrice=console.nextInt();
	
	int profit = currentStock.getProfit(currentPrice);
	System.out.println("net kazanc/kayip: "+profit+ " tl");
	
	return profit;
}
}