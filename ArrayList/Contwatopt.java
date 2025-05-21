import java.util.*;
public class Contwatopt {
    public static void main(String args[]){
        int maxwater=0;
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5,4,8,3,7));
        int start=0;
        int end=list.size()-1;
        while(start<end){
            int height=Math.min(list.get(start),list.get(end));
            int width=end-start;
            
            maxwater=Math.max(maxwater,height*width);
            if(list.get(start)<list.get(end)){
                start++;
            }
            else{
                end--;
            }
        }
        System.out.print(maxwater);

    }
    
}
