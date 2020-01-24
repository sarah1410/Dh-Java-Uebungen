package dh.dhbwka.java.exercises.control;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        System.out.println("Hallo, Wie ist dein Name?");
        Scanner scan = new Scanner(System.in);
        String username = scan.next();
        new NumberGuess().numberGuess(username, scan);
    }

    public void numberGuess(String username, Scanner scan) {
        boolean runs = true;
        int count = 1;
        System.out.println(username + " rate mal. [1-100]");
        int random = (int) Math.round(Math.random() * 100);
        do {
            int guess = scan.nextInt();

            if (guess > random) {
                System.out.println("Versuch " + count + ": " + guess + " ist zu hoch");
                count++;
            } else if (guess < random) {
                System.out.println("Versuch " + count + ": " + guess + " ist zu niedrig");
                count++;
            } else {
                runs = false;
                System.out.println("Nach "+count+" Versuchen richtig geraten!");
                System.out.println("Möchtest du weiterspielen?");
                System.out.println("0 - Das Spiel beenden.");
                System.out.println("1 - Das Spiel fortsetzen.");
                if(scan.nextInt() == 0){
                    runs = false;
                }else{
                    numberGuess(username, scan);
                }
            }
        } while (runs);
    }
}
