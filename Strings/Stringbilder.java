public class Stringbilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("12");
    // sb.toString();
        for(char i='a';i<='z';i++){
            sb.append(i);
        }
        System.out.print(sb);

    }
    
}
