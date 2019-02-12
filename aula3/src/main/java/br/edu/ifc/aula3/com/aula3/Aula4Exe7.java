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
public class Aula4Exe7 {

    public static void main(String[] main) {

        String[] nomes = new String[10];
        for (int i = 0; i < 10; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite " + (i + 1) + " Nome");
        }

        JOptionPane.showMessageDialog(null, "O numero sorteado é: " + sorteio() + " corresponde ao nome: " + nomes[sorteio()]);

    }

    public static Integer sorteio() {
        int sorteado = 0;

        sorteado = (int) (Math.random() * 9);

        return sorteado;
    }

}
