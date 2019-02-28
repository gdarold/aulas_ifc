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
public class Lobo extends Animal{
    
    public Lobo(){
        super(4,"galinha");
    }

    public Lobo(double peso, String comida) {
        super(peso, comida);
        super.id= 3;
    }

    @Override
    public void correr() {
        JOptionPane.showMessageDialog(null, "Que lobito");
   }

    @Override
    public void fazerBarulho() {
        JOptionPane.showMessageDialog(null, "auuuuuu, auuuuu");
    }
    
}
