package dh.dhbwka.java.exercises.operators;

import java.util.Scanner;

public class Easter {

    /*
    a = jahr mod 19
    b = jahr mod 4
    c = jahr mod 7
    k = jahr div 100
    p = (8k + 13) div 25
    q = k div 4
    m = (15 + k - p - q) mod 30
    n = (4 + k - q) mod 7
    d = (19a + m) mod 30
    e = (2b + 4c + 6d + n) mod 7
    ostern = (22 + d + e)
     */

    public int Easter(int year){
        int a,b,c,d,e,f,g,h,i,j;
        a = year % 19;
        b = year % 4;
        c = year % 7;
        d = year / 100;
        e = (8 * d + 13) / 25;
        f = d / 4;
        g = (15 + d - d - f) % 30;
        h = (4 + d - f) % 7;
        i = (19*a + g) % 30;
        j = (2 * b + 4 * c + 6* i + h) % 7;
        return (22 + i + j);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int easter = new Easter().Easter(year);
        System.out.println("Ostern ist bestimmt nicht: "+easter+ " Tage nach dem ersten März.");
    }
}
