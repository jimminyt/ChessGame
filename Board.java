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
    gameBoard[0][0].setPiece(new Rook(0,0,0));
    gameBoard[1][0].setPiece(new Rook(1,0,0));
    gameBoard[2][0].setPiece(new Rook(2,0,0));
    gameBoard[3][0].setPiece(new Rook(3,0,0));
    gameBoard[4][0].setPiece(new Rook(4,0,0));
    gameBoard[5][0].setPiece(new Rook(5,0,0));
    gameBoard[6][0].setPiece(new Rook(6,0,0));
    gameBoard[7][0].setPiece(new Rook(7,0,0));
    for (int i=0;i<8;i++){
      gameBoard[i][6].setPiece(new Pawn(i,6,1));
    }
    gameBoard[0][7].setPiece(new Rook(0,7,1));
    gameBoard[1][7].setPiece(new Knight(1,7,1));
    gameBoard[2][7].setPiece(new Bishop(2,7,1));
    gameBoard[3][7].setPiece(new Queen(3,7,1));
    gameBoard[4][7].setPiece(new King(4,7,1));
    gameBoard[5][7].setPiece(new Pawn(5,7,1));
    gameBoard[6][7].setPiece(new Knight(6,7,1));
    gameBoard[7][7].setPiece(new Rook(7,7,1));
  }

  public void display() {
    System.out.println("__________________");
    for (int i=7;i>=0;i--){
      System.out.print("|");
      for (int j=7;j>=0;j--){
        System.out.print(gameBoard[j][i].display());
      }
      System.out.println("|");
    }
    System.out.println("__________________");

  }
}
