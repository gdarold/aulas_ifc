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
public class Testeconta {
    
    
    public static void main(String[] args) {
        
        ContaBancaria nova = new ContaBancaria();
        
        nova.deposita(100);
        nova.exibeSaldo();
        //nova.saca(50);
        nova.exibeSaldo();
        //nova.saca(50);
        
        ContaBancaria nova2 = new ContaBancaria();
        nova2.deposita(500);
        nova2.exibeSaldo();
        nova2.transfere(50, nova);
        nova2.exibeSaldo();
        nova.exibeSaldo();
        
    }
        
}
