/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula3.com.aula3;

/**
 *
 * @author aluno
 */
class aula4exemplo4 {

    public int umaVariavelNormal;
    public static int umaVariavelStatica;

    public int resultadoNormal(int num1, int num2) {

        return (num1 + num2);

    }

    public static int resultadoStatico(int num1, int num2) {

        return (num1 + num2);

    }

}

public class TestaSoma {

    public static void main(String[] main) {

        System.out.println(new aula4exemplo4().resultadoNormal(10, 50));
        System.out.println(aula4exemplo4.resultadoStatico(10, 50));
    }

}
