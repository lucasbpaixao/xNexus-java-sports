/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.entidade;

import br.senac.sp.dto.ItemCarrinhoDto;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lucas
 */
public class Venda {
    private long id;
    private List<ItemCarrinhoDto> produtosVendidos = new ArrayList<>();
    private long idCliente;
    private long idFilial;
    private double valorTotal;
    private Date dataVenda;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ItemCarrinhoDto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutosVendidos(List<ItemCarrinhoDto> produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(long idFilial) {
        this.idFilial = idFilial;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public void addProdutos(List<ItemCarrinhoDto> produtos) {
        this.produtosVendidos = produtos;
    }
       
}
