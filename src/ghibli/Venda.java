/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli;

/**
 *
 * @author kelly
 */
public class Venda {
    
    private String nome;
    private double valorVenda;
    private String dadosCartao;
    private String dadosEntrega;

    // método construtor com parâmetros
    public Venda(String nome, double valorVenda, String dadosCartao, String dadosEntrega) {
        this.nome = nome;
        this.valorVenda = valorVenda;
        this.dadosCartao = dadosCartao;
        this.dadosEntrega = dadosEntrega;
    }
    
    public void realizarVenda(Item item){
        System.out.println("Filme '" + item.getFilme().getTitulo() + "' comprado por " + nome + ".");
        System.out.println("Valor: R$" + valorVenda);
    }
    
    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getDadosCartao() {
        return dadosCartao;
    }

    public void setDadosCartao(String dadosCartao) {
        this.dadosCartao = dadosCartao;
    }

    public String getDadosEntrega() {
        return dadosEntrega;
    }

    public void setDadosEntrega(String dadosEntrega) {
        this.dadosEntrega = dadosEntrega;
    }
    
    
}
