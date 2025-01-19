public class Powerof2 {
    public static void main(String args[]){
        int x= 7;
        
        if((x & (x-1))==0){
            System.out.println("yes it is power of 2");

        }
        else{
            System.out.println("No it is not power of 2");
            
        }
    }
}
