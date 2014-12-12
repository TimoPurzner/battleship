package battleship;

public class Point {

  private final int x;
  private final int y;
  private MarkType mark;

  /**
   * Creates a 2D point with given <var>x</var> and <var>y</var> coordinates.
   * <p>
   * @param x x coordinate of the point.
   * @param y y coordinate of the point.
   */
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
    this.mark = MarkType.Empty;
  }

  /**
   * Method to get the x coordinate of the point
   * <p>
   * @return Returns the x coordinate
   */
  public int x() {
    return this.x;
  }

  /**
   * Method to get the y coordinate of the point.
   * <p>
   * @return Returns the y coordinate.
   */
  public int y() {
    return this.y;
  }

  /**
   * Method to get the <var>MarkType</var> of the point.
   * <p>
   * @return Returns the <var>MarkType</var> the point was marked with.
   */
  public MarkType getMark() {
    return this.mark;
  }

  /**
   * Method to set the <var>MarkType</var> of the point.
   * <p>
   * @param mt Sets the <var>MarkType</var> to the value of <var>mt</var>.
   */
  public void setmark(MarkType mt) {
    this.mark = mt;
  }

  /**
   * Method to check if the given <var>MarkType</var> is the same with the one from the parameters.
   * <p>
   * @param mt Specifys the <var>MarkType</var> you want to check with.
   * <p>
   * @return Returns <var>true</var> if both MarkType's are equal. Otherwise it returns <var>false</var>
   */
  public boolean markEquals(MarkType mt) {
    return this.mark == mt;
  }
  
  /**
   * Checks if the point ist marked. 
   * @return Returns true if the point is not empty. Otherwise it returns false.
   */
  public boolean isMarked() {
    return this.mark != MarkType.Empty;
  }

  /**
   * Method that gets the content of the point by resolving its MarkType
   * <p>
   * @return Returns a string that contains the value
   */
  @Override
  public String toString() {
    return String.valueOf(MarkType.getMark(this.mark));
  }
}
