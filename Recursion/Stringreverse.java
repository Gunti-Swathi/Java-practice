public class Stringreverse {
    public static void reverse(String s, int i){
        if(i<0){
            return;
        }
        System.out.print(s.charAt(i));
        reverse(s,i-1);

    }
    public static void main(String[] args) {
        String s= "abc";
        reverse(s,s.length()-1);
        
    }
    
}
