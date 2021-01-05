public class Pawn extends Piece {

  public boolean moved;

  public Pawn(int xVal, int yVal, int pColour){
    super(xVal,yVal,pColour);
    name = "P";
    moved = false;
  }

  public boolean move(int xVal, int yVal, Board board){
    if (!checkBorder(xVal,yVal)){
      return false;
    }
    if ((colour == 0 && xVal == x+1 && yVal == y)
      ||(colour == 0 && xVal == x+2 && yVal == y && !moved)
      ||(colour == 0 && xVal == x+1 && yVal == y)
      ||(colour == 0 && xVal == x+2 && yVal == y && !moved)){
      moved = true;
      return true;
    }
    return false;
  }



  public boolean hasMoved(){
    return moved;
  }

}
