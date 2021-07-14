/**
 * Convierte una velocidad de km/h (kilometros por hora) a m/h (millas por hora)
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca la velocidad en kilometros por hora que desea cambiar a millas por hora: ");
        Scanner sc = new Scanner(System.in);
        double kph= sc.nextInt();
        sc.close();
        // double mph = 0.62137119*kph;
        System.out.println("La velocidad equivalente en millas por hora, es: " + 0.62137119*kph);
        double velocidad = 55;
        System.out.println(velocidad + " Km/h -> " + velocidad*1000/3600 + " m/s");
    }

}
