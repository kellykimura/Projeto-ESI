/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ghibli.interfaces;


import ghibli.modelo.Filme;
import ghibli.modelo.Cliente;
import ghibli.modelo.Locacao;
import ghibli.modelo.Item;
import ghibli.modelo.Venda;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/**
 * Janela para finalizar a operação de compra ou locação.
 * Exibe os itens no carrinho, calcula o total e solicita os dados do cartão e endereço.
 * A ação finaliza a compra conforme indicado.
 * 
 * @author Gabrielly
 */
public class FinalizacaoFrame extends javax.swing.JFrame {
    
    /**
     * Cliente que está realizando a compra ou locação.
     */
    private Cliente cliente;
    
    /**
     * Lista de itens no carrinho.
     */
    private ArrayList<Item> carrinho;
    
    /**
     * Indica se a operação é uma compra (true) ou locação (false).
     */
    private boolean isCompra;
    
    
    /**
     * Construtor da janela de finalização.
     * Configura a interface com os dados do cliente, carrinho e tipo de operação.
     * 
     * @param cliente Cliente que realizará a operação.
     * @param carrinho Lista de itens que serão comprados ou alugados.
     * @para isCompra true para compra, false para locação.
     */
    public FinalizacaoFrame(Cliente cliente, ArrayList<Item> carrinho, boolean isCompra) {
        
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.isCompra = isCompra;

        // Configurações gerais da janela
        setTitle("Finalizar " + (isCompra ? "Compra" : "Locação"));
        setSize(450, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        // Exibe o nome do cliente
        JLabel nomeLabel = new JLabel("Cliente: " + cliente.getNome());
        nomeLabel.setBounds(20, 20, 400, 20);
        add(nomeLabel);

        // Área de texto com detalhes dos itens do carrinho
        JTextArea detalhesArea = new JTextArea();
        detalhesArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(detalhesArea);
        scroll.setBounds(20, 50, 390, 180);
        add(scroll);

        // Calcula o valor total e preenche os detalhes
        double total = 0.0;
        StringBuilder detalhes = new StringBuilder();

        for (Item item : carrinho) {
            Filme filme = item.getFilme();
            double valor = isCompra ? filme.getValorVenda() : filme.getValorLocacao();
            total += valor;
            detalhes.append(filme.getTitulo())
                    .append(" - R$ ").append(String.format("%.2f", valor))
                    .append("\n");
        }

        // Label que mostra o valor total
        JLabel totalLabel = new JLabel("Total: R$ " + String.format("%.2f", total));
        totalLabel.setBounds(20, 240, 300, 20);
        add(totalLabel);

        // Campos para dados do cartão e do endereço
        JLabel cartaoLabel = new JLabel("Dados do Cartão:");
        cartaoLabel.setBounds(20, 270, 200, 20);
        add(cartaoLabel);

        JTextField cartaoField = new JTextField();
        cartaoField.setBounds(20, 295, 390, 25);
        add(cartaoField);

        JLabel enderecoLabel = new JLabel("Endereço de Entrega:");
        enderecoLabel.setBounds(20, 330, 200, 20);
        add(enderecoLabel);

        JTextField enderecoField = new JTextField();
        enderecoField.setBounds(20, 355, 390, 25);
        add(enderecoField);

        // Botões "Confirmar" e "Cancelar"
        JButton confirmarBtn = new JButton("Confirmar");
        confirmarBtn.setBounds(20, 410, 170, 35);
        add(confirmarBtn);

        JButton cancelarBtn = new JButton("Cancelar");
        cancelarBtn.setBounds(240, 410, 170, 35);
        add(cancelarBtn);

        // Preenche a área de detalhes
        detalhesArea.setText(detalhes.toString());

        // Evento para confirmar operação
        confirmarBtn.addActionListener(e -> {
            String cartao = cartaoField.getText().trim();
            String endereco = enderecoField.getText().trim();

            if (cartao.isEmpty() || endereco.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
                return;
            }

            if (isCompra) {
                for (Item item : carrinho) {
                    Venda venda = new Venda(cliente.getNome(), item.getFilme().getValorVenda(), cartao, endereco);
                    venda.realizarVenda(item);
                }
                JOptionPane.showMessageDialog(this, "Compra realizada com sucesso!");
            } else {
                for (Item item : carrinho) {
                    Locacao locacao = new Locacao(cliente.getNome(), item.getFilme().getValorLocacao(), "15/06/2025", cartao, endereco);
                    locacao.realizarLocacao(item);
                }
                JOptionPane.showMessageDialog(this, "Locação realizada com sucesso!");
            }

            carrinho.clear();
            dispose();
        });
        
        // Evento para cancelar operação
        cancelarBtn.addActionListener(e -> dispose());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método principal para teste da janela.
     * Cria um cliente e um carrinho vazio para abrir a interface.
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Cliente cliente = new Cliente("Antônia", "antonia@gmail.com", "12345678901", "a", "senha123");
        ArrayList<Item> carrinho = new ArrayList<>();
        
        boolean isCompra = true;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalizacaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizacaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizacaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizacaoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizacaoFrame(cliente, carrinho, isCompra).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
