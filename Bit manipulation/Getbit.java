

public class Getbit {
    public static void main(String args[]){
        int i=3;
        int x =10;
        int bitmask = 1<<i;
        if((x&bitmask) ==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");

        }
    }
    
}
