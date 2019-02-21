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
public class Lampada {

    private boolean status;

    public Lampada() {
    }

    public Lampada(boolean status) {
        this.status = status;
    }

    public void ligar() {
        this.setStatus(true);

    }

    public void desligar() {

        this.setStatus(false);

    }

    public void observar() {

        if (this.status) {

            System.out.println("A lampada esta ligada");
        } else {

            System.out.println("A lampada esta desligada");
        }

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
