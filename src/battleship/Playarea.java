package battleship;

public class Playarea {

  private final Point[][] playarea;

  /**
   * Constructor for creating a playarea for one player. Usually a player owns two playareas, one for his ships and one
   * for his attacks.
   * <p>
   * @param x Specifying the length of the playarea.
   * @param y Specifying the height of the playarea.
   */
  public Playarea(int x, int y) {

    this.playarea = new Point[x][y];

    /*
     * Initializing the coordinates
     */
    for (int i = 0; i < this.playarea.length; i++) {
      for (int j = 0; j < this.playarea[i].length; j++) {
        this.playarea[i][j] = new Point(i, j);
      }
    }

  }

  /**
   * Simple getter for retrieving a point object by using specific x and y coodinates.
   * <p>
   * @param x Specific x coordinate of the wanted point.
   * @param y Specific y coordinate of the wanted point.
   * <p>
   * @return Returns a point for specific coordinates.
   */
  public Point getPoint(int x, int y) {
    if (x < this.playarea.length && y < this.playarea[x].length) {
      return this.playarea[x][y];
    } else {
      return null;
    }
  }

  /**
   * Method that generates the String of the formatted actual playarea object.
   * <p>
   * @return Returns a formatted string that represents the playarea.
   */
  @Override
  public String toString() {
    String str = "";

    for (int x = 0; x < this.playarea.length; x++) {

      str += this.getRowSeparator();

      /*
       * Generating a row with their marks
       */
      for (int y = 0; y < this.playarea[x].length; y++) {
        if (y == 0) {
          str += "| ";
        }
        str += this.playarea[x][y] + " | ";

      }
      str += "\n";
    }

    str += this.getRowSeparator();

    return str;
  }

  /**
   * <b>WARNING:Only <var>toString()</var> should use this method!</b><br/>
   * Simple method to generate a simple row separator.
   * <p>
   * @return Returns the formatted string.s
   */
  private String getRowSeparator() {
    String str = "";
    /*
     * Generating row separator
     */
    for (int i = 0; i < this.playarea[0].length; i++) {
      str += "+---";
    }

    str += "+\n";
    return str;
  }

}
