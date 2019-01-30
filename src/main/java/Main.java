import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int rndStart = (int)(Math.random() * 5);
        simpleDotCom.setLocationCells(new int[]{rndStart, rndStart + 1, rndStart + 2});
        boolean isAlive = true;
        int userGuess;
        while (isAlive == true) {
            System.out.print("enter a number ");
            Scanner scanner = new Scanner(System.in);
            userGuess = scanner.nextInt();
            numOfGuesses++;
            if (simpleDotCom.checkYourself(String.valueOf(userGuess)).equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
