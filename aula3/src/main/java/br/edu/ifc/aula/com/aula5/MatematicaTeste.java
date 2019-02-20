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
public class MatematicaTeste {
    
    
    public static void main(String[] args) {
        
        Matematica m1 = new Matematica();
        
        System.out.println(m1.media(5, 8, 7));
        System.out.println(m1.calculo(8.0, 5.0));
        System.out.println(m1.media("8","5"));
        
    }
}
