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
public class Exe4 {
     public static void main(String args[]) {

        double peso, altura;
        String nome;

       // JOptionPane.showMessageDialog(null, "Calcula Imc");

        nome = JOptionPane.showInputDialog("digite nome");

        peso = Double.parseDouble(JOptionPane.showInputDialog("digite seu peso"));

        altura = Double.parseDouble(JOptionPane.showInputDialog("digite sua altura"));

        //imc = peso / (altura * altura);

        
        double imc = calculaImc(peso, altura);
        
    JOptionPane.showMessageDialog(null, "Imc: " + imc+ " "+retornaImc(imc));
       

    }

    public static double calculaImc(double peso, double altura){
        
        return peso/(altura*altura);
    }
    
    public static String retornaImc(double imc){
          String imcResultado = "";
        if (imc < 18.5) {

            imcResultado = "peso abaixo do normal";
        } else if (imc >= 18.6 && imc <= 24.4) {

            imcResultado = "peso ideal";
          
            
              }else if (imc >= 24.5 && imc <= 29.9) {

            imcResultado = "pré obesidade";
          
            
              }else if (imc >= 30 && imc <= 34.9) {

            imcResultado = "Obesidade classe 1";
          
            
              }else if (imc >= 35 && imc <= 39.9) {

            imcResultado = "Obesidade classe 2";
          
            
              }else if (imc >= 40) {

            imcResultado = "Obesidade classe 3";
          
            
              }
        return imcResultado;
        
    }

    
}
