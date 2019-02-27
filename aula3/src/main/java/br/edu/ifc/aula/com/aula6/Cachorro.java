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
public class Cachorro extends Animal {

    

    public Cachorro() {
        this(3, "osso");
        
    }

    public Cachorro(double peso, String comida) {
        super(peso, comida);
        super.id = 1;
    }
    
    
    
    @Override
    public void fazerBarulho(){
        JOptionPane.showMessageDialog(null, "Au, Au");
        
        
    }
}
