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
public class Aula4Exe6 {

    public static void main(String[] main) {

        
        int verifica = 0;
        
        String[] nomes = {"branca", "verde", "vermelha", "amarela"};

        String cor = JOptionPane.showInputDialog("Digite o nome de uma cor");

        for (int i = 0; i < nomes.length; i++) {

            if (nomes[i].equals(cor)) {

                 JOptionPane.showMessageDialog(null, "cor encontrada");
                  verifica++;
            } else {

            }

        }
        
        if (verifica == 0) {

            JOptionPane.showMessageDialog(null, "cor incorreto");
        }

    }
}
