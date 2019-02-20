/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula5;

/**
 *
 * @author aluno
 */
public class Matematica {

    private double calculo(double[] notas) {
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {

            soma += notas[i];
        }

        return soma / notas.length;
    }

    public double calculo(double n1, double n2) {

        return calculo(new double[]{n1, n2});
    }

    public int media(int n1, int n2) {

        return Double.valueOf(calculo(n1, n2)).intValue();
    }

    public double media(double n1, double n2, double n3) {

        return calculo(new double[]{n1, n2, n3});
    }

    public double media(String n1, String n2) {

        return media(Integer.parseInt(n1), Integer.parseInt(n2));
    }

}
