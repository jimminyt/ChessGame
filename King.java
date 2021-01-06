public class King extends Piece {

  private boolean moved;

  public King(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "K";
    moved = false;
  }

  public boolean validateMove(int xVal, int yVal, Square[][] board){
    if (!checkBorder(xVal,yVal)){
      return false;
    }
    if ((xVal == x+1 && yVal == y+1)
      ||(xVal == x-1 && yVal == y+1)
      ||(xVal == x+1 && yVal == y-1)
      ||(xVal == x-1 && yVal == y-1)
      ||(xVal == x+1 && yVal == y)
      ||(xVal == x-1 && yVal == y)
      ||(xVal == x && yVal == y+1)
      ||(xVal == x && yVal == y-1)){
      if (board[xVal][yVal].getPiece() != null){
        if (board[xVal][yVal].getPiece().getColour() == colour){
          return false;
        }
      }
      moved = true;
      return makeMove(xVal,yVal);
    }
    return false;
  }

  public boolean hasMoved(){
    return moved;
  }
}
