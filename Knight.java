public class Knight extends Piece {

  public Knight(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "K";
  }

  public boolean validateMove(int xVal, int yVal, Square[][] board){
    if (!checkBorder(xVal,yVal)){
      return false;
    }
    if ((xVal == x+1 && yVal == y+2)
      ||(xVal == x+1 && yVal == y-2)
      ||(xVal == x-1 && yVal == y+2)
      ||(xVal == x-1 && yVal == y-2)
      ||(xVal == x+2 && yVal == y+1)
      ||(xVal == x+2 && yVal == y-1)
      ||(xVal == x-2 && yVal == y+1)
      ||(xVal == x-2 && yVal == y-1)){
      if (board[xVal][yVal].getPiece() != null){
        if (board[xVal][yVal].getPiece().getColour() == colour){
          return false;
        }
      }
      return makeMove(xVal,yVal);
    }
    return false;
  }
}
