public class pairing {
    public static int pair(int n){
        if(n==1 || n==2){
            return n;
        }
        // single means remaining n-1 persons
        int f1 = pair(n-1);
        // pair means remaining n-2 persons
        int f2 = n-1 *pair(n-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        System.out.println(pair(3));
        
    }
    
}
