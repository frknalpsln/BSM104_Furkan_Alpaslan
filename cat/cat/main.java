package cat;

public class main {

	public static void main(String[] args) {
		   cat kedi1 = new cat();
	          System.out.println(kedi1.age+" , "+kedi1.color+" , "+kedi1.name );
	          
	          cat kedi2 = new cat("Tarcin",2);
	          System.out.println(kedi2.age+" , "+kedi2.color+" , "+kedi2.name );
	        
	          cat kedi3 = new cat("Tekir","gri",3);
	          System.out.println(kedi3.age+" , "+kedi3.color+" , "+kedi3.name );
	        
	          cat kedi4 = new cat(2,"Duman","gri");
	          System.out.println(kedi4.age+" , "+kedi4.color+" , "+kedi4.name );
	        
	}

}