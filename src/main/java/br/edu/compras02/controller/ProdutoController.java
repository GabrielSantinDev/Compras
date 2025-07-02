
package br.edu.compras02.controller;

import br.edu.compras02.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ProdutoController {
    
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();
    
    
    public void addProduto(Produto produto) {
        listaDeProdutos.add(produto);
    }
    
    public void atualizaTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);
        
        for(Produto p : listaDeProdutos) {
            Object [] linha = {
              p.getNome(),
              p.getQuantidade(),
              p.getPreco(),
              p.getCodigo()
            };
            modelo.addRow(linha);
        }
    }
    
    public Produto getProduto(int index) {
        
        if (index >= 0 && index < listaDeProdutos.size()) {
            return listaDeProdutos.get(index);
        }
        
        return null;
    }
    
    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }
    
    public void editarProduto(int index, Produto produto) {
        if (index >= 0 && index < listaDeProdutos.size()) {
            listaDeProdutos.set(index, produto);
        }
    }
    
    public void excluirProduto(int index) {
        if (index >= 0 && index < listaDeProdutos.size()) {
            listaDeProdutos.remove(index);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum produto foi selecionado", "Erro ao excluir produto", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
