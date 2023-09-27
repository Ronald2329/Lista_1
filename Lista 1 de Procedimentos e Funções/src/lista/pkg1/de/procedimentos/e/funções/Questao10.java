package lista.pkg1.de.procedimentos.e.funções;

import javax.swing.JOptionPane;

public class Questao10 {

    public static String EnunciadoQuestao10 = "(Questão 10)- Faça um procedimento que recebe um vetor de valores inteiros por parâmetro e \n"
            + "ordena-os em ordem crescente.";

    public void OrdenaVetoresInteiros(int quantidadeDeVetores) {
        int vetor[] = new int[quantidadeDeVetores];
        int i;

        // Leitura dos valores e armazenamento no vetor
        for (i = 0; i < quantidadeDeVetores; i++) {
            String input = JOptionPane.showInputDialog(EnunciadoQuestao10 + "\n" + "Informe um número inteiro:\n");
            int novoVetor = Integer.parseInt(input);
            vetor[i] = novoVetor;
        }

        // Algoritmo Bubble Sort para ordenação crescente
        for (i = 0; i < quantidadeDeVetores - 1; i++) {
            for (int j = 0; j < quantidadeDeVetores - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        // Exibe o vetor ordenado
        JOptionPane.showMessageDialog(null, "Vetor Ordenado em Ordem Crescente: " + java.util.Arrays.toString(vetor));
    }

    public static void main(String[] args) {
        String quantidade = JOptionPane.showInputDialog(EnunciadoQuestao10 + "\nInforme a quantidade de valores a serem ordenados:");
        int quantidadeDeValores = Integer.parseInt(quantidade);

        Questao10 questao10 = new Questao10();
        questao10.OrdenaVetoresInteiros(quantidadeDeValores);
    }
}
