/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.entidade;

/**
 *
 * @author Raul
 */
public class Produto {
    
    private int codigo;
    private String nomeProduto;
    private String marca;
    private double preco;
    private int quantidade;
    
    public Produto(int codigo, String nomeProduto, String marca, double preco, int quantidade){
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
        }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
  

    @Override
    public String toString() {
        return "ProdutoModel{" + "codigo=" + codigo + ", nomeProduto=" + nomeProduto + ", marca=" + marca + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
    
}
