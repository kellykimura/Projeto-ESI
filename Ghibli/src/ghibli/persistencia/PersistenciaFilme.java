/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.persistencia;

import ghibli.modelo.Filme;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Gabrielly
 */
public class PersistenciaFilme {
    private static final String ARQUIVO = "filmes.json";

    public static void salvar(ArrayList<Filme> filmes) {
    ObjectMapper mapper = new ObjectMapper();
    try {
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARQUIVO), filmes);
        System.out.println("Salvo com sucesso.");
    } catch (IOException e) {
        System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public static ArrayList<Filme> carregar() {
    ObjectMapper mapper = new ObjectMapper();
    try {
        File file = new File(ARQUIVO);
        if(!file.exists()) {
            System.out.println("Arquivo não existe, retornando lista vazia.");
            return new ArrayList<>();
        }
        return mapper.readValue(file, new TypeReference<ArrayList<Filme>>() {});
    } catch (IOException e) {
        System.out.println("Erro ao carregar: " + e.getMessage());
        return new ArrayList<>();
      }
    }
}
