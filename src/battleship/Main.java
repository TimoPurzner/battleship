package battleship;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("How big should the playarea should be?\n Length: ");
    int fieldlength = sc.nextInt();

    System.out.print("  Width: ");
    int fieldwidth = sc.nextInt();

    //System.out.print("\nHow many  \nAnzahl: ");
    //int anz = sc.nextInt();

    Player p1 = new Player(fieldlength, fieldwidth);
    Player p2 = new Player(fieldlength, fieldwidth);

    //TODO: Starting game
    Main.cls();
    System.out.println("What do you want to do next?");
    System.out.println("'q' or 'quit'\tQuitting the game\n"
            + "'n' or 'new'\tStart new game");
    String in = sc.nextLine();

    //TODO: Setting ships for player1 and player2
    System.out.println("Player1, set your ships!");
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
        // NOT WORKING ANYMORE !!!! p1.showFieldWithAtks();
        System.out.println("\nEnter coordinates:\n");
        System.out.print("  x: ");
        int x = sc.nextInt();
        System.out.print("  y: ");
        int y = sc.nextInt();
        // NOT WORKING ANYMORE !!!! eing = p1Atk.Attk(new Point(x, y));
        if (wrong_input) {
          System.out.println("Missformatted input!");
        }
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
        // NOT WORKING ANYMORE !!! p2.showFieldWithAtks();
        System.out.println("\nEnter coordinates:\n");
        System.out.print("  x: ");
        int x = sc.nextInt();
        System.out.print("  y: ");
        int y = sc.nextInt();
        // NOT WORKING ANYMORE !!! eing = p2Atk.Attk(new Point(x, y));
        if (wrong_input) {
          System.out.println("Misformatted input!");
        }
      }

      // NOT WORKING ANYMORE !!! p2.showFieldWithAtks();
      System.out.println("Next player!\nPress 'Enter' to continue");
      sc.nextLine();
      cls();

      //TODO: Check if all ships are destroyed
    }

    System.out.println("Player " + win + " wins!");
  }

  private static void cls() {
    System.out.print("\n\n\n\n\n\n\n\n\n\n");
  }
}
