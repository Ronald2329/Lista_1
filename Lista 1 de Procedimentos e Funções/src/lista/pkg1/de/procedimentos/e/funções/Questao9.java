/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.pkg1.de.procedimentos.e.funções;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno o cara mais brabo
 */
public class Questao9{
    
    public static String EnunciadoQuestao9 = "(Questão 9)- A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e número de filhos. "
            + "\nFaça um programa que leia os dados em vetores e crie um procedimento que imprima a média de salário da população, a média do número de filhos, o maior salário e o percentual de pessoas com salário até R$550,00."
            + "\n Obs: O usuário deve informar a quantidade de entrevistados.";
    
    public void DescobrindoMediaSalarial(int quantidadeDeIntrevistados){
      
      double salario[] = new double[quantidadeDeIntrevistados];
              
      int i;
      double salarioDeReferencia = 550.00;
      int quantidadeDePessoasComSalarioMenorOuIgualAoDeReferencia = 0;
      double porcentagemDePessoasComSalarioMenorOuIgualAoDeReferencia = 0;
      double mediaSalarial = 0;
      double somaDosSalarios = 0;
      double maiorSalario = salario[0];
      
      for(i = 0; i < quantidadeDeIntrevistados; i++){
          String input = JOptionPane.showInputDialog(EnunciadoQuestao9+"\n"
                                                     + "Informe o salário do entrevistado "+(i+1)+":\n");
          double novoSalario = Double.parseDouble(input);
          
          salario[i] = novoSalario;
          somaDosSalarios += novoSalario;
          

           if (novoSalario > maiorSalario) {
                maiorSalario = novoSalario;
            }

          
          if(novoSalario <= salarioDeReferencia){
              quantidadeDePessoasComSalarioMenorOuIgualAoDeReferencia++;
          }
          
      }
      
      mediaSalarial = somaDosSalarios/quantidadeDeIntrevistados;
      porcentagemDePessoasComSalarioMenorOuIgualAoDeReferencia = (quantidadeDePessoasComSalarioMenorOuIgualAoDeReferencia * 100.0) / quantidadeDeIntrevistados;
      
      JOptionPane.showConfirmDialog(null,"A media salarial é de:R$ "+mediaSalarial+"\n"
                                    + "A porcentagem de pessoas com o salario de até "+salarioDeReferencia+" é "+porcentagemDePessoasComSalarioMenorOuIgualAoDeReferencia+"%\n"
                                    + "O maior salário é: R$"+maiorSalario);
    }
    
    public void DescobrindoMediaDoNumeroDeFilhos(int quantidadeDeIntrevistados){
      
      int i;
      double mediaDeFilhos = 0;
      double somaDosFilhos = 0;
      double filhos[] = new double[quantidadeDeIntrevistados];
      double maiorQuantidadeDeFilhos = filhos[0];
      
       for(i = 0; i < quantidadeDeIntrevistados; i++){
          String input = JOptionPane.showInputDialog(EnunciadoQuestao9+"\n"
                  + "                                 Informe a quantidade de filhos do entrevistado "+(i+1)+":\n");
          double novosFilhos = Double.parseDouble(input);
          
          filhos[i] = novosFilhos;
          somaDosFilhos += novosFilhos;
          
          if(novosFilhos > maiorQuantidadeDeFilhos){
              maiorQuantidadeDeFilhos = novosFilhos;
          }
          
         
          
      }
       mediaDeFilhos = somaDosFilhos/quantidadeDeIntrevistados;
       JOptionPane.showConfirmDialog(null,"A media de filhos é:"+mediaDeFilhos+"\n"
               + "O entrevistado com a maior quantidade de filhos é:"+maiorQuantidadeDeFilhos);
       
    }
    
    public static void main(String[] args){
        String quantidade = JOptionPane.showInputDialog(EnunciadoQuestao9+"\n"
                + "Informe primeiro a quantidade de entrevistados");
        int quantidadeDeEntrevistados = Integer.parseInt(quantidade);
        
        Questao9 questao9 = new Questao9();
        questao9.DescobrindoMediaSalarial(quantidadeDeEntrevistados);
        questao9.DescobrindoMediaDoNumeroDeFilhos(quantidadeDeEntrevistados);
    }
} 
