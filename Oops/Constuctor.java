public class Constuctor {
    public static void main(String[] args) {
        //  and passing the name here by creating object
        // parameterized constructor
        // Student s1 = new Student("Swathi");
        // System.out.print(s1.name);
        // Non parametrized constructor

        Student s1 = new Student();

        
    }
    
}
class Student{
    String name;
    // intilazing constructor with default value;
    //  contructor is defaultly intilazed in java i.w without any parameters
    // Student(String name){
    //     this.name=name;
    // }
    //  we can simply print anything inside constructor when it is called
    Student(){
        System.out.println("Called constructor");
    }


}
