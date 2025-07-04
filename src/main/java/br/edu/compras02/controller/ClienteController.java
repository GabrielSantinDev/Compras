
package br.edu.compras02.controller;

import br.edu.compras02.model.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ClienteController {
    
    private ArrayList<Cliente> listaDeClientes = new ArrayList<>();
    
    
    public void addCliente(Cliente cliente) {
        listaDeClientes.add(cliente);
    }
    
    public void atualizaTabela(JTable tabela) {
        DefaultTableModel modeloTabela = (DefaultTableModel) tabela.getModel();
        
        modeloTabela.setNumRows(0);
        
        for(Cliente c : listaDeClientes){
            Object[] linha = {c.getNome(), 
                              c.getTelefone(),
                              c.getDataDeNascimento(),
                              c.getCpf(), 
                              c.getSexo()
                            };
            modeloTabela.addRow(linha);
            
        }
    }
    
    public Cliente getCliente(int index) {
        
        if (index >= 0 && index < listaDeClientes.size()) {
            return listaDeClientes.get(index);
        }
        
        return null;
    }
    
    public ArrayList<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }
    
    public void editarCliente(int index, Cliente cliente) {
        if (index >= 0 && index < listaDeClientes.size()) {
            listaDeClientes.set(index, cliente);
        }
    }
    
    public void excluirCliente(int index) {
        if (index >= 0 && index < listaDeClientes.size()) {
            listaDeClientes.remove(index);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente foi selecionado", "Erro ao excluir cliente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
