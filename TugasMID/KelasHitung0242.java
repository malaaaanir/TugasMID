// Nirmala 13020210242
import java.util.Scanner;
public class KelasHitung0242{
    public static void main(String args[]){
        double mil, meter;
        final double konversi = 1.609;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Jarak Dalam MIL : ");
        mil = input.nextDouble();
        meter = mil * konversi;
        System.out.println("Hasil " + mil + " MIL = " + meter + " Meter");
    }
}