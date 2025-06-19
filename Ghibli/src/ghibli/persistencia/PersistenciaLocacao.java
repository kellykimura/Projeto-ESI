/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.persistencia;

import ghibli.modelo.Locacao;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Gabrielly
 */
public class PersistenciaLocacao {
    private static final String ARQUIVO = "locacoes.json";

    public static void salvar(ArrayList<Locacao> locacoes) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARQUIVO), locacoes);
        } catch (IOException e) {
            System.out.println("Erro ao salvar locações: " + e.getMessage());
        }
    }

    public static ArrayList<Locacao> carregar() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File(ARQUIVO);
            if (!file.exists()) {
                System.out.println("Arquivo locacoes.json não encontrado, criando lista vazia.");
                return new ArrayList<>();
            }
            return mapper.readValue(file, new TypeReference<ArrayList<Locacao>>() {});
        } catch (IOException e) {
            System.out.println("Erro ao carregar locações: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
