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
	public boolean getDestroyed() {
		return destroyed;
	}

	//Setter
	public void setStart(Point start){
		this.startPos=start;
	}
	
	public void setEndPoint(Point end){
		this.endPos=end;
	}
	
	public void setDestroyed(boolean dest) {
		destroyed = dest;
	}



}
