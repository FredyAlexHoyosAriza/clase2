public class AsignaCondicion {
    public static void main(String[] args) {
        int C = 55;
        System.out.println(C + (C >= 0 ? " es positivo " : " es negativo "));
        System.out.println(C + (C%2== 0 ? " es par " : " es impar "));
        System.out.println(C + (C%5== 0 ? " es múltiplo de 5 " : " no es múltiplo de 5 "));
        System.out.print(C + (C%10== 0 ? " es múltiplo de 10 " : " no es múltiplo de 10 "));
        System.out.println(C + (C>100 ? " es mayor que 100 " : " es menor que 100 "));
     }
}
