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
public class ContaPoupanca extends Conta {

    @Override
    public void atualizaSaldo(double taxa) {
        this.setSaldo(this.saldo + (this.saldo * taxa) / 100);

    }

}
