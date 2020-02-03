package dh.dhbwka.java.exercises.control;

import java.util.Scanner;

public class Quadratics {

    public Quadratics(){
        /*Scanner scan = new Scanner(System.in);
        System.out.println("geben sie a ein.");
        int a = scan.nextInt();
        System.out.println("geben sie b ein.");
        int b = scan.nextInt();
        System.out.println("geben sie c ein.");
        int c = scan.nextInt();*/
        solveEquotation(1,0,1);
    }

    public static void main(String[] args) {
       new Quadratics();
    }

    public void solveEquotation(int a, int b, int c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Die Gleichung ist degeniert");
            } else {
                int erg = -c / b;
                System.out.println("Die Lösung ist: " + erg);
            }
        } else {
            double checkDiskriminante = Math.pow(b, 2) - 4 * a * c;
            if (checkDiskriminante < 0) {
                System.out.println("Die Lösung ist konjugiert komplex.");
            } else if (checkDiskriminante >= 0) {
                double erg0 =( -b + Math.sqrt(checkDiskriminante)) / (2 * a);
                System.out.println("Die Lösung 0 ist: " + erg0);
                double erg1 =( -b - Math.sqrt(checkDiskriminante)) / (2 * a);
                System.out.println("Die Lösung 1 ist: " + erg1);
            }
        }
    }
}
