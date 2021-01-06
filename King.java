public class King extends Piece {

  public King(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "K";
  }

  public boolean validateMove(int xVal, int yVal, Square[][] board){
    return false;
  }
}
