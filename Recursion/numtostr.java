public class numtostr {
    // here we can create simple static object for array without passing it as a parameter to method convert;
    // Static arr[]={"zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine"};
    public static void convert(int num, String arr[]){
        if(num==0){
            return;
        }
        int rem = num%10;
        convert(num/10,arr);
        System.out.println(arr[rem]+ " ");
    }
    public static void main(String[] args) {
        int num = 1947;
        String words[] = {"zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine"};
        convert(num,words);
        
    }
    
}
