/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.compras02.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String sexo;
    private String telefone;
    private String cpf;
    private LocalDate dataDeNascimento;
    private ArrayList<Produto> listaDeProdutos;

    public Cliente() {
    }

    public Cliente(String nome, String sexo, String telefone, String cpf, LocalDate dataDeNascimento, ArrayList<Produto> listaDeProdutos) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.listaDeProdutos = listaDeProdutos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public ArrayList<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", sexo=" + sexo + ", telefone=" + telefone + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento + ", listaDeProdutos=" + listaDeProdutos + '}';
    }
}
