package dh.dhbwka.java.exercises.control;

public class MultiplicationTable {

    public static void main(String[] args) {
        new MultiplicationTable().TABEL(100,100);
    }

    public void TABEL(int klein, int klein2){
        for(int i =0; i< klein; i++){
            for(int x =0; x< klein2; x++){
                System.out.printf("%-5d ", (i+1)*(x+1));
            }
            System.out.printf("\n");
        }
    }
}
