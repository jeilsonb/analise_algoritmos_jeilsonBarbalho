public class TrocoGuloso {
    public static void main(String[] args) {
        // Cédulas disponíveis (em ordem decrescente para o algoritmo guloso funcionar corretamente)
        int[] cedulasDisponiveis = {100, 50, 20, 10, 9, 6, 1}; 
        int trocoPara = 127; // Valor do troco a ser dado

        int[] cedulasUsadas = new int[cedulasDisponiveis.length];

        // Estratégia gulosa: sempre usar a maior cédula possível
        for (int i = 0; i < cedulasDisponiveis.length; i++) {
            while (trocoPara >= cedulasDisponiveis[i]) {
                trocoPara -= cedulasDisponiveis[i];
                cedulasUsadas[i]++;
            }
        }

        // Exibir resultado
        System.out.println("\nCédulas usadas (estratégia gulosa):");
        for (int i = 0; i < cedulasDisponiveis.length; i++) {
            if (cedulasUsadas[i] > 0) {
                System.out.println("R$ " + cedulasDisponiveis[i] + ",00 == " + cedulasUsadas[i] + "x");
            }
        }

        if (trocoPara > 0) {
            System.out.println("\nNão foi possível dar o troco exato com as cédulas disponíveis.");
        }
    }
}
