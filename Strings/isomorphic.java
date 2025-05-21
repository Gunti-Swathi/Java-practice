public class isomorphic {
    public static void main(String args[]){
        String s="abcdefghijklmnopqrstuvwxyzva";
        String t="abcdefghijklmnopqrstuvwxyzck";
        System.out.println(isIsomorphic(s,t));
        
    }
    public static boolean isIsomorphic(String s, String t) {
        
        String x="";
        String y="";
        String x1="";
        String y1="";
    
        
        for(int i=0;i<s.length();i++){
            if(x.indexOf(s.charAt(i))==-1){
                x+=s.charAt(i);
    
            }
    
        }
        for(int i=0;i<t.length();i++){
            if(y.indexOf(t.charAt(i))==-1){
                y+=t.charAt(i);
    
            }
    
        }
        if(x.length()!=y.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            x1+=x.indexOf(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            y1+=y.indexOf(t.charAt(i));
        }
        System.out.println(x1);
        System.out.println(y1); 
        if(x1.equals(y1)){
            return true;
        }
        
    
    
    
          return false;
        
    }
}
    
    
    

