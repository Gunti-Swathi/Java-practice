public class Abstraction {
    public static void main(String args[]){
        Horse h1 = new Horse();
        h1.walk();
        Chicken c1  = new Chicken();
        c1.walk();
        System.out.print(c1.color);
        c1.changecolor();

    }
    // cant create object of animal as it is abstract class
    // Animal a = new Animal();
}
abstract class Animal{
    String color;
    Animal(){
        color = "brown";

    }
    void eat(){
        System.out.println("eats");

    }
    // just gives idea
    abstract void walk();
}
class Chicken extends Animal{
    void changecolor(){
        System.out.println("pink");

        
    }
    void walk(){
        System.out.println("walk with 2 legs");
    }

}
class Horse extends Animal{
    void walk(){
        System.out.println("walk with 4 legs");
    }
}
