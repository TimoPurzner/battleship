package battleship;

public class Ship {

	private final int length;
	private Point startPos;
	private Point endPos;
	private boolean destroyed;

	// Konstruktor
	Ship(ShipType st){
		this.length = ShipType.getShipLength(st);
		this.destroyed = false;
	}

	// Getter
	public boolean destroyed() {
		return destroyed;
	}

	//Setter
	public void setStart(Point start){
		
	}
	
	public void setDestroyed(boolean dest) {
		destroyed = dest;
	}



}
