
package lista.pkg1.de.procedimentos.e.funções;

import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import static lista.pkg1.de.procedimentos.e.funções.Questao10.EnunciadoQuestao10;
import static lista.pkg1.de.procedimentos.e.funções.Questao11.EnunciadoQuestao11;
import static lista.pkg1.de.procedimentos.e.funções.Questao12.EnunciadoQuestao12;
import static lista.pkg1.de.procedimentos.e.funções.Questao2.EnunciadoQuestao2;
import static lista.pkg1.de.procedimentos.e.funções.Questao3.EnunciadoQuestao3;
import static lista.pkg1.de.procedimentos.e.funções.Questao4.EnunciadoQuestao4;
import static lista.pkg1.de.procedimentos.e.funções.Questao5.EnunciadoQuestao5;
import static lista.pkg1.de.procedimentos.e.funções.Questao6.EnunciadoQuestao6;
import static lista.pkg1.de.procedimentos.e.funções.Questao7.EnunciadoQuestao7;
import static lista.pkg1.de.procedimentos.e.funções.Questao8.EnunciadoQuestao8;
import static lista.pkg1.de.procedimentos.e.funções.Questao9.EnunciadoQuestao9;

public class Lista1DeProcedimentosEFunções {
    
    public void Questao1(){
      
         String raio = JOptionPane.showInputDialog("(Questão 1)- Faça uma função que recebe por parâmetro o raio de uma esfera e calcula o seu volume (v = 4/3 * π * r^3), onde r é o raio da esfera e π é uma constante igual a 3,14159265."
                 + "                                \nInforme o raio da esfera\n Informe o raio da esfera ");
         double caculaRaio = Double.parseDouble(raio);
         
         Questao1 questao1 = new Questao1();
         
         JOptionPane.showConfirmDialog(null, "O resultado do cáculo do volume é: "+questao1.CalculaRaio(caculaRaio));
    }
    
    public void Questao2(){
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
    
    public void Questao3(){
        Questao3 questao3 = new Questao3();
        String input = JOptionPane.showInputDialog(EnunciadoQuestao3 + "\nInforme um número: \n");

        if (questao3.VerificaSeNumeroEInteiro(input)) {
            int numero = Integer.parseInt(input);

            if (numero >= 0) {
                if (questao3.VerificaSeNumeroEPrimo(numero)) {
                    JOptionPane.showMessageDialog(null, "O número: " + numero + " é um número inteiro e é primo!!");
                } else {
                    JOptionPane.showMessageDialog(null, "O número: " + numero + " é um número inteiro porém não é primo");
                }
            } else {
                JOptionPane.showMessageDialog(null, "O número: " + numero + " é um número inteiro porém é negativo");
            }

        } else {
            JOptionPane.showMessageDialog(null, "O texto: " + input + " não é um número inteiro!!");
        } 
    }
    
    public void Questao4(){
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
    
    public void Questao5(){
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
    
    public void Questao6(){
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
    
    public void Questao7(){
        String media = JOptionPane.showInputDialog(EnunciadoQuestao7+"\nInforme o valor da media final do aluno: ");
        double mediaFinal = Double.parseDouble(media);
        
        Questao7 questao7 = new Questao7();
        
        questao7.CalculaMediaPorConceito(mediaFinal);
    }
    
    public void Questao8(){
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
    
    public void Questao9(){
         String quantidade = JOptionPane.showInputDialog(EnunciadoQuestao9+"\n"
                + "Informe primeiro a quantidade de entrevistados");
        int quantidadeDeEntrevistados = Integer.parseInt(quantidade);
        
        Questao9 questao9 = new Questao9();
        questao9.DescobrindoMediaSalarial(quantidadeDeEntrevistados);
        questao9.DescobrindoMediaDoNumeroDeFilhos(quantidadeDeEntrevistados);
    }
    
    public void Questao10(){
         String quantidade = JOptionPane.showInputDialog(EnunciadoQuestao10 + "\nInforme a quantidade de valores a serem ordenados:");
        int quantidadeDeValores = Integer.parseInt(quantidade);

        Questao10 questao10 = new Questao10();
        questao10.OrdenaVetoresInteiros(quantidadeDeValores);
    }
    
    public void Questao11(){
         double matriz[][] = new double[9][9];
        int i,j;
        
        Random random = new Random();
        for ( i = 0; i < matriz.length; i++) {
            for ( j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextDouble(); // Gera um número real aleatório entre 0 e 1
            }
        }

        Questao11 questao11 = new Questao11();
        questao11.RecebeMatriz(matriz);

        // Exibir a matriz aleatória gerada com 2 casas decimais e formatação adequada
        StringBuilder matrizString = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        for ( i = 0; i < matriz.length; i++) { 
            for ( j = 0; j < matriz[i].length; j++) {
                matrizString.append(decimalFormat.format(matriz[i][j])).append(" \t ");
            }
            matrizString.append("\n");
        }
        JOptionPane.showMessageDialog(null, EnunciadoQuestao11+"\nA matriz aleatória gerada foi:\n" + matrizString.toString());
    } 
    
    public void Questao12(){
        int n = 15;
        int vetor[] = new int[n];

        StringBuilder matrizString = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("0");

        for (int i = 0; i < n; i++) {
            String input = JOptionPane.showInputDialog(EnunciadoQuestao12+"\nInforme o valor de número " + (i + 1) + ":\n");
            int novoVetor = Integer.parseInt(input);

            vetor[i] = novoVetor;
        }

        for (int i = 0; i < vetor.length; i++) {
            matrizString.append(decimalFormat.format(vetor[i])).append(" \t ");
        }

        Questao12 questao12 = new Questao12();
        JOptionPane.showMessageDialog(null, "O vetor: " +
                matrizString.toString() + "\n" +
                "possui " + questao12.DscobrindoAQuantidadeDeNumerosParesNoVetor(vetor) + " números pares");
    }
   
}
