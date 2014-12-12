package battleship;

public class Ship {

	private final int length;
	private Point startPos;
	private Point endPos;
	private boolean destroyed;

	// Konstruktor
	Ship(int length) {
		this.length = length;
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
