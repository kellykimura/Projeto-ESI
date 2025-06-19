/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.modelo;

/**
 *
 * @author kelly
 */
public class Item {
    
    private String numSerie;
    private String dtAquisicao;
    private Filme filme;
    
    // contrutor vazio para usar jackson
    
    public Item(){
        
    }
    
    // método construtor com parâmetros
    public Item(String numSerie,String dtAquisicao, Filme filme){
        this.numSerie = numSerie;
        this.dtAquisicao = dtAquisicao;
        this.filme = filme;
    }

    // getters e setters
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getDtAquisicao() {
        return dtAquisicao;
    }

    public void setDtAquisicao(String dtAquisicao) {
        this.dtAquisicao = dtAquisicao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    
}
