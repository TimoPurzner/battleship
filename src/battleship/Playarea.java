package battleship;

public class Playarea {

	Point[][] field;

	// Konstruktor
	Playarea(int n, int m) {

		field = new Point[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				field[i][j] = new Point(i, j);
			}

	}

	// Getter
	public Point field(int x, int y) {
		return field[x][y];
	}

	public boolean Attk(Point atk) {
		boolean right = false;
		
		if (atk.x() < 0 || atk.x() > field[0].length || atk.y() < 0 || atk.y() > field.length
				|| field[atk.x() - 1][atk.y() - 1)] == 'X' || field[atk.x() - 1][atk.y() - 1)] == 'O'){
			right=false;
			}
		else{
			right=true;
			
			field[(atk.x() - 1)][(atk.y() - 1)].setField('X');
		}
		
		
		return right;
	}

	public void setShip(Point start, Point end) {

	}

	public void printField() {

		for (int j = 0; j < field.length; j++) {
			// Zeile ohne Zeichen ausgeben
			for (int i = 0; i < field[j].length; i++) {
				System.out.print("+---");

			}
			System.out.print("+\n");
			// Zeile mit Zeichen ausgeben
			for (int k = 0; k < field[j].length; k++) {
				if (k == 0)
					System.out.print("| ");
				System.out.print(field[j][k].field() + " | ");

			}
			System.out.print("\n");
		}
		for (int i = 0; i < field[0].length; i++)
			System.out.print("+---");
		System.out.print("+");
	}

}
