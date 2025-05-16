/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli;

/**
 *
 * @author kelly
 */
public class Locacao {
    private String nome;
    private double valorLocacao;
    private String prazoDevolucao;
    private String dadosCartao; //dados cartao pode ser uma classe?
    private String dadosEntrega;
    
    // construtor com parâmetros
    public Locacao(String nome, double valorLocacao, String prazoDevolucao, String dadosCartao, String dadosEntrega){
        this.nome = nome;
        this.valorLocacao = valorLocacao;
        this.prazoDevolucao = prazoDevolucao;
        this.dadosCartao = dadosCartao;
        this.dadosEntrega = dadosEntrega;
    }
    
    public void definirDevolucao (String novaData){
        this.prazoDevolucao = novaData;
        System.out.println("Nova data de devoluação: "+prazoDevolucao);
    }
    
    public void realizarLocacao(Item item){
        System.out.println("Filme '" + item.getFilme().getTitulo()+"'alugado por" + nome+".");
        System.out.println("Valor R$"+valorLocacao + "| Devolução: " + prazoDevolucao);
    }
    
    
    // getters and setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public String getPrazoDevolucao() {
        return prazoDevolucao;
    }

    public void setPrazoDevolucao(String prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
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
