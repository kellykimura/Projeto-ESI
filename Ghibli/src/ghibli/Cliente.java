/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli;

import java.util.ArrayList;

/**
 *
 * @author kelly
 */
public class Cliente {
    
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String senha;
    
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    // construtor com parâmetros
    public Cliente(String nome, String email, String telefone, String cpf, String senha){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
    }
    
    public void criarConta(){
        listaClientes.add(this);
        System.out.println("Conta criada para: " + nome);
    }
    
    // getters e setters
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
     
}
