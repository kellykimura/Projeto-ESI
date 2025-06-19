/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.controlador;

import ghibli.modelo.Locacao;
import ghibli.persistencia.PersistenciaLocacao;
import java.util.ArrayList;
/**
 *
 * @author Gabrielly
 */
public class ControladorLocacao {
    private ArrayList<Locacao> locacoes;

    public ControladorLocacao() {
        locacoes = PersistenciaLocacao.carregar();
    }

    public void adicionarLocacao(Locacao locacao) {
        locacoes.add(locacao);
        PersistenciaLocacao.salvar(locacoes);
        System.out.println("Locação adicionada para: " + locacao.getNome());
    }

    public void listarLocacoes() {
        if (locacoes.isEmpty()) {
            System.out.println("Nenhuma locação registrada.");
        } else {
            for (Locacao l : locacoes) {
                System.out.println("Cliente: " + l.getNome() + ", Valor: R$" + l.getValorLocacao() + ", Devolução: " + l.getPrazoDevolucao());
            }
        }
    }

    public Locacao buscarPorNome(String nome) {
        for (Locacao l : locacoes) {
            if (l.getNome().equalsIgnoreCase(nome)) {
                return l;
            }
        }
        return null;
    }
}
