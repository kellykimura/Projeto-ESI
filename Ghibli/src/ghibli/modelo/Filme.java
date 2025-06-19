/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.modelo;

import java.util.ArrayList;


/**
 *
 * @author kelly
 */
public class Filme {
    
    private String titulo;
    private String ano;
    private String categoria;
    private String diretor;
    private String sinopse;
    private double valorVenda;
    private double valorLocacao;
    
    // método vazio para usar jackson
    public Filme(){
        
    }
    
    
    // método construtor com parâmetros
    public Filme (String titulo, String ano, String categoria, String diretor, String sinopse, double ValorLocacao, double ValorVenda){
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.valorLocacao = valorLocacao;
        this.valorVenda = valorVenda;
    } 
    
    /*public void adicionarFilme(){
        listaFilmes.add(this);
        System.out.println("Filme adicionado: " + titulo);
    } vai ficar no controlador*/

    // getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
    
    
    
}
