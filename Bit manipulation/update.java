

public class update {
    public static void main(String args[]){
        int x =10;
        int bit =1;
        int i=2;
        // if(bit ==0){
        //     int bitmask = ~(1<<i);
        //     System.out.println(x&bitmask);

        // }
        // if(bit==1){
        //     int bitmask = 1<<i;
        //     System.out.println(x|bitmask);

        // }

        // 2nd method
            int bitmask = ~(1<<i);
            x=x&bitmask;
            int bitmask2=bit<<i;
            System.out.println(x|bitmask2);

        

        
    }
    
}
