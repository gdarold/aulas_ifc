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
public class Veiculo {

    private String modelo;
    private int velocidadeMaxima;
    private double segundosZeroACem;

    public Veiculo(String modelo, int velocidadeMaxima, double segundosZeroACem) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
    }

    public Veiculo(String modelo, int velocidadeMaxima) {
        this(modelo, velocidadeMaxima, 10);
    }

    public Veiculo() {
        this("ferrari Enzo", 349, 10);

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getSegundosZeroACem() {
        return segundosZeroACem;
    }

    public void setSegundosZeroACem(double segundosZeroACem) {
        this.segundosZeroACem = segundosZeroACem;
    }

    @Override
    public String toString() {
        return this.modelo+" - "+this.velocidadeMaxima+" - "+this.segundosZeroACem;
    }

    
    
}
