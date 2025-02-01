public class Inheritence {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // // gets from animal class as it fish inherits animal class properties
        // shark.eat();

        // Dog d1=new Dog();
        // d1.eat();
        // d1.legs=4;
        // System.out.println(d1.legs);
        Bird b1 = new Bird();
        b1.eat();
        b1.fly();


    }
    
}
class Animal{
    void breath(){
        System.out.println("breaths");
    }
    void eat(){
        System.out.println("eats");
    }
}
// single level inheritence
// class Fish extends Animal{
//     int fins;
//     void swin(){
//         System.out.println("swims");
//     }
// }
// multi level inheritence
// class Mammal extends Animal{
//     int legs;
// }
// class Dog extends Mammal{
//     String breed;
// }
// heiarrical inheritence   
class Fish extends Animal{
    int fins;
    void swin(){
        System.out.println("swims");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walking");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flying");

    }
}