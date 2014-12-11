package battleship;

public class Player {

	// Ships from Player
    Playarea shipps;
    //Attacks this Player does
    Playarea atk;
    
    //Ships from each player
    Ship aircraft = new Ship(5);
    Ship battleship = new Ship(4);
    Ship destroyer1 = new Ship(3);
    Ship destroyer2 = new Ship(3);
    Ship submarine1 = new Ship(2);
    Ship submarine2 = new Ship(2);
    Ship submarine3 = new Ship(2);
    Ship submarine4 = new Ship(2);
    
    
    public Player(int fieldlength, int fieldwidth){
    	
    	shipps = new Playarea(fieldlength, fieldwidth);
    	atk = new Playarea(fieldlength, fieldwidth);
    }
    
	
	
}
