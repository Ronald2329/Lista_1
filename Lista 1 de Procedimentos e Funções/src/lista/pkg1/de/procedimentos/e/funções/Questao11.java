package lista.pkg1.de.procedimentos.e.funções;

import javax.swing.JOptionPane;
import java.util.Random;
import java.text.DecimalFormat;

public class Questao11 {

    public static String EnunciadoQuestao11 = "(Questão 11)- Faça um procedimento que receba, por parâmetro, uma matriz B(9,9) de reais e some \n"
            + "os elementos das linhas pares de B.";

    public void RecebeMatriz(double matriz[][]) {
        double somaLinhasPares = 0;
        int i, j;
        
        for ( i = 0; i < matriz.length; i++) {
            if (i % 2 == 0) { // Verifica se a linha é par
                for ( j = 0; j < matriz[i].length; j++) {
                    somaLinhasPares += matriz[i][j];
                }
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String somaFormatada = decimalFormat.format(somaLinhasPares);

        JOptionPane.showMessageDialog(null, "A soma dos elementos das linhas pares da matriz é: " + somaFormatada + "\n");
        
        
    }

    public static void main(String[] args) {
        double matriz[][] = new double[9][9];
        int i,j;
        
        // Preencha a matriz com números aleatórios
        Random random = new Random();
        for ( i = 0; i < matriz.length; i++) {
            for ( j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextDouble(); // Gera um número real aleatório entre 0 e 1
            }
        }

        Questao11 questao11 = new Questao11();
        questao11.RecebeMatriz(matriz);

        // Exibir a matriz aleatória gerada com 2 casas decimais e formatação adequada
        StringBuilder matrizString = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        for ( i = 0; i < matriz.length; i++) { 
            for ( j = 0; j < matriz[i].length; j++) {
                matrizString.append(decimalFormat.format(matriz[i][j])).append(" \t ");
            }
            matrizString.append("\n");
        }
        JOptionPane.showMessageDialog(null, "A matriz aleatória gerada foi:\n" + matrizString.toString());
    }
}
