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
public class Exe5 {

    public static void main(String args[]) {

        int v1, v2;

        v1 = Integer.parseInt(JOptionPane.showInputDialog("digite valor1"));

        v2 = Integer.parseInt(JOptionPane.showInputDialog("digite valor2"));

        JOptionPane.showMessageDialog(null, "Soma: " + soma(v1, v2)
                + " \n Diminuir: " + diminuir(v1, v2)
                + "\n Multiplica: " + multiplica(v1, v2)
                + "\n Divide: " + divide(v1, v2));

    }

    public static int soma(int v1, int v2) {

        return v1 + v2;

    }

    public static int diminuir(int v1, int v2) {

        return v1 - v2;
    }

    public static int multiplica(int v1, int v2) {

        return v1 * v2;
    }

    public static double divide(int v1, int v2) {

        return v1 / v2;
    }

}
