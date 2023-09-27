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
public class Questao6{
    public static String EnunciadoQuestao6 = "(Questão 6)- Faça uma função que recebe um valor inteiro e verifica se o valor é positivo ou \n" +
                                             "negativo. A função deve retornar um valor booleano para o programa principal que \n" +
                                             "imprimirá o resultado";
  
   public boolean DescobreSeNumeroInteiroEpositivo(int numero){
       return numero % 2 == 0 ? true: false;
   }
    
    public static void main(String[] args){
        Questao6 questao6 = new Questao6();
        Questao3 questao3 = new Questao3();
        
       String input =  JOptionPane.showInputDialog(EnunciadoQuestao6+"\nInforme um número: \n");
       if(questao3.VerificaSeNumeroEInteiro(input) == true){
           int numero = Integer.parseInt(input);
           
           if(questao6.DescobreSeNumeroInteiroEpositivo(numero) == true){
                 JOptionPane.showConfirmDialog(null, "O número:"+numero+" é um número inteiro e é positivo!!");
           }else{
               JOptionPane.showConfirmDialog(null, "O número:"+numero+" é um número inteiro mas, é negativo!!");
           }
       }else{
           JOptionPane.showConfirmDialog(null, "O texto:"+input+" não é um número inteiro!!");
       }
    }
}
