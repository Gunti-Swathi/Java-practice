public class subseq {
    public static void sub(String s, int i, String snew){
        if(i==s.length()){
            System.out.println(snew);
            return;

        }
        // Time complexity is O(2^n )as each node has 2 posibilities it can add into new string or doesnt add.
        sub(s,i+1,snew+s.charAt(i));
        sub(s,i+1,snew);

    }
    public static void main(String[] args) {
        String s="abc";
        sub(s,0,"");
        
    }
    
}
