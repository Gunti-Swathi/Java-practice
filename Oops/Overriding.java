public class Overriding {
    public static void main(String[] args) {
        Deer d11=new Deer();
        d11.eat();
        
    }
    
}
class Animal{
    void eat(){
        System.out.println("eats");
    }

}
class Deer extends Animal{

void eat(){
    System.out.println("eats grass");
}
}
