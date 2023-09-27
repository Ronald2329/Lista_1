package lista.pkg1.de.procedimentos.e.funções;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Questao12 {

    public static String EnunciadoQuestao12 = "(Questão 12)- Faça uma função que recebe um vetor X(15) de inteiros , por parâmetro, e retorna a \n"
            + "quantidade de valores pares em X.";

    public int DscobrindoAQuantidadeDeNumerosParesNoVetor(int vetor[]) {
        int numerosParesNoVetor = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                numerosParesNoVetor++;
            }
        }

        return numerosParesNoVetor;
    }

    public static void main(String[] args) {
        int n = 15;
        int vetor[] = new int[n];

        StringBuilder matrizString = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("0");

        for (int i = 0; i < n; i++) {
            String input = JOptionPane.showInputDialog("Informe o valor de número " + (i + 1) + ":\n");
            int novoVetor = Integer.parseInt(input);

            // Correção: Atribuir o valor lido ao vetor na posição i
            vetor[i] = novoVetor;
        }

        for (int i = 0; i < vetor.length; i++) {
            matrizString.append(decimalFormat.format(vetor[i])).append(" \t ");
        }

        Questao12 questao12 = new Questao12();
        JOptionPane.showMessageDialog(null, "O vetor: " +
                matrizString.toString() + "\n" +
                "possui " + questao12.DscobrindoAQuantidadeDeNumerosParesNoVetor(vetor) + " números pares");
    }
}
