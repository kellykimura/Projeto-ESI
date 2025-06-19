/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.controlador;

import ghibli.modelo.Filme;
import ghibli.persistencia.PersistenciaFilme;

import java.util.ArrayList;
/**
 *
 * @author Gabrielly
 */
public class ControladorFilme {
    private ArrayList<Filme> filmes;

    public ControladorFilme() {
        filmes = PersistenciaFilme.carregar();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
        PersistenciaFilme.salvar(filmes);
        System.out.println("Filme adicionado: " + filme.getTitulo());
    }

    public void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            for (Filme f : filmes) {
                System.out.println(f.getTitulo() + " (" + f.getAno() + ") - " + f.getCategoria());
            }
        }
    }

    public Filme buscarPorTitulo(String titulo) {
        for (Filme f : filmes) {
            if (f.getTitulo().equalsIgnoreCase(titulo)) {
                return f;
            }
        }
        return null;
    }
}
