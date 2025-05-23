public class Getset {
    public static void main(String args[]){
        Pencil p11 = new Pencil();
        p11.settip(100);
        p11.setColor("green");
        // The bellow line gives error as they are private 
        p11.color=yellow;
        // so we can modify and print the private variables using get and set functions  
        System.out.println(p11.getcolor());
        System.out.println(p11.gettip());


    }
    
}

class Pencil{
    private String color;
    private int tip;
// define seters
    void setColor(String newcolor){
        // this refers to current variable and mostly used in variables with same name scenarios
        
        this.color=newcolor;
    }
    void settip(int newtip){    
        this.tip=newtip;
    }
// define geters
int gettip(){
    return this.tip;

}
String getcolor(){
    return this.color;
}
}
