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
public class Soma extends OperacaoMatematica{

    double soma;
    public Soma() {
    }

        
    @Override
    public void calcular(double numero1, double numero2) {
       this.soma = numero1+numero2;
        JOptionPane.showMessageDialog(null, "O resultado da soma é: "+soma);
    }
    
}
