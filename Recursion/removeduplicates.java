public class removeduplicates {
    public static void calc(String s,boolean arr[],int i, StringBuilder sb){
        
        if(i==s.length()){
            System.out.print(sb);
            return;
        }
        if(arr[s.charAt(i)-97]==false){
            sb.append(s.charAt(i));
            arr[s.charAt(i)-97]=true;
            calc(s,arr,i+1,sb);

        }
        else{
            calc(s,arr,i+1,sb);

        }

        
        
    }
    public static void main(String args[]){
        boolean arr[]= new boolean[26];
        String s="appnnacollege";
        StringBuilder sb = new StringBuilder("");
        calc(s,arr,0,sb);

    }
    
}
