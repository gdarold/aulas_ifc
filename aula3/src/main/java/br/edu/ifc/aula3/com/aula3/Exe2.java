/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula3.com.aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exe2 {
   
    public static void main(String args[]) {

        int base, altura, area;
        

        base = Integer.parseInt(JOptionPane.showInputDialog("digite valor base triangulo"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("digite valor da altura triangulo"));
        
        area = (base*altura)/2;
        
        JOptionPane.showMessageDialog(null, area);

    }
    
}
