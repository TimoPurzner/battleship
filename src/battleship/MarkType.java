package battleship;

public enum MarkType {

  Empty,
  Water,
  Hit,
  Ship;

  /**
   * This method allows to resolve a <var>Marktype</var> to its correct character value.
   * <p>
   * @param mt The <var>MarkType</var> you want to convert.
   * <p>
   * @return Returns the corresponding character inside a string.
   */
  public static char getMark(MarkType mt) {
    switch (mt) {
      case Water:
        return '~';
      case Hit:
        return 'X';
      case Ship:
        return 'S';
      case Empty:
      default:
        return ' ';
    }
  }
}
