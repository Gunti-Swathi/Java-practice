

public class palindrome {
    public static boolean interpret (String str){
        int n = str.length()/2;
        for(int i=0;i<=n;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        
        }
        return true;
    }
    public static void main(String args[]){
        String str="noon";
        boolean bool = interpret(str);
        System.out.println(bool);

    }

    
}
