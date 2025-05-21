public class bin_dec{
    public static double calculate(int a){
        // double sum = 0;
        // double c=0;
        int sum =0;
        int c=0;
        while(a!=0){
        
        
        int num = a%10;
        // double calc = num *   Math.pow(2,c);
        // int calc = num * (int) Math.pow(2,c);
        
        // sum = sum + calc;
        sum = sum + num *(int) Math.pow(2,c);
        a = a/10;
        c++;}
        return sum;
    }
    public static void main(String args[]){
        System.out.println(calculate(101));

    }
}