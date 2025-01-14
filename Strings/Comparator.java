

public class Comparator {
    public static void main(String args[]){
        String s1="abcd";
        String s2="abcd";
        String s3 = new String("abcd");
        // if(s1==s2){
        //     System.out.println("1 and2 are equal");
        // }
        // else{
        //     System.out.println("1 and2 are not equal");

        // }
        // if(s1==s3){
        //     System.out.println("1 and3 are equal");
        // }
        // else{
        //     System.out.println("1 and3 are not equal");

        // }

        // Using equal function
        
        if(s1.equals(s2)){
            System.out.println("1 and2 are equal");
        }
        else{
            System.out.println("1 and2 are not equal");

        }
        if(s1.equals(s3)){
            System.out.println("1 and3 are equal");
        }
        else{
            System.out.println("1 and3 are not equal");

        }




    }
    
}
