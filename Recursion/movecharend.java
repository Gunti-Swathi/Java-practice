public class movecharend {
    static int count =0;
    public static void move(String s, int i,String sb, char x){
        if(i==s.length()){
            while(count>0){
                sb+=x;
                count--;

            }
            System.out.print(sb);
            return;
            
            
            
        }
        
        if(s.charAt(i)!=x){
            sb+=s.charAt(i);
        }
        else{
            count++;

        }
        move(s,i+1,sb,x);
    }
    public static void main(String[] args) {
        String s ="abecdefgehie";
        move(s,0,"",'e');

        
    }
    
}
