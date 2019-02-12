/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula3.com.aula3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Aula4Exemplo2 {

    public static void main(String[] main) {

        try {
            String auxiliar = null;
            int qtdNotas;
            Double nota, notas[] = null;

            auxiliar = JOptionPane.showInputDialog("Informe a quantidade de notas");
            qtdNotas = Integer.parseInt(auxiliar);
            notas = new Double[qtdNotas];

            for (int i = 0; i < notas.length; i++) {

                auxiliar = JOptionPane.showInputDialog("Informe a nota " + (i + 1) + ":");
                nota = Double.parseDouble(auxiliar);
                notas[i] = nota;

            }

            System.out.println(notas.length);
            System.out.println(Aula4Exemplo2.somarNotas(notas));

            System.out.println(Aula4Exemplo2.calcularMediaNotas(notas));
            System.out.println(Arrays.asList(notas));

            Arrays.sort(notas);

            System.out.println(Arrays.asList(notas));

        } catch (NumberFormatException ex) {

            ex.printStackTrace();

            JOptionPane.showMessageDialog(null, "Informe numeros válidos");
        }

    }

    public static Double somarNotas(Double notas[]) {
        return Arrays.stream(notas).mapToDouble(Double::doubleValue).sum();

    }

    public static Double calcularMediaNotas(Double notas[]) {

        return Arrays.stream(notas).mapToDouble(Double::doubleValue).average().orElse(Double.NaN);

    }

}
