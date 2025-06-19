/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.controlador;

/**
 *
 * @author Gabrielly
 */

import ghibli.modelo.Venda;
import ghibli.persistencia.PersistenciaVenda;
import java.util.ArrayList;

public class ControladorVenda {
    private ArrayList<Venda> vendas;

    public ControladorVenda() {
        vendas = PersistenciaVenda.carregar();
    }

    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
        PersistenciaVenda.salvar(vendas);
        System.out.println("Venda adicionada: " + venda.getNome());
    }

    public void listarVendas() {
        if (vendas.isEmpty()) {
            System.out.println("Nenhuma venda registrada.");
        } else {
            for (Venda v : vendas) {
                System.out.println("Cliente: " + v.getNome() + ", Valor: R$" + v.getValorVenda());
            }
        }
    }

    public Venda buscarPorNome(String nome) {
        for (Venda v : vendas) {
            if (v.getNome().equalsIgnoreCase(nome)) {
                return v;
            }
        }
        return null;
    }
}
