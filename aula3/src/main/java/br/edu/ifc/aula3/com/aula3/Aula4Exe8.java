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
        for (int i = 0; i < 5; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (i + 1) + " Numero"));

            System.out.println(numeros[i]);
        }

        JOptionPane.showMessageDialog(null, "Soma " + soma(numeros) + " maior " + maior(numeros) + " menor " + menor(numeros));

    }

    public static Integer soma(Integer[] numeros) {
        int soma = 0;

        for (int i = 0; i < 5; i++) {

            soma += soma + numeros[i];
        }

        return soma;

    }

    public static Integer maior(Integer[] numeros) {
        int maior = 0;
        maior = numeros[0];
        for (int i = 0; i < 5; i++) {

            if (numeros[i] > maior) {

                maior = numeros[i];

            }
        }

        return maior;

    }

    public static Integer menor(Integer[] numeros) {
        int menor = 0;
        menor = numeros[0];
        for (int i = 0; i < 5; i++) {

            if (numeros[i] < menor);

            menor = numeros[i];
        }

        return menor;

    }

}
