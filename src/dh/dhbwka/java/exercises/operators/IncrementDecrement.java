package dh.dhbwka.java.exercises.operators;

public class IncrementDecrement {

    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        j = ++i;
        int k = j++ + ++i;
        System.out.println("k: " + k);  //3
        System.out.println("*: " + j++ + ++i); //23
        System.out.println(j++ + ++i); // 7
        int m = j++ * ++i;
        System.out.println("m: " + m); //20
        int n = --j * --i;
        System.out.println("n: " + n); //16
        System.out.println("i: " + i); //4
        System.out.println("j: " + j); //4

    }
}