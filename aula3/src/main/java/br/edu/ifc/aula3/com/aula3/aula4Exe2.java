package br.edu.ifc.aula3.com.aula3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class aula4Exe2 {
    
    
    public static void main(String[] main) {
         
         
       int linha = 2, coluna = 3, soma = 0;
       
       int matriz[][] = new int[linha][coluna];
       
       matriz[0][0] = 1;
       matriz[0][1] = 3;
       matriz[0][2] = 8;
       matriz[1][0] = 12;
       matriz[1][1] = 15;
       matriz[1][2] = 18;
      
       
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[l].length; c++) {
                
                soma+=matriz[l][c];
                
            }
            
        }
          
        System.out.println("a soma "+soma);
    
    }
}
