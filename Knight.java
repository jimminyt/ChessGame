public class Knight extends Piece {

  public Knight(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "K";
  }

  public boolean validateMove(int xVal, int yVal, Square[][] board){
    return false;
  }
}
