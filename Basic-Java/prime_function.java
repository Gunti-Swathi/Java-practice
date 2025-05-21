public class prime_function{
    public static boolean check(int a){
        // boolean is_prime = true;
        if(a ==2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(a);i++){
            if(a % i== 0){
                return false;
                // is_prime = false;
                // break;
                }
           
        }
        return true;
        
    }
    public static void main(String args[]){
        System.out.println(check(6));

    }
}