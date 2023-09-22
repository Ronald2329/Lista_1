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
    
    public static String EnunciadoQuestao9 = "A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e número de filhos. "
            + "\nFaça um programa que leia os dados em vetores e crie um procedimento que imprima a média de salário da população, a média do número de filhos, o maior salário e o percentual de pessoas com salário até R$550,00."
            + "\n Obs: O usuário deve informar a quantidade de entrevistados.";
    
    public void DescobrindoMediaSalarial(int quantidadeDeIntrevistados){
      
      double salario[] = new double[quantidadeDeIntrevistados];
       Scanner ler = new Scanner(System.in);
              
      int i;
      double salarioDeReferencia = 550.00;
      int quantidadeDePessoasComSalarioMenorOuIgualAoDeReferencia = 0;
      double porcentagemDePessoasComSalarioMenorOuIgualAoDeReferencia;
      double mediaSalarial = 0;
      double somaDosSalarios = 0;
      double menorSalario = salario[0];
      double maiorSalario = salario[0];
      
      for(i = 0; i < quantidadeDeIntrevistados; i++){
          String input = JOptionPane.showInputDialog("Informe o salário do intrevistado "+(i+1)+":");
          double novoSalario = Double.parseDouble(input);
          
          salario[i] = novoSalario;
          somaDosSalarios += novoSalario;
          
          if(novoSalario > menorSalario){
              menorSalario = novoSalario;
          }
          
          if(novoSalario < menorSalario){
              maiorSalario = novoSalario;
          }
          
          if(novoSalario <= salarioDeReferencia){
              quantidadeDePessoasComSalarioMenorOuIgualAoDeReferencia++;
          }
      }
      
      mediaSalarial = somaDosSalarios/quantidadeDeIntrevistados;
    }
    
    public void DescobrindoMediaDoNumeroDeFilhos(double filhos[],int quantidadeDeIntrevistados){
        
      double menorQuantidadeDeFilhos = filhos[0];
      double maiorQuantidadeDeFilhos = filhos[0];
      
      
    }
}
