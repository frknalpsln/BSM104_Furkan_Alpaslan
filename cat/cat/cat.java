package cat;

public class cat {
	int age;
    String name;
    String color;
    
    
    public cat() {
        this.age = 0;
        this.name ="isim girilmedi" ;
        this.color = "renk girilmedi" ;
    
    }    
    
    public cat(String name, int age) {
        this.name = name;
        this.age = age;

    }
   public cat(String name, String color,int age) {
    this.name = name;
    this.color = color ; 
    this.age = age;

   }
    
   public cat(int age, String name, String color) {
        this.name = name;
        this.color = color ; 
        this.age = age;

       }
    
}