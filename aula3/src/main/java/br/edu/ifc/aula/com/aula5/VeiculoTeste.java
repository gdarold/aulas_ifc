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
public class VeiculoTeste {

    public static void main(String[] args) {

        Veiculo ferrari = new Veiculo();
        System.out.println(ferrari.toString());
        Veiculo montana = new Veiculo("GM Montana", 180);
        System.out.println(montana.toString());
        Veiculo corsa = new Veiculo("GM Corsa", 160, 20);
        System.out.println(corsa.toString());
    }

}
