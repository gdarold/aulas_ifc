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
public class aula4Exe4 {

    public static void main(String[] main) {

        int[] lista = {1, 5, 20, 30, 4, 2, 25, 13};
        int digitado;

        boolean op= false;
        digitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 25 "));

        for (int i = 0; i < lista.length; i++) {

            if (lista[i] == digitado) {
                JOptionPane.showMessageDialog(null, "Acertou mizerave!!!");

            } else {
                op = true;
            }

        }
        if (op) {

            JOptionPane.showMessageDialog(null, "numero incorreto");
        }

    }

}
