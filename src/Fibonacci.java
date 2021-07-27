public class Fibonacci {
    // Serie de Fibonacci
    // F(n) = F(n-1) + F(n-2)
    // Constantes base de la serie
    static final int F_0 = 0, F_1 = 1;
    public static void showFibonacciSerie(int N) {
        int Fn, Fn_1 = F_1, Fn_2 = F_0;
        for (int i = 0; i <= N; i++) {
            // Casos base
            if(i<2) {
                System.out.printf("F(%d) = %d \n", i, i);
            } else { // Caso general
                Fn = Fn_1 + Fn_2;
                System.out.printf("F(%d) = F(%d) + F(%d) = %d \n", i, i-1, i-2, Fn);
                Fn_2 = Fn_1;
                Fn_1 = Fn;
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Se muestra la serie de Fibonacci");
        showFibonacciSerie(8);
    }
    
}
