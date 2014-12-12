package battleship;

public enum ShipType {
  Sweeper,
  Submarine,
  Destroyer,
  Carrier;
  
  public static int getShipLength(ShipType st) {
    switch (st) {
      case Sweeper:
        return 2;
      case Submarine: 
        return 3;
      case Destroyer:
        return 4;
      case Carrier:
        return 5;
      default:
        return 0;
    }
  }
}
