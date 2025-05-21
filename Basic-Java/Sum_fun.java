import java.util.*;
public class Sum_fun{
 // Without parameters  
//    public static void sum(){
//     Scanner sc = new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     int sumi = a+b;
//     System.out.println(sumi);

//    }
//    public static void main(String args[]){
//         sum();
        

//     }

// With parameters
//     public static void sum(int num1,int num2){
//         int sumi = num1+num2;
//         System.out.println(sumi);
    
    

//    }
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//      sum(a,b);
    
//    }

   // with parmeters and non void return type

   public static int sum(int num1,int num2){
        int sumi = num1+num2;
        return sumi;
    
    

   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
   //  int result = sum(a,b);
   //  System.out.println(result);
    //or
    System.out.println(sum(a,b));
   }
        

}