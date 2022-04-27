package week4;

public class Stock {

    private String store;
    private int totalproduct;
    private int totalcost;
    
    public Stock(String theStore) {
    	if(theStore==null) {
    		throw new NullPointerException();
    		
    	}
    	store=theStore;
    	totalproduct=0;
    	totalcost=0;
    }
    public int getProfit(int currentPrice) {
    	if(currentPrice<0) {
    		throw new NullPointerException();
    	}
    	int marketvalue = totalproduct*currentPrice;
    	return marketvalue-totalcost;
    	
	}

    public void purchase(int shares,int pricepershare) {
	if(shares<0||pricepershare<0) {
		throw new IllegalArgumentException();
	}
	totalproduct+=shares;
	totalcost+=shares*pricepershare;
}
}