public class lengthstring {
    static int count=0;
    public static int length(String s, int i){
        
        if(i==s.length()){
            return 0;
        }
        // or you can simple run bellow line without using count as this one it takes substring removing 1 st char and adds one as it removed one like that it removes one and adds 1 so t last it returns strings length
        // return length(str.substring(1)) + 1;
        
        // count++;
        return 1+length(s,i+1);

        // return count; 
    }
    public static void main(String[] args) {
        String s="1234ixnncm58";
        System.out.println(length(s,0));
    }
    
}
