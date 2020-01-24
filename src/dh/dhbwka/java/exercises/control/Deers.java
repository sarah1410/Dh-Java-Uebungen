package dh.dhbwka.java.exercises.control;

public class Deers {

    public static void main(String[] args) {
        new Deers().simulateDeerPopulation(200,300);
    }

    private void simulateDeerPopulation(int start, int stop) {
        int jahr = 1;
        while(start < stop){
            start = (int) Math.floor((start * 1.10) - 15);
            System.out.printf("%d. %-3d %s \n", jahr, start, "Hirsche");
            jahr++;
        }
    }

}
