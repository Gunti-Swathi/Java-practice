public class pairs_arr{
    public static void calculate(int a[]){
        int count = 0;
        for(int i =0; i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
                count++;
            }
            System.out.println();

        }
        System.out.println("count is "+count);

    }
    public static void main(String args[]){
        int array[] = {2,5,8,9,20}; 
        calculate(array);
    }
}