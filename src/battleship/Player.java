package battleship;

public class Player {

	// Ships from Player
	Playarea shipps;
	// Attacks this Player does
	Playarea atk;
	static int shipNr=0;
	
	Ship[] ships;
	
	
	//Konstruktur
	public Player(int fieldlength, int fieldwidth) {

		shipps = new Playarea(fieldlength, fieldwidth);
		atk = new Playarea(fieldlength, fieldwidth);
		
	}
	
	//set the ships
	public boolean setShip(Point start, Point end){
		boolean set=false;
		
		
		if(start.x() == end.x())
			for(int i=start.x() ;i<end.x();i++)
		shipps.getPoint(start.x(), start.y()).setmark(MarkType.Ship);
		
		
		return set;
	}
	
}
