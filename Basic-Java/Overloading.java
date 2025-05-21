public class Overloading{
    public static int calculate(int a,int b){
        return a + b;
    }
    public static float calculate(float a,float b){
        return a/b;
    }
    public static int calculate(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(calculate(2.0f,3.0f));
        System.out.println(calculate(5,8,4));



    }
}