package dh.dhbwka.java.exercises.datatypes;

public class Round {

    public int Round(double integer){
        return (int) Math.round(integer);
    }

    public static void main(String[] args) {
        Round ekick = new Round();
        System.out.println(ekick.Round(3.1415926));
        System.out.println(ekick.Round(2.7182818));
        System.out.println(ekick.Round(-3.1415926));
        System.out.println(ekick.Round(-2.7182818));
    }
}
