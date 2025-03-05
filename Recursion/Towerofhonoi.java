public class Towerofhonoi {
   
    // public static void tower(int n, String src, String helper, String des){
        public static int tower(int n, String src, String helper, String des){
           

        if(n==1){
            System.out.println("transfer disk "+n+"from "+src+" to "+des);
            
            // return;
            return 1;
        }
        int count=0;
        count+=tower(n-1,src,des,helper);
        System.out.println("transfer disk "+n+"from "+src+" to "+des);
        count+=1;
        count+=tower(n-1,helper,src,des);
   
        return count;
    }
    public static void main(String[] args) {
    int n=2;
    System.out.println(tower(n,"S","H","D"));
        
    }
    
}
