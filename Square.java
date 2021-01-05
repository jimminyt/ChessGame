public class Square {

  Piece piece;

  public Square(){
    piece = null;
  }

  public void setPiece(Piece newP){
    piece = newP;
  }

  public Piece getPiece(){
    return piece;
  }

  public Piece removePiece(){
    Piece tempPiece = piece; //May need checking if not copied correctly?
    piece = null;
    return tempPiece;
  }

  public String display(){
    if (piece != null){
      return piece.display();
    } else {
      return "--";
    }
  }

}
