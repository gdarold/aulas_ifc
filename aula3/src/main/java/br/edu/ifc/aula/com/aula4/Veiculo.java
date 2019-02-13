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
public class Veiculo {

    public String cor;
    private int ano, velocidade;
    protected boolean ligado;
    private static final int VELOCIDADE_MAXIMA = 180; // constante
    private static int qtadeVeiculos; //global

    public Veiculo(int ano, int velocidade) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.ligado = false;
        qtadeVeiculos++;
        
    }

// Método construtor sem parâmetros
    public Veiculo() {
// fazendo referência ao outro construtor da classe
        this(2019, 0);
        
    }

    public void ligar() {
        System.out.println("Ligou");
        this.ligado = true;
    }

    public void desligar() {
        System.out.println("Desligou");
        this.ligado = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void acelerar() {
        System.out.println("Acelerou");
        this.velocidade += 1;
    }

    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
    }

    public void frear(boolean parar) {
        System.out.println("Freando");
        if (parar) {
            this.velocidade = 0;
        } else {
            this.velocidade -= 10;
        }
    }

    public static int getQtadeVeiculos() {
        return qtadeVeiculos;
    }

    public static void setQtadeVeiculos(int qtadeVeiculos) {
        Veiculo.qtadeVeiculos = qtadeVeiculos;
    }
    

}
