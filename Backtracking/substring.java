public class substring {
    public static void substr(int i, String s, String newstr){
        if(i==s.length()){
            if(newstr.length()==0){
            System.out.println("null");


            }
            else{
                System.out.println(newstr);

            }
            return;
        }
        substr(i+1,s,newstr+s.charAt(i));
        substr(i+1, s,newstr);
    }
    public static void main(String[] args) {
    substr(0,"abc","");
    }
    
}
// time complexity(O(n*2^n))
// space complecity(O(n))