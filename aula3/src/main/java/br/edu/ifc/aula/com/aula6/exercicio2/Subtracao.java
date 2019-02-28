/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Subtracao extends OperacaoMatematica {

    double subtracao;
    public Subtracao() {
    }

    @Override
    public void calcular(double numero1, double numero2) {
        this.subtracao = numero1 - numero2;

        JOptionPane.showMessageDialog(null, "o resultado da subtração é: " + subtracao);
    }

}
