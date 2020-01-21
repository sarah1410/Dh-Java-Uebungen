package dh.dhbwka.java.exercises.control;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int year = scan.nextInt();
            boolean check = new LeapYear().leapTheYeet(year);
            System.out.println("Das Jahr: " + year + " ist ein Schaltjahr? : " + check);
        }
    }

    public boolean leapTheYeet(int year){
        boolean check4 = year % 4 == 0;
        boolean check100 = year % 100 == 0;
        boolean check400 = year % 400 == 0;
        return (check4 && !check100) || check400;
    }
}
