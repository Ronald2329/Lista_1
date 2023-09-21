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
public class Questao3 {
    
    public static boolean VerificaSeNumeroEInteiro(String numero){
        try{
            Integer.parseInt(numero);
            return true;
        }catch (Exception e) {
            return false;
        
        }
    }
    
    public static boolean VerificaSeNumeroEPrimo(int numero){
        for(int i =0; i < numero; i++){
            if(numero % i = 0){
                int count = 0;
                count++;
            }
        }
    }
    
    public static void ProgramaPrincipalQuestao3(String numero){
        
        if(VerificaSeNumeroEInteiro(numero) == true){
            int numeroValido = Integer.parseInt(numero);
                
            if(numeroValido >=0){
               
            }else{
                JOptionPane.showConfirmDialog(null,"O numero:"+numero+" é um número inteiro porém é negativo");
            }
            
        }else{
            JOptionPane.showConfirmDialog(null,"O texto:"+numero+" não é um número inteiro!!");
        }
    }
}
