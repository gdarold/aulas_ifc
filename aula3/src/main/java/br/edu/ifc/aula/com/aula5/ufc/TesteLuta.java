/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula5.ufc;

/**
 *
 * @author aluno
 */
public class TesteLuta {

    public static void main(String[] args) {

        Lutador l1 = new Lutador("Anderson Silva", NacionalidadeType.BRASIL, 38, 1.88, 72.0, 10, 2, 0, CategoriaTipo.LEVE);
        Lutador l2 = new Lutador("Joaquim Silva", NacionalidadeType.BRASIL, 30, 1.80, 73.0, 12, 4, 0, CategoriaTipo.LEVE);
        Lutador l3 = new Lutador("Junior Sigano", NacionalidadeType.BRASIL, 36, 1.90, 96.0, 12, 4, 0, CategoriaTipo.PESADO);
        Luta luta1 = new Luta();
        luta1.marcarLuta(l1, l2);
        luta1.lutar();


    }
}


