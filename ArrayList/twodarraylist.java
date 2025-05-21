import java.util.*;

public class twodarraylist {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList( 6,7,8,9));
        ArrayList<Integer>list3=new ArrayList<>(Arrays.asList( 2,26,29,50));
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.print(mainlist);
        // for(int i=0;i<mainlist.size();i++){
        //     for(int j=0;j<mainlist.get(i).size();j++){
        //         System.out.print(mainlist.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<mainlist.size();i++){
            ArrayList <Integer>Currlist=mainlist.get(i);
            for(int j=0;j<Currlist.size();j++){
                System.out.print(Currlist.get(j)+" ");
            }
            System.out.println();
        }
    }





        

        
    
}
