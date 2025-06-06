import java.math.BigInteger;
import java.util.*;

public class Fibonacci {

    private static Map<Integer, BigInteger> memo = new HashMap<>();

    // Fibonacci recursivo com memoization usando BigInteger
    public static BigInteger fibRecursivo(int n) {
        if (n <= 1) return BigInteger.valueOf(n);
        if (memo.containsKey(n)) return memo.get(n);
        BigInteger result = fibRecursivo(n - 1).add(fibRecursivo(n - 2));
        memo.put(n, result);
        return result;
    }

    // Fibonacci iterativo usando BigInteger
    public static BigInteger fibIterativo(int n) {
        if (n <= 1) return BigInteger.valueOf(n);
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }
        return b;
    }

    // Executa um teste para um valor de n
    public static void executarTeste(int n) {
        System.out.println("\n--- Resultado para n = " + n + " ---");

        memo.clear(); // limpa o cache para o recursivo

        BigInteger resultadoRec = fibRecursivo(n);
        BigInteger resultadoIt = fibIterativo(n);

        System.out.println("Fibonacci Recursivo: " + resultadoRec);
        System.out.println("Fibonacci Iterativo: " + resultadoIt);
        System.out.println("----------------------------------------");
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores de n que deseja testar (separados por espaço):");
        String linha = scanner.nextLine();
        String[] valores = linha.trim().split("\\s+");

        for (String valor : valores) {
            try {
                int n = Integer.parseInt(valor);
                executarTeste(n);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido ignorado: " + valor);
            }
        }

        scanner.close();
    }
}
