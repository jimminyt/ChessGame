abstract class Piece{

  protected String name;
  protected int x;
  protected int y;
  protected int colour;

  public Piece(int xVal, int yVal, int pColour){
    x = xVal;
    y = yVal;
    colour = pColour;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public int getColour(){
    return colour;
  }

  public void makeMove(int xVal, int yVal){
    x = xVal;
    y = yVal;
  }

  protected boolean checkBorder(int xVal, int yVal){
    if (xVal < 0 || xVal > 7 ){
      return false;
    } else if (yVal < 0 || yVal > 7 ){
      return false;
    } else{
      return true;
    }

  }

  public String display(){
    if (colour == 0){
      return "W" + name;
    } else {
      return "B" + name;
    }
  }

  public String displayFull(){
    String output;
    if (colour == 0){
      output = "White " + name + ": " + x + "," + y;
    } else {
      output = "Black " + name + ": " + x + "," + y;
    }
    return output;
  }
}
