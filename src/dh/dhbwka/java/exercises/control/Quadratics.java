package dh.dhbwka.java.exercises.control;

import java.util.Scanner;

public class Quadratics {

    public Quadratics(){
        Scanner scan = new Scanner(System.in);
        System.out.println("geben sie a ein.");
        double a = scan.nextDouble();
        System.out.println("geben sie b ein.");
        double b = scan.nextDouble();
        System.out.println("geben sie c ein.");
        double c = scan.nextDouble();
        solveEquotation(a,b,c);
    }

    public static void main(String[] args) {
       new Quadratics();
    }

    public void solveEquotation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Die Gleichung ist degeniert");
            } else {
                double erg = -c / b;
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
