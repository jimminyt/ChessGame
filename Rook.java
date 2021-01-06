public class Rook extends Piece {

  public Rook(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "R";
  }

  public boolean validateMove(int xVal, int yVal, Square[][] board){
    return false;
  }
}
