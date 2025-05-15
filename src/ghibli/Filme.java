/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli;

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
    
    public Filme (String titulo, String ano, String categoria, String diretor, String sinopse){
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
        this.diretor = diretor;
        this.sinopse = sinopse;
    } 
    
    public void adicionarFilme(String titulo, String ano, String categoria, String diretor, String sinopse){
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
        this.diretor = diretor;
        this.sinopse = sinopse;
    }
    
    public void adicionarFilme() {
        System.out.println("Filme '" + titulo + "' adicionado ao sistema.");
    }

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
    
}
