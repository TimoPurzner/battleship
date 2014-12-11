package schiffeversenken;

public class Schiffe {

	int lenth = 0;
	Point startPos;
	Point endPos;
	boolean destroyed;

	// Konstruktor
	Schiffe(int l, Point start, Point end) {
		this.lenth = l;
		this.startPos = start;
		this.endPos = end;
		this.destroyed = false;
	}

	// Getter
	public boolean destroyed() {
		return destroyed;
	}


}
