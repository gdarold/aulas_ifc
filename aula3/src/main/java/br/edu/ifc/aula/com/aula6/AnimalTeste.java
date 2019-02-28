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
public class AnimalTeste {
    
    public static void main(String[] args) {
        
        
        
        Animal generico = new Animal(6, "peixe") {
            
            @Override
            public void fazerBarulho() {
                JOptionPane.showMessageDialog(null, "Miauu");
            }

            @Override
            public void correr() {
               
                JOptionPane.showMessageDialog(null, "lisp");
                
                
                
            }
        };
        
        Animal toto = new Cachorro();
        
        Animal coco = new Galinha();
        
        
        toto.fazerBarulho();
        toto.correr();
        coco.fazerBarulho();
        coco.correr();
        generico.fazerBarulhoSemPolimorfismo();
        generico.correr();
        
    }
}
