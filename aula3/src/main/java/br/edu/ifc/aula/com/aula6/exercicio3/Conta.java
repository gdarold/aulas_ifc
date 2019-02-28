/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula6.exercicio3;

/**
 *
 * @author aluno
 */
public abstract class Conta {

    private Integer numeroConta;
    private String agencia;
    protected Double saldo;

    public Conta() {
        this.saldo = 0D;

    }

    public Conta(Integer numeroConta, String agencia) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = 0D;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }

    }

    public void sacar(double valor) {

        if (this.saldo > valor) {
            this.saldo -= valor;
        }

    }

    public abstract void atualizaSaldo(double taxa);

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(String.format("%-15s %-15s %-30s\n", "Número","Agencia", "Saldo"));
      sb.append(String.format("%-15s %-15s %-30s\n", this.numeroConta,this.agencia,this.saldo));
      
      
      
      return sb.toString();
      
    }
    
    
    
    
    
    
    
    
}
