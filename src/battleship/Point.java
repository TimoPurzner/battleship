package battleship;

public class Point {

	int x;
	int y;
	char field;
	
	Point(int a, int b){
		x=a;
		y=b;
		field = ' ';
	}
	
	public int x(){
		return x;
	}
	
	public int y(){
		return y;
	}
	
	public char field(){
		return field;
	}
	public void setField(char f){
		field = f;
	}
	
}
