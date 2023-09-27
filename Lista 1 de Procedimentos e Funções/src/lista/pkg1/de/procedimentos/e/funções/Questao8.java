/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.de.procedimentos.e.funções;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Questao8 {
    
    public static String EnunciadoQuestao8 = "(Questão 8)- Faça uma função que recebe, por parâmetro, a altura e o sexo de uma pessoa e retorna o seu peso ideal. \n" +
                  "Para homens, calcular o peso ideal usando a fórmula peso ideal = 72.7 x alt - 58 e, \n" +
                  "para mulheres, peso ideal = 62.1 x alt - 44.7.";
   
    public void DescobrindoOPesoIDeal(double altura, String sexo){
       
        double peso;
        
        switch(sexo.toUpperCase()){
            case "M":
                
             peso = 72.7 * altura - 58;
             JOptionPane.showConfirmDialog(null,"O peso ideal com base na altura: "+altura+"m e o sexo:Masculino é de: "+peso+" kilogramas");
             
            break;
            
            case "F":
                
             peso = 62.1 * altura - 44.7;
             JOptionPane.showConfirmDialog(null,"O peso ideal com base na altura: "+altura+"m e o sexo:Masculino é de: "+peso+" kilogramas");

            break;
            
            default:
                JOptionPane.showConfirmDialog(null,"Não é possível descobrir o peso ideal pois o sexo: "+sexo+" não existe!!");
        }
    }
    
    public static void main(String [] args){
        
        Questao8 questao8 = new Questao8();
        
        String sexo = JOptionPane.showInputDialog(EnunciadoQuestao8
                + "\n[Digite M ou m para escolher o sexo Masculino]"
                + "\n[Digite F ou f para escolher o sexo Feminino]:"
                + "\n");
        
        String altura = JOptionPane.showInputDialog(EnunciadoQuestao8
                +"\nInforme agora a altura"
                + "\nObservação: Informe a altura por m em vez de cm exemplo: 1.8 ou 1.80 para 1 metro e 80 centímetros em vez de 180"
                + "\n");
        
        double alturaEscolhida = Double.parseDouble(altura);
        
        questao8.DescobrindoOPesoIDeal(alturaEscolhida, sexo);
        
    }
}
