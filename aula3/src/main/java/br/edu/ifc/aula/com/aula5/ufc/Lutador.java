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
public class Lutador {

    private String nome;
    private NacionalidadeType nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private int vitorias, derrotas, empates;
    private CategoriaTipo categoria;

    public void apresentar() {
        System.out.println("Chegou o grande dia, apresentamos o lutador " + this.nome);
        System.out.println("diretamente de " + this.nacionalidade.name());
        this.status();

    }

    public void status() {
        System.out.println("O lutador " + this.nome + "da categoria " + this.categoria);
        System.out.println("Ganhou " + this.vitorias);
        System.out.println("Empatou " + this.empates);
        System.out.println("Perdeu " + this.derrotas);
    }

    public void ganharLuta() {
        System.out.println(this.nome + " é o vencedor");
        this.vitorias++;
    }

    public void perderLuta() {
        System.out.println(this.nome + " é o perdedor");
        this.derrotas++;
    }

    public void empatarLuta() {
        this.empates++;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NacionalidadeType getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(NacionalidadeType nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public CategoriaTipo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaTipo categoria) {
        this.categoria = categoria;
    }

    public Lutador(String nome, NacionalidadeType nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates, CategoriaTipo categoria) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.categoria = categoria;
    }

    public Lutador() {

    }

    @Override
    public String toString() {
        return "Lutador{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", altura=" + altura + ", peso=" + peso + ", vitorias=" + vitorias + ", derrotas=" + derrotas + ", empates=" + empates + ", categoria=" + categoria + '}';
    }

}
