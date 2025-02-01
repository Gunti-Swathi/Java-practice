public class Copyconstructor {
    public static void main(String[] args) {
        school ss1 = new school();
        ss1.name="chaitanya";
        ss1.address="India";
        ss1.events[0]=10;
        ss1.events[1]=100;
        ss1.events[2]=1000;


        school ss2 = new school(ss1);
        ss2.pin=45;
        System.out.println(ss2.name);
        System.out.println(ss2.events[2]);
        // modifying the 1 st constructor's array after copying in 2 nd constructor but still change is reflecting this is because its not creating new its just heading or pointed towards the existing array so changes made there will also reflect here.
        ss1.events[2]=1900;
        System.out.println(ss2.events[2]);






        
    }
    
}
class school{
    // intialize everything
    String name;
    String address;
    int pin;
    int events[]=new int[3];

    // create constructor with 0 param as we are  also creating other constructor

    school(){
       
        System.out.println("called constructor");

    }
    // shallow copy constructor
    // school(school ss1){
      
    //     // specify the atributes you want to copy in the 2nd constructor
    //     this.name=ss1.name;
    //     this.address=ss1.address;
    //     this.events=ss1.events;

    // }
    // deep copy constructor
     school(school ss1){
      
        // specify the atributes you want to copy in the 2nd constructor
        this.name=ss1.name;
        this.address=ss1.address;
        // instead of this.events we make a loop and copy each element then it creats a new array without refering to the orgnal array
        for(int i=0;i<3;i++){
            this.events[i]=ss1.events[i];
        }


    }

}
