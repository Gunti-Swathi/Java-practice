public class keypad {
    public static void keycal(String input,String newstr, int i){
        if(i==input.length()){
            System.out.println(newstr);
            return;
        }
        int x = (input.charAt(i)-'0')-2;
        if(x<0 ||x>=arr.length){
            return;
        }
        for(int k=0;k<arr[x].length();k++){
            keycal(input,newstr+arr[x].charAt(k),i+1);
            
                



        }

            
        
        
       


    }
    static String arr[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        
       
        String input ="345";
        keycal(input,"",0);
    }
    
}
