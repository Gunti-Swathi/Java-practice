public class lexicolargest {
    public static void main(String args[]){
        String str[]={"apple","banana","mango"};
        String largest = str[0];
        for(int i=0;i<str.length;i++){
            if(largest.compareToIgnoreCase(str[i])<0){
                largest=str[i];
            }
      
        }
      System.out.print(largest);

    }
    
}
