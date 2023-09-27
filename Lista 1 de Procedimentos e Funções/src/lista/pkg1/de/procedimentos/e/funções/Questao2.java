/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.de.procedimentos.e.funções;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questao2 {
    
    public static String EnunciadoQuestao2= "(Questão 2)- Escreva um procedimento que recebe as 3 notas de um aluno por parâmetro e uma\n" +
                                            "        letra. Se a letra for A o procedimento calcula e imprime a média aritmética das notas\n" +
                                            "        do aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2) e se for H, a sua média\n" +
                                            "        harmônica.";
    
    public static double CalculaMediaAritmetica(double nota1,double nota2, double nota3){
       return (nota1 + nota2 + nota3)/3;
    }
    
    public static double CalculaMediaPonderada(double nota1,double nota2, double nota3){
        return ((nota1 * 5) + (nota2 * 3) + (nota3 *2))/3;
    }
    
    public static double CalculaMediaHarmonica(double nota1,double nota2, double nota3){
        return 3/((1/nota1)+(1/nota2) + (1/nota3));
    }
    
    public double CalculaMedia(double nota1,double nota2, double nota3, String escolha){
        
        double resultado = 0;
      
         if(escolha.equalsIgnoreCase("A") == true){
           resultado = CalculaMediaAritmetica(nota1,nota2,nota3);
        }else if(escolha.equalsIgnoreCase("P") == true){
            resultado = CalculaMediaPonderada(nota1,nota2,nota3);
       }else if(escolha.equalsIgnoreCase("H") == true){
            resultado =  CalculaMediaHarmonica(nota1,nota2,nota3);
       }
         
        return resultado;
    }
    
    public static void main(String[] args){
        String inputEscolha = JOptionPane.showInputDialog(EnunciadoQuestao2+"\n"+
                                                          "Informe uma escolha: ");
        
        String inputNota1 = JOptionPane.showInputDialog(EnunciadoQuestao2+"\n"+
                                                   "Informe a primeira nota: ");
        double nota1 = Integer.parseInt(inputNota1);
        
        
        String inputNota2 = JOptionPane.showInputDialog(EnunciadoQuestao2+"\n"+
                                                   "Informe a segunda nota: ");
        double nota2 = Integer.parseInt(inputNota2);
        
        
        String inputNota3 = JOptionPane.showInputDialog(EnunciadoQuestao2+"\n"+
                                                   "Informe a terceira nota: ");
        double nota3 = Integer.parseInt(inputNota3);
        
        
        Questao2 questao2 = new Questao2();
       if(inputEscolha.equalsIgnoreCase("A") == true){
            JOptionPane.showConfirmDialog(null, "A média arimética entre as notas "+nota1+","+nota2+" e "+nota3+" é "+questao2.CalculaMedia(nota1, nota2, nota3, inputEscolha));
        }else if(inputEscolha.equalsIgnoreCase("P") == true){
            JOptionPane.showConfirmDialog(null, "A média ponderada entre as notas "+nota1+","+nota2+" e "+nota3+" é "+questao2.CalculaMedia(nota1, nota2, nota3, inputEscolha));
       }else if(inputEscolha.equalsIgnoreCase("H") == true){
            JOptionPane.showConfirmDialog(null, "A média harmônica entre as notas "+nota1+","+nota2+" e "+nota3+" é "+questao2.CalculaMedia(nota1, nota2, nota3, inputEscolha));
       }else{
             JOptionPane.showConfirmDialog(null, "A escolha: "+inputEscolha+"não existe!!");
        }
    }
    
 }
        

