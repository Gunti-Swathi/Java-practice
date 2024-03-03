public class Array_func{
    public static void update(int a[]){
        for(int i =0;i<a.length;i++){
            int num =15;
            a[i] = a[i] + 1;
            System.out.print(a[i]);
        }
        

    }
    public static void main(String args[]){
        int array[] = {10,58,96};
        update(array);
        int num =10;
        //here varaible will pass by value  so num is not updated it prints 10 only.
        System.out.println(num);
        // function update changed array in main method also using "pass by reference"(****only for arrays****)
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]);
        }

    }
}