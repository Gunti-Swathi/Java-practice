import java.util.*;
public class Contwmwbrute {
    public static void main(String args[]){
        int maxwater=0;
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5,4,8,3,7));
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int height=Math.min(list.get(i),list.get(j));
                int width=j-i;
                
                maxwater=Math.max(maxwater,height*width);
                
            }
        }
        
        System.out.print(maxwater);
    }
}
