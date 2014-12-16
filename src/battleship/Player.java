package battleship;

public class Player {

  // Ships from Player
  Playarea ships;

  Playarea atk;

  //Ships from each player
  Ship[] ship;

  /**
   * Constructor to create a player object with two "maps" for the ships and the attacks.
   * <p>
   * @param area_length Length of the playarea.
   * @param area_width  Height of the playarea.
   */
  public Player(int area_length, int area_width) {
    ships = new Playarea(area_length, area_width);
    atk = new Playarea(area_length, area_width);
  }

  /**
   * Method that allows a player to attack a specific Point. Further the method marks the attacked point with the
   * result.
   * <p>
   * @param target Specifies the point the player wants to attack.
   * <p>
   * @return Returns <var>true</var> if a ship was hit. Otherwise the method returns <var>fasle</var>.
   */
  public boolean attack(Point target) {
    Point p = this.atk.getPoint(target.x(), target.y());

    if (p.isMarked()) {
      if (p.markEquals(MarkType.Ship)) {
        p.setMark(MarkType.Hit);
        return true;
      }
    }
    p.setMark(MarkType.Water);
    return false;
  }

  /**
   * Method to set a ship with two coordinates.
   * <p>
   * @param start Specifies the starting point of the ship.
   * @param end   Specifies the ending point of the ship.
   * <p>
   * @return Returns <var>true</var> if it was possible to set the ship. Otherwise it returns <var>false</var>.
   */
  public boolean setShip(Point start, Point end) {
    boolean set = false;

    if (start.x() == end.x()) {
      for (int i = start.y(); i < end.y(); i++) {

      }
    }

    return set;
  }

  /**
   * Method to set a ship between two coordinates.
   * <p>
   * @param start Specifies the starting point of the ship.
   * @param end   Specifies the ending point of the ship.
   * @param st    Specifies the type of the ship you want to set.
   * <p>
   * @return Returns <var>true</var> if it was possible to set the ship. Otherwise it returns <var>false</var>.
   */
  public boolean setShip(Point start, Point end, ShipType st) {
    return false;
  }
}
