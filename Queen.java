public class Queen extends Piece {

  public Queen(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "Q";
  }

  public boolean validateMove(int xVal, int yVal, Square[][] board){
    if (!checkBorder(xVal,yVal)){
      return false;
    }
    //Right
    if (xVal > x && yVal == y){
      for(int i=x+1;i<xVal;i++){
        if (board[i][y].getPiece() != null){
          return false;
        }
      }
    }
    //Left
    else if (xVal < x && yVal == y){
      for(int i=x-1;i>xVal;i--){
        if (board[i][y].getPiece() != null){
          return false;
        }
      }
    }
    //Up
    else if (xVal == x && yVal > y){
      for(int i=y+1;i<yVal;i++){
        if (board[x][i].getPiece() != null){
          return false;
        }
      }
    }
    //Down
    else if (xVal == x && yVal < y){
      for(int i=y-1;i>yVal;i--){
              System.out.println("D" + y + ", " + yVal + ", " + i);
        if (board[x][i].getPiece() != null){
          return false;
        }
      }
    } else if (xVal - x == yVal - y){
      //Up-right
      if (xVal > x){
        for(int i=1;i<(xVal-x);i++){
          if (board[x+i][y+i].getPiece() != null){
            return false;
          }
        }
        //Down-Left
      } else if (xVal < x){
        for(int i=1;i<(x - xVal);i++){
          if (board[x-i][y-i].getPiece() != null){
            return false;
          }
        }
      } else { //if x1,y1 = x2,y2
        return false;
      }
    }
    else if (xVal - x == y - yVal){ //X and y in opposing directions
      //Down-right
      if (xVal > x){
        for(int i=1;i<(xVal-x);i++){
          if (board[x+i][y-i].getPiece() != null){
            return false;
          }
        }
      //Up-Left
      } else if (xVal < x){
        for(int i=1;i<(x-xVal);i++){
          if (board[x-i][y+i].getPiece() != null){
            return false;
          }
        }
      }
    } else { //Not a horizontal/vertical/diagonal move
      return false;
    }
    //Check desitnation for piece
    if (board[xVal][yVal].getPiece() != null){
      if (board[xVal][yVal].getPiece().getColour() == colour){ //Case where destination occupied by friendly piece
        return false;
      }
    }
    return makeMove(xVal,yVal); //Move is valid and can be made
  }
}
