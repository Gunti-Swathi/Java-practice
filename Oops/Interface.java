public class Interface {
    public static void main(String[] args) {
        // object
        Queen q1 = new Queen();
        q1.moves();
        
    }
    
}
// interface( blue print of class)
interface Chessplay{
    //  interface deafult has publuc, abstract and no implementation method
    void moves();
}
//  class blue print of object
class Queen implements Chessplay{
    //  without publi it tkaes default as acesss specifier
    public void moves(){
        System.out.println("moves 1 step");
    }
}
class Rook implements Chessplay{
    //  without publi it tkaes default as acesss specifier
    public void moves(){
        System.out.println("moves 2 step");
    }
}
