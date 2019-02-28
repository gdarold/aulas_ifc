/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public abstract class Animal extends Object {

    protected int id;
    private double peso;
    private String comida;

    public Animal(double peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    public void dormir() {
        JOptionPane.showMessageDialog(null, "Animal dormindo");

    }

    public abstract void correr();

    public abstract void fazerBarulho();

    public void fazerBarulhoSemPolimorfismo() {

        if (this instanceof Cachorro) {
            Cachorro obj = (Cachorro) this;
            obj.fazerBarulho();

        } else if (this instanceof Galinha) {
            Galinha obj = (Galinha) this;
            obj.fazerBarulho();

        } else {
            this.fazerBarulho();
        }

    }

}
