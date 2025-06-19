/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghibli.modelo;

/**
 *
 * @author kelly
 */
public class FinalizarVenda {
    
    private String resumoCompra;

    public FinalizarVenda(String resumoCompra) {
        this.resumoCompra = resumoCompra;
    }

    public void finalizar() {
        System.out.println("Resumo da compra: " + resumoCompra);
        System.out.println("Compra finalizada com sucesso!");
    }

    public String getResumoCompra() {
        return resumoCompra;
    }

    public void setResumoCompra(String resumoCompra) {
        this.resumoCompra = resumoCompra;
    }
    
    
}
