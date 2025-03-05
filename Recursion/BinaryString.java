public class BinaryString {
    // public static void bin(int n, int last, StringBuilder sb){
        // if(n==0){
        //     System.out.println(sb);
        //     return;
        // }
        // // as StringBuilder is mutable and is being modified in-place across recursive calls. This leads to incorrect output because all recursive calls share the same StringBuilder instance, and changes made in one recursive path affect others so we are using new sb at each step
        // bin(n-1,0,new StringBuilder(sb).append("0"));
        // if(last==0){
        // bin(n-1,1,new StringBuilder(sb).append("1"));

        // }
        //  // instead use string
    public static void bin(int n, int last, String s){

        if(n==0){
            System.out.println(s);
            return;
        }
        // as StringBuilder is mutable and is being modified in-place across recursive calls. This leads to incorrect output because all recursive calls share the same StringBuilder instance, and changes made in one recursive path affect others so we are using new sb at each step
        bin(n-1,0,s+"0");
        if(last==0){
        bin(n-1,1,s+"1");

        }
    // to count tota strings
    //  public static int bin(int n, int last){
    //     int c=0;

    //     if(n==0){
            
    //         return 1;
    //     }
    //     // as StringBuilder is mutable and is being modified in-place across recursive calls. This leads to incorrect output because all recursive calls share the same StringBuilder instance, and changes made in one recursive path affect others so we are using new sb at each step
    //     c+=bin(n-1,0);
    //     if(last==0){
    //         c+=bin(n-1,1);

    //     }
    //     return c;
        
        // if(last==1){
        //     bin(n-1,0,sb.append("0"));
        // }
        // if(last==0){
        //     bin(n-1,0,sb.append("0"));
        //     bin(n-1,1,sb.append("0"));


        // }
        
    


    }
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("");
        // bin(3,0,sb);
        // if you want to print count of strings exist 
        // System.out.println(bin(2,0));
        bin(3,0,"");
        
        
    }
    
}
