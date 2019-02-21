/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula5.exercicios;

/**
 *
 * @author aluno
 */
public class UsaLampada {
    
    public static void main(String[] args) {
        
        Lampada l1 = new Lampada(true);
        Lampada l2 = new Lampada(false);
        l1.observar();
        l2.observar();
    }
    
    
}
