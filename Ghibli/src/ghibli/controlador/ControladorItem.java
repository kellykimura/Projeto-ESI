/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.controlador;

import ghibli.modelo.Item;
import ghibli.persistencia.PersistenciaItem;

import java.util.ArrayList;
/**
 *
 * @author Gabrielly
 */
public class ControladorItem {
    private ArrayList<Item> itens;

    public ControladorItem() {
        itens = PersistenciaItem.carregar();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
        PersistenciaItem.salvar(itens);
        System.out.println("Item adicionado: " + item.getNumSerie());
    }

    public void removerItem(Item item) {
        itens.remove(item);
        PersistenciaItem.salvar(itens);
        System.out.println("Item removido: " + item.getNumSerie());
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            for (Item i : itens) {
                System.out.println("NumSerie: " + i.getNumSerie() + ", Filme: " + i.getFilme().getTitulo());
            }
        }
    }

    public Item buscarPorNumSerie(String numSerie) {
        for (Item i : itens) {
            if (i.getNumSerie().equalsIgnoreCase(numSerie)) {
                return i;
            }
        }
        return null;
    }
}
