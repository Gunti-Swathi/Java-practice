public class perfect_square{
    
    public static void main(String args[]){
        boolean is_perfect = false;
        int q =38;
        int prod =1;
        for(int i =2;i <=q/2;i++){
            prod = i*i;
            if(q == prod){
                 is_perfect = true;
                 break;
                 
                }
              
        }
        System.out.println(is_perfect);


         

    }
}