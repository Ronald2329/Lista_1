package lista.pkg1.de.procedimentos.e.funções;

import javax.swing.JOptionPane;

public class Questao3 {

    public static String EnunciadoQuestao3 = "(Questão 3)-  Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna o \n"
            + "valor lógico Verdadeiro caso o valor seja primo e Falso em caso contrário. O programa \n"
            + "principal imprimirá o texto “O Número é Primo”, caso a função retorne verdadeiro.";

    public boolean VerificaSeNumeroEInteiro(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean VerificaSeNumeroEPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        if (numero == 2) {
            return true;
        }

        if (numero % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Questao3 questao3 = new Questao3();
        String input = JOptionPane.showInputDialog(EnunciadoQuestao3 + "\nInforme um número: \n");

        if (questao3.VerificaSeNumeroEInteiro(input)) {
            int numero = Integer.parseInt(input);

            if (numero >= 0) {
                if (questao3.VerificaSeNumeroEPrimo(numero)) {
                    JOptionPane.showMessageDialog(null, "O número: " + numero + " é um número inteiro e é primo!!");
                } else {
                    JOptionPane.showMessageDialog(null, "O número: " + numero + " é um número inteiro porém não é primo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O número: " + numero + " é um número inteiro porém é negativo");
            }

        } else {
            JOptionPane.showMessageDialog(null, "O texto: " + input + " não é um número inteiro!!");
        }
    }
}
