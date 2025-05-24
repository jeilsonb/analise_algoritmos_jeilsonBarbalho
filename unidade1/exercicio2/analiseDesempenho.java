import java.util.Random;

public class analiseDesempenho {
    public static void main(String[] args) {
        int tamanho = 10000000;
        int[] vetor = new int[tamanho];
        Random random = new Random();

        // Preencher o vetor com valores aleatórios
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(10000000); 
        }

        int alvo = 33;
        boolean encontrado = false;

        // Medir tempo de busca
        long inicio = System.nanoTime();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == alvo) {
                System.out.println(alvo + " está na lista (posição: " + i + ")");
                encontrado = true;
                break;
            }
        }

        if (!encontrado)
            System.out.println(alvo + " não está na lista");

        long fim = System.nanoTime();
        double tempoMs = (fim - inicio) / 1000000;

        System.out.printf("Tempo de busca: %.2f ms%n", tempoMs);
    }
}