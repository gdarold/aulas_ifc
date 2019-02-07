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
public class Exe3 {
    public static void main(String args[]) {

        int saldo = 0, valor, op;
        

        
        JOptionPane.showMessageDialog(null, "Seu saldo é: "+saldo);
        
        
        op = Integer.parseInt(JOptionPane.showInputDialog("digite operação 1= deposito, 2 = saque"));
        
        
        if(op ==1){
            valor = Integer.parseInt(JOptionPane.showInputDialog("digite valor"));
            saldo +=valor;
            JOptionPane.showMessageDialog(null, "Seu saldo é: "+saldo);
        }else{
            
            valor = Integer.parseInt(JOptionPane.showInputDialog("digite valor"));
            saldo -=valor;
            JOptionPane.showMessageDialog(null, "Seu saldo é: "+saldo);
            
        }
        
        
        
        
       
        
        

    }
}
