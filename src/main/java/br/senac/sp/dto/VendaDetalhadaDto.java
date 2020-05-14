/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.dto;

import br.senac.sp.dto.ItemCarrinhoDto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lucas
 */
public class VendaDetalhadaDto {
    private int idVenda;
    private String nomeCliente;
    private String nomeFilial;
    private double ValorTotal;
    private List<ItemCarrinhoDto> carrinho;
    private Date dataVenda;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public List<ItemCarrinhoDto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<ItemCarrinhoDto> carrinho) {
        this.carrinho = carrinho;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        String carrinho = "";
        
        for (ItemCarrinhoDto item : this.carrinho) {
            carrinho+= ", "+ item.toString();
        }
        return "VendaDetalhadaDto{" + "idVenda=" + idVenda + ", nomeCliente=" + nomeCliente + ", nomeFilial=" + nomeFilial + ", ValorTotal=" + ValorTotal + ", dataVenda=" + dataVenda + ", carrinho=["+carrinho+"]}";
    } 
    
}
