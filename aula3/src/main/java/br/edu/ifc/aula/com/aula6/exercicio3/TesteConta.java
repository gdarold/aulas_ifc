/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio3;

/**
 *
 * @author aluno
 */
public class TesteConta {
    
    
    public static void main(String[] args) {
        
        ContaCorrente a = new ContaCorrente(12345,"caixa");
        a.depositar(100);
        a.depositar(250);
        a.sacar(25);
        a.atualizaSaldo(0.5);
        System.out.println(a.toString());
    }
    
}
