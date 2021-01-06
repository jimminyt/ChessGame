public class Pawn extends Piece {

  public boolean moved;

  public Pawn(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "P";
    moved = false;
  }

  public boolean validateMove(int xVal, int yVal, Square[][] board){
    if (!checkBorder(xVal,yVal)){
      return false;
    }
    if (board[xVal][yVal].getPiece() == null){
      if ((colour == 0 && xVal == x && yVal == y+1)
        ||(colour == 0 && xVal == x && yVal == y+2 && !moved)
        ||(colour == 1 && xVal == x && yVal == y-1)
        ||(colour == 1 && xVal == x && yVal == y-2 && !moved)){
        moved = true;
        return makeMove(xVal,yVal);
      }
    }else if (board[xVal][yVal].getPiece().getColour() != colour){
      if ((colour == 0 && xVal == x+1 && yVal == y+1)
        ||(colour == 0 && xVal == x-1 && yVal == y+1)
        ||(colour == 1 && xVal == x+1 && yVal == y-1)
        ||(colour == 1 && xVal == x-1 && yVal == y-1)){
          moved = true;
          return makeMove(xVal,yVal);
      }
    }
    return false;
  }

  public boolean hasMoved(){
    return moved;
  }

}
