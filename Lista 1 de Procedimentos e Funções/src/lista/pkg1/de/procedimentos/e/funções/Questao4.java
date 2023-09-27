package lista.pkg1.de.procedimentos.e.funções;

import javax.swing.JOptionPane;

public class Questao4 {
    public static String EnunciadoQuestao4 = "(Questão 4)- Faça um procedimento que recebe por parâmetro o tempo de duração de uma\n"
            + "fábrica expressa em segundos e imprima esse tempo em horas, minutos e segundos\n"
            + "(hh:mm:ss).";

    public void DescobreTempoDeDuracao(int duracao) {
        int horas = duracao / 3600;         
        int minutos = (duracao % 3600) / 60;
        int segundos = duracao % 60;          

        JOptionPane.showConfirmDialog(null,"O horário: "+duracao+"segundos convertido fica:\n"
                                                        +horas+"h:"+minutos+"m:"+segundos+"s");
    }

    public static void main(String[] args) {
        Questao3 questao3 = new Questao3();
        Questao4 questao4 = new Questao4();
        
        String input = JOptionPane.showInputDialog(EnunciadoQuestao4+"\nInforme o tempo de duração em segundos:\n");
        
        if(questao3.VerificaSeNumeroEInteiro(input) == true){
            int duracao = Integer.parseInt(input);
                questao4.DescobreTempoDeDuracao(duracao);
        }else{
            JOptionPane.showConfirmDialog(null, "Para poder calcular a duração é necessário que voce insira um valor numérico inteiro!!");
        }
    }
}
