/**
 * Calcula las ventas brutas para un prducto
 * @author FredyAlexHoyosAriza
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Para el producto, ingrese: el precio por unidad, el numero de unidades vendidas y el porcentaje de IVA aplicado: ");        
        double unitPrice = sc.nextDouble();
        int unitNumber = sc.nextInt();
        float IVA = sc.nextFloat();
        sc.close();
        if (IVA >= 1 && IVA < 100) {
            System.out.println("Las ventas brutas del producto son de: " + (unitPrice * unitNumber) * (1 + IVA/100));
        } else if (IVA >=0 && IVA < 1) {
            System.out.println("Las ventas brutas del producto son de: " + (unitPrice * unitNumber) * (1 + IVA));
        } else {
            System.out.println("El valor ingresado para el IVA es invalido");
        }
        // double salePrice = (unitPrice * unitNumber) * (1 + IVA);
    }
}
