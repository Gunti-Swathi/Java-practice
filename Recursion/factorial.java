

public class factorial {
    public static int calc(int n){
       
        if(n==0){
            // prod=prod*1;
            return 1;
            
        }
        return n*calc(n-1);
        

    }
    public static void main(String args[]){
        int n=5;
        int result=calc(n);
        System.out.print(result);
        
    }
    
}
