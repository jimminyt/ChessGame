import java.util.ArrayList;
public class Chess {
  public static void main(String[] args) {
    Player white = new Player(0);
    Player black = new Player(1);
    Board board = new Board();
    board.display();


    board.makeMove(1,0,3,1);
    board.display();
    board.makeMove(3,1,2,3);
    board.display();
    board.makeMove(2,3,4,2);
    board.display();



  }
}
