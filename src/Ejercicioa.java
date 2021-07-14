/**
 * Lee un numero entero y muestra si este es potencia de 10
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

import java.util.Scanner;
public class Ejercicioa {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca el valor entero para el cual se desea saber si es potencia de 10: ");
        Scanner sc = new Scanner(System.in);
        int intN = sc.nextInt();
        sc.close();
        if (ismultiple10(intN)) {
            System.out.println("El valor entero ingresado es potencia de 10 " );
        } else {
            System.out.println("El valor entero ingresado no es potencia de 10 ");
        }
        
    }

    public static boolean ismultiple10(int intN) {
        int m10 = powInt10(numeroDigitos(intN)-1); // = 10^(cifras-1)
        // boolean isP10 = intN == intN/m10*m10;
        return intN == intN/m10*m10; // isP10
    }

    public static int numeroDigitos(int numero) {
        int cifras = 0;

        while (numero != 0) {
            numero /= 10;
            //System.out.println(numero);
            cifras++;
        }
        return cifras;
    }

    public static int powInt10(int m) {

        int p10 = 1;
        // m += 1;
        for (int i = 1; i <= m; i++) { // i < m
            p10 *= 10;
        }
        return p10;
    }
}
