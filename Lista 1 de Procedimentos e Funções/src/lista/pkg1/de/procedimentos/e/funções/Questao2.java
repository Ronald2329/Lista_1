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
    
    /*
        Escreva um procedimento que recebe as 3 notas de um aluno por parâmetro e uma
        letra. Se a letra for A o procedimento calcula e imprime a média aritmética das notas
        do aluno, se for P, a sua média ponderada (pesos: 5, 3 e 2) e se for H, a sua média
        harmônica.
    */
    
    
    public static double CalculaMediaAritmetica(double nota1,double nota2, double nota3){
       return (nota1 + nota2 + nota3)/3;
    }
    
    public static double CalculaMediaPonderada(double nota1,double nota2, double nota3){
        return ((nota1 * 5) + (nota2 * 3) + (nota3 *2))/3;
    }
    
    public static double CalculaMediaHarmonica(double nota1,double nota2, double nota3){
        return 3/((1/nota1)+(1/nota2) + (1/nota3));
    }
    
    public static boolean ComparaEscolha(String escolha){
        
            if(escolha.equalsIgnoreCase("A") == false && escolha.equalsIgnoreCase("P") == false && escolha.equalsIgnoreCase("H") == false){
               return false; 
            }
        
        return true;
    }
    public double CalculaMedia(double nota1,double nota2, double nota3, String escolha){
        
         if(escolha.equalsIgnoreCase("A") == true){
            return CalculaMediaAritmetica(nota1,nota2,nota3);
        }else if(escolha.equalsIgnoreCase("P") == true){
            return CalculaMediaPonderada(nota1,nota2,nota3);
       }else if(escolha.equalsIgnoreCase("H") == true){
            return CalculaMediaHarmonica(nota1,nota2,nota3);
       }else{
            do{
                String novaEscolha = JOptionPane.showInputDialog("Escolha inválida!\n INforme novamente uma escolha válida!");
            
            }while(ComparaEscolha(novaEscolha) == false);
          
       }
        
    }
    
    public static void main(String[] args){
        JOptionPane.showInputDialog(args)
    }
    
    }
        

