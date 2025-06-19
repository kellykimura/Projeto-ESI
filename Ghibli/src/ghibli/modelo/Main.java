/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.modelo;

import ghibli.controlador.*;
/**
 *
 * @author kelly
 */
public class Main {
    
    public static void main(String[] args) {
        
        ControladorCliente controladorCliente = new ControladorCliente();
        ControladorFilme controladorFilme = new ControladorFilme();
        ControladorItem controladorItem = new ControladorItem();
        ControladorLocacao controladorLocacao = new ControladorLocacao();
        ControladorVenda controladorVenda = new ControladorVenda();

        //cria cliente
        Cliente cliente = new Cliente("Antônia", "antonia@gmail.com", "12345678901", "senha123", "Rua Exemplo, 123");
        controladorCliente.cadastrarCliente(
            cliente.getNome(),
            cliente.getEmail(),
            cliente.getTelefone(),
            cliente.getCpf(),
            cliente.getSenha(),
            cliente.getEndereco()
        ); //cliente novo

        //cria e adiciona filme
        Filme filme = new Filme("A Viagem de Chihiro","2001","Fantasia/Aventura","Hayao Miyazaki","Sonhos dentro de sonhos.",50.0,15.0);
        controladorFilme.adicionarFilme(filme);
        
        Item item = new Item("001", "15/06/2025", filme);
        controladorItem.adicionarItem(item);
        
        // realiza locação
        Locacao locacao = new Locacao(
            cliente.getNome(),
            filme.getValorLocacao(),
            "22/06/2025",
            "1234-****",
            cliente.getEndereco()
        );
        controladorLocacao.adicionarLocacao(locacao);
        locacao.realizarLocacao(item);
        locacao.definirDevolucao("25/06/2025");

        // realiza venda
        Venda venda = new Venda(
            cliente.getNome(),
            filme.getValorVenda(),
            "1234-****",
            cliente.getEndereco()
        );
        controladorVenda.adicionarVenda(venda);
        venda.realizarVenda(item);

        // finaliza venda
        FinalizarVenda finalizar = new FinalizarVenda("1x A Origem - R$" + filme.getValorVenda());
        finalizar.finalizar();

        // lista tudo o que foi criado
        System.out.println("\nCliente(s) cadastrado(s):");
        controladorCliente.listarClientes();

        System.out.println("\nFilme(s) cadastrado(s):");
        controladorFilme.listarFilmes();

        System.out.println("\nIten(s) cadastrado(s):");
        controladorItem.listarItens();

        System.out.println("\nLigaçõe(s) cadastrada(s):");
        controladorLocacao.listarLocacoes();

        System.out.println("\nVenda(s) cadastrada(s):");
        controladorVenda.listarVendas();
    }
}
