public class MutipleClasses{
    public static void main(String args[]){
        Pen p1=new Pen();
        // p1.setColor("yellow");
        p1.color="blue";
        System.out.print(p1.color);
        // creating object; (constructor intlaization)
        BankAccount b1= new BankAccount();
        b1.username="Swathi";
        System.out.print(b1.username);
        // Throws error as password is private;
        // b1.password="Swathi23";
        // now it works to change password
        b1.setpass("12345");
        System.out.print(b1.setpass());




        

    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newcolor){
        
        color=newcolor;
    }
    void settip(int newtip){    
        tip=newtip;
    }
}
class BankAccount{
    public String username;
    private String password;
    // but we can create a public method to change password but we cant access the password if you forget
    public void setpass(String pass){
        password=pass;
    }

}