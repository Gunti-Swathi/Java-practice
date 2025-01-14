

public class Route {
    public static void main(String args[]){
        String str ="WNEENESENNN";
        int x1=0;
        int x2=0;
        int y1=0;
        int y2=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='E'){
                x2++;
            }
            else if(str.charAt(i)=='W'){
                x2--;
            }
            else if(str.charAt(i)=='N'){
                y2++;
            }
            else if(str.charAt(i)=='S'){
                y2--;
            }
        }
        double result = Math.sqrt((x2*x2)+(y2*y2));
        System.out.print(result);
    }
    
}
