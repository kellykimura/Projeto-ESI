/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.controlador;

import ghibli.modelo.Cliente;
import ghibli.persistencia.PersistenciaCliente;

import java.util.ArrayList;
/**
 *
 * @author Gabrielly
 */
public class ControladorCliente {
    private ArrayList<Cliente> clientes;

    public ControladorCliente() {
        clientes = PersistenciaCliente.carregar();
    }

    public void cadastrarCliente(String nome, String email, String telefone, String cpf, String senha, String endereco) {
        Cliente novo = new Cliente(nome, email, telefone, cpf, senha);
        novo.setEndereco(endereco);
        clientes.add(novo);
        PersistenciaCliente.salvar(clientes);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente c : clientes) {
                System.out.println("Nome: " + c.getNome() + ", Email: " + c.getEmail());
            }
        }
    }

    public Cliente buscarPorCpf(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }
    
    public ArrayList<Cliente> getClientes() {
    return clientes;
    }

}
