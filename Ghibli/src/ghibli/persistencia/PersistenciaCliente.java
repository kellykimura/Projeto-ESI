/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.persistencia;

import ghibli.modelo.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Gabrielly
 */
public class PersistenciaCliente {
     private static final String ARQUIVO = "clientes.json";

    public static void salvar(ArrayList<Cliente> clientes) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(ARQUIVO), clientes);
        } catch (IOException e) {
            System.out.println("Erro ao salvar clientes: " + e.getMessage());
        }
    }

    public static ArrayList<Cliente> carregar() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(ARQUIVO), new TypeReference<ArrayList<Cliente>>() {});
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado ou erro na leitura. Lista vazia criada.");
            return new ArrayList<>();
        }
    }
}
