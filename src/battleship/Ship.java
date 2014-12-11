package battleship;

public class Ship {

	int length;
	Point startPos;
	Point endPos;
	boolean destroyed;

	// Konstruktor
	Ship(int length, Point start, Point end) {
		this.length = length;
		this.startPos = start;
		this.endPos = end;
		this.destroyed = false;
	}

	// Getter
	public boolean destroyed() {
		return destroyed;
	}


}
