/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.persistencia;

import ghibli.modelo.Item;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Gabrielly
 */
    public class PersistenciaItem {
     private static final String ARQUIVO = "itens.json";

    public static void salvar(ArrayList<Item> itens) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARQUIVO), itens);
        } catch (IOException e) {
            System.out.println("Erro ao salvar itens: " + e.getMessage());
        }
    }

    public static ArrayList<Item> carregar() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File(ARQUIVO);
            if (!file.exists()) {
                System.out.println("Arquivo não encontrado, criando lista vazia.");
                return new ArrayList<>();
            }
            return mapper.readValue(file, new TypeReference<ArrayList<Item>>() {});
        } catch (IOException e) {
            System.out.println("Erro ao carregar itens: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
