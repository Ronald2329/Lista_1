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
public class Questao1 {
    
     public double CalculaRaio(double raio){
       
        double pi = 3.14159265;   
        
        double volume = ((4/3) * pi * Math.pow(raio,3));
        
        return volume;
    }
     
      public static void main(String[] args) {
        // TODO code application logic here
        
         String raio = JOptionPane.showInputDialog("(Questão 1)- Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume (v = 4/3 * π * r^3), onde r é o raio da esfera e π é uma constante igual a 3,14159265."
                 + "                                \nInforme o raio da esfera ");
         double caculaRaio = Double.parseDouble(raio);
         
         Questao1 questao1 = new Questao1();
         
         JOptionPane.showConfirmDialog(null, "O resultado do cáculo do volume é: "+questao1.CalculaRaio(caculaRaio));
         
    }
}
