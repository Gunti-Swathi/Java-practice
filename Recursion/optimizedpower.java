public class optimizedpower {
    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        // int x= pow(a,b/2)*pow(a,b/2);
        int x= pow(a,b/2);
        int y=x*x;

        
        if(b%2!=0){
            return a*y;
        } 
        return y;  

    }
    public static void main(String[] args) {
        int a =2;
        int b=10;
        int result = pow(a,b);
        System.out.print(result);
        
    }
}
    

