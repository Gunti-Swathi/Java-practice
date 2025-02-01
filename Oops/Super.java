public class Super {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
        
    }
    
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor called");
    }

}
class Horse extends Animal{
    Horse(){
        // like this we can intialize imediate variable
        super.color="brown";
        // super();
        // super is intilazed as inbuild in java
        System.out.println("HORSE Constructor called");
     
    
    }
}
