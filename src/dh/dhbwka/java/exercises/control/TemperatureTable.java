package dh.dhbwka.java.exercises.control;

public class TemperatureTable {

    public static void main(String[] args) {
     new TemperatureTable().table();
    }

    public void table(){
        System.out.println("F:  |    C:");
        System.out.println("-----------");
        for(int i =0; i< 301; i++){
            System.out.printf("%-3d | %-3.1f\n", i, getCelcius(i));
        }
    }

    private double getCelcius(int gradF){
        return (5.00 / 9.00) * ( gradF - 32.00);
    }
}
