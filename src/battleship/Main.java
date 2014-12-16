package battleship;

import java.util.Scanner;

public class Main {

  // TODO Fix all non utf-8 chars
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);

    System.out.print("Wie gross soll das Spielfeld sein? Laenge: ");
    int fieldlength = sc.nextInt();
    sc.nextLine();
    System.out.print("Breite: ");
    int fieldwidth = sc.nextInt();
    System.out.print("\nWie viele Schiffe hat jeder Spieler? \nAnzahl: ");
    int anz = sc.nextInt();
    // Player 1
   Player p1 = new Player(fieldlength,fieldwidth); 

    // Player 2
   Player p2 = new Player(fieldlength,fieldwidth);
    
    // Start des Spieles
    //TODO: Implement new game, end
    Main.cls();
    System.out.println("Was moechtest du tun?");
    System.out.print("\t e oder Ende = Spielende"
            + "\t n oder Neu = NeuesSpiel\n");

    // setzen der Schiffe
    
    
    
    //P1 schiffe Setzten
    System.out.println("Spieler 1 setzt nun die Schiffe!");
    // NOT WORKING ANYMORE !!! p1.showFieldwithShipps();

    //P1 schiffe Setzten
    System.out.println("Spieler 2 setzt nun die Schiffe!");

    // Wiederhole bis P1 oder P2 alle Schiffe verloren hat
    int win = 0;
    while (win == 0) {
      // P1 greift an
    	
      boolean eing = false;
      while (eing == false) {
        // NOT WORKING ANYMORE !!!! p1.showFieldWithAtks();
        System.out.println("\nGeben sie Die Koordinaten des Angriffs an");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        // NOT WORKING ANYMORE !!!! eing = p1Atk.Attk(new Point(x, y));
        if (eing == false) {
          System.out.println("Falsche eingabe");
        }

      }

      // P1 getroffen?
      // P2 Schiffe kaputt?
      // NOT WORKING ANYMORE !!! p1.showFieldWithAtks();
      System.out.println("F�r n�chsten Spieler belibige Taste dr�cken");
      sc.nextLine();
      cls();

      // alle Schiffe von P2 versenkt?
      // P2 greift an
      eing = false;
      while (eing == false) {
        // NOT WORKING ANYMORE !!! p2.showFieldWithAtks();
        System.out.println("\nGeben sie Die Koordinaten des Angriffs an");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        // NOT WORKING ANYMORE !!! eing = p2Atk.Attk(new Point(x, y));
        if (eing == false) {
          System.out.println("Falsche eingabe");
        }
      }

      // NOT WORKING ANYMORE !!! p2.showFieldWithAtks();
      System.out.println("F�r n�chsten Spieler belibige Taste dr�cken");
      sc.nextLine();
      cls();
			// P2 getroffen?

      // alle Schiffe von P1 versenkt?
    }
    System.out.println("Gewonnen hat Spieler " + win + " Gl�ckwunsch!");
  }

  public static void cls() {
    System.out.print("\n\n\n\n\n\n\n\n\n\n");
  }
}
