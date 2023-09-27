/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.pkg1.de.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 *
 * @author ronal
 */
public class Questao5 {
    public static String EnunciadoQuestao5 ="(Questao 5)- Faça um procedimento que recebe a idade de um nadador por parâmetro e imprime a \n" +
                                            "categoria desse nadador de acordo com a tabela abaixo: Chame atenção do usuário \n" +
                                            "em caso de uma consulta inválida, ou seja, com números menores ou iguais a zero, ou \n" +
                                            "maiores do que a quantidade cadastrada.\n" +
                                            "Idade              Categoria  \n" +
                                            "5 a 7 anos          Infantil A \n" +
                                            "8 a 10 anos        Infantil B \n" +
                                            "11-13 anos         Juvenil  A  \n" +
                                            "14-17 anos         Juvenil  B  \n" +
                                            "Maiores de 18 anos\n (inclusive)               Adulto";
    
    public void DescobreIdadeDoNadador(int idade){
        
        if(idade > 0){
            if(idade >4){
                if(idade >= 5 && idade <=7){
                    JOptionPane.showConfirmDialog(null, "A cartegoria do nadador é: Infantil A");
                }else if(idade >=8  && idade <= 10){
                    JOptionPane.showConfirmDialog(null, "A cartegoria do nadador é: Infantil B");
                }else if(idade >=11 && idade <= 13){
                    JOptionPane.showConfirmDialog(null, "A cartegoria do nadador é: Juvenil A");
                }else if(idade >=14 && idade <= 17){
                    JOptionPane.showConfirmDialog(null, "A cartegoria do nadador é: Juvenil B");
                }else{
                    JOptionPane.showConfirmDialog(null, "A cartegoria do nadador é: Adulto");
                }
            }else{
                JOptionPane.showConfirmDialog(null, "A idade:"+idade+" é inválida pois, ela não está cadastrada!!");
            }
        }else{
            JOptionPane.showConfirmDialog(null, "A  idade:"+idade+" é inválida pois, é negativa!!");
        }
    }
    
   
    public static void main(String[] args){
        Questao3 questao3 = new Questao3();
        Questao5 questao5 = new Questao5();
        String input = JOptionPane.showInputDialog(EnunciadoQuestao5+"\nInforme a idade do nadador:\n");
      
        if(questao3.VerificaSeNumeroEInteiro(input) == true){
            int numero = Integer.parseInt(input);
            questao5.DescobreIdadeDoNadador(numero);
        }else{
            JOptionPane.showConfirmDialog(null,"Digite um número, para poder descobrir a cartegoria do nador!!");
        }
    }
}
