public class Permutations {
    public static void permu(String s, String news){
        if(s.length()==0){
            System.out.println(news);
            return;
        }
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String newstr = s.substring(0, i)+s.substring(i+1);
            permu(newstr,news+s.charAt(i));
        }

    }
    public static void main(String[] args) {
        permu("abc","");
        
    }
    
}
