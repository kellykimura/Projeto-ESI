/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.persistencia;

import ghibli.modelo.Venda;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gabrielly
 */
public class PersistenciaVenda {
    private static final String ARQUIVO = "vendas.json";

    public static void salvar(ArrayList<Venda> vendas) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARQUIVO), vendas);
        } catch (IOException e) {
            System.out.println("Erro ao salvar vendas: " + e.getMessage());
        }
    }

    public static ArrayList<Venda> carregar() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File(ARQUIVO);
            if (!file.exists()) {
                System.out.println("Arquivo vendas.json não encontrado, criando lista vazia.");
                return new ArrayList<>();
            }
            return mapper.readValue(file, new TypeReference<ArrayList<Venda>>() {});
        } catch (IOException e) {
            System.out.println("Erro ao carregar vendas: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
