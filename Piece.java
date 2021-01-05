public class Piece{

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

  // public Bool move(int xVal, int yVal){
  //   x = xVal;
  //   y = yVal;
  //   //ADD VALIDITY CHECK
  //   return true;
  // }

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
