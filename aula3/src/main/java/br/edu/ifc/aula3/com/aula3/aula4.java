/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula3.com.aula3;

import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class aula4 {

    public static void main(String[] main) {

        String[] semana = {"Domingo", "Segunda", "Terça", "quarta", "quinta", "Sexta", "Sábado"

        };

        for (String string : semana) {

            System.out.println(string);

        }
        
        System.out.println("---------");

        for (int i = semana.length-1; i >= 0; i--) {
            System.out.println(semana[i]);
        }

    }

}
