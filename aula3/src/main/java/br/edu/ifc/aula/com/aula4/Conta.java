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
public class Conta {

    private String cliente;
    private double saldo;

    private static final int SALDO_MINIMO = 50;

    private boolean verificarSaldo(double valor) {
        return this.saldo - valor >= SALDO_MINIMO;
    }

    public void exibeSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public void saca(double valor) {
        if (verificarSaldo(valor)) {
            corrigirSaldo(valor, false);
            System.out.println("Sacou " + valor);
        } else {
            System.out.println("Saldo Insuficiente!");
        }

    }

    public void deposita(double valor) {
        corrigirSaldo(valor, true);
        System.out.println("Depositou " + valor);
    }

    public void transferePara(Conta destino, double valor) {
        if (verificarSaldo(valor)) {
            destino.setSaldo(destino.getSaldo() + valor);
            corrigirSaldo(valor, false);
            System.out.println("Transferência do cliente "
                    + this.getCliente()
                    + " para o cliente "
                    + destino.getCliente()
                    + " o valor de " + valor);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    private void corrigirSaldo(double valor, boolean aumentar) {
        if (aumentar) {

            this.saldo += valor;
        } else {
            this.saldo -= valor;

        }

    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
