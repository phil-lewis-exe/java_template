import java.util.Scanner;
import java.util.Random;

enum HandSign {
    ROCK, SCISSORS, PAPER
}

public class RPSApp {
    /**
     * Get the computer’s move (randomly generated)
     */
    public static HandSign getComputerMove(){
       Random rd = new Random();
       int n = rd.nextInt(3); // n will be a random number in {0,1,2}
       // add your code to output the computer’s hand sign.
       HandSign computerMove = null; 
       switch(n){
        case 0:
            computerMove = HandSign.ROCK;
            break;
        case 1:
            computerMove = HandSign.SCISSORS;
            break;
        case 2:
            computerMove = HandSign.PAPER;
            break;
        }
        return computerMove;
    }

    /**
     * Get the player move from the keyboard input
     */
    public static HandSign getPlayerMove(){
        // The Scanner class is used to get the keyboard input
        Scanner in = new Scanner(System.in);
        // Use a variable to tag if the input is valid 
        // (one of the characters {s,S,p,P,r,R,q,Q}) or not
        boolean validInput = true;
        HandSign playerHandSign = null;
        do {// repeat this process till the user’s input is valid
            // Add your code to give some description about what input the
            //  users are supposed to give
            System.out.println("Please enter your move: (r)ock, (p)aper, (s)cissors, or (q)uit");

            // convert the input string into a char type
            char inChar = in.next().toLowerCase().charAt(0);
            // Add your code to output the player’s hand sign. A
            //switch-statement is a good choice.
            switch(inChar){
            case 'r':
              playerHandSign = HandSign.ROCK;
              break;
            case 's':
              playerHandSign = HandSign.SCISSORS;
              break;
            case 'p':
              playerHandSign = HandSign.PAPER;
              break;
            case 'q':
                System.exit(0);
            default:
                System.out.println("Invalid input. Please enter again.");
                validInput = false;
            }
        } while(!validInput);
        return playerHandSign;

      }

    /**
     * Check who wins
     *
     * @param h1 the first hand sign
     * @param h2 the second hand sign
     * @return 0 if two signs equal, 
     *        -1 if the second sign wins, 
     *         1 if the first sign wins
     *
     */
    public static int whoWins(HandSign h1, HandSign h2){
         if (h1 == h2) return 0;
         if (h1 == HandSign.ROCK && h2 == HandSign.SCISSORS) return 1;
         if (h1 == HandSign.SCISSORS && h2 == HandSign.PAPER) return 1;
         if (h1 == HandSign.PAPER && h2 == HandSign.ROCK) return 1;
         return -1;
    }
    
    /**
     * The main method
     */
    public static void main(String[] args) {
      HandSign playerMove;// player’s sign from keyboard
      HandSign computerMove;// computer’s random sign
      int checkwin;
      boolean gameOver = false;
      while (!gameOver){
        // repeat this process till the user quits
         //Step1: Get the player move from the keyboard input
        playerMove = getPlayerMove();
         //Step2: Get the computer’s move (randomly generated)
        computerMove = getComputerMove();
         //Step3: Check who wins
        checkwin = whoWins(playerMove, computerMove);
        //Step4: output who wins
        if (checkwin == 0) {
          System.out.println("It is a tie!");
        } else if (checkwin == 1) {
          System.out.println("You win!");
        } else {
          System.out.println("You lose!");
        }
      }
    }
}
