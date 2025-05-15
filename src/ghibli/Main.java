/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli;

/**
 *
 * @author kelly
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Antônia", "antonia@gmail.com", "12345678901", "a", "senha123");
        cliente.criarConta();
        
        Filme filme = new Filme("A Viagem de Chihiro", "2001", "Fantasia/Aventura", "Hayao Miyazaki", "Sonhos dentro de sonhos.");
        filme.adicionarFilme();
        
        Item item = new Item("001", "15/05/2025", filme);
        item.adicionarCarrinho();
        
        Locacao locacao = new Locacao("Antônia", 12.90, "20/05/2025", "1234-****", "Rua Exemplo, 123");
        locacao.realizarLocacao(item);
        locacao.definirDevolucao("22/05/2025");
    
        Venda venda = new Venda("Antônia", 39.90, "1234-****", "Rua Exemplo, 123");
        venda.realizarVenda(item);
        
        FinalizarVenda finalizar = new FinalizarVenda("1x A Origem - R$39.90");
        finalizar.finalizar();
    }
}
