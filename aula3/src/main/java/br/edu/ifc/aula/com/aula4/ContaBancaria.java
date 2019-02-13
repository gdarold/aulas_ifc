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
public class ContaBancaria {

    private String cliente;
    private double saldo;
    private static final double SALDO_MINIMO = 50.0;
    

    public ContaBancaria(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public ContaBancaria() {
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

    public void deposita(double valor) {
        this.saldo += valor;

    }

    public void saca(double valor) {
        
        if(this.saldo>SALDO_MINIMO){
        this.saldo -= valor;
        }else{
            
            System.out.println("Não é possivel saque,"+this.saldo);
        }
    }

    public void exibeSaldo(){
        
        System.out.println("o Saldo é: "+this.saldo);
    }
    
    public void transfere(double valor, ContaBancaria destino){
       if(this.saldo>SALDO_MINIMO){
           saca(valor);
        }else{
            
            System.out.println("Não é possivel Transferencia,"+this.saldo);
        }
    }
    
    
}
