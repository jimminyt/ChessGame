public class Queen extends Piece {

  public Queen(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "Q";
  }

  public boolean validateMove(int xVal, int yVal, Square[][] board){
    return false;
  }
}
