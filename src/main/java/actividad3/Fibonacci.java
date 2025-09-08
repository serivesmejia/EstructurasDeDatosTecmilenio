package actividad3;

public class Fibonacci {
    public static int fibonacci(int n) {
        // Caso base
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Caso recursivo
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // ejemplo
        System.out.println("Fibonacci de " + n + " = " + fibonacci(n));
    }
}