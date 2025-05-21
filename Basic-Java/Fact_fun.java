public class Fact_fun{
    public static void facto(int a){
        int product = 1;
        while(a>0){
            product = product*a;
            a--;
        }
        System.out.println(product);

    }
    public static void main(String args[]){
        facto(5);

    }
}