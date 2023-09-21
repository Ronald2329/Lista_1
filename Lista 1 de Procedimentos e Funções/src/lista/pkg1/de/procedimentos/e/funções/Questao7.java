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
public class Questao7 {
        
    public static  String EnunciadoQuestao7 = "Faça uma função que recebe a média final de um aluno por parâmetro e retorna o seu conceito, conforme a tabela abaixo, para o programa principal:\n" +
"        Nota Conceito\n" +
"        de 0,0 a 4,9 D\n" +
"        de 5,0 a 6,9 C\n" +
"        de 7,0 a 8,9 B\n" +
"        de 9,0 a 10,0 A";
    
    public  void CalculaMediaPorConceito(double media){
       
        String conceito;
        
        if(media >= 0 && media <= 4.9){
            conceito = "D";
            JOptionPane.showConfirmDialog(null, "A media: "+media+" possui o conceito: "+conceito);
        }else if(media >= 5 && media <= 6.9){
            conceito = "C";  
            JOptionPane.showConfirmDialog(null, "A media: "+media+" possui o conceito: "+conceito);
        }else if(media >= 7 && media <= 8.9){
            conceito = "B";   
            JOptionPane.showConfirmDialog(null, "A media: "+media+" possui o conceito: "+conceito);
        }else if(media >= 9 && media <= 10){
           conceito = "A"; 
           JOptionPane.showConfirmDialog(null, "A media: "+media+" possui o conceito: "+conceito);
        }else{
           conceito = "Inexistente"; 
           JOptionPane.showConfirmDialog(null, "A media: "+media+" possui o conceito: "+conceito);
                
        }
    }
    
    public static void main(String [] args){
       
        String media = JOptionPane.showInputDialog("Enunciado: "+EnunciadoQuestao7+"\nInforme o valor da media final do aluno: ");
        double mediaFinal = Double.parseDouble(media);
        
        Questao7 questao7 = new Questao7();
        
        questao7.CalculaMediaPorConceito(mediaFinal);
    }
            
}
