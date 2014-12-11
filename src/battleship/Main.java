package battleship;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);

    System.out.print("Wie gross soll das Playarea sein? Laenge: ");
    int fieldlength = sc.nextInt();
    sc.nextLine();
    System.out.print("Breite: ");
    int fieldwidth = sc.nextInt();

    // Playareaer die Spieler 1 sieht
    Playarea p1Shipps = new Playarea(fieldlength, fieldwidth);
    Playarea p1Atk = new Playarea(fieldlength, fieldwidth);

    // Playareaer die Spieler 2 sieht
    Playarea p2Shipps = new Playarea(fieldlength, fieldwidth);
    Playarea p2Atk = new Playarea(fieldlength, fieldwidth);

    // Start des Spieles
    Main.cls();
    System.out.println("Was moechtest du tun?");
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
        eing = p1Atk.Attk(new Point(x, y));
        if (eing == false) {
          System.out.println("Falsche eingabe");
        }

      }

      // P1 getroffen?
      // P2 Schiffe kaputt?
      p1Atk.printField();
      System.out.println("F�r n�chsten Spieler belibige Taste dr�cken");
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
        eing = p2Atk.Attk(new Point(x, y));
        if (eing == false) {
          System.out.println("Falsche eingabe");
        }
      }

      p1Atk.printField();
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
