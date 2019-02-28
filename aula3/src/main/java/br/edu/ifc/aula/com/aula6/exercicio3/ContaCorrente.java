/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(Integer numeroConta, String agencia) {
        super(numeroConta, agencia);
    }

    
    
    @Override
    public void atualizaSaldo(double taxa) {
       
        JOptionPane.showMessageDialog(null, "Não tem reajuste");
    }
    
}
