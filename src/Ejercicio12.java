/**
 * Muestra los numeros del 1 al 100 que no son multiplos de 3, usando: while, do while y for
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */

public class Ejercicio12 {
    
    public static void main(String[] args) throws Exception {
        
        int no3[] = new int[90]; // todos los valores en un arreglo numerico se inicializan a cero
        for (int i = 1, j = 0; i < 101; i++) {
            if (i%3 != 0) {
                System.out.print(i + " ");
                no3[j] = i;
                j++; // las variables i, j solo existen dentro del bucle for
            }
        }
        System.out.println();
        
        int i = 1, j = 0;
        while (i < 101) {
            if (i%3 != 0) {
                System.out.print(i + " ");
                no3[j] = i;
                j++; // j al final contiene el indice de la posicion + 1 del ultimo valor ingresado en no3
            }
            i++;
        }
        System.out.println();

        no3 = new int[j];
        i = 1; j = 0;
        do {
            if (i%3 != 0) {
                System.out.print(i + " ");
                no3[j] = i;
                j++; // j al final contiene el indice de la posicion + 1 del ultimo valor ingresado en no3
            }
            i++;
        } while (i < 101);
        System.out.println();
        
        // j = no3.length
        for (i = 0; i < j; i++) {
            System.out.print(no3[i] + " ");
        }        

    }

}
