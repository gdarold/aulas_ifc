/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.com.aula5.ufc;

/**
 *
 * @author aluno
 */
public enum CategoriaTipo {

    LEVE("peso leve"),
    PENA("peso pena"),
    PESADO("peso pesado"),
    MOSCA("peso mosca"),
    MEDIO("peso medio");

    private final String tipo;

    private CategoriaTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
