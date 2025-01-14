
public class substring {
    public static void Calculte(String str,int a,int b){
        for(int i=a;i<b;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }
    public static void main(String args[]){
        String str = "HelloWorld";
        int i =0;
        int j=5;
        // inbuilt function for substring
        System.out.print(str.substring(0,3));
        Calculte(str, i, j);


    }
}
