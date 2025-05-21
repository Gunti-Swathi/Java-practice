public class linear_search{
    // public static int search(int array[],int key){
    public static int search(String array[],String key){

        for(int i =0; i<array.length;i++){
            if(key == array[i]){
                return i;
            }
            
            
           
        }
        //if key does not exist in our array
         return -1;
        
    }
    public static void main(String args[]){
        // int array[] ={10,15,5,45,85,69,587};
        String array[] ={"dosa","apple","mango","cake","samosa","shake"};
        // int key =85;
        String key ="shake";
        int result = search(array,key);
        if(result ==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found: "+ result);


        }

    }
}
