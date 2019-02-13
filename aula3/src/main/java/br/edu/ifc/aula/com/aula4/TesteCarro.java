/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula4;

/**
 *
 * @author aluno
 */
public class TesteCarro {

    public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo();
        Veiculo corsa = new Veiculo(2011, 0);

        corsa.cor = "Prata";
        // corsa.setCor("Prata");
        corsa.setLigado(true);

        System.out.println(corsa.isLigado());

        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.acelerar(40);
        meuCarro.frear(true);
        meuCarro.desligar();

    }

}
