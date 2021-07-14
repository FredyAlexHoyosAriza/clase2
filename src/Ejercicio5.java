/**
 * Calcula la hipotenusa a partir de las longitudes de los catetos
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Para calcular la hipotenusa, ingrese la longitud del cateto opuesto (co) y luego la del cateto adyacente (ca), o viceversa: ");
        double co= sc.nextDouble();
        double ca= sc.nextDouble();
        double h = Math.sqrt(co*co + ca*ca);
        sc.close();
        // double mph = 0.62137119*kph;
        System.out.println("La hipotenusa es igual a: " + h);
    }

}
