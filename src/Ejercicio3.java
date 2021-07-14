/**
 * Elimina los ultimos m digitos de un valor entero N
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca el valor entero (N), y luego el numero de digitos (m) a eliminarse: ");
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        int nN = deleteDigits(N, m);
        System.out.println("El valor entero " + N + " sin sus " + m + " ultimas cifras, corresponde a: " + nN);
    }

    public static int deleteDigits(int N, int m) {
        return N/powInt10(m);
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
