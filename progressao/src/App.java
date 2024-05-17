public class App {
    public static void main(String[] args) {

        System.out.println("Progressão Aritmética:");
        Progressao arit = new ProgressaoAritmetica(15, 10);

        for (int i = 0; i < 5; i++) {
            System.out.println(arit.proximo());
        }

        System.out.println("\nProgressão Geométrica:");
        Progressao geo = new ProgressaoGeometrica(4, 2);

        for (int i = 0; i < 5; i++) {
            System.out.println(geo.proximo());
        }

        System.out.println("\nProgressão Fibonacci:");
        Progressao fib = new ProgressaoFibonacci(0, 1);

        for (int i = 0; i < 10; i++) {
            System.out.println(fib.proximo());
        }
    }
}