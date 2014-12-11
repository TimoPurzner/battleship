package schiffeversenken;

import schiffe.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Wie groß soll das Spielfeld sein? Länge: ");
		int fieldlength = sc.nextInt();
		sc.nextLine();
		System.out.print("Breite: ");
		int fieldwidth = sc.nextInt();

		// Spielfelder die Spieler 1 sieht
		Spielfeld p1Shipps = new Spielfeld(fieldlength, fieldwidth);
		Spielfeld p1Atk = new Spielfeld(fieldlength, fieldwidth);

		// Spielfelder die Spieler 2 sieht
		Spielfeld p2Shipps = new Spielfeld(fieldlength, fieldwidth);
		Spielfeld p2Atk = new Spielfeld(fieldlength, fieldwidth);

		// Start des Spieles
		Main.cls();
		System.out.println("Was möchtest du tun?");
		System.out.print("\t e oder Ende = Spielende"
				+ "\t n oder Neu = NeuesSpiel\n");

		// setzen der Schiffe

			//P1 schiffe Setzten
			System.out.println("Spieler 1 setzt nun die Schiffe!");
			p1Shipps.printField();
			
			
			
			//P1 schiffe Setzten
			System.out.println("Spieler 1 setzt nun die Schiffe!");
			
			
		// Wiederhole bis P1 oder P2 alle Schiffe verloren hat
		int win = 0;
		while (win == 0) {
			// P1 greift an
			boolean eing = false;
			while (eing == false) {
				p1Atk.printField();
				System.out.println("\nGeben sie Die Koordinaten des Angriffs an");
				System.out.print("x: ");
				int x = sc.nextInt();
				System.out.print("y: ");
				int y = sc.nextInt();
				eing= p1Atk.Attk(new Point(x,y));
					if(eing==false)
					System.out.println("Falsche eingabe");

				}
			


			// P1 getroffen?

			// P2 Schiffe kaputt?
			
			p1Atk.printField();
			System.out.println("Für nächsten Spieler belibige Taste drücken");
			sc.nextLine();
			cls();
			
			// alle Schiffe von P2 versenkt?
			
			
			// P2 greift an
			eing = false;
			while (eing == false) {
				p2Atk.printField();
				System.out.println("\nGeben sie Die Koordinaten des Angriffs an");
				System.out.print("x: ");
				int x = sc.nextInt();
				System.out.print("y: ");
				int y = sc.nextInt();
				eing= p2Atk.Attk(new Point(x,y));
					if(eing==false)
					System.out.println("Falsche eingabe");
			}

			p1Atk.printField();
			System.out.println("Für nächsten Spieler belibige Taste drücken");
			sc.nextLine();
			cls();
			// P2 getroffen?

			// alle Schiffe von P1 versenkt?

		}
		System.out.println("Gewonnen hat Spieler " + win + " Glückwunsch!");
	}

	public static void cls() {
		System.out.print("\n\n\n\n\n\n\n\n\n\n");
	}
}
