/**
 * Lee un numero entero y muestra si este es multiplo de 10
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca el valor entero para el cual se desea saber si es multiplo de 10: ");
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();
        sc.close();
        if (ismultiple10(intN)) {
            System.out.println("El valor entero ingresado es multiplo de 10 " );
        } else {
            System.out.println("El valor entero ingresado no es multiplo de 10 ");
        }
        
    }

    public static boolean ismultiple10(int intN) {
        return intN == intN/10*10;
    }
}

