/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio2;

/**
 *
 * @author aluno
 */
public class TesteOperacao {
    
    public static void main(String[] args) {
        
        double a = 10;
        double b = 5;
        
        Soma somar = new Soma();
        
        somar.calcular(a, b);
        
        Subtracao sub = new Subtracao();
        sub.calcular(a, b);
        
    }
    
}
