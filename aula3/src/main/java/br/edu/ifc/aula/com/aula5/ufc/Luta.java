/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula5.ufc;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;
            System.out.println("Luta marcada");

        } else {

            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Luta não pode ser marcada");

        }

    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("Desafiante");
            this.desafiante.apresentar();

            System.out.println("Desafiado");
            this.desafiado.apresentar();
            verificaVencedor();
        } else {
            System.out.println("Luta não vai rolar");

        }

    }

    private void verificaVencedor() {
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        System.out.println("-----------Resultado da luta--------");

        switch (vencedor) {

            case 0:
                System.out.println("-----------Empatou--------");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;

            case 1:
                System.out.println("-----------Ganhou--------");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;

            case 2:
                System.out.println("-----------Perdeu--------");
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;

        }

        System.err.println("--------------------------------");
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
