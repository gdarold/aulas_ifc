/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Galinha extends Animal {

    public Galinha() {
        super(1.4, "milho");
        super.id = 2;
    }

    public Galinha(double peso, String comida) {
        super(peso, comida);
    }

    @Override
    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null, " co, co");

    }

    @Override
    public void correr() {
       JOptionPane.showMessageDialog(null, "ciscando");
        
    }
}
