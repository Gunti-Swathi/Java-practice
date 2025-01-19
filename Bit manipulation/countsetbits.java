public class countsetbits {
    public static void main(String args[]){
        int x=16;
        int count=0;
        while(x>0){
            if((x&1)!=0){
                count++;
                
            }
            x=x>>1;

        }
        System.out.print(count);
        
    }
    
}
