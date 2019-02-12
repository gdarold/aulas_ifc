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
public class Aula4Exe8 {

    public static void main(String[] main) {

        Integer[] numeros = new Integer[5];
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (i + 1) + " Numero"));
        }

      

    }

    public static Integer soma(int numeros) {
        int sorteado = 0;

        sorteado = (int) (Math.random() * 9);

        return sorteado;

    }

}
