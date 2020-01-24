package dh.dhbwka.java.exercises.control;

import java.util.Scanner;

public class AddUp {
    public static void main(String[] args) {
        new AddUp().addUp();
    }

    public void addUp() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        while (input >= 0) {
            System.out.println("Zahl eingeben (<0 für Abbruch): ");
            input = scan.nextInt();
            if (input >= 0) {
                sum = sum + input;
            } else {
                System.out.println(sum);
            }
        }

        /*
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int input =0;
        do {
            System.out.println("Zahl eingeben (<0 für Abbruch): ");
            input = scan.nextInt();
            if(input >= 0){
                sum = sum + input;
            }else{
                System.out.println(sum);
            }
        }while(input >=0);
        */
    }
}
