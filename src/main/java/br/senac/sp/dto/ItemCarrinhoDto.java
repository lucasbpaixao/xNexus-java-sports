/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.dto;

/**
 *
 * @author lucas
 */
public class ItemCarrinhoDto {
    private int idItemCarrinho;
    private int idProduto;
    private String nome;
    private String marca;
    private int quantidade;
    private double preco;
    private double valorTotalItem;

    public ItemCarrinhoDto(int idItemCarrinho, int idProduto, String nome, String marca, int quantidade, double preco) {
        this.idItemCarrinho = idItemCarrinho;
        this.idProduto = idProduto;
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.preco = preco;
        this.valorTotalItem = this.preco * this.quantidade;
    }
    
    public int getIdItemCarrinho() {
        return idItemCarrinho;
    }

    public void setIdItemCarrinho(int idItemCarrinho) {
        this.idItemCarrinho = idItemCarrinho;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    @Override
    public String toString() {
        return "ItemCarrinhoDto{" + "idItemCarrinho=" + idItemCarrinho + ", idProduto=" + idProduto + ", nome=" + nome + ", marca=" + marca + ", quantidade=" + quantidade + ", preco=" + preco + ", valorTotalItem=" + valorTotalItem + '}';
    }
    
    
}
