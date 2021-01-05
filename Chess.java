import java.util.ArrayList;
public class Chess {
  public static void main(String[] args) {
    Player white = new Player(0);
    Player black = new Player(1);
    Board board = new Board();
    board.display();

    board.makeMove(0,1,0,2);

    board.display();
  }
}
