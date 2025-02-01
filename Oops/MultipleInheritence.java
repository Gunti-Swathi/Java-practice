public class MultipleInheritence {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eat();
        
        
    }
    
}
interface Carnivorious{
    void eat();
}
interface Herbivorious{
    void eat();
}
class Bear implements Carnivorious,Herbivorious{
    public void eat(){
        System.out.println("Eats both plants and animals");
    }
}
