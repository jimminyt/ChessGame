import java.util.ArrayList;
public class Board {

  private Square[][] gameBoard = new Square[8][8];

  public Board(){
    for (int i=0;i<8;i++){
      for (int j=0;j<8;j++){
        gameBoard[i][j] = new Square();
      }
    }
    for (int i=0;i<8;i++){
      gameBoard[i][1].setPiece(new Pawn(i,1,0));
    }
    for (int i=0;i<8;i++){
      gameBoard[i][1].setPiece(new Pawn(i,1,1));
    }
  }

  public void display() {
    for (int i=0;i<8;i++){
      for (int j=0;j<8;j++){
        System.out.println(gameBoard[i][j].display());
      }
    }

  }
}
