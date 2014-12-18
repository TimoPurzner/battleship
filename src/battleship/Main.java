package battleship;

import java.util.Scanner;

public class Main {
	
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("How big should the playarea should be?\n  Length: ");
    int width = sc.nextInt();

    System.out.print("  Height: ");
    int height = sc.nextInt();

    //System.out.print("\nHow many  \nAnzahl: ");
    //int anz = sc.nextInt();

    Player p1 = new Player(width, height);
    Player p2 = new Player(width, height);

    //TODO: Starting game
    Main.cls();
    System.out.println("What do you want to do next?");
    System.out.println("'q' or 'quit'\tQuitting the game\n"
            + "'n' or 'new'\tStart new game");
    String in = sc.nextLine();

    //TODO: Setting ships for player1 and player2
    System.out.println("Player1, set your ships!");
    
	cls();
	System.out.println("Spieler 1 setzt nun die Schiffe!\n");
	System.out.println("Bitte gibt die Start und end Koordinate deines Schiffes an");
	System.out.print("Bitte x Wert der Start Koordinate eingeben x: ");
	int n = sc.nextInt();
	System.out.print("Bitte y Wert der Start Koodinate eingeben y: ");
	int z = sc.nextInt();
	Point start = new Point(n, z);

	System.out.print("Bitte x Wert der End Koordinate eingeben x: ");
	n = sc.nextInt();
	System.out.print("Bitte y Wert der End Koodinate eingeben y: ");
	z = sc.nextInt();
	Point end = new Point(n,z);

	p1.setShip(start, end);
    
    System.out.println(p1.getPrimary());

    System.out.println("Player2, set your ships!");
    System.out.println(p2.getPrimary());
    
    /*
     * 
     */
    int win = 0;
    while (win == 0) {
      boolean wrong_input = true;

      /*
       * Player1 is attacking
       * block gets repeated until player enters valid format
       */
      while (wrong_input) {
        System.out.println(p1.getTracker());
        System.out.println("\nEnter coordinates:\n");
        System.out.print("  x: ");
        int x = sc.nextInt();
        System.out.print("  y: ");
        int y = sc.nextInt();
        // TODO: If attack was successfull player may attack again
        p1.attack(x,y);
        wrong_input = false;
      }

      // P1 getroffen?
      // P2 Schiffe kaputt?
      // NOT WORKING ANYMORE !!! p1.showFieldWithAtks();
      System.out.println("Next player!\nPress 'Enter' to continue");
      sc.nextLine();
      cls();

      // alle Schiffe von P2 versenkt?
      // P2 greift an
      wrong_input = true;
      while (wrong_input) {
        System.out.println(p2.getTracker());
        System.out.println("\nEnter coordinates:\n");
        System.out.print("  x: ");
        int x = sc.nextInt();
        System.out.print("  y: ");
        int y = sc.nextInt();
        // TODO: If attack was successfull player may attack again
        p2.attack(x,y);
        wrong_input = false;
      }

      // NOT WORKING ANYMORE !!! p2.showFieldWithAtks();
      System.out.println("Next player!\nPress 'Enter' to continue");
      sc.nextLine();
      //cls();

      //TODO: Check if all ships are destroyed
    }

    System.out.println("Player " + win + " wins!");
  }

  private static void cls() {
    System.out.print("\n\n\n\n\n\n\n\n\n\n");
  }
}
