public class interface1 {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("The queen can move diagonally or horizontally.");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("The rook can only move vertically or horizontally.");
    }
}
